package com.example.demo.model;

import java.util.Date;

import javax.persistence.*;

@Table(name = "IM_STOCK_PRODUCT")
public class ImStockProductVo {
    /**
     * ID-
     */
	@Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 仓储物流商ID-
     */
    @Column(name = "LOGISTICS_ID")
    private String logisticsId;

    /**
     * 实体库ID-
     */
    @Column(name = "WAREHOUSE_ID")
    private String warehouseId;

    /**
     * 逻辑库ID-
     */
    @Column(name = "LOGIC_WAREHOUSE_ID")
    private String logicWarehouseId;

    /**
     * 产品编码-
     */
    @Column(name = "PRODUCT_CD")
    private String productCd;

    /**
     * 产品大类编码-
     */
    @Column(name = "PRODUCT_TYPE_CD")
    private String productTypeCd;

    /**
     * 产品小类编码-
     */
    @Column(name = "PRODUCT_SUBTYPE_CD")
    private String productSubtypeCd;

    /**
     * 供应商名称-
     */
    @Column(name = "SUPPLIER_NAME")
    private String supplierName;

    /**
     * 供应商编码-
     */
    @Column(name = "SUPPLIER_CODE")
    private String supplierCode;

    @Column(name = "PRODUCT_QUANTITY")
    private Long productQuantity;

    /**
     * 产品型号-
     */
    @Column(name = "PRODUCT_MODEL")
    private String productModel;

    /**
     * 产品名称-
     */
    @Column(name = "PRODUCT_NAME")
    private String productName;

    /**
     * 品牌名称-
     */
    @Column(name = "BRAND_NAME")
    private String brandName;

    /**
     * 品牌编码-
     */
    @Column(name = "BRAND_CD")
    private String brandCd;

    /**
     * 颜色编码-
     */
    @Column(name = "COLOR_CD")
    private String colorCd;

    /**
     * 颜色名称-
     */
    @Column(name = "COLOR_NAME")
    private String colorName;

    /**
     * 产品尺寸-
     */
    @Column(name = "PRODUCT_SIZE")
    private String productSize;

    /**
     * Flash内存-
     */
    @Column(name = "FLASH_ROM")
    private String flashRom;

    /**
     * 总入库数量-
     */
    @Column(name = "SUM_COUNT")
    private Long sumCount;

    /**
     * 冻结数量-
     */
    @Column(name = "FREEZE_COUNT")
    private Long freezeCount;

    /**
     * 盒损数量-
     */
    @Column(name = "BOX_LOSS_COUNT")
    private Long boxLossCount;

    /**
     * 已销售数量-已结帐的数量
     */
    @Column(name = "SALED_COUNT")
    private Long saledCount;

    /**
     * 可销售数量-
     */
    @Column(name = "MAY_SALE_COUNT")
    private Long maySaleCount;

    @Column(name = "WSJ_COUNT")
    private Long wsjCount;

    @Column(name = "YSJ_COUNT")
    private Long ysjCount;

    @Column(name = "DXFH_COUNT")
    private Long dxfhCount;

    @Column(name = "ZT_COUNT")
    private Long ztCount;

    @Column(name = "DBDJ_COUNT")
    private Long dbdjCount;

    @Column(name = "SJDJ_COUNT")
    private Long sjdjCount;

    @Column(name = "DQSJ_COUNT")
    private Long dqsjCount;

    @Column(name = "ZK_COUNT")
    private Long zkCount;

    @Column(name = "DBCK_COUNT")
    private Long dbckCount;

    @Column(name = "BHCK_COUNT")
    private Long bhckCount;

    @Column(name = "PROPERTY_CODE")
    private String propertyCode;

    /**
     * 预留1-
     */
    @Column(name = "FILED1")
    private String filed1;

    /**
     * 预留2-
     */
    @Column(name = "FILED2")
    private String filed2;

    /**
     * 预留3-
     */
    @Column(name = "FILED3")
    private String filed3;

    /**
     * 预留4-
     */
    @Column(name = "FILED4")
    private String filed4;

