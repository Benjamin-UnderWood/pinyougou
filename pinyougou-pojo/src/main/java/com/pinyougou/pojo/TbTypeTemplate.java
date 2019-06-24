package com.pinyougou.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_type_template")
public class TbTypeTemplate implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ģ������
     */
    @Column(name = "name")
    private String name;

    /**
     * �������
     */
    @Column(name = "spec_ids")
    private String specIds;

    /**
     * ����Ʒ��
     */
    @Column(name = "brand_ids")
    private String brandIds;

    /**
     * �Զ�������
     */
    @Column(name = "custom_attribute_items")
    private String customAttributeItems;

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
     * ��ȡģ������
     *
     * @return name - ģ������
     */
    public String getName() {
        return name;
    }

    /**
     * ����ģ������
     *
     * @param name ģ������
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ�������
     *
     * @return spec_ids - �������
     */
    public String getSpecIds() {
        return specIds;
    }

    /**
     * ���ù������
     *
     * @param specIds �������
     */
    public void setSpecIds(String specIds) {
        this.specIds = specIds;
    }

    /**
     * ��ȡ����Ʒ��
     *
     * @return brand_ids - ����Ʒ��
     */
    public String getBrandIds() {
        return brandIds;
    }

    /**
     * ���ù���Ʒ��
     *
     * @param brandIds ����Ʒ��
     */
    public void setBrandIds(String brandIds) {
        this.brandIds = brandIds;
    }

    /**
     * ��ȡ�Զ�������
     *
     * @return custom_attribute_items - �Զ�������
     */
    public String getCustomAttributeItems() {
        return customAttributeItems;
    }

    /**
     * �����Զ�������
     *
     * @param customAttributeItems �Զ�������
     */
    public void setCustomAttributeItems(String customAttributeItems) {
        this.customAttributeItems = customAttributeItems;
    }
}