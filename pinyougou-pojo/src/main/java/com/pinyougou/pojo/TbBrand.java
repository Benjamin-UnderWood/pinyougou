package com.pinyougou.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_brand")
public class TbBrand implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Ʒ������
     */
    @Column(name = "name")
    private String name;

    /**
     * Ʒ������ĸ
     */
    @Column(name = "first_char")
    private String firstChar;

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
     * ��ȡƷ������
     *
     * @return name - Ʒ������
     */
    public String getName() {
        return name;
    }

    /**
     * ����Ʒ������
     *
     * @param name Ʒ������
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡƷ������ĸ
     *
     * @return first_char - Ʒ������ĸ
     */
    public String getFirstChar() {
        return firstChar;
    }

    /**
     * ����Ʒ������ĸ
     *
     * @param firstChar Ʒ������ĸ
     */
    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }
}