    /**
     * 预留5-
     */
    @Column(name = "FILED5")
    private String filed5;

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

    @Column(name = "QTCK_COUNT")
    private Long qtckCount;

    @Column(name = "QTCKTWO_COUNT")
    private Long qtcktwoCount;

    @Column(name = "QTXS_COUNT")
    private Long qtxsCount;

    @Column(name = "STRCODE_GOVERN")
    private String strcodeGovern;

    @Column(name = "FH_COUNT")
    private Long fhCount;

    /**
     * 订单冻结数量（普通商品下多地址订单）
     */
    @Column(name = "ORDER_FREEZE_COUNT")
    private Long orderFreezeCount;

    /**
     * 订单分货冻结数量（购物车模式定向分货商品下多地址订单）
     */
    @Column(name = "ORDER_DIST_FREEZE_COUNT")
    private Long orderDistFreezeCount;

    /**
     * 备注-
     */
    @Column(name = "REMARK")
    private String remark;
    
    @Transient
    private String LOGIC_NAME;
    
    @Transient
    private String LOGIC_CODE;
    
    @Transient
    private String WAREHOUSE_NAME;
    
    @Transient
    private String WAREHOUSE_CODE;

    /**
     * 获取ID-
     *
     * @return ID - ID-
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID-
     *
     * @param id ID-
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取仓储物流商ID-
     *
     * @return LOGISTICS_ID - 仓储物流商ID-
     */
    public String getLogisticsId() {
        return logisticsId;
    }

    /**
     * 设置仓储物流商ID-
     *
     * @param logisticsId 仓储物流商ID-
     */
    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    /**
     * 获取实体库ID-
     *
     * @return WAREHOUSE_ID - 实体库ID-
     */
    public String getWarehouseId() {
        return warehouseId;
    }

    /**
     * 设置实体库ID-
     *
     * @param warehouseId 实体库ID-
     */
    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    /**
     * 获取逻辑库ID-
     *
     * @return LOGIC_WAREHOUSE_ID - 逻辑库ID-
     */
    public String getLogicWarehouseId() {
        return logicWarehouseId;
    }

    /**
     * 设置逻辑库ID-
     *
     * @param logicWarehouseId 逻辑库ID-
     */
    public void setLogicWarehouseId(String logicWarehouseId) {
        this.logicWarehouseId = logicWarehouseId;
    }

    /**
     * 获取产品编码-
     *
     * @return PRODUCT_CD - 产品编码-
     */
    public String getProductCd() {
        return productCd;
    }

    /**
     * 设置产品编码-
     *
     * @param productCd 产品编码-
     */
    public void setProductCd(String productCd) {
        this.productCd = productCd;
    }

    /**
     * 获取产品大类编码-
     *
     * @return PRODUCT_TYPE_CD - 产品大类编码-
     */
    public String getProductTypeCd() {
        return productTypeCd;
    }

    /**
     * 设置产品大类编码-
     *
     * @param productTypeCd 产品大类编码-
     */
    public void setProductTypeCd(String productTypeCd) {
        this.productTypeCd = productTypeCd;
    }

    /**
     * 获取产品小类编码-
     *
     * @return PRODUCT_SUBTYPE_CD - 产品小类编码-
     */
    public String getProductSubtypeCd() {
        return productSubtypeCd;
    }

    /**
     * 设置产品小类编码-
     *
     * @param productSubtypeCd 产品小类编码-
     */
    public void setProductSubtypeCd(String productSubtypeCd) {
        this.productSubtypeCd = productSubtypeCd;
    }

    /**
     * 获取供应商名称-
     *
     * @return SUPPLIER_NAME - 供应商名称-
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * 设置供应商名称-
     *
     * @param supplierName 供应商名称-
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
     * 获取供应商编码-
     *
     * @return SUPPLIER_CODE - 供应商编码-
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * 设置供应商编码-
     *
     * @param supplierCode 供应商编码-
     */
    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    /**
     * @return PRODUCT_QUANTITY
     */
    public Long getProductQuantity() {
        return productQuantity;
    }

