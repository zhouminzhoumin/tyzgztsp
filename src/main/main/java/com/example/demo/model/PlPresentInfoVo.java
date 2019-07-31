package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Table(name = "PL_PRESENT_INFO")
public class PlPresentInfoVo {
    /**
     * 主键-
     */
	@Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 产品主键-
     */
    @Column(name = "PRODUCT_ID")
    private String productId;

    /**
     * 零售价-
     */
    @Column(name = "RETAIL_PRICE")
    private BigDecimal retailPrice;

    /**
     * 直供价-
     */
    @Column(name = "ZG_PRICE")
    private BigDecimal zgPrice;

    /**
     * 是否营销活动-0=否,1=是
     */
    @Column(name = "IS_MARKET")
    private String isMarket;

    /**
     * 营销活动主键-
     */
    @Column(name = "IS_MARKET_ID")
    private String isMarketId;

    /**
     * 上架开始时间-
     */
    @Column(name = "SHELVES_START_DATE")
    private Date shelvesStartDate;

    /**
     * 商品状态-未上架=0,已上架=1,已下架=2
     */
    @Column(name = "PRODUCT_STATUS")
    private String productStatus;

    /**
     * 商品审核-未审核=0,审核通过=1,审核未通过=2
     */
    @Column(name = "PRODUCT_AUDIT")
    private String productAudit;

    /**
     * 总上架数量-
     */
    @Column(name = "SHELVES_SUM")
    private Integer shelvesSum;

    /**
     * 发票类型-0=增值税普通发票,1=增值税专用发票
     */
    @Column(name = "INVOICE_TYPE")
    private String invoiceType;

    /**
     * 是否龙商-是=0,否=1
     */
    @Column(name = "IS_LONGBUS")
    private String isLongbus;

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
     * 供应商编码-
     */
    @Column(name = "SUPPLIER_CODE")
    private String supplierCode;

    /**
     * 供应商名称-
     */
    @Column(name = "SUPPLIER_NAME")
    private String supplierName;

    /**
     * 是否销售审核-0-否，1-是
     */
    @Column(name = "IS_SALE_AUDIT")
    private String isSaleAudit;

    /**
     * 商品编码-
     */
    @Column(name = "PRODUCT_CODE")
    private String productCode;

    /**
     * ECS表ID-
     */
    @Column(name = "ECS_PRODUCT_ID")
    private String ecsProductId;

    /**
     * 产品12位编码-
     */
    @Column(name = "PRODUCT_CD_TWELVE")
    private String productCdTwelve;

    /**
     * 产品25位编码-
     */
    @Column(name = "PRODUCT_CD_EIGHTEEN")
    private String productCdEighteen;

    /**
     * 省份编码-
     */
    @Column(name = "PROVINCE_CODE")
    private String provinceCode;

    /**
     * 上架渠道-01-电子，02-政企，03-实体
     */
    @Column(name = "CHANEL_SALETYPE_CD")
    private String chanelSaletypeCd;

    /**
     * 供货商物权-
     */
    @Column(name = "SUPPLIER_PROPERTYCODE")
    private String supplierPropertycode;

    /**
     * 供货商ID-
     */
    @Column(name = "SUPPLIER_ID")
    private String supplierId;

    /**
     * 是否推ERP-0-否，1-是
     */
    @Column(name = "IS_SENDERP")
    private String isSenderp;

    /**
     * 上架属性:0立即上架，1定时上架
     */
    @Column(name = "SHELVES_ATTRIBUTE")
    private String shelvesAttribute;

