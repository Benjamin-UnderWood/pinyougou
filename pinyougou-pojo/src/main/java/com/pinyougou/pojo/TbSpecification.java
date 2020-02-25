package com.pinyougou.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_specification")
public class TbSpecification implements Serializable {
    /**
     * ����
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ����
     */
    @Column(name = "spec_name")
    private String specName;

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
     * ��ȡ����
     *
     * @return spec_name - ����
     */
    public String getSpecName() {
        return specName;
    }

    /**
     * ��������
     *
     * @param specName ����
     */
    public void setSpecName(String specName) {
        this.specName = specName;
    }
}