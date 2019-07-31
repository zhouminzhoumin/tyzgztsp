package com.example.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "PL_PRODUCT_CATALOG")
public class PlProductCatalogVo {
    /**
     * 主键-
     */
	@Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "TYPE_CODE")
    private String typeCode;

    @Column(name = "TYPE_NAME")
    private String typeName;

    @Column(name = "COLUMN_CD")
    private String columnCd;

    @Column(name = "UPPER_COLUMN_CD")
    private String upperColumnCd;

    /**
     * 0:失效 1:正常
     */
    @Column(name = "COLUMN_STATE")
    private String columnState;

    @Column(name = "CREATE_OPRT")
    private String createOprt;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "PRODUCT_TYPE_FLAG")
    private String productTypeFlag;

    @Column(name = "LEAF")
    private String leaf;

    @Column(name = "PRODUCT_TYPE_CD")
    private String productTypeCd;

    @Column(name = "PRODUCT_TYPE_NAME")
    private String productTypeName;

    @Column(name = "PRODUCT_TYPE_ID")
    private String productTypeId;

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
     * @return TYPE_CODE
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * @param typeCode
     */
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    /**
     * @return TYPE_NAME
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @param typeName
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * @return COLUMN_CD
     */
    public String getColumnCd() {
        return columnCd;
    }

    /**
     * @param columnCd
     */
    public void setColumnCd(String columnCd) {
        this.columnCd = columnCd;
    }

    /**
     * @return UPPER_COLUMN_CD
     */
    public String getUpperColumnCd() {
        return upperColumnCd;
    }

    /**
     * @param upperColumnCd
     */
    public void setUpperColumnCd(String upperColumnCd) {
        this.upperColumnCd = upperColumnCd;
    }

    /**
     * 获取0:失效 1:正常
     *
     * @return COLUMN_STATE - 0:失效 1:正常
     */
    public String getColumnState() {
        return columnState;
    }

    /**
     * 设置0:失效 1:正常
     *
     * @param columnState 0:失效 1:正常
     */
    public void setColumnState(String columnState) {
        this.columnState = columnState;
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
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return PRODUCT_TYPE_FLAG
     */
    public String getProductTypeFlag() {
        return productTypeFlag;
    }

    /**
     * @param productTypeFlag
     */
    public void setProductTypeFlag(String productTypeFlag) {
        this.productTypeFlag = productTypeFlag;
    }

    /**
     * @return LEAF
     */
    public String getLeaf() {
        return leaf;
    }

    /**
     * @param leaf
     */
    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

    /**
     * @return PRODUCT_TYPE_CD
     */
    public String getProductTypeCd() {
        return productTypeCd;
    }

    /**
     * @param productTypeCd
     */
    public void setProductTypeCd(String productTypeCd) {
        this.productTypeCd = productTypeCd;
    }

    /**
     * @return PRODUCT_TYPE_NAME
     */
    public String getProductTypeName() {
        return productTypeName;
    }

    /**
     * @param productTypeName
     */
    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    /**
     * @return PRODUCT_TYPE_ID
     */
    public String getProductTypeId() {
        return productTypeId;
    }

    /**
     * @param productTypeId
     */
    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }
}