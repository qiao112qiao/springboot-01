package com.qf.pojo;

public class TbCart {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_cart.cartid
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private Integer cartid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_cart.goods_id
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_cart.user_id
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_cart.goods_num
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private Integer goodsNum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_cart.cartid
     *
     * @return the value of tb_cart.cartid
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public Integer getCartid() {
        return cartid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_cart.cartid
     *
     * @param cartid the value for tb_cart.cartid
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_cart.goods_id
     *
     * @return the value of tb_cart.goods_id
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_cart.goods_id
     *
     * @param goodsId the value for tb_cart.goods_id
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_cart.user_id
     *
     * @return the value of tb_cart.user_id
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_cart.user_id
     *
     * @param userId the value for tb_cart.user_id
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_cart.goods_num
     *
     * @return the value of tb_cart.goods_num
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public Integer getGoodsNum() {
        return goodsNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_cart.goods_num
     *
     * @param goodsNum the value for tb_cart.goods_num
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }
}