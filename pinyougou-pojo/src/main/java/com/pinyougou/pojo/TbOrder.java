package com.pinyougou.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_order")
public class TbOrder implements Serializable {
    /**
     * ����id
     */
    @Id
    @Column(name = "order_id")
    private Long orderId;

    /**
     * ʵ������ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
     */
    @Column(name = "payment")
    private BigDecimal payment;

    /**
     * ֧�����ͣ�1������֧����2����������
     */
    @Column(name = "payment_type")
    private String paymentType;

    /**
     * �ʷѡ���ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
     */
    @Column(name = "post_fee")
    private String postFee;

    /**
     * ״̬��1��δ���2���Ѹ��3��δ������4���ѷ�����5�����׳ɹ���6�����׹ر�,7��������
     */
    @Column(name = "status")
    private String status;

    /**
     * ��������ʱ��
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * ��������ʱ��
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * ����ʱ��
     */
    @Column(name = "payment_time")
    private Date paymentTime;

    /**
     * ����ʱ��
     */
    @Column(name = "consign_time")
    private Date consignTime;

    /**
     * �������ʱ��
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * ���׹ر�ʱ��
     */
    @Column(name = "close_time")
    private Date closeTime;

    /**
     * ��������
     */
    @Column(name = "shipping_name")
    private String shippingName;

    /**
     * ��������
     */
    @Column(name = "shipping_code")
    private String shippingCode;

    /**
     * �û�id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * �������
     */
    @Column(name = "buyer_message")
    private String buyerMessage;

    /**
     * ����ǳ�
     */
    @Column(name = "buyer_nick")
    private String buyerNick;

    /**
     * ����Ƿ��Ѿ�����
     */
    @Column(name = "buyer_rate")
    private String buyerRate;

    /**
     * �ջ��˵�������(ʡ���У���)�ֵ�
     */
    @Column(name = "receiver_area_name")
    private String receiverAreaName;

    /**
     * �ջ����ֻ�
     */
    @Column(name = "receiver_mobile")
    private String receiverMobile;

    /**
     * �ջ����ʱ�
     */
    @Column(name = "receiver_zip_code")
    private String receiverZipCode;

    /**
     * �ջ���
     */
    @Column(name = "receiver")
    private String receiver;

    /**
     * ����ʱ�䣬��������
     */
    @Column(name = "expire")
    private Date expire;

    /**
     * ��Ʊ����(��ͨ��Ʊ�����ӷ�Ʊ����ֵ˰��Ʊ)
     */
    @Column(name = "invoice_type")
    private String invoiceType;

    /**
     * ������Դ��1:app�ˣ�2��pc�ˣ�3��M�ˣ�4��΢�Ŷˣ�5���ֻ�qq��
     */
    @Column(name = "source_type")
    private String sourceType;

    /**
     * �̼�ID
     */
    @Column(name = "seller_id")
    private String sellerId;

    private static final long serialVersionUID = 1L;

    /**
     * ��ȡ����id
     *
     * @return order_id - ����id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * ���ö���id
     *
     * @param orderId ����id
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * ��ȡʵ������ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
     *
     * @return payment - ʵ������ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
     */
    public BigDecimal getPayment() {
        return payment;
    }

    /**
     * ����ʵ������ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
     *
     * @param payment ʵ������ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
     */
    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    /**
     * ��ȡ֧�����ͣ�1������֧����2����������
     *
     * @return payment_type - ֧�����ͣ�1������֧����2����������
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * ����֧�����ͣ�1������֧����2����������
     *
     * @param paymentType ֧�����ͣ�1������֧����2����������
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * ��ȡ�ʷѡ���ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
     *
     * @return post_fee - �ʷѡ���ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
     */
    public String getPostFee() {
        return postFee;
    }

    /**
     * �����ʷѡ���ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
     *
     * @param postFee �ʷѡ���ȷ��2λС��;��λ:Ԫ����:200.07����ʾ:200Ԫ7��
     */
    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    /**
     * ��ȡ״̬��1��δ���2���Ѹ��3��δ������4���ѷ�����5�����׳ɹ���6�����׹ر�,7��������
     *
     * @return status - ״̬��1��δ���2���Ѹ��3��δ������4���ѷ�����5�����׳ɹ���6�����׹ر�,7��������
     */
    public String getStatus() {
        return status;
    }

    /**
     * ����״̬��1��δ���2���Ѹ��3��δ������4���ѷ�����5�����׳ɹ���6�����׹ر�,7��������
     *
     * @param status ״̬��1��δ���2���Ѹ��3��δ������4���ѷ�����5�����׳ɹ���6�����׹ر�,7��������
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * ��ȡ��������ʱ��
     *
     * @return create_time - ��������ʱ��
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * ���ö�������ʱ��
     *
     * @param createTime ��������ʱ��
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * ��ȡ��������ʱ��
     *
     * @return update_time - ��������ʱ��
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * ���ö�������ʱ��
     *
     * @param updateTime ��������ʱ��
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return payment_time - ����ʱ��
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * ���ø���ʱ��
     *
     * @param paymentTime ����ʱ��
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return consign_time - ����ʱ��
     */
    public Date getConsignTime() {
        return consignTime;
    }

