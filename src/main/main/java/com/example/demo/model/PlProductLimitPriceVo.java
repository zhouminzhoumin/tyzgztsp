package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "PL_PRODUCT_LIMIT_PRICE")
public class PlProductLimitPriceVo {
	@Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "PRODUCT_ID")
    private String productId;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "PRODUCT_CD")
    private String productCd;

    @Column(name = "PROVINCE_NAME")
    private String provinceName;

    @Column(name = "PROVINCE_CODE")
    private String provinceCode;

    @Column(name = "BRAND")
    private String brand;

    @Column(name = "BRAND_CODE")
    private String brandCode;

    @Column(name = "PRODUCT_MODEL")
    private String productModel;

    @Column(name = "COLOR")
    private String color;

    @Column(name = "COLOR_CODE")
    private String colorCode;

    @Column(name = "PRODUCT_HIGHEST_PRICE")
    private BigDecimal productHighestPrice;

    @Column(name = "PRODUCT_LOWEST_PRICE")
    private BigDecimal productLowestPrice;

    @Column(name = "IS_EFFECT")
    private String isEffect;

    @Column(name = "MODIFY_DATE")
    private Date modifyDate;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return PRODUCT_ID
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * @return PRODUCT_NAME
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return PRODUCT_CD
     */
    public String getProductCd() {
        return productCd;
    }

    /**
     * @param productCd
     */
    public void setProductCd(String productCd) {
        this.productCd = productCd;
    }

    /**
     * @return PROVINCE_NAME
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * @param provinceName
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * @return PROVINCE_CODE
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * @param provinceCode
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * @return BRAND
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return BRAND_CODE
     */
    public String getBrandCode() {
        return brandCode;
    }

    /**
     * @param brandCode
     */
    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    /**
     * @return PRODUCT_MODEL
     */
    public String getProductModel() {
        return productModel;
    }

    /**
     * @param productModel
     */
    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    /**
     * @return COLOR
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return COLOR_CODE
     */
    public String getColorCode() {
        return colorCode;
    }

    /**
     * @param colorCode
     */
    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    /**
     * @return PRODUCT_HIGHEST_PRICE
     */
    public BigDecimal getProductHighestPrice() {
        return productHighestPrice;
    }

    /**
     * @param productHighestPrice
     */
    public void setProductHighestPrice(BigDecimal productHighestPrice) {
        this.productHighestPrice = productHighestPrice;
    }

    /**
     * @return PRODUCT_LOWEST_PRICE
     */
    public BigDecimal getProductLowestPrice() {
        return productLowestPrice;
    }

    /**
     * @param productLowestPrice
     */
    public void setProductLowestPrice(BigDecimal productLowestPrice) {
        this.productLowestPrice = productLowestPrice;
    }

    /**
     * @return IS_EFFECT
     */
    public String getIsEffect() {
        return isEffect;
    }

    /**
     * @param isEffect
     */
    public void setIsEffect(String isEffect) {
        this.isEffect = isEffect;
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
}