package com.example.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "PL_PRODUCT_STOCK")
public class PlProductStockVo {
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

    @Column(name = "PRODUCT_CODE")
    private String productCode;

    /**
     * 逻辑仓库主键-
     */
    @Column(name = "STOCK_ID")
    private String stockId;

    /**
     * 逻辑仓库名称-
     */
    @Column(name = "STOCK_NAME")
    private String stockName;

    /**
     * 逻辑仓库编码-
     */
    @Column(name = "STOCK_CODE")
    private String stockCode;

    /**
     * 实体仓库名称-
     */
    @Column(name = "ENTITY_STOCK_NAME")
    private String entityStockName;

    /**
     * 实体仓库编码-
     */
    @Column(name = "ENTITY_STOCK_CODE")
    private String entityStockCode;

    @Column(name = "PROPERTY_CODE")
    private String propertyCode;

    /**
     * 上架数量-
     */
    @Column(name = "SHELVES_SUM")
    private Integer shelvesSum;

    @Column(name = "INSTOCK_MAYSALE_SUM")
    private Long instockMaysaleSum;

    @Column(name = "FREEZE_WAITAUDIT_SUM")
    private Long freezeWaitauditSum;

    @Column(name = "FREEZE_WAITPAY_SUM")
    private Long freezeWaitpaySum;

    @Column(name = "WAITOUT_SUM")
    private Long waitoutSum;

    @Column(name = "SALED_WAITREVEICE_SUM")
    private Long saledWaitreveiceSum;

    @Column(name = "SALED_REVEICED_SUM")
    private Long saledReveicedSum;

    @Column(name = "INSTCOK_SUM")
    private Long instcokSum;

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

    @Column(name = "ENTITY_STOCK_ID")
    private String entityStockId;

    @Column(name = "FREEZE_WAITDIRT_SUM")
    private Long freezeWaitdirtSum;

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
     * @return PRODUCT_CODE
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * 获取逻辑仓库主键-
     *
     * @return STOCK_ID - 逻辑仓库主键-
     */
    public String getStockId() {
        return stockId;
    }

    /**
     * 设置逻辑仓库主键-
     *
     * @param stockId 逻辑仓库主键-
     */
    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    /**
     * 获取逻辑仓库名称-
     *
     * @return STOCK_NAME - 逻辑仓库名称-
     */
    public String getStockName() {
        return stockName;
    }

    /**
     * 设置逻辑仓库名称-
     *
     * @param stockName 逻辑仓库名称-
     */
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    /**
     * 获取逻辑仓库编码-
     *
     * @return STOCK_CODE - 逻辑仓库编码-
     */
    public String getStockCode() {
        return stockCode;
    }

    /**
     * 设置逻辑仓库编码-
     *
     * @param stockCode 逻辑仓库编码-
     */
    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    /**
     * 获取实体仓库名称-
     *
     * @return ENTITY_STOCK_NAME - 实体仓库名称-
     */
    public String getEntityStockName() {
        return entityStockName;
    }

    /**
     * 设置实体仓库名称-
     *
     * @param entityStockName 实体仓库名称-
     */
    public void setEntityStockName(String entityStockName) {
        this.entityStockName = entityStockName;
    }

    /**
     * 获取实体仓库编码-
     *
     * @return ENTITY_STOCK_CODE - 实体仓库编码-
     */
    public String getEntityStockCode() {
        return entityStockCode;
    }

    /**
     * 设置实体仓库编码-
     *
     * @param entityStockCode 实体仓库编码-
     */
    public void setEntityStockCode(String entityStockCode) {
        this.entityStockCode = entityStockCode;
    }

    /**
     * @return PROPERTY_CODE
     */
    public String getPropertyCode() {
        return propertyCode;
    }

    /**
     * @param propertyCode
     */
    public void setPropertyCode(String propertyCode) {
        this.propertyCode = propertyCode;
    }

    /**
     * 获取上架数量-
     *
     * @return SHELVES_SUM - 上架数量-
     */
    public Integer getShelvesSum() {
        return shelvesSum;
    }

    /**
     * 设置上架数量-
     *
     * @param shelvesSum 上架数量-
     */
    public void setShelvesSum(Integer shelvesSum) {
        this.shelvesSum = shelvesSum;
    }

    /**
     * @return INSTOCK_MAYSALE_SUM
     */
    public Long getInstockMaysaleSum() {
        return instockMaysaleSum;
    }

    /**
     * @param instockMaysaleSum
     */
    public void setInstockMaysaleSum(Long instockMaysaleSum) {
        this.instockMaysaleSum = instockMaysaleSum;
    }

    /**
     * @return FREEZE_WAITAUDIT_SUM
     */
    public Long getFreezeWaitauditSum() {
        return freezeWaitauditSum;
    }

    /**
     * @param freezeWaitauditSum
     */
    public void setFreezeWaitauditSum(Long freezeWaitauditSum) {
        this.freezeWaitauditSum = freezeWaitauditSum;
    }

    /**
     * @return FREEZE_WAITPAY_SUM
     */
    public Long getFreezeWaitpaySum() {
        return freezeWaitpaySum;
    }

    /**
     * @param freezeWaitpaySum
     */
    public void setFreezeWaitpaySum(Long freezeWaitpaySum) {
        this.freezeWaitpaySum = freezeWaitpaySum;
    }

    /**
     * @return WAITOUT_SUM
     */
    public Long getWaitoutSum() {
        return waitoutSum;
    }

    /**
     * @param waitoutSum
     */
    public void setWaitoutSum(Long waitoutSum) {
        this.waitoutSum = waitoutSum;
    }

    /**
     * @return SALED_WAITREVEICE_SUM
     */
    public Long getSaledWaitreveiceSum() {
        return saledWaitreveiceSum;
    }

    /**
     * @param saledWaitreveiceSum
     */
    public void setSaledWaitreveiceSum(Long saledWaitreveiceSum) {
        this.saledWaitreveiceSum = saledWaitreveiceSum;
    }

    /**
     * @return SALED_REVEICED_SUM
     */
    public Long getSaledReveicedSum() {
        return saledReveicedSum;
    }

    /**
     * @param saledReveicedSum
     */
    public void setSaledReveicedSum(Long saledReveicedSum) {
        this.saledReveicedSum = saledReveicedSum;
    }

    /**
     * @return INSTCOK_SUM
     */
    public Long getInstcokSum() {
        return instcokSum;
    }

    /**
     * @param instcokSum
     */
    public void setInstcokSum(Long instcokSum) {
        this.instcokSum = instcokSum;
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

    /**
     * @return ENTITY_STOCK_ID
     */
    public String getEntityStockId() {
        return entityStockId;
    }

    /**
     * @param entityStockId
     */
    public void setEntityStockId(String entityStockId) {
        this.entityStockId = entityStockId;
    }

    /**
     * @return FREEZE_WAITDIRT_SUM
     */
    public Long getFreezeWaitdirtSum() {
        return freezeWaitdirtSum;
    }

    /**
     * @param freezeWaitdirtSum
     */
    public void setFreezeWaitdirtSum(Long freezeWaitdirtSum) {
        this.freezeWaitdirtSum = freezeWaitdirtSum;
    }
}