    /**
     * @param productQuantity
     */
    public void setProductQuantity(Long productQuantity) {
        this.productQuantity = productQuantity;
    }

    /**
     * 获取产品型号-
     *
     * @return PRODUCT_MODEL - 产品型号-
     */
    public String getProductModel() {
        return productModel;
    }

    /**
     * 设置产品型号-
     *
     * @param productModel 产品型号-
     */
    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    /**
     * 获取产品名称-
     *
     * @return PRODUCT_NAME - 产品名称-
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置产品名称-
     *
     * @param productName 产品名称-
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取品牌名称-
     *
     * @return BRAND_NAME - 品牌名称-
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 设置品牌名称-
     *
     * @param brandName 品牌名称-
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * 获取品牌编码-
     *
     * @return BRAND_CD - 品牌编码-
     */
    public String getBrandCd() {
        return brandCd;
    }

    /**
     * 设置品牌编码-
     *
     * @param brandCd 品牌编码-
     */
    public void setBrandCd(String brandCd) {
        this.brandCd = brandCd;
    }

    /**
     * 获取颜色编码-
     *
     * @return COLOR_CD - 颜色编码-
     */
    public String getColorCd() {
        return colorCd;
    }

    /**
     * 设置颜色编码-
     *
     * @param colorCd 颜色编码-
     */
    public void setColorCd(String colorCd) {
        this.colorCd = colorCd;
    }

    /**
     * 获取颜色名称-
     *
     * @return COLOR_NAME - 颜色名称-
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * 设置颜色名称-
     *
     * @param colorName 颜色名称-
     */
    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    /**
     * 获取产品尺寸-
     *
     * @return PRODUCT_SIZE - 产品尺寸-
     */
    public String getProductSize() {
        return productSize;
    }

    /**
     * 设置产品尺寸-
     *
     * @param productSize 产品尺寸-
     */
    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    /**
     * 获取Flash内存-
     *
     * @return FLASH_ROM - Flash内存-
     */
    public String getFlashRom() {
        return flashRom;
    }

    /**
     * 设置Flash内存-
     *
     * @param flashRom Flash内存-
     */
    public void setFlashRom(String flashRom) {
        this.flashRom = flashRom;
    }

    /**
     * 获取总入库数量-
     *
     * @return SUM_COUNT - 总入库数量-
     */
    public Long getSumCount() {
        return sumCount;
    }

    /**
     * 设置总入库数量-
     *
     * @param sumCount 总入库数量-
     */
    public void setSumCount(Long sumCount) {
        this.sumCount = sumCount;
    }

    /**
     * 获取冻结数量-
     *
     * @return FREEZE_COUNT - 冻结数量-
     */
    public Long getFreezeCount() {
        return freezeCount;
    }

    /**
     * 设置冻结数量-
     *
     * @param freezeCount 冻结数量-
     */
    public void setFreezeCount(Long freezeCount) {
        this.freezeCount = freezeCount;
    }

    /**
     * 获取盒损数量-
     *
     * @return BOX_LOSS_COUNT - 盒损数量-
     */
    public Long getBoxLossCount() {
        return boxLossCount;
    }

    /**
     * 设置盒损数量-
     *
     * @param boxLossCount 盒损数量-
     */
    public void setBoxLossCount(Long boxLossCount) {
        this.boxLossCount = boxLossCount;
    }

    /**
     * 获取已销售数量-已结帐的数量
     *
     * @return SALED_COUNT - 已销售数量-已结帐的数量
     */
    public Long getSaledCount() {
        return saledCount;
    }

    /**
     * 设置已销售数量-已结帐的数量
     *
     * @param saledCount 已销售数量-已结帐的数量
     */
    public void setSaledCount(Long saledCount) {
        this.saledCount = saledCount;
    }

    /**
     * 获取可销售数量-
     *
     * @return MAY_SALE_COUNT - 可销售数量-
     */
    public Long getMaySaleCount() {
        return maySaleCount;
    }

