package com.pinyougou.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_seller")
public class TbSeller implements Serializable {
    /**
     * �û�ID �û���
     */
    @Id
    @Column(name = "seller_id")
    private String sellerId;

    /**
     * ��˾��
     */
    @Column(name = "name")
    private String name;

    /**
     * ��������
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * ����
     */
    @Column(name = "password")
    private String password;

    /**
     * EMAIL
     */
    @Column(name = "email")
    private String email;

    /**
     * ��˾�ֻ�
     */
    @Column(name = "mobile")
    private String mobile;

    /**
     * ��˾�绰
     */
    @Column(name = "telephone")
    private String telephone;

    /**
     * ״̬
     */
    @Column(name = "status")
    private String status;

    /**
     * ��ϸ��ַ
     */
    @Column(name = "address_detail")
    private String addressDetail;

    /**
     * ��ϵ������
     */
    @Column(name = "linkman_name")
    private String linkmanName;

    /**
     * ��ϵ��QQ
     */
    @Column(name = "linkman_qq")
    private String linkmanQq;

    /**
     * ��ϵ�˵绰
     */
    @Column(name = "linkman_mobile")
    private String linkmanMobile;

    /**
     * ��ϵ��EMAIL
     */
    @Column(name = "linkman_email")
    private String linkmanEmail;

    /**
     * Ӫҵִ�պ�
     */
    @Column(name = "license_number")
    private String licenseNumber;

    /**
     * ˰��Ǽ�֤��
     */
    @Column(name = "tax_number")
    private String taxNumber;

    /**
     * ��֯��������
     */
    @Column(name = "org_number")
    private String orgNumber;

    /**
     * ��˾��ַ
     */
    @Column(name = "address")
    private Long address;

    /**
     * ��˾LOGOͼ
     */
    @Column(name = "logo_pic")
    private String logoPic;

    /**
     * ���
     */
    @Column(name = "brief")
    private String brief;

    /**
     * ��������
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * ����������
     */
    @Column(name = "legal_person")
    private String legalPerson;

    /**
     * �������������֤
     */
    @Column(name = "legal_person_card_id")
    private String legalPersonCardId;

    /**
     * �������˺�����
     */
    @Column(name = "bank_user")
    private String bankUser;

    /**
     * ������
     */
    @Column(name = "bank_name")
    private String bankName;

    private static final long serialVersionUID = 1L;

    /**
     * ��ȡ�û�ID �û���
     *
     * @return seller_id - �û�ID �û���
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * �����û�ID �û���
     *
     * @param sellerId �û�ID �û���
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * ��ȡ��˾��
     *
     * @return name - ��˾��
     */
    public String getName() {
        return name;
    }

    /**
     * ���ù�˾��
     *
     * @param name ��˾��
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ��������
     *
     * @return nick_name - ��������
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * ���õ�������
     *
     * @param nickName ��������
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * ��ȡ����
     *
     * @return password - ����
     */
    public String getPassword() {
        return password;
    }

    /**
     * ��������
     *
     * @param password ����
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ��ȡEMAIL
     *
     * @return email - EMAIL
     */
    public String getEmail() {
        return email;
    }

    /**
     * ����EMAIL
     *
     * @param email EMAIL
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * ��ȡ��˾�ֻ�
     *
     * @return mobile - ��˾�ֻ�
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * ���ù�˾�ֻ�
     *
     * @param mobile ��˾�ֻ�
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * ��ȡ��˾�绰
     *
     * @return telephone - ��˾�绰
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * ���ù�˾�绰
     *
     * @param telephone ��˾�绰
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * ��ȡ״̬
     *
     * @return status - ״̬
     */
    public String getStatus() {
        return status;
    }

    /**
     * ����״̬
     *
     * @param status ״̬
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * ��ȡ��ϸ��ַ
     *
     * @return address_detail - ��ϸ��ַ
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * ������ϸ��ַ
     *
     * @param addressDetail ��ϸ��ַ
     */
    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    /**
     * ��ȡ��ϵ������
     *
     * @return linkman_name - ��ϵ������
     */
    public String getLinkmanName() {
        return linkmanName;
    }

