package com.pinyougou.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_areas")
public class TbAreas implements Serializable {
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
    @Column(name = "areaid")
    private String areaid;

    /**
     * ��������
     */
    @Column(name = "area")
    private String area;

    /**
     * ����ID
     */
    @Column(name = "cityid")
    private String cityid;

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
     * @return areaid - ����ID
     */
    public String getAreaid() {
        return areaid;
    }

    /**
     * ��������ID
     *
     * @param areaid ����ID
     */
    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    /**
     * ��ȡ��������
     *
     * @return area - ��������
     */
    public String getArea() {
        return area;
    }

    /**
     * ������������
     *
     * @param area ��������
     */
    public void setArea(String area) {
        this.area = area;
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
}