    /**
     * 设置可销售数量-
     *
     * @param maySaleCount 可销售数量-
     */
    public void setMaySaleCount(Long maySaleCount) {
        this.maySaleCount = maySaleCount;
    }

    /**
     * @return WSJ_COUNT
     */
    public Long getWsjCount() {
        return wsjCount;
    }

    /**
     * @param wsjCount
     */
    public void setWsjCount(Long wsjCount) {
        this.wsjCount = wsjCount;
    }

    /**
     * @return YSJ_COUNT
     */
    public Long getYsjCount() {
        return ysjCount;
    }

    /**
     * @param ysjCount
     */
    public void setYsjCount(Long ysjCount) {
        this.ysjCount = ysjCount;
    }

    /**
     * @return DXFH_COUNT
     */
    public Long getDxfhCount() {
        return dxfhCount;
    }

    /**
     * @param dxfhCount
     */
    public void setDxfhCount(Long dxfhCount) {
        this.dxfhCount = dxfhCount;
    }

    /**
     * @return ZT_COUNT
     */
    public Long getZtCount() {
        return ztCount;
    }

    /**
     * @param ztCount
     */
    public void setZtCount(Long ztCount) {
        this.ztCount = ztCount;
    }

    /**
     * @return DBDJ_COUNT
     */
    public Long getDbdjCount() {
        return dbdjCount;
    }

    /**
     * @param dbdjCount
     */
    public void setDbdjCount(Long dbdjCount) {
        this.dbdjCount = dbdjCount;
    }

    /**
     * @return SJDJ_COUNT
     */
    public Long getSjdjCount() {
        return sjdjCount;
    }

    /**
     * @param sjdjCount
     */
    public void setSjdjCount(Long sjdjCount) {
        this.sjdjCount = sjdjCount;
    }

    /**
     * @return DQSJ_COUNT
     */
    public Long getDqsjCount() {
        return dqsjCount;
    }

    /**
     * @param dqsjCount
     */
    public void setDqsjCount(Long dqsjCount) {
        this.dqsjCount = dqsjCount;
    }

    /**
     * @return ZK_COUNT
     */
    public Long getZkCount() {
        return zkCount;
    }

    /**
     * @param zkCount
     */
    public void setZkCount(Long zkCount) {
        this.zkCount = zkCount;
    }

    /**
     * @return DBCK_COUNT
     */
    public Long getDbckCount() {
        return dbckCount;
    }

    /**
     * @param dbckCount
     */
    public void setDbckCount(Long dbckCount) {
        this.dbckCount = dbckCount;
    }

    /**
     * @return BHCK_COUNT
     */
    public Long getBhckCount() {
        return bhckCount;
    }

