package com.example.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "PL_PRODUCT_INFO_PIC")
public class PlProductInfoPicVo {
    /**
     * 主键-
     */
	@Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 商品ID-
     */
    @Column(name = "PRODUCT_ID")
    private String productId;

    /**
     * 图标名称-
     */
    @Column(name = "PIC_NAME")
    private String picName;

    /**
     * 图标地址-
     */
    @Column(name = "PIC_URL")
    private String picUrl;

    /**
     * 缩略图地址-
     */
    @Column(name = "SMALL_PIC_URL")
    private String smallPicUrl;

    /**
     * 排序值-
     */
    @Column(name = "SORT")
    private Integer sort;

    /**
     * 图标类型-幻灯图=1,详情图=2,列表图=3
     */
    @Column(name = "ICON_TYPE")
    private String iconType;

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
     * 获取商品ID-
     *
     * @return PRODUCT_ID - 商品ID-
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置商品ID-
     *
     * @param productId 商品ID-
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获取图标名称-
     *
     * @return PIC_NAME - 图标名称-
     */
    public String getPicName() {
        return picName;
    }

    /**
     * 设置图标名称-
     *
     * @param picName 图标名称-
     */
    public void setPicName(String picName) {
        this.picName = picName;
    }

    /**
     * 获取图标地址-
     *
     * @return PIC_URL - 图标地址-
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 设置图标地址-
     *
     * @param picUrl 图标地址-
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    /**
     * 获取缩略图地址-
     *
     * @return SMALL_PIC_URL - 缩略图地址-
     */
    public String getSmallPicUrl() {
        return smallPicUrl;
    }

    /**
     * 设置缩略图地址-
     *
     * @param smallPicUrl 缩略图地址-
     */
    public void setSmallPicUrl(String smallPicUrl) {
        this.smallPicUrl = smallPicUrl;
    }

    /**
     * 获取排序值-
     *
     * @return SORT - 排序值-
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序值-
     *
     * @param sort 排序值-
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取图标类型-幻灯图=1,详情图=2,列表图=3
     *
     * @return ICON_TYPE - 图标类型-幻灯图=1,详情图=2,列表图=3
     */
    public String getIconType() {
        return iconType;
    }

    /**
     * 设置图标类型-幻灯图=1,详情图=2,列表图=3
     *
     * @param iconType 图标类型-幻灯图=1,详情图=2,列表图=3
     */
    public void setIconType(String iconType) {
        this.iconType = iconType;
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