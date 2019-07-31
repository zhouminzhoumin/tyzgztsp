package com.example.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "PL_PRODUCT_COLUMN")
public class PlProductColumnVo {
    /**
     * 主键-
     */
	@Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 商品主键-
     */
    @Column(name = "PRODUCT_ID")
    private String productId;

    /**
     * 栏目主键-
     */
    @Column(name = "PRODUCT_COLUMN")
    private String productColumn;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    @Column(name = "CREATE_OPRT_ID")
    private String createOprtId;

    @Column(name = "CREATE_OPRT")
    private String createOprt;

    @Column(name = "MODIFY_DATE")
    private Date modifyDate;

    @Column(name = "MODIFY_OPRT_ID")
    private String modifyOprtId;

    @Column(name = "MODIFY_OPRT")
    private String modifyOprt;

    /**
     * 获取主键-
     *
     * @return ID - 主键-
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键-
     *
     * @param id 主键-
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取商品主键-
     *
     * @return PRODUCT_ID - 商品主键-
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置商品主键-
     *
     * @param productId 商品主键-
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获取栏目主键-
     *
     * @return PRODUCT_COLUMN - 栏目主键-
     */
    public String getProductColumn() {
        return productColumn;
    }

    /**
     * 设置栏目主键-
     *
     * @param productColumn 栏目主键-
     */
    public void setProductColumn(String productColumn) {
        this.productColumn = productColumn;
    }

    /**
     * @return CREATE_DATE
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return CREATE_OPRT_ID
     */
    public String getCreateOprtId() {
        return createOprtId;
    }

    /**
     * @param createOprtId
     */
    public void setCreateOprtId(String createOprtId) {
        this.createOprtId = createOprtId;
    }

    /**
     * @return CREATE_OPRT
     */
    public String getCreateOprt() {
        return createOprt;
    }

    /**
     * @param createOprt
     */
    public void setCreateOprt(String createOprt) {
        this.createOprt = createOprt;
    }

    /**
     * @return MODIFY_DATE
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * @param modifyDate
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * @return MODIFY_OPRT_ID
     */
    public String getModifyOprtId() {
        return modifyOprtId;
    }

    /**
     * @param modifyOprtId
     */
    public void setModifyOprtId(String modifyOprtId) {
        this.modifyOprtId = modifyOprtId;
    }

    /**
     * @return MODIFY_OPRT
     */
    public String getModifyOprt() {
        return modifyOprt;
    }

    /**
     * @param modifyOprt
     */
    public void setModifyOprt(String modifyOprt) {
        this.modifyOprt = modifyOprt;
    }
}