    /**
     * ���÷���ʱ��
     *
     * @param consignTime ����ʱ��
     */
    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    /**
     * ��ȡ�������ʱ��
     *
     * @return end_time - �������ʱ��
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * ���ý������ʱ��
     *
     * @param endTime �������ʱ��
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * ��ȡ���׹ر�ʱ��
     *
     * @return close_time - ���׹ر�ʱ��
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * ���ý��׹ر�ʱ��
     *
     * @param closeTime ���׹ر�ʱ��
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * ��ȡ��������
     *
     * @return shipping_name - ��������
     */
    public String getShippingName() {
        return shippingName;
    }

    /**
     * ������������
     *
     * @param shippingName ��������
     */
    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    /**
     * ��ȡ��������
     *
     * @return shipping_code - ��������
     */
    public String getShippingCode() {
        return shippingCode;
    }

    /**
     * ������������
     *
     * @param shippingCode ��������
     */
    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
    }

    /**
     * ��ȡ�û�id
     *
     * @return user_id - �û�id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * �����û�id
     *
     * @param userId �û�id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * ��ȡ�������
     *
     * @return buyer_message - �������
     */
    public String getBuyerMessage() {
        return buyerMessage;
    }

    /**
     * �����������
     *
     * @param buyerMessage �������
     */
    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage;
    }

    /**
     * ��ȡ����ǳ�
     *
     * @return buyer_nick - ����ǳ�
     */
    public String getBuyerNick() {
        return buyerNick;
    }

    /**
     * ��������ǳ�
     *
     * @param buyerNick ����ǳ�
     */
    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    /**
     * ��ȡ����Ƿ��Ѿ�����
     *
     * @return buyer_rate - ����Ƿ��Ѿ�����
     */
    public String getBuyerRate() {
        return buyerRate;
    }

    /**
     * ��������Ƿ��Ѿ�����
     *
     * @param buyerRate ����Ƿ��Ѿ�����
     */
    public void setBuyerRate(String buyerRate) {
        this.buyerRate = buyerRate;
    }

    /**
     * ��ȡ�ջ��˵�������(ʡ���У���)�ֵ�
     *
     * @return receiver_area_name - �ջ��˵�������(ʡ���У���)�ֵ�
     */
    public String getReceiverAreaName() {
        return receiverAreaName;
    }

    /**
     * �����ջ��˵�������(ʡ���У���)�ֵ�
     *
     * @param receiverAreaName �ջ��˵�������(ʡ���У���)�ֵ�
     */
    public void setReceiverAreaName(String receiverAreaName) {
        this.receiverAreaName = receiverAreaName;
    }

    /**
     * ��ȡ�ջ����ֻ�
     *
     * @return receiver_mobile - �ջ����ֻ�
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * �����ջ����ֻ�
     *
     * @param receiverMobile �ջ����ֻ�
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    /**
     * ��ȡ�ջ����ʱ�
     *
     * @return receiver_zip_code - �ջ����ʱ�
     */
    public String getReceiverZipCode() {
        return receiverZipCode;
    }

    /**
     * �����ջ����ʱ�
     *
     * @param receiverZipCode �ջ����ʱ�
     */
    public void setReceiverZipCode(String receiverZipCode) {
        this.receiverZipCode = receiverZipCode;
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
     * ��ȡ����ʱ�䣬��������
     *
     * @return expire - ����ʱ�䣬��������
     */
    public Date getExpire() {
        return expire;
    }

    /**
     * ���ù���ʱ�䣬��������
     *
     * @param expire ����ʱ�䣬��������
     */
    public void setExpire(Date expire) {
        this.expire = expire;
    }

    /**
     * ��ȡ��Ʊ����(��ͨ��Ʊ�����ӷ�Ʊ����ֵ˰��Ʊ)
     *
     * @return invoice_type - ��Ʊ����(��ͨ��Ʊ�����ӷ�Ʊ����ֵ˰��Ʊ)
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * ���÷�Ʊ����(��ͨ��Ʊ�����ӷ�Ʊ����ֵ˰��Ʊ)
     *
     * @param invoiceType ��Ʊ����(��ͨ��Ʊ�����ӷ�Ʊ����ֵ˰��Ʊ)
     */
    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    /**
     * ��ȡ������Դ��1:app�ˣ�2��pc�ˣ�3��M�ˣ�4��΢�Ŷˣ�5���ֻ�qq��
     *
     * @return source_type - ������Դ��1:app�ˣ�2��pc�ˣ�3��M�ˣ�4��΢�Ŷˣ�5���ֻ�qq��
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * ���ö�����Դ��1:app�ˣ�2��pc�ˣ�3��M�ˣ�4��΢�Ŷˣ�5���ֻ�qq��
     *
     * @param sourceType ������Դ��1:app�ˣ�2��pc�ˣ�3��M�ˣ�4��΢�Ŷˣ�5���ֻ�qq��
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
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
}