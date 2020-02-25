package com.pinyougou.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "tb_goods")
public class TbGoods implements Serializable {
    /**
     * ����
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * �̼�ID
     */
    @Column(name = "seller_id")
    private String sellerId;

    /**
     * SPU��
     */
    @Column(name = "goods_name")
    private String goodsName;

    /**
     * Ĭ��SKU
     */
    @Column(name = "default_item_id")
    private Long defaultItemId;

    /**
     * ״̬ ��ʾ��Ʒ�Ƿ���� 0 δ��� 1 ����� 2 ���δͨ�� 3 �ر�
     */
    @Column(name = "audit_status")
    private String auditStatus;

    /**
     * �Ƿ��ϼ�
     */
    @Column(name = "is_marketable")
    private String isMarketable;

    /**
     * Ʒ��
     */
    @Column(name = "brand_id")
    private Long brandId;

    /**
     * ������
     */
    @Column(name = "caption")
    private String caption;

    /**
     * һ����Ŀ
     */
    @Column(name = "category1_id")
    private Long category1Id;

    /**
     * ������Ŀ
     */
    @Column(name = "category2_id")
    private Long category2Id;

    /**
     * ������Ŀ
     */
    @Column(name = "category3_id")
    private Long category3Id;

    /**
     * Сͼ
     */
    @Column(name = "small_pic")
    private String smallPic;

    /**
     * �̳Ǽ�
     */
    @Column(name = "price")
    private BigDecimal price;

    /**
     * ����ģ��ID
     */
    @Column(name = "type_template_id")
    private Long typeTemplateId;

    /**
     * �Ƿ����ù��
     */
    @Column(name = "is_enable_spec")
    private String isEnableSpec;

    /**
     * �Ƿ�ɾ��
     */
    @Column(name = "is_delete")
    private Boolean isDelete;

    private static final long serialVersionUID = 1L;

    /**
     * ��ȡ����
     *
     * @return id - ����
     */
    public Long getId() {
        return id;
    }

    /**
     * ��������
     *
     * @param id ����
     */
    public void setId(Long id) {
        this.id = id;
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
     * ��ȡSPU��
     *
     * @return goods_name - SPU��
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * ����SPU��
     *
     * @param goodsName SPU��
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * ��ȡĬ��SKU
     *
     * @return default_item_id - Ĭ��SKU
     */
    public Long getDefaultItemId() {
        return defaultItemId;
    }

    /**
     * ����Ĭ��SKU
     *
     * @param defaultItemId Ĭ��SKU
     */
    public void setDefaultItemId(Long defaultItemId) {
        this.defaultItemId = defaultItemId;
    }

    /**
     * ��ȡ״̬ ��ʾ��Ʒ�Ƿ���� 0 δ��� 1 ����� 2 ���δͨ�� 3 �ر�
     *
     * @return audit_status - ״̬ ��ʾ��Ʒ�Ƿ���� 0 δ��� 1 ����� 2 ���δͨ�� 3 �ر�
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    /**
     * ����״̬ ��ʾ��Ʒ�Ƿ���� 0 δ��� 1 ����� 2 ���δͨ�� 3 �ر�
     *
     * @param auditStatus ״̬ ��ʾ��Ʒ�Ƿ���� 0 δ��� 1 ����� 2 ���δͨ�� 3 �ر�
     */
    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * ��ȡ�Ƿ��ϼ�
     *
     * @return is_marketable - �Ƿ��ϼ�
     */
    public String getIsMarketable() {
        return isMarketable;
    }

    /**
     * �����Ƿ��ϼ�
     *
     * @param isMarketable �Ƿ��ϼ�
     */
    public void setIsMarketable(String isMarketable) {
        this.isMarketable = isMarketable;
    }

    /**
     * ��ȡƷ��
     *
     * @return brand_id - Ʒ��
     */
    public Long getBrandId() {
        return brandId;
    }

    /**
     * ����Ʒ��
     *
     * @param brandId Ʒ��
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    /**
     * ��ȡ������
     *
     * @return caption - ������
     */
    public String getCaption() {
        return caption;
    }

    /**
     * ���ø�����
     *
     * @param caption ������
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * ��ȡһ����Ŀ
     *
     * @return category1_id - һ����Ŀ
     */
    public Long getCategory1Id() {
        return category1Id;
    }

    /**
     * ����һ����Ŀ
     *
     * @param category1Id һ����Ŀ
     */
    public void setCategory1Id(Long category1Id) {
        this.category1Id = category1Id;
    }

    /**
     * ��ȡ������Ŀ
     *
     * @return category2_id - ������Ŀ
     */
    public Long getCategory2Id() {
        return category2Id;
    }

    /**
     * ���ö�����Ŀ
     *
     * @param category2Id ������Ŀ
     */
    public void setCategory2Id(Long category2Id) {
        this.category2Id = category2Id;
    }

    /**
     * ��ȡ������Ŀ
     *
     * @return category3_id - ������Ŀ
     */
    public Long getCategory3Id() {
        return category3Id;
    }

    /**
     * ����������Ŀ
     *
     * @param category3Id ������Ŀ
     */
    public void setCategory3Id(Long category3Id) {
        this.category3Id = category3Id;
    }

    /**
     * ��ȡСͼ
     *
     * @return small_pic - Сͼ
     */
    public String getSmallPic() {
        return smallPic;
    }

    /**
     * ����Сͼ
     *
     * @param smallPic Сͼ
     */
    public void setSmallPic(String smallPic) {
        this.smallPic = smallPic;
    }

    /**
     * ��ȡ�̳Ǽ�
     *
     * @return price - �̳Ǽ�
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * �����̳Ǽ�
     *
     * @param price �̳Ǽ�
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * ��ȡ����ģ��ID
     *
     * @return type_template_id - ����ģ��ID
     */
    public Long getTypeTemplateId() {
        return typeTemplateId;
    }

    /**
     * ���÷���ģ��ID
     *
     * @param typeTemplateId ����ģ��ID
     */
    public void setTypeTemplateId(Long typeTemplateId) {
        this.typeTemplateId = typeTemplateId;
    }

    /**
     * ��ȡ�Ƿ����ù��
     *
     * @return is_enable_spec - �Ƿ����ù��
     */
    public String getIsEnableSpec() {
        return isEnableSpec;
    }

    /**
     * �����Ƿ����ù��
     *
     * @param isEnableSpec �Ƿ����ù��
     */
    public void setIsEnableSpec(String isEnableSpec) {
        this.isEnableSpec = isEnableSpec;
    }

    /**
     * ��ȡ�Ƿ�ɾ��
     *
     * @return is_delete - �Ƿ�ɾ��
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * �����Ƿ�ɾ��
     *
     * @param isDelete �Ƿ�ɾ��
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}