package com.pinyougou.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_content_category")
public class TbContentCategory implements Serializable {
    /**
     * ��ĿID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ��������
     */
    @Column(name = "name")
    private String name;

    /**
     * ����
     */
    @Column(name = "content_group")
    private String contentGroup;

    /**
     * ����key
     */
    @Column(name = "content_key")
    private String contentKey;

    /**
     * ״̬
     */
    @Column(name = "status")
    private String status;

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
     * ��ȡ��������
     *
     * @return name - ��������
     */
    public String getName() {
        return name;
    }

    /**
     * ���÷�������
     *
     * @param name ��������
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ����
     *
     * @return content_group - ����
     */
    public String getContentGroup() {
        return contentGroup;
    }

    /**
     * ���÷���
     *
     * @param contentGroup ����
     */
    public void setContentGroup(String contentGroup) {
        this.contentGroup = contentGroup;
    }

    /**
     * ��ȡ����key
     *
     * @return content_key - ����key
     */
    public String getContentKey() {
        return contentKey;
    }

    /**
     * ���÷���key
     *
     * @param contentKey ����key
     */
    public void setContentKey(String contentKey) {
        this.contentKey = contentKey;
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
}