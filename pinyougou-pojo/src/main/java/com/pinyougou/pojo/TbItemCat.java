package com.pinyougou.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_item_cat")
public class TbItemCat implements Serializable {
    /**
     * ��ĿID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ����ĿID=0ʱ���������һ������Ŀ
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * ��Ŀ����
     */
    @Column(name = "name")
    private String name;

    /**
     * ����id
     */
    @Column(name = "type_id")
    private Long typeId;

    private static final long serialVersionUID = 1L;

    /**
     * ��ȡ��ĿID
     *
     * @return id - ��ĿID
     */
    public Long getId() {
        return id;
    }

    /**
     * ������ĿID
     *
     * @param id ��ĿID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ��ȡ����ĿID=0ʱ���������һ������Ŀ
     *
     * @return parent_id - ����ĿID=0ʱ���������һ������Ŀ
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * ���ø���ĿID=0ʱ���������һ������Ŀ
     *
     * @param parentId ����ĿID=0ʱ���������һ������Ŀ
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * ��ȡ��Ŀ����
     *
     * @return name - ��Ŀ����
     */
    public String getName() {
        return name;
    }

    /**
     * ������Ŀ����
     *
     * @param name ��Ŀ����
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ����id
     *
     * @return type_id - ����id
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * ��������id
     *
     * @param typeId ����id
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }
}