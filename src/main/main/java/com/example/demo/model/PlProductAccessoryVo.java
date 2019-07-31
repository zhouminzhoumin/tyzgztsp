package com.example.demo.model;

import javax.persistence.*;

@Table(name = "PL_PRODUCT_ACCESSORY")
public class PlProductAccessoryVo {
    /**
     * 主键
     */
	@Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 商品ID
     */
    @Column(name = "PRODUCT_ID")
    private String productId;

    /**
     * 附件名称
     */
    @Column(name = "ACCESSORY_NAME")
    private String accessoryName;

    /**
     * 附件地址
     */
    @Column(name = "ACCESSORY_URL")
    private String accessoryUrl;

    /**
     * 上传时间
     */
    @Column(name = "ACCESSORY_UPLPAD_TIME")
    private String accessoryUplpadTime;

    /**
     * 附件大小
     */
    @Column(name = "ACCESSORY_SIZE")
    private String accessorySize;

    /**
     * 省份编码
     */
    @Column(name = "PROVINCE_CODE")
    private String provinceCode;

    /**
     * 获取主键
     *
     * @return ID - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取商品ID
     *
     * @return PRODUCT_ID - 商品ID
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置商品ID
     *
     * @param productId 商品ID
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获取附件名称
     *
     * @return ACCESSORY_NAME - 附件名称
     */
    public String getAccessoryName() {
        return accessoryName;
    }

    /**
     * 设置附件名称
     *
     * @param accessoryName 附件名称
     */
    public void setAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName;
    }

    /**
     * 获取附件地址
     *
     * @return ACCESSORY_URL - 附件地址
     */
    public String getAccessoryUrl() {
        return accessoryUrl;
    }

    /**
     * 设置附件地址
     *
     * @param accessoryUrl 附件地址
     */
    public void setAccessoryUrl(String accessoryUrl) {
        this.accessoryUrl = accessoryUrl;
    }

    /**
     * 获取上传时间
     *
     * @return ACCESSORY_UPLPAD_TIME - 上传时间
     */
    public String getAccessoryUplpadTime() {
        return accessoryUplpadTime;
    }

    /**
     * 设置上传时间
     *
     * @param accessoryUplpadTime 上传时间
     */
    public void setAccessoryUplpadTime(String accessoryUplpadTime) {
        this.accessoryUplpadTime = accessoryUplpadTime;
    }

    /**
     * 获取附件大小
     *
     * @return ACCESSORY_SIZE - 附件大小
     */
    public String getAccessorySize() {
        return accessorySize;
    }

    /**
     * 设置附件大小
     *
     * @param accessorySize 附件大小
     */
    public void setAccessorySize(String accessorySize) {
        this.accessorySize = accessorySize;
    }

    /**
     * 获取省份编码
     *
     * @return PROVINCE_CODE - 省份编码
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * 设置省份编码
     *
     * @param provinceCode 省份编码
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
}