    /**
     * ������ϵ������
     *
     * @param linkmanName ��ϵ������
     */
    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName;
    }

    /**
     * ��ȡ��ϵ��QQ
     *
     * @return linkman_qq - ��ϵ��QQ
     */
    public String getLinkmanQq() {
        return linkmanQq;
    }

    /**
     * ������ϵ��QQ
     *
     * @param linkmanQq ��ϵ��QQ
     */
    public void setLinkmanQq(String linkmanQq) {
        this.linkmanQq = linkmanQq;
    }

    /**
     * ��ȡ��ϵ�˵绰
     *
     * @return linkman_mobile - ��ϵ�˵绰
     */
    public String getLinkmanMobile() {
        return linkmanMobile;
    }

    /**
     * ������ϵ�˵绰
     *
     * @param linkmanMobile ��ϵ�˵绰
     */
    public void setLinkmanMobile(String linkmanMobile) {
        this.linkmanMobile = linkmanMobile;
    }

    /**
     * ��ȡ��ϵ��EMAIL
     *
     * @return linkman_email - ��ϵ��EMAIL
     */
    public String getLinkmanEmail() {
        return linkmanEmail;
    }

    /**
     * ������ϵ��EMAIL
     *
     * @param linkmanEmail ��ϵ��EMAIL
     */
    public void setLinkmanEmail(String linkmanEmail) {
        this.linkmanEmail = linkmanEmail;
    }

    /**
     * ��ȡӪҵִ�պ�
     *
     * @return license_number - Ӫҵִ�պ�
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * ����Ӫҵִ�պ�
     *
     * @param licenseNumber Ӫҵִ�պ�
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    /**
     * ��ȡ˰��Ǽ�֤��
     *
     * @return tax_number - ˰��Ǽ�֤��
     */
    public String getTaxNumber() {
        return taxNumber;
    }

    /**
     * ����˰��Ǽ�֤��
     *
     * @param taxNumber ˰��Ǽ�֤��
     */
    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    /**
     * ��ȡ��֯��������
     *
     * @return org_number - ��֯��������
     */
    public String getOrgNumber() {
        return orgNumber;
    }

    /**
     * ������֯��������
     *
     * @param orgNumber ��֯��������
     */
    public void setOrgNumber(String orgNumber) {
        this.orgNumber = orgNumber;
    }

    /**
     * ��ȡ��˾��ַ
     *
     * @return address - ��˾��ַ
     */
    public Long getAddress() {
        return address;
    }

    /**
     * ���ù�˾��ַ
     *
     * @param address ��˾��ַ
     */
    public void setAddress(Long address) {
        this.address = address;
    }

    /**
     * ��ȡ��˾LOGOͼ
     *
     * @return logo_pic - ��˾LOGOͼ
     */
    public String getLogoPic() {
        return logoPic;
    }

    /**
     * ���ù�˾LOGOͼ
     *
     * @param logoPic ��˾LOGOͼ
     */
    public void setLogoPic(String logoPic) {
        this.logoPic = logoPic;
    }

    /**
     * ��ȡ���
     *
     * @return brief - ���
     */
    public String getBrief() {
        return brief;
    }

    /**
     * ���ü��
     *
     * @param brief ���
     */
    public void setBrief(String brief) {
        this.brief = brief;
    }

    /**
     * ��ȡ��������
     *
     * @return create_time - ��������
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * ���ô�������
     *
     * @param createTime ��������
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * ��ȡ����������
     *
     * @return legal_person - ����������
     */
    public String getLegalPerson() {
        return legalPerson;
    }

    /**
     * ���÷���������
     *
     * @param legalPerson ����������
     */
    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    /**
     * ��ȡ�������������֤
     *
     * @return legal_person_card_id - �������������֤
     */
    public String getLegalPersonCardId() {
        return legalPersonCardId;
    }

    /**
     * ���÷������������֤
     *
     * @param legalPersonCardId �������������֤
     */
    public void setLegalPersonCardId(String legalPersonCardId) {
        this.legalPersonCardId = legalPersonCardId;
    }

    /**
     * ��ȡ�������˺�����
     *
     * @return bank_user - �������˺�����
     */
    public String getBankUser() {
        return bankUser;
    }

    /**
     * ���ÿ������˺�����
     *
     * @param bankUser �������˺�����
     */
    public void setBankUser(String bankUser) {
        this.bankUser = bankUser;
    }

    /**
     * ��ȡ������
     *
     * @return bank_name - ������
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * ���ÿ�����
     *
     * @param bankName ������
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}