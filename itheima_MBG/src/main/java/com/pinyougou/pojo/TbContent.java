package com.pinyougou.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_content")
public class TbContent implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ������ĿID
     */
    @Column(name = "category_id")
    private Long categoryId;

    /**
     * ���ݱ���
     */
    @Column(name = "title")
    private String title;

    /**
     * ����
     */
    @Column(name = "url")
    private String url;

    /**
     * ͼƬ����·��
     */
    @Column(name = "pic")
    private String pic;

    /**
     * ����
     */
    @Column(name = "content")
    private String content;

    /**
     * ״̬
     */
    @Column(name = "status")
    private String status;

    /**
     * ����
     */
    @Column(name = "sort_order")
    private Integer sortOrder;

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
     * ��ȡ������ĿID
     *
     * @return category_id - ������ĿID
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * ����������ĿID
     *
     * @param categoryId ������ĿID
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * ��ȡ���ݱ���
     *
     * @return title - ���ݱ���
     */
    public String getTitle() {
        return title;
    }

    /**
     * �������ݱ���
     *
     * @param title ���ݱ���
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * ��ȡ����
     *
     * @return url - ����
     */
    public String getUrl() {
        return url;
    }

    /**
     * ��������
     *
     * @param url ����
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * ��ȡͼƬ����·��
     *
     * @return pic - ͼƬ����·��
     */
    public String getPic() {
        return pic;
    }

    /**
     * ����ͼƬ����·��
     *
     * @param pic ͼƬ����·��
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * ��ȡ����
     *
     * @return content - ����
     */
    public String getContent() {
        return content;
    }

    /**
     * ��������
     *
     * @param content ����
     */
    public void setContent(String content) {
        this.content = content;
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

    /**
     * ��ȡ����
     *
     * @return sort_order - ����
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * ��������
     *
     * @param sortOrder ����
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
}