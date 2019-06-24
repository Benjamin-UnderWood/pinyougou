package com.pinyougou.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_seckill_goods")
public class TbSeckillGoods implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * spu ID
     */
    @Column(name = "goods_id")
    private Long goodsId;

    /**
     * sku ID
     */
    @Column(name = "item_id")
    private Long itemId;

    /**
     * ����
     */
    @Column(name = "title")
    private String title;

    /**
     * ��ƷͼƬ
     */
    @Column(name = "small_pic")
    private String smallPic;

    /**
     * ԭ�۸�
     */
    @Column(name = "price")
    private BigDecimal price;

    /**
     * ��ɱ�۸�
     */
    @Column(name = "cost_price")
    private BigDecimal costPrice;

    /**
     * �̼�ID
     */
    @Column(name = "seller_id")
    private String sellerId;

    /**
     * �������
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * �������
     */
    @Column(name = "check_time")
    private Date checkTime;

    /**
     * ���״̬
     */
    @Column(name = "status")
    private String status;

    /**
     * ��ʼʱ��
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * ����ʱ��
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * ��ɱ��Ʒ������� 
     */
    @Column(name = "num")
    private Integer num;

    /**
     * ʣ������
     */
    @Column(name = "stock_count")
    private Integer stockCount;

    /**
     * ����
     */
    @Column(name = "introduction")
    private String introduction;

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
     * ��ȡspu ID
     *
     * @return goods_id - spu ID
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * ����spu ID
     *
     * @param goodsId spu ID
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * ��ȡsku ID
     *
     * @return item_id - sku ID
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * ����sku ID
     *
     * @param itemId sku ID
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * ��ȡ����
     *
     * @return title - ����
     */
    public String getTitle() {
        return title;
    }

    /**
     * ���ñ���
     *
     * @param title ����
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * ��ȡ��ƷͼƬ
     *
     * @return small_pic - ��ƷͼƬ
     */
    public String getSmallPic() {
        return smallPic;
    }

    /**
     * ������ƷͼƬ
     *
     * @param smallPic ��ƷͼƬ
     */
    public void setSmallPic(String smallPic) {
        this.smallPic = smallPic;
    }

    /**
     * ��ȡԭ�۸�
     *
     * @return price - ԭ�۸�
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * ����ԭ�۸�
     *
     * @param price ԭ�۸�
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * ��ȡ��ɱ�۸�
     *
     * @return cost_price - ��ɱ�۸�
     */
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    /**
     * ������ɱ�۸�
     *
     * @param costPrice ��ɱ�۸�
     */
    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * ��ȡ�̼�ID
     *
     * @return seller_id - �̼�ID
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * �����̼�ID
     *
     * @param sellerId �̼�ID
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * ��ȡ�������
     *
     * @return create_time - �������
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * �����������
     *
     * @param createTime �������
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * ��ȡ�������
     *
     * @return check_time - �������
     */
    public Date getCheckTime() {
        return checkTime;
    }

    /**
     * �����������
     *
     * @param checkTime �������
     */
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * ��ȡ���״̬
     *
     * @return status - ���״̬
     */
    public String getStatus() {
        return status;
    }

    /**
     * �������״̬
     *
     * @param status ���״̬
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * ��ȡ��ʼʱ��
     *
     * @return start_time - ��ʼʱ��
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * ���ÿ�ʼʱ��
     *
     * @param startTime ��ʼʱ��
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return end_time - ����ʱ��
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * ���ý���ʱ��
     *
     * @param endTime ����ʱ��
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * ��ȡ��ɱ��Ʒ������� 
     *
     * @return num - ��ɱ��Ʒ������� 
     */
    public Integer getNum() {
        return num;
    }

    /**
     * ������ɱ��Ʒ������� 
     *
     * @param num ��ɱ��Ʒ������� 
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * ��ȡʣ������
     *
     * @return stock_count - ʣ������
     */
    public Integer getStockCount() {
        return stockCount;
    }

    /**
     * ����ʣ������
     *
     * @param stockCount ʣ������
     */
    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    /**
     * ��ȡ����
     *
     * @return introduction - ����
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * ��������
     *
     * @param introduction ����
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}