    /**
     * @param bhckCount
     */
    public void setBhckCount(Long bhckCount) {
        this.bhckCount = bhckCount;
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
     * 获取预留1-
     *
     * @return FILED1 - 预留1-
     */
    public String getFiled1() {
        return filed1;
    }

    /**
     * 设置预留1-
     *
     * @param filed1 预留1-
     */
    public void setFiled1(String filed1) {
        this.filed1 = filed1;
    }

    /**
     * 获取预留2-
     *
     * @return FILED2 - 预留2-
     */
    public String getFiled2() {
        return filed2;
    }

    /**
     * 设置预留2-
     *
     * @param filed2 预留2-
     */
    public void setFiled2(String filed2) {
        this.filed2 = filed2;
    }

    /**
     * 获取预留3-
     *
     * @return FILED3 - 预留3-
     */
    public String getFiled3() {
        return filed3;
    }

    /**
     * 设置预留3-
     *
     * @param filed3 预留3-
     */
    public void setFiled3(String filed3) {
        this.filed3 = filed3;
    }

    /**
     * 获取预留4-
     *
     * @return FILED4 - 预留4-
     */
    public String getFiled4() {
        return filed4;
    }

    /**
     * 设置预留4-
     *
     * @param filed4 预留4-
     */
    public void setFiled4(String filed4) {
        this.filed4 = filed4;
    }

    /**
     * 获取预留5-
     *
     * @return FILED5 - 预留5-
     */
    public String getFiled5() {
        return filed5;
    }

    /**
     * 设置预留5-
     *
     * @param filed5 预留5-
     */
    public void setFiled5(String filed5) {
        this.filed5 = filed5;
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
     * @return QTCK_COUNT
     */
    public Long getQtckCount() {
        return qtckCount;
    }

    /**
     * @param qtckCount
     */
    public void setQtckCount(Long qtckCount) {
        this.qtckCount = qtckCount;
    }

    /**
     * @return QTCKTWO_COUNT
     */
    public Long getQtcktwoCount() {
        return qtcktwoCount;
    }

    /**
     * @param qtcktwoCount
     */
    public void setQtcktwoCount(Long qtcktwoCount) {
        this.qtcktwoCount = qtcktwoCount;
    }

    /**
     * @return QTXS_COUNT
     */
    public Long getQtxsCount() {
        return qtxsCount;
    }

    /**
     * @param qtxsCount
     */
    public void setQtxsCount(Long qtxsCount) {
        this.qtxsCount = qtxsCount;
    }

    /**
     * @return STRCODE_GOVERN
     */
    public String getStrcodeGovern() {
        return strcodeGovern;
    }

    /**
     * @param strcodeGovern
     */
    public void setStrcodeGovern(String strcodeGovern) {
        this.strcodeGovern = strcodeGovern;
    }

    /**
     * @return FH_COUNT
     */
    public Long getFhCount() {
        return fhCount;
    }

    /**
     * @param fhCount
     */
    public void setFhCount(Long fhCount) {
        this.fhCount = fhCount;
    }

    /**
     * 获取订单冻结数量（普通商品下多地址订单）
     *
     * @return ORDER_FREEZE_COUNT - 订单冻结数量（普通商品下多地址订单）
     */
    public Long getOrderFreezeCount() {
        return orderFreezeCount;
    }

    /**
     * 设置订单冻结数量（普通商品下多地址订单）
     *
     * @param orderFreezeCount 订单冻结数量（普通商品下多地址订单）
     */
    public void setOrderFreezeCount(Long orderFreezeCount) {
        this.orderFreezeCount = orderFreezeCount;
    }

    /**
     * 获取订单分货冻结数量（购物车模式定向分货商品下多地址订单）
     *
     * @return ORDER_DIST_FREEZE_COUNT - 订单分货冻结数量（购物车模式定向分货商品下多地址订单）
     */
    public Long getOrderDistFreezeCount() {
        return orderDistFreezeCount;
    }

    /**
     * 设置订单分货冻结数量（购物车模式定向分货商品下多地址订单）
     *
     * @param orderDistFreezeCount 订单分货冻结数量（购物车模式定向分货商品下多地址订单）
     */
    public void setOrderDistFreezeCount(Long orderDistFreezeCount) {
        this.orderDistFreezeCount = orderDistFreezeCount;
    }

    /**
     * 获取备注-
     *
     * @return REMARK - 备注-
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注-
     *
     * @param remark 备注-
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

	public String getLOGIC_NAME() {
		return LOGIC_NAME;
	}

	public void setLOGIC_NAME(String lOGIC_NAME) {
		LOGIC_NAME = lOGIC_NAME;
	}

	public String getLOGIC_CODE() {
		return LOGIC_CODE;
	}

	public void setLOGIC_CODE(String lOGIC_CODE) {
		LOGIC_CODE = lOGIC_CODE;
	}

	public String getWAREHOUSE_NAME() {
		return WAREHOUSE_NAME;
	}

	public void setWAREHOUSE_NAME(String wAREHOUSE_NAME) {
		WAREHOUSE_NAME = wAREHOUSE_NAME;
	}

	public String getWAREHOUSE_CODE() {
		return WAREHOUSE_CODE;
	}

	public void setWAREHOUSE_CODE(String wAREHOUSE_CODE) {
		WAREHOUSE_CODE = wAREHOUSE_CODE;
	}
    
    
}