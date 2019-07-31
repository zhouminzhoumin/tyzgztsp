package com.example.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "PRODUCT_COLUMN")
public class ProductColumnVo {
    /**
     * 主键-
     */
	@Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 栏目序号-
     */
    @Column(name = "COLUMN_NO")
    private String columnNo;

    /**
     * 栏目名称-
     */
    @Column(name = "COLUMN_NAME")
    private String columnName;

    /**
     * 是否发布-0=否，1是
     */
    @Column(name = "IS_PUBLISH")
    private String isPublish;

    /**
     * 上级编码-
     */
    @Column(name = "HIGH_COLUMN_CODE")
    private String highColumnCode;

    /**
     * 栏目类型-0=父栏目，1=子栏目
     */
    @Column(name = "COLUMN_TYPE")
    private String columnType;

    /**
     * 省分编码-
     */
    @Column(name = "PROVICE_CODE")
    private String proviceCode;

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

    @Column(name = "CREATE_DATE")
    private Date createDate;

    /**
     * 完全编码-
     */
    @Column(name = "TOTAL_CODE")
    private String totalCode;

    @Column(name = "RELATE")
    private String relate;

    /**
     * 栏目描述-
     */
    @Column(name = "COLUMN_MOME")
    private String columnMome;

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
     * 获取栏目序号-
     *
     * @return COLUMN_NO - 栏目序号-
     */
    public String getColumnNo() {
        return columnNo;
    }

    /**
     * 设置栏目序号-
     *
     * @param columnNo 栏目序号-
     */
    public void setColumnNo(String columnNo) {
        this.columnNo = columnNo;
    }

    /**
     * 获取栏目名称-
     *
     * @return COLUMN_NAME - 栏目名称-
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * 设置栏目名称-
     *
     * @param columnName 栏目名称-
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * 获取是否发布-0=否，1是
     *
     * @return IS_PUBLISH - 是否发布-0=否，1是
     */
    public String getIsPublish() {
        return isPublish;
    }

    /**
     * 设置是否发布-0=否，1是
     *
     * @param isPublish 是否发布-0=否，1是
     */
    public void setIsPublish(String isPublish) {
        this.isPublish = isPublish;
    }

    /**
     * 获取上级编码-
     *
     * @return HIGH_COLUMN_CODE - 上级编码-
     */
    public String getHighColumnCode() {
        return highColumnCode;
    }

    /**
     * 设置上级编码-
     *
     * @param highColumnCode 上级编码-
     */
    public void setHighColumnCode(String highColumnCode) {
        this.highColumnCode = highColumnCode;
    }

    /**
     * 获取栏目类型-0=父栏目，1=子栏目
     *
     * @return COLUMN_TYPE - 栏目类型-0=父栏目，1=子栏目
     */
    public String getColumnType() {
        return columnType;
    }

    /**
     * 设置栏目类型-0=父栏目，1=子栏目
     *
     * @param columnType 栏目类型-0=父栏目，1=子栏目
     */
    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    /**
     * 获取省分编码-
     *
     * @return PROVICE_CODE - 省分编码-
     */
    public String getProviceCode() {
        return proviceCode;
    }

    /**
     * 设置省分编码-
     *
     * @param proviceCode 省分编码-
     */
    public void setProviceCode(String proviceCode) {
        this.proviceCode = proviceCode;
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
     * 获取完全编码-
     *
     * @return TOTAL_CODE - 完全编码-
     */
    public String getTotalCode() {
        return totalCode;
    }

    /**
     * 设置完全编码-
     *
     * @param totalCode 完全编码-
     */
    public void setTotalCode(String totalCode) {
        this.totalCode = totalCode;
    }

    /**
     * @return RELATE
     */
    public String getRelate() {
        return relate;
    }

    /**
     * @param relate
     */
    public void setRelate(String relate) {
        this.relate = relate;
    }

    /**
     * 获取栏目描述-
     *
     * @return COLUMN_MOME - 栏目描述-
     */
    public String getColumnMome() {
        return columnMome;
    }

    /**
     * 设置栏目描述-
     *
     * @param columnMome 栏目描述-
     */
    public void setColumnMome(String columnMome) {
        this.columnMome = columnMome;
    }
}