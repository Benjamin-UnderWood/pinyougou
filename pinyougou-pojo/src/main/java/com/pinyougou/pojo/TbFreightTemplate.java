package com.pinyougou.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_freight_template")
public class TbFreightTemplate implements Serializable {
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
     * �Ƿ�Ĭ��   ����Y����   'N'��
     */
    @Column(name = "is_default")
    private String isDefault;

    /**
     * ģ������
     */
    @Column(name = "name")
    private String name;

    /**
     * ����ʱ�䣨1:12h  2:24h  3:48h  4:72h  5:7d 6:15d ��
     */
    @Column(name = "send_time_type")
    private String sendTimeType;

    /**
     * ͳһ�۸�
     */
    @Column(name = "price")
    private Long price;

    /**
     * ����ʱ��
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * ��ȡ�Ƿ�Ĭ��   ����Y����   'N'��
     *
     * @return is_default - �Ƿ�Ĭ��   ����Y����   'N'��
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * �����Ƿ�Ĭ��   ����Y����   'N'��
     *
     * @param isDefault �Ƿ�Ĭ��   ����Y����   'N'��
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
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
     * ��ȡ����ʱ�䣨1:12h  2:24h  3:48h  4:72h  5:7d 6:15d ��
     *
     * @return send_time_type - ����ʱ�䣨1:12h  2:24h  3:48h  4:72h  5:7d 6:15d ��
     */
    public String getSendTimeType() {
        return sendTimeType;
    }

    /**
     * ���÷���ʱ�䣨1:12h  2:24h  3:48h  4:72h  5:7d 6:15d ��
     *
     * @param sendTimeType ����ʱ�䣨1:12h  2:24h  3:48h  4:72h  5:7d 6:15d ��
     */
    public void setSendTimeType(String sendTimeType) {
        this.sendTimeType = sendTimeType;
    }

    /**
     * ��ȡͳһ�۸�
     *
     * @return price - ͳһ�۸�
     */
    public Long getPrice() {
        return price;
    }

    /**
     * ����ͳһ�۸�
     *
     * @param price ͳһ�۸�
     */
    public void setPrice(Long price) {
        this.price = price;
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
}