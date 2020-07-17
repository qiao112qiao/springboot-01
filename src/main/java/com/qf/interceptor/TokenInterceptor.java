package com.qf.interceptor;

import com.alibaba.fastjson.JSON;
import com.qf.config.RedisKeyConfig;
import com.qf.constant.SystemConstant;
import com.qf.note.CheckToken;
import com.qf.util.JedisCore;
import com.qf.util.StringUtil;
import com.qf.vo.R;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: springboot-01
 * @description
 * @author:
 * @create: 2020-07-17 10:46
 **/
public class TokenInterceptor implements HandlerInterceptor {
    public TokenInterceptor(JedisCore jedisCore) {
        this.jedisCore = jedisCore;
    }

    //此处注入会失效  应该在TokenInterceptorConfig配置类中使用构造方法注入↑↑↑↑
    //@Autowired
    private JedisCore jedisCore;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getMethod().equals(RequestMethod.OPTIONS.name())) {
            setHeader(request,response);
            return true;
        }

        //从执行的控制器方法中获取CheckToken注解对象
        System.out.println("handler"+handler);
        CheckToken tokenValidate = ((HandlerMethod) handler).getMethodAnnotation(CheckToken.class);
        if (null != tokenValidate) {//方法有CheckToken注解  需要验证Token
            String token = request.getHeader(SystemConstant.TOKEN_HEADER);
            //System.out.println(token);
            //校验token合法性
            if (!StringUtil.isEmpty(token)) {
                if (jedisCore.checkKey(RedisKeyConfig.TOKEN_USER + token)) { //如果redis里有这个token对应的用户信息 就放行
                    return true;
                }
            }
            //验证失败的响应信息
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().write((JSON.toJSONString(R.error("权限校验不通过，请重新登陆。"))));
            return false;
        } else {//方法没有CheckToken注解 无需验证token的接口走这里
            return true;
        }
    }
    /**
     * 为response设置header，实现跨域
     */
    private void setHeader(HttpServletRequest request,HttpServletResponse response) {
        //跨域的header设置
        response.setHeader("Access-control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Methods", request.getMethod());
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers", request.getHeader("Access-Control-Request-Headers"));
        //防止乱码，适用于传输JSON数据
        response.setHeader("Content-Type", "application/json;charset=UTF-8");

    }
}