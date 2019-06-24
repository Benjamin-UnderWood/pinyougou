package com.pinyougou.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_goods_desc")
public class TbGoodsDesc implements Serializable {
    /**
     * SPU_ID
     */
    @Id
    @Column(name = "goods_id")
    private Long goodsId;

    /**
     * ����
     */
    @Column(name = "introduction")
    private String introduction;

    /**
     * ������������й�񣬰���isSelected
     */
    @Column(name = "specification_items")
    private String specificationItems;

    /**
     * �Զ������ԣ����������
     */
    @Column(name = "custom_attribute_items")
    private String customAttributeItems;

    /**
     * ��Ʒ��ͼƬ��Ϣ����ɫ��Ϣ�洢
     */
    @Column(name = "item_images")
    private String itemImages;

    /**
     * ��װ�б�
     */
    @Column(name = "package_list")
    private String packageList;

    /**
     * �ۺ����
     */
    @Column(name = "sale_service")
    private String saleService;

    private static final long serialVersionUID = 1L;

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

    /**
     * ��ȡ������������й�񣬰���isSelected
     *
     * @return specification_items - ������������й�񣬰���isSelected
     */
    public String getSpecificationItems() {
        return specificationItems;
    }

    /**
     * ���ù�����������й�񣬰���isSelected
     *
     * @param specificationItems ������������й�񣬰���isSelected
     */
    public void setSpecificationItems(String specificationItems) {
        this.specificationItems = specificationItems;
    }

    /**
     * ��ȡ�Զ������ԣ����������
     *
     * @return custom_attribute_items - �Զ������ԣ����������
     */
    public String getCustomAttributeItems() {
        return customAttributeItems;
    }

    /**
     * �����Զ������ԣ����������
     *
     * @param customAttributeItems �Զ������ԣ����������
     */
    public void setCustomAttributeItems(String customAttributeItems) {
        this.customAttributeItems = customAttributeItems;
    }

    /**
     * ��ȡ��Ʒ��ͼƬ��Ϣ����ɫ��Ϣ�洢
     *
     * @return item_images - ��Ʒ��ͼƬ��Ϣ����ɫ��Ϣ�洢
     */
    public String getItemImages() {
        return itemImages;
    }

    /**
     * ������Ʒ��ͼƬ��Ϣ����ɫ��Ϣ�洢
     *
     * @param itemImages ��Ʒ��ͼƬ��Ϣ����ɫ��Ϣ�洢
     */
    public void setItemImages(String itemImages) {
        this.itemImages = itemImages;
    }

    /**
     * ��ȡ��װ�б�
     *
     * @return package_list - ��װ�б�
     */
    public String getPackageList() {
        return packageList;
    }

    /**
     * ���ð�װ�б�
     *
     * @param packageList ��װ�б�
     */
    public void setPackageList(String packageList) {
        this.packageList = packageList;
    }

    /**
     * ��ȡ�ۺ����
     *
     * @return sale_service - �ۺ����
     */
    public String getSaleService() {
        return saleService;
    }

    /**
     * �����ۺ����
     *
     * @param saleService �ۺ����
     */
    public void setSaleService(String saleService) {
        this.saleService = saleService;
    }
}