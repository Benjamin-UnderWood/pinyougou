package com.pinyougou.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "tb_order_item")
public class TbOrderItem implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ��Ʒid
     */
    @Column(name = "item_id")
    private Long itemId;

    /**
     * SPU_ID
     */
    @Column(name = "goods_id")
    private Long goodsId;

    /**
     * ����id
     */
    @Column(name = "order_id")
    private Long orderId;

    /**
     * ��Ʒ����
     */
    @Column(name = "title")
    private String title;

    /**
     * ��Ʒ����
     */
    @Column(name = "price")
    private BigDecimal price;

    /**
     * ��Ʒ��������
     */
    @Column(name = "num")
    private Integer num;

    /**
     * ��Ʒ�ܽ��
     */
    @Column(name = "total_fee")
    private BigDecimal totalFee;

    /**
     * ��ƷͼƬ��ַ
     */
    @Column(name = "pic_path")
    private String picPath;

    @Column(name = "seller_id")
    private String sellerId;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ��ȡ��Ʒid
     *
     * @return item_id - ��Ʒid
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * ������Ʒid
     *
     * @param itemId ��Ʒid
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * ��ȡSPU_ID
     *
     * @return goods_id - SPU_ID
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * ����SPU_ID
     *
     * @param goodsId SPU_ID
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * ��ȡ����id
     *
     * @return order_id - ����id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * ���ö���id
     *
     * @param orderId ����id
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * ��ȡ��Ʒ����
     *
     * @return title - ��Ʒ����
     */
    public String getTitle() {
        return title;
    }

    /**
     * ������Ʒ����
     *
     * @param title ��Ʒ����
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * ��ȡ��Ʒ����
     *
     * @return price - ��Ʒ����
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * ������Ʒ����
     *
     * @param price ��Ʒ����
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * ��ȡ��Ʒ��������
     *
     * @return num - ��Ʒ��������
     */
    public Integer getNum() {
        return num;
    }

    /**
     * ������Ʒ��������
     *
     * @param num ��Ʒ��������
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * ��ȡ��Ʒ�ܽ��
     *
     * @return total_fee - ��Ʒ�ܽ��
     */
    public BigDecimal getTotalFee() {
        return totalFee;
    }

    /**
     * ������Ʒ�ܽ��
     *
     * @param totalFee ��Ʒ�ܽ��
     */
    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * ��ȡ��ƷͼƬ��ַ
     *
     * @return pic_path - ��ƷͼƬ��ַ
     */
    public String getPicPath() {
        return picPath;
    }

    /**
     * ������ƷͼƬ��ַ
     *
     * @param picPath ��ƷͼƬ��ַ
     */
    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    /**
     * @return seller_id
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * @param sellerId
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }
}