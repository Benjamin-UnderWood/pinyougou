package com.pinyougou.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_item")
public class TbItem implements Serializable {
    /**
     * ��Ʒid��ͬʱҲ����Ʒ���
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ��Ʒ����
     */
    @Column(name = "title")
    private String title;

    /**
     * ��Ʒ����
     */
    @Column(name = "sell_point")
    private String sellPoint;

    /**
     * ��Ʒ�۸񣬵�λΪ��Ԫ
     */
    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "stock_count")
    private Integer stockCount;

    /**
     * �������
     */
    @Column(name = "num")
    private Integer num;

    /**
     * ��Ʒ������
     */
    @Column(name = "barcode")
    private String barcode;

    /**
     * ��ƷͼƬ
     */
    @Column(name = "image")
    private String image;

    /**
     * ������Ŀ��Ҷ����Ŀ �����ID
     */
    @Column(name = "categoryId")
    private Long categoryid;

    /**
     * ��Ʒ״̬��1-������2-�¼ܣ�3-ɾ��
     */
    @Column(name = "status")
    private String status;

    /**
     * ����ʱ��
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * ����ʱ��
     */
    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "item_sn")
    private String itemSn;

    @Column(name = "cost_pirce")
    private BigDecimal costPirce;

    @Column(name = "market_price")
    private BigDecimal marketPrice;

    @Column(name = "is_default")
    private String isDefault;

    @Column(name = "goods_id")
    private Long goodsId;

    @Column(name = "seller_id")
    private String sellerId;

    @Column(name = "cart_thumbnail")
    private String cartThumbnail;

    /**
     * �����ֶ� ���������������
     */
    @Column(name = "category")
    private String category;

    /**
     * �����ֶ� ���Ʒ������
     */
    @Column(name = "brand")
    private String brand;

    @Column(name = "spec")
    private String spec;

    /**
     * �����ֶΣ����ڴ���̼ҵĵ�������
     */
    @Column(name = "seller")
    private String seller;

    private static final long serialVersionUID = 1L;

    /**
     * ��ȡ��Ʒid��ͬʱҲ����Ʒ���
     *
     * @return id - ��Ʒid��ͬʱҲ����Ʒ���
     */
    public Long getId() {
        return id;
    }

    /**
     * ������Ʒid��ͬʱҲ����Ʒ���
     *
     * @param id ��Ʒid��ͬʱҲ����Ʒ���
     */
    public void setId(Long id) {
        this.id = id;
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
     * @return sell_point - ��Ʒ����
     */
    public String getSellPoint() {
        return sellPoint;
    }

    /**
     * ������Ʒ����
     *
     * @param sellPoint ��Ʒ����
     */
    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    /**
     * ��ȡ��Ʒ�۸񣬵�λΪ��Ԫ
     *
     * @return price - ��Ʒ�۸񣬵�λΪ��Ԫ
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * ������Ʒ�۸񣬵�λΪ��Ԫ
     *
     * @param price ��Ʒ�۸񣬵�λΪ��Ԫ
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * @return stock_count
     */
    public Integer getStockCount() {
        return stockCount;
    }

    /**
     * @param stockCount
     */
    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    /**
     * ��ȡ�������
     *
     * @return num - �������
     */
    public Integer getNum() {
        return num;
    }

    /**
     * ���ÿ������
     *
     * @param num �������
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * ��ȡ��Ʒ������
     *
     * @return barcode - ��Ʒ������
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * ������Ʒ������
     *
     * @param barcode ��Ʒ������
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     * ��ȡ��ƷͼƬ
     *
     * @return image - ��ƷͼƬ
     */
    public String getImage() {
        return image;
    }

    /**
     * ������ƷͼƬ
     *
     * @param image ��ƷͼƬ
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * ��ȡ������Ŀ��Ҷ����Ŀ �����ID
     *
     * @return categoryId - ������Ŀ��Ҷ����Ŀ �����ID
     */
    public Long getCategoryid() {
        return categoryid;
    }

    /**
     * ����������Ŀ��Ҷ����Ŀ �����ID
     *
     * @param categoryid ������Ŀ��Ҷ����Ŀ �����ID
     */
    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * ��ȡ��Ʒ״̬��1-������2-�¼ܣ�3-ɾ��
     *
     * @return status - ��Ʒ״̬��1-������2-�¼ܣ�3-ɾ��
     */
    public String getStatus() {
        return status;
    }

    /**
     * ������Ʒ״̬��1-������2-�¼ܣ�3-ɾ��
     *
     * @param status ��Ʒ״̬��1-������2-�¼ܣ�3-ɾ��
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return create_time - ����ʱ��
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * ���ô���ʱ��
     *
     * @param createTime ����ʱ��
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return update_time - ����ʱ��
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * ���ø���ʱ��
     *
     * @param updateTime ����ʱ��
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return item_sn
     */
    public String getItemSn() {
        return itemSn;
    }

    /**
     * @param itemSn
     */
    public void setItemSn(String itemSn) {
        this.itemSn = itemSn;
    }

    /**
     * @return cost_pirce
     */
    public BigDecimal getCostPirce() {
        return costPirce;
    }

    /**
     * @param costPirce
     */
    public void setCostPirce(BigDecimal costPirce) {
        this.costPirce = costPirce;
    }

    /**
     * @return market_price
     */
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    /**
     * @param marketPrice
     */
    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * @return is_default
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * @param isDefault
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * @return goods_id
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * @param goodsId
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
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

    /**
     * @return cart_thumbnail
     */
    public String getCartThumbnail() {
        return cartThumbnail;
    }

    /**
     * @param cartThumbnail
     */
    public void setCartThumbnail(String cartThumbnail) {
        this.cartThumbnail = cartThumbnail;
    }

    /**
     * ��ȡ�����ֶ� ���������������
     *
     * @return category - �����ֶ� ���������������
     */
    public String getCategory() {
        return category;
    }

    /**
     * ���������ֶ� ���������������
     *
     * @param category �����ֶ� ���������������
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * ��ȡ�����ֶ� ���Ʒ������
     *
     * @return brand - �����ֶ� ���Ʒ������
     */
    public String getBrand() {
        return brand;
    }

    /**
     * ���������ֶ� ���Ʒ������
     *
     * @param brand �����ֶ� ���Ʒ������
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return spec;
    }

    /**
     * @param spec
     */
    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     * ��ȡ�����ֶΣ����ڴ���̼ҵĵ�������
     *
     * @return seller - �����ֶΣ����ڴ���̼ҵĵ�������
     */
    public String getSeller() {
        return seller;
    }

    /**
     * ���������ֶΣ����ڴ���̼ҵĵ�������
     *
     * @param seller �����ֶΣ����ڴ���̼ҵĵ�������
     */
    public void setSeller(String seller) {
        this.seller = seller;
    }
}