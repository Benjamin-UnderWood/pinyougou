package com.pinyougou.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_pay_log")
public class TbPayLog implements Serializable {
    /**
     * ֧��������
     */
    @Id
    @Column(name = "out_trade_no")
    private String outTradeNo;

    /**
     * ��������
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * ֧�����ʱ��
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * ֧�����֣�
     */
    @Column(name = "total_fee")
    private Long totalFee;

    /**
     * �û�ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * ���׺���
     */
    @Column(name = "transaction_id")
    private String transactionId;

    /**
     * ����״̬ 0  1:��֧��
     */
    @Column(name = "trade_state")
    private String tradeState;

    /**
     * ��������б�
     */
    @Column(name = "order_list")
    private String orderList;

    /**
     * ֧������
     */
    @Column(name = "pay_type")
    private String payType;

    private static final long serialVersionUID = 1L;

    /**
     * ��ȡ֧��������
     *
     * @return out_trade_no - ֧��������
     */
    public String getOutTradeNo() {
        return outTradeNo;
    }

    /**
     * ����֧��������
     *
     * @param outTradeNo ֧��������
     */
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
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
     * ��ȡ֧�����ʱ��
     *
     * @return pay_time - ֧�����ʱ��
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * ����֧�����ʱ��
     *
     * @param payTime ֧�����ʱ��
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * ��ȡ֧�����֣�
     *
     * @return total_fee - ֧�����֣�
     */
    public Long getTotalFee() {
        return totalFee;
    }

    /**
     * ����֧�����֣�
     *
     * @param totalFee ֧�����֣�
     */
    public void setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
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
     * ��ȡ���׺���
     *
     * @return transaction_id - ���׺���
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * ���ý��׺���
     *
     * @param transactionId ���׺���
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * ��ȡ����״̬ 0  1:��֧��
     *
     * @return trade_state - ����״̬ 0  1:��֧��
     */
    public String getTradeState() {
        return tradeState;
    }

    /**
     * ���ý���״̬ 0  1:��֧��
     *
     * @param tradeState ����״̬ 0  1:��֧��
     */
    public void setTradeState(String tradeState) {
        this.tradeState = tradeState;
    }

    /**
     * ��ȡ��������б�
     *
     * @return order_list - ��������б�
     */
    public String getOrderList() {
        return orderList;
    }

    /**
     * ���ö�������б�
     *
     * @param orderList ��������б�
     */
    public void setOrderList(String orderList) {
        this.orderList = orderList;
    }

    /**
     * ��ȡ֧������
     *
     * @return pay_type - ֧������
     */
    public String getPayType() {
        return payType;
    }

    /**
     * ����֧������
     *
     * @param payType ֧������
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }
}