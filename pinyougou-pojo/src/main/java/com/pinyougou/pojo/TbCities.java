package com.pinyougou.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_cities")
public class TbCities implements Serializable {
    /**
     * ΨһID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * ����ID
     */
    @Column(name = "cityid")
    private String cityid;

    /**
     * ��������
     */
    @Column(name = "city")
    private String city;

    /**
     * ʡ��ID
     */
    @Column(name = "provinceid")
    private String provinceid;

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
     * ��ȡ����ID
     *
     * @return cityid - ����ID
     */
    public String getCityid() {
        return cityid;
    }

    /**
     * ���ó���ID
     *
     * @param cityid ����ID
     */
    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    /**
     * ��ȡ��������
     *
     * @return city - ��������
     */
    public String getCity() {
        return city;
    }

    /**
     * ���ó�������
     *
     * @param city ��������
     */
    public void setCity(String city) {
        this.city = city;
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
}