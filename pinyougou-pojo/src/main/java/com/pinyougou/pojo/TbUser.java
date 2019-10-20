package com.pinyougou.pojo;

import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Table(name = "tb_user")
public class TbUser implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * �û���
     */
    @Column(name = "username")
    @NotBlank(message = "�û�������Ϊ��!")
    @Pattern(regexp = "^[a-zA-Z0-9\\u4E00-\\u9FA5]+$",message = "�û���ֻ��Ϊ���ֻ�����ĸ!")
    private String username;

    /**
     * ���룬���ܴ洢
     */
    @Column(name = "password")
    @NotBlank(message = "���벻��Ϊ��!")
    private String password;

    /**
     * ע���ֻ���
     */
    @Column(name = "phone")
    @NotBlank(message = "�ֻ��Ų�����Ϊ��!")
    @Pattern(regexp = "[1][3|4|5|7|8][0-9]{9}",message = "�ֻ��Ÿ�ʽ����ȷ��")
    private String phone;

    /**
     * ע������
     */
    @Column(name = "email")
    private String email;

    /**
     * ����ʱ��
     */
    @Column(name = "created")
    private Date created;

    @Column(name = "updated")
    private Date updated;

    /**
     * ��Ա��Դ��1:PC��2��H5��3��Android��4��IOS��5��WeChat
     */
    @Column(name = "source_type")
    private String sourceType;

    /**
     * �ǳ�
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * ��ʵ����
     */
    @Column(name = "name")
    private String name;

    /**
     * ʹ��״̬��Y���� N��������
     */
    @Column(name = "status")
    private String status;

    /**
     * ͷ���ַ
     */
    @Column(name = "head_pic")
    private String headPic;

    /**
     * QQ����
     */
    @Column(name = "qq")
    private String qq;

    /**
     * �˻����
     */
    @Column(name = "account_balance")
    private Long accountBalance;

    /**
     * �ֻ��Ƿ���֤ ��0��  1�ǣ�
     */
    @Column(name = "is_mobile_check")
    private String isMobileCheck;

    /**
     * �����Ƿ��⣨0��  1�ǣ�
     */
    @Column(name = "is_email_check")
    private String isEmailCheck;

    /**
     * �Ա�1�У�2Ů
     */
    @Column(name = "sex")
    private String sex;

    /**
     * ��Ա�ȼ�
     */
    @Column(name = "user_level")
    private Integer userLevel;

    /**
     * ����
     */
    @Column(name = "points")
    private Integer points;

    /**
     * ����ֵ
     */
    @Column(name = "experience_value")
    private Integer experienceValue;

    /**
     * ����
     */
    @Column(name = "birthday")
    private Date birthday;

    /**
     * ����¼ʱ��
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

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
     * ��ȡ�û���
     *
     * @return username - �û���
     */
    public String getUsername() {
        return username;
    }

    /**
     * �����û���
     *
     * @param username �û���
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * ��ȡ���룬���ܴ洢
     *
     * @return password - ���룬���ܴ洢
     */
    public String getPassword() {
        return password;
    }

    /**
     * �������룬���ܴ洢
     *
     * @param password ���룬���ܴ洢
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ��ȡע���ֻ���
     *
     * @return phone - ע���ֻ���
     */
    public String getPhone() {
        return phone;
    }

    /**
     * ����ע���ֻ���
     *
     * @param phone ע���ֻ���
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * ��ȡע������
     *
     * @return email - ע������
     */
    public String getEmail() {
        return email;
    }

    /**
     * ����ע������
     *
     * @param email ע������
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return created - ����ʱ��
     */
    public Date getCreated() {
        return created;
    }

    /**
     * ���ô���ʱ��
     *
     * @param created ����ʱ��
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return updated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * @param updated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * ��ȡ��Ա��Դ��1:PC��2��H5��3��Android��4��IOS��5��WeChat
     *
     * @return source_type - ��Ա��Դ��1:PC��2��H5��3��Android��4��IOS��5��WeChat
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * ���û�Ա��Դ��1:PC��2��H5��3��Android��4��IOS��5��WeChat
     *
     * @param sourceType ��Ա��Դ��1:PC��2��H5��3��Android��4��IOS��5��WeChat
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * ��ȡ�ǳ�
     *
     * @return nick_name - �ǳ�
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * �����ǳ�
     *
     * @param nickName �ǳ�
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * ��ȡ��ʵ����
     *
     * @return name - ��ʵ����
     */
    public String getName() {
        return name;
    }

    /**
     * ������ʵ����
     *
     * @param name ��ʵ����
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡʹ��״̬��Y���� N��������
     *
     * @return status - ʹ��״̬��Y���� N��������
     */
    public String getStatus() {
        return status;
    }

    /**
     * ����ʹ��״̬��Y���� N��������
     *
     * @param status ʹ��״̬��Y���� N��������
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * ��ȡͷ���ַ
     *
     * @return head_pic - ͷ���ַ
     */
    public String getHeadPic() {
        return headPic;
    }

    /**
     * ����ͷ���ַ
     *
     * @param headPic ͷ���ַ
     */
    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    /**
     * ��ȡQQ����
     *
     * @return qq - QQ����
     */
    public String getQq() {
        return qq;
    }

    /**
     * ����QQ����
     *
     * @param qq QQ����
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * ��ȡ�˻����
     *
     * @return account_balance - �˻����
     */
    public Long getAccountBalance() {
        return accountBalance;
    }

    /**
     * �����˻����
     *
     * @param accountBalance �˻����
     */
    public void setAccountBalance(Long accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * ��ȡ�ֻ��Ƿ���֤ ��0��  1�ǣ�
     *
     * @return is_mobile_check - �ֻ��Ƿ���֤ ��0��  1�ǣ�
     */
    public String getIsMobileCheck() {
        return isMobileCheck;
    }

    /**
     * �����ֻ��Ƿ���֤ ��0��  1�ǣ�
     *
     * @param isMobileCheck �ֻ��Ƿ���֤ ��0��  1�ǣ�
     */
    public void setIsMobileCheck(String isMobileCheck) {
        this.isMobileCheck = isMobileCheck;
    }

    /**
     * ��ȡ�����Ƿ��⣨0��  1�ǣ�
     *
     * @return is_email_check - �����Ƿ��⣨0��  1�ǣ�
     */
    public String getIsEmailCheck() {
        return isEmailCheck;
    }

    /**
     * ���������Ƿ��⣨0��  1�ǣ�
     *
     * @param isEmailCheck �����Ƿ��⣨0��  1�ǣ�
     */
    public void setIsEmailCheck(String isEmailCheck) {
        this.isEmailCheck = isEmailCheck;
    }

    /**
     * ��ȡ�Ա�1�У�2Ů
     *
     * @return sex - �Ա�1�У�2Ů
     */
    public String getSex() {
        return sex;
    }

    /**
     * �����Ա�1�У�2Ů
     *
     * @param sex �Ա�1�У�2Ů
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * ��ȡ��Ա�ȼ�
     *
     * @return user_level - ��Ա�ȼ�
     */
    public Integer getUserLevel() {
        return userLevel;
    }

    /**
     * ���û�Ա�ȼ�
     *
     * @param userLevel ��Ա�ȼ�
     */
    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    /**
     * ��ȡ����
     *
     * @return points - ����
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * ���û���
     *
     * @param points ����
     */
    public void setPoints(Integer points) {
        this.points = points;
    }

    /**
     * ��ȡ����ֵ
     *
     * @return experience_value - ����ֵ
     */
    public Integer getExperienceValue() {
        return experienceValue;
    }

    /**
     * ���þ���ֵ
     *
     * @param experienceValue ����ֵ
     */
    public void setExperienceValue(Integer experienceValue) {
        this.experienceValue = experienceValue;
    }

    /**
     * ��ȡ����
     *
     * @return birthday - ����
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * ��������
     *
     * @param birthday ����
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * ��ȡ����¼ʱ��
     *
     * @return last_login_time - ����¼ʱ��
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * ��������¼ʱ��
     *
     * @param lastLoginTime ����¼ʱ��
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}