package com.pinyougou.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_seckill_order")
public class TbSeckillOrder implements Serializable {
    /**
     * ����
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ��ɱ��ƷID
     */
    @Column(name = "seckill_id")
    private Long seckillId;

    /**
     * ֧�����
     */
    @Column(name = "money")
    private BigDecimal money;

    /**
     * �û�
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * �̼�
     */
    @Column(name = "seller_id")
    private String sellerId;

    /**
     * ����ʱ��
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * ֧��ʱ��
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * ״̬
     */
    @Column(name = "status")
    private String status;

    /**
     * �ջ��˵�ַ
     */
    @Column(name = "receiver_address")
    private String receiverAddress;

    /**
     * �ջ��˵绰
     */
    @Column(name = "receiver_mobile")
    private String receiverMobile;

    /**
     * �ջ���
     */
    @Column(name = "receiver")
    private String receiver;

    /**
     * ������ˮ
     */
    @Column(name = "transaction_id")
    private String transactionId;

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
     * ��ȡ��ɱ��ƷID
     *
     * @return seckill_id - ��ɱ��ƷID
     */
    public Long getSeckillId() {
        return seckillId;
    }

    /**
     * ������ɱ��ƷID
     *
     * @param seckillId ��ɱ��ƷID
     */
    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    /**
     * ��ȡ֧�����
     *
     * @return money - ֧�����
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * ����֧�����
     *
     * @param money ֧�����
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * ��ȡ�û�
     *
     * @return user_id - �û�
     */
    public String getUserId() {
        return userId;
    }

    /**
     * �����û�
     *
     * @param userId �û�
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * ��ȡ�̼�
     *
     * @return seller_id - �̼�
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * �����̼�
     *
     * @param sellerId �̼�
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
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
     * ��ȡ֧��ʱ��
     *
     * @return pay_time - ֧��ʱ��
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * ����֧��ʱ��
     *
     * @param payTime ֧��ʱ��
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
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
     * ��ȡ�ջ��˵�ַ
     *
     * @return receiver_address - �ջ��˵�ַ
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * �����ջ��˵�ַ
     *
     * @param receiverAddress �ջ��˵�ַ
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    /**
     * ��ȡ�ջ��˵绰
     *
     * @return receiver_mobile - �ջ��˵绰
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * �����ջ��˵绰
     *
     * @param receiverMobile �ջ��˵绰
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    /**
     * ��ȡ�ջ���
     *
     * @return receiver - �ջ���
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * �����ջ���
     *
     * @param receiver �ջ���
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
     * ��ȡ������ˮ
     *
     * @return transaction_id - ������ˮ
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * ���ý�����ˮ
     *
     * @param transactionId ������ˮ
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}