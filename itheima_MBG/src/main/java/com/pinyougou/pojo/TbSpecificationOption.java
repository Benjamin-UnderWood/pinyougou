package com.pinyougou.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_specification_option")
public class TbSpecificationOption implements Serializable {
    /**
     * �����ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ���������
     */
    @Column(name = "option_name")
    private String optionName;

    /**
     * ���ID
     */
    @Column(name = "spec_id")
    private Long specId;

    /**
     * ����ֵ
     */
    @Column(name = "orders")
    private Integer orders;

    private static final long serialVersionUID = 1L;

    /**
     * ��ȡ�����ID
     *
     * @return id - �����ID
     */
    public Long getId() {
        return id;
    }

    /**
     * ���ù����ID
     *
     * @param id �����ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ��ȡ���������
     *
     * @return option_name - ���������
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * ���ù��������
     *
     * @param optionName ���������
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    /**
     * ��ȡ���ID
     *
     * @return spec_id - ���ID
     */
    public Long getSpecId() {
        return specId;
    }

    /**
     * ���ù��ID
     *
     * @param specId ���ID
     */
    public void setSpecId(Long specId) {
        this.specId = specId;
    }

    /**
     * ��ȡ����ֵ
     *
     * @return orders - ����ֵ
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * ��������ֵ
     *
     * @param orders ����ֵ
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }
}