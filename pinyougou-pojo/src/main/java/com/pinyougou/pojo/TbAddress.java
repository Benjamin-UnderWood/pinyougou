package com.pinyougou.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_address")
public class TbAddress implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * �û�ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * ʡ
     */
    @Column(name = "province_id")
    private String provinceId;

    /**
     * ��
     */
    @Column(name = "city_id")
    private String cityId;

    /**
     * ��/��
     */
    @Column(name = "town_id")
    private String townId;

    /**
     * �ֻ�
     */
    @Column(name = "mobile")
    private String mobile;

    /**
     * ��ϸ��ַ
     */
    @Column(name = "address")
    private String address;

    /**
     * ��ϵ��
     */
    @Column(name = "contact")
    private String contact;

    /**
     * �Ƿ���Ĭ�� 1Ĭ�� 0��
     */
    @Column(name = "is_default")
    private String isDefault;

    /**
     * ��ע
     */
    @Column(name = "notes")
    private String notes;

    /**
     * ��������
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * ����
     */
    @Column(name = "alias")
    private String alias;

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
     * ��ȡ�û�ID
     *
     * @return user_id - �û�ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * �����û�ID
     *
     * @param userId �û�ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * ��ȡʡ
     *
     * @return province_id - ʡ
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * ����ʡ
     *
     * @param provinceId ʡ
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * ��ȡ��
     *
     * @return city_id - ��
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * ������
     *
     * @param cityId ��
     */
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    /**
     * ��ȡ��/��
     *
     * @return town_id - ��/��
     */
    public String getTownId() {
        return townId;
    }

    /**
     * ������/��
     *
     * @param townId ��/��
     */
    public void setTownId(String townId) {
        this.townId = townId;
    }

    /**
     * ��ȡ�ֻ�
     *
     * @return mobile - �ֻ�
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * �����ֻ�
     *
     * @param mobile �ֻ�
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * ��ȡ��ϸ��ַ
     *
     * @return address - ��ϸ��ַ
     */
    public String getAddress() {
        return address;
    }

    /**
     * ������ϸ��ַ
     *
     * @param address ��ϸ��ַ
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * ��ȡ��ϵ��
     *
     * @return contact - ��ϵ��
     */
    public String getContact() {
        return contact;
    }

    /**
     * ������ϵ��
     *
     * @param contact ��ϵ��
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * ��ȡ�Ƿ���Ĭ�� 1Ĭ�� 0��
     *
     * @return is_default - �Ƿ���Ĭ�� 1Ĭ�� 0��
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * �����Ƿ���Ĭ�� 1Ĭ�� 0��
     *
     * @param isDefault �Ƿ���Ĭ�� 1Ĭ�� 0��
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * ��ȡ��ע
     *
     * @return notes - ��ע
     */
    public String getNotes() {
        return notes;
    }

    /**
     * ���ñ�ע
     *
     * @param notes ��ע
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * ��ȡ��������
     *
     * @return create_date - ��������
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * ���ô�������
     *
     * @param createDate ��������
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * ��ȡ����
     *
     * @return alias - ����
     */
    public String getAlias() {
        return alias;
    }

    /**
     * ���ñ���
     *
     * @param alias ����
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }
}