    /**
     * 上架模式：0定时上架，1清单上架
     */
    @Column(name = "SHELVES_MODEL")
    private String shelvesModel;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "IS_LOGISTIC")
    private String isLogistic;

    @Column(name = "TITLE_NAME")
    private String titleName;

    /**
     * 允许使用价保返利0否，1是
     */
    @Column(name = "IS_REBATE")
    private String isRebate;

    /**
     * 允许使用账期0否，1是
     */
    @Column(name = "IS_PERIOD")
    private String isPeriod;

    /**
     * 产品名称-
     */
    @Column(name = "PRODUCT_NAME")
    private String productName;

    /**
     * 产品副标题-
     */
    @Column(name = "PRODUCT_SED_NAME")
    private String productSedName;

    @Column(name = "CONTENT_NAME")
    private String contentName;
    
    @Transient
    private String SHELVES_SUM_STOCK;//上架数量
    
    @Transient
    private String INSTOCK_MAYSALE_SUM;//在库可销售数量
    
    @Transient
    private String FREEZE_WAITAUDIT_SUM;//冻结待审核
    
    @Transient
    private String FREEZE_WAITPAY_SUM;//冻结待付款
    
    @Transient
    private String WAITOUT_SUM;//待出库
    
    @Transient
    private String SALED_WAITREVEICE_SUM;//待出库
    
    @Transient
    private String SALED_REVEICED_SUM;//已销售已签收
    
    @Transient
    private String INSTCOK_SUM;//在库数量

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
     * 获取产品主键-
     *
     * @return PRODUCT_ID - 产品主键-
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置产品主键-
     *
     * @param productId 产品主键-
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 获取零售价-
     *
     * @return RETAIL_PRICE - 零售价-
     */
    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    /**
     * 设置零售价-
     *
     * @param retailPrice 零售价-
     */
    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    /**
     * 获取直供价-
     *
     * @return ZG_PRICE - 直供价-
     */
    public BigDecimal getZgPrice() {
        return zgPrice;
    }

    /**
     * 设置直供价-
     *
     * @param zgPrice 直供价-
     */
    public void setZgPrice(BigDecimal zgPrice) {
        this.zgPrice = zgPrice;
    }

    /**
     * 获取是否营销活动-0=否,1=是
     *
     * @return IS_MARKET - 是否营销活动-0=否,1=是
     */
    public String getIsMarket() {
        return isMarket;
    }

    /**
     * 设置是否营销活动-0=否,1=是
     *
     * @param isMarket 是否营销活动-0=否,1=是
     */
    public void setIsMarket(String isMarket) {
        this.isMarket = isMarket;
    }

    /**
     * 获取营销活动主键-
     *
     * @return IS_MARKET_ID - 营销活动主键-
     */
    public String getIsMarketId() {
        return isMarketId;
    }

    /**
     * 设置营销活动主键-
     *
     * @param isMarketId 营销活动主键-
     */
    public void setIsMarketId(String isMarketId) {
        this.isMarketId = isMarketId;
    }

    /**
     * 获取上架开始时间-
     *
     * @return SHELVES_START_DATE - 上架开始时间-
     */
    public Date getShelvesStartDate() {
        return shelvesStartDate;
    }

    /**
     * 设置上架开始时间-
     *
     * @param shelvesStartDate 上架开始时间-
     */
    public void setShelvesStartDate(Date shelvesStartDate) {
        this.shelvesStartDate = shelvesStartDate;
    }

    /**
     * 获取商品状态-未上架=0,已上架=1,已下架=2
     *
     * @return PRODUCT_STATUS - 商品状态-未上架=0,已上架=1,已下架=2
     */
    public String getProductStatus() {
        return productStatus;
    }

    /**
     * 设置商品状态-未上架=0,已上架=1,已下架=2
     *
     * @param productStatus 商品状态-未上架=0,已上架=1,已下架=2
     */
    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    /**
     * 获取商品审核-未审核=0,审核通过=1,审核未通过=2
     *
     * @return PRODUCT_AUDIT - 商品审核-未审核=0,审核通过=1,审核未通过=2
     */
    public String getProductAudit() {
        return productAudit;
    }

    /**
     * 设置商品审核-未审核=0,审核通过=1,审核未通过=2
     *
     * @param productAudit 商品审核-未审核=0,审核通过=1,审核未通过=2
     */
    public void setProductAudit(String productAudit) {
        this.productAudit = productAudit;
    }

    /**
     * 获取总上架数量-
     *
     * @return SHELVES_SUM - 总上架数量-
     */
    public Integer getShelvesSum() {
        return shelvesSum;
    }

    /**
     * 设置总上架数量-
     *
     * @param shelvesSum 总上架数量-
     */
    public void setShelvesSum(Integer shelvesSum) {
        this.shelvesSum = shelvesSum;
    }

    /**
     * 获取发票类型-0=增值税普通发票,1=增值税专用发票
     *
     * @return INVOICE_TYPE - 发票类型-0=增值税普通发票,1=增值税专用发票
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * 设置发票类型-0=增值税普通发票,1=增值税专用发票
     *
     * @param invoiceType 发票类型-0=增值税普通发票,1=增值税专用发票
     */
    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    /**
     * 获取是否龙商-是=0,否=1
     *
     * @return IS_LONGBUS - 是否龙商-是=0,否=1
     */
    public String getIsLongbus() {
        return isLongbus;
    }

    /**
     * 设置是否龙商-是=0,否=1
     *
     * @param isLongbus 是否龙商-是=0,否=1
     */
    public void setIsLongbus(String isLongbus) {
        this.isLongbus = isLongbus;
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
     * 获取是否销售审核-0-否，1-是
     *
     * @return IS_SALE_AUDIT - 是否销售审核-0-否，1-是
     */
    public String getIsSaleAudit() {
        return isSaleAudit;
    }

    /**
     * 设置是否销售审核-0-否，1-是
     *
     * @param isSaleAudit 是否销售审核-0-否，1-是
     */
    public void setIsSaleAudit(String isSaleAudit) {
        this.isSaleAudit = isSaleAudit;
    }

    /**
     * 获取商品编码-
     *
     * @return PRODUCT_CODE - 商品编码-
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * 设置商品编码-
     *
     * @param productCode 商品编码-
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * 获取ECS表ID-
     *
     * @return ECS_PRODUCT_ID - ECS表ID-
     */
    public String getEcsProductId() {
        return ecsProductId;
    }

    /**
     * 设置ECS表ID-
     *
     * @param ecsProductId ECS表ID-
     */
    public void setEcsProductId(String ecsProductId) {
        this.ecsProductId = ecsProductId;
    }

    /**
     * 获取产品12位编码-
     *
     * @return PRODUCT_CD_TWELVE - 产品12位编码-
     */
    public String getProductCdTwelve() {
        return productCdTwelve;
    }

    /**
     * 设置产品12位编码-
     *
     * @param productCdTwelve 产品12位编码-
     */
    public void setProductCdTwelve(String productCdTwelve) {
        this.productCdTwelve = productCdTwelve;
    }

    /**
     * 获取产品25位编码-
     *
     * @return PRODUCT_CD_EIGHTEEN - 产品25位编码-
     */
    public String getProductCdEighteen() {
        return productCdEighteen;
    }

    /**
     * 设置产品25位编码-
     *
     * @param productCdEighteen 产品25位编码-
     */
    public void setProductCdEighteen(String productCdEighteen) {
        this.productCdEighteen = productCdEighteen;
    }

    /**
     * 获取省份编码-
     *
     * @return PROVINCE_CODE - 省份编码-
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * 设置省份编码-
     *
     * @param provinceCode 省份编码-
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * 获取上架渠道-01-电子，02-政企，03-实体
     *
     * @return CHANEL_SALETYPE_CD - 上架渠道-01-电子，02-政企，03-实体
     */
    public String getChanelSaletypeCd() {
        return chanelSaletypeCd;
    }

    /**
     * 设置上架渠道-01-电子，02-政企，03-实体
     *
     * @param chanelSaletypeCd 上架渠道-01-电子，02-政企，03-实体
     */
    public void setChanelSaletypeCd(String chanelSaletypeCd) {
        this.chanelSaletypeCd = chanelSaletypeCd;
    }

    /**
     * 获取供货商物权-
     *
     * @return SUPPLIER_PROPERTYCODE - 供货商物权-
     */
    public String getSupplierPropertycode() {
        return supplierPropertycode;
    }

    /**
     * 设置供货商物权-
     *
     * @param supplierPropertycode 供货商物权-
     */
    public void setSupplierPropertycode(String supplierPropertycode) {
        this.supplierPropertycode = supplierPropertycode;
    }

    /**
     * 获取供货商ID-
     *
     * @return SUPPLIER_ID - 供货商ID-
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * 设置供货商ID-
     *
     * @param supplierId 供货商ID-
     */
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * 获取是否推ERP-0-否，1-是
     *
     * @return IS_SENDERP - 是否推ERP-0-否，1-是
     */
    public String getIsSenderp() {
        return isSenderp;
    }

    /**
     * 设置是否推ERP-0-否，1-是
     *
     * @param isSenderp 是否推ERP-0-否，1-是
     */
    public void setIsSenderp(String isSenderp) {
        this.isSenderp = isSenderp;
    }

    /**
     * 获取上架属性:0立即上架，1定时上架
     *
     * @return SHELVES_ATTRIBUTE - 上架属性:0立即上架，1定时上架
     */
    public String getShelvesAttribute() {
        return shelvesAttribute;
    }

    /**
     * 设置上架属性:0立即上架，1定时上架
     *
     * @param shelvesAttribute 上架属性:0立即上架，1定时上架
     */
    public void setShelvesAttribute(String shelvesAttribute) {
        this.shelvesAttribute = shelvesAttribute;
    }

    /**
     * 获取上架模式：0定时上架，1清单上架
     *
     * @return SHELVES_MODEL - 上架模式：0定时上架，1清单上架
     */
    public String getShelvesModel() {
        return shelvesModel;
    }

    /**
     * 设置上架模式：0定时上架，1清单上架
     *
     * @param shelvesModel 上架模式：0定时上架，1清单上架
     */
    public void setShelvesModel(String shelvesModel) {
        this.shelvesModel = shelvesModel;
    }

    /**
     * @return START_DATE
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return END_DATE
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return IS_LOGISTIC
     */
    public String getIsLogistic() {
        return isLogistic;
    }

    /**
     * @param isLogistic
     */
    public void setIsLogistic(String isLogistic) {
        this.isLogistic = isLogistic;
    }

    /**
     * @return TITLE_NAME
     */
    public String getTitleName() {
        return titleName;
    }

    /**
     * @param titleName
     */
    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    /**
     * 获取允许使用价保返利0否，1是
     *
     * @return IS_REBATE - 允许使用价保返利0否，1是
     */
    public String getIsRebate() {
        return isRebate;
    }

    /**
     * 设置允许使用价保返利0否，1是
     *
     * @param isRebate 允许使用价保返利0否，1是
     */
    public void setIsRebate(String isRebate) {
        this.isRebate = isRebate;
    }

    /**
     * 获取允许使用账期0否，1是
     *
     * @return IS_PERIOD - 允许使用账期0否，1是
     */
    public String getIsPeriod() {
        return isPeriod;
    }

    /**
     * 设置允许使用账期0否，1是
     *
     * @param isPeriod 允许使用账期0否，1是
     */
    public void setIsPeriod(String isPeriod) {
        this.isPeriod = isPeriod;
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
     * 获取产品副标题-
     *
     * @return PRODUCT_SED_NAME - 产品副标题-
     */
    public String getProductSedName() {
        return productSedName;
    }

    /**
     * 设置产品副标题-
     *
     * @param productSedName 产品副标题-
     */
    public void setProductSedName(String productSedName) {
        this.productSedName = productSedName;
    }

    /**
     * @return CONTENT_NAME
     */
    public String getContentName() {
        return contentName;
    }

    /**
     * @param contentName
     */
    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

	public String getSHELVES_SUM_STOCK() {
		return SHELVES_SUM_STOCK;
	}

	public void setSHELVES_SUM_STOCK(String sHELVES_SUM_STOCK) {
		SHELVES_SUM_STOCK = sHELVES_SUM_STOCK;
	}

	public String getINSTOCK_MAYSALE_SUM() {
		return INSTOCK_MAYSALE_SUM;
	}

	public void setINSTOCK_MAYSALE_SUM(String iNSTOCK_MAYSALE_SUM) {
		INSTOCK_MAYSALE_SUM = iNSTOCK_MAYSALE_SUM;
	}

	public String getFREEZE_WAITAUDIT_SUM() {
		return FREEZE_WAITAUDIT_SUM;
	}

	public void setFREEZE_WAITAUDIT_SUM(String fREEZE_WAITAUDIT_SUM) {
		FREEZE_WAITAUDIT_SUM = fREEZE_WAITAUDIT_SUM;
	}

	public String getFREEZE_WAITPAY_SUM() {
		return FREEZE_WAITPAY_SUM;
	}

	public void setFREEZE_WAITPAY_SUM(String fREEZE_WAITPAY_SUM) {
		FREEZE_WAITPAY_SUM = fREEZE_WAITPAY_SUM;
	}

	public String getWAITOUT_SUM() {
		return WAITOUT_SUM;
	}

	public void setWAITOUT_SUM(String wAITOUT_SUM) {
		WAITOUT_SUM = wAITOUT_SUM;
	}

	public String getSALED_WAITREVEICE_SUM() {
		return SALED_WAITREVEICE_SUM;
	}

	public void setSALED_WAITREVEICE_SUM(String sALED_WAITREVEICE_SUM) {
		SALED_WAITREVEICE_SUM = sALED_WAITREVEICE_SUM;
	}

	public String getSALED_REVEICED_SUM() {
		return SALED_REVEICED_SUM;
	}

	public void setSALED_REVEICED_SUM(String sALED_REVEICED_SUM) {
		SALED_REVEICED_SUM = sALED_REVEICED_SUM;
	}

	public String getINSTCOK_SUM() {
		return INSTCOK_SUM;
	}

	public void setINSTCOK_SUM(String iNSTCOK_SUM) {
		INSTCOK_SUM = iNSTCOK_SUM;
	}
    
    
}