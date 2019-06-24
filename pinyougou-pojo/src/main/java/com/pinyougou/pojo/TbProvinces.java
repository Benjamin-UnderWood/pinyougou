package com.pinyougou.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_provinces")
public class TbProvinces implements Serializable {
    /**
     * ΨһID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * ʡ��ID
     */
    @Column(name = "provinceid")
    private String provinceid;

    /**
     * ʡ������
     */
    @Column(name = "province")
    private String province;

    private static final long serialVersionUID = 1L;

    /**
     * ��ȡΨһID
     *
     * @return id - ΨһID
     */
    public Integer getId() {
        return id;
    }

    /**
     * ����ΨһID
     *
     * @param id ΨһID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * ��ȡʡ��ID
     *
     * @return provinceid - ʡ��ID
     */
    public String getProvinceid() {
        return provinceid;
    }

    /**
     * ����ʡ��ID
     *
     * @param provinceid ʡ��ID
     */
    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }

    /**
     * ��ȡʡ������
     *
     * @return province - ʡ������
     */
    public String getProvince() {
        return province;
    }

    /**
     * ����ʡ������
     *
     * @param province ʡ������
     */
    public void setProvince(String province) {
        this.province = province;
    }
}