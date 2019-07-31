package com.example.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "IM_WAREHOUSE")
public class ImWarehouseVo {
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
     * ERP仓库编码-ERP
     */
    @Column(name = "ERP_STORE_CD")
    private String erpStoreCd;

    /**
     * 仓库编码-
     */
    @Column(name = "WAREHOUSE_CODE")
    private String warehouseCode;

    /**
     * 省分CODE-BD_REGIONAL_INFO  PROVINCE_CODE 跟王腾要内部接口
     */
    @Column(name = "PRVNCE_CODE")
    private String prvnceCode;

    /**
     * 仓库名称-
     */
    @Column(name = "WAREHOUSE_NAME")
    private String warehouseName;

    /**
     * ERP

     */
    @Column(name = "ERP_STORE_ENTITY_CD")
    private String erpStoreEntityCd;

    /**
     * 联系人-
     */
    @Column(name = "LINKMAN")
    private String linkman;

    /**
     * 联系电话-
     */
    @Column(name = "PHONE")
    private String phone;

    /**
     * 仓库地址-
     */
    @Column(name = "ADDRESS")
    private String address;

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

    @Column(name = "STOCK_ATTR")
    private String stockAttr;

    @Column(name = "IS_DIRECT_SUPPLY")
    private String isDirectSupply;

    @Column(name = "COUNTY_CODE")
    private String countyCode;

    @Column(name = "SUPPLIER_NAME")
    private String supplierName;

    @Column(name = "SUPPLIER_ID")
    private String supplierId;

    /**
     * 面单模板
     */
    @Column(name = "ORDER_PRINT")
    private String orderPrint;

    /**
     * 出库单模板
     */
    @Column(name = "STOCK_OUT_CODE")
    private String stockOutCode;

    @Column(name = "CHANNEL_CODE")
    private String channelCode;

    @Column(name = "ORDER_PRINT_MEMO")
    private String orderPrintMemo;

    @Column(name = "ZF_ERP_TYPE")
    private String zfErpType;

    @Column(name = "NEW_ZF_ERP_STORE_CD")
    private String newZfErpStoreCd;

    @Column(name = "DISPATCH_CITY")
    private String dispatchCity;

    @Column(name = "DISPATCH_CITY_CODE")
    private String dispatchCityCode;

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
     * 获取ERP仓库编码-ERP
     *
     * @return ERP_STORE_CD - ERP仓库编码-ERP
     */
    public String getErpStoreCd() {
        return erpStoreCd;
    }

    /**
     * 设置ERP仓库编码-ERP
     *
     * @param erpStoreCd ERP仓库编码-ERP
     */
    public void setErpStoreCd(String erpStoreCd) {
        this.erpStoreCd = erpStoreCd;
    }

    /**
     * 获取仓库编码-
     *
     * @return WAREHOUSE_CODE - 仓库编码-
     */
    public String getWarehouseCode() {
        return warehouseCode;
    }

    /**
     * 设置仓库编码-
     *
     * @param warehouseCode 仓库编码-
     */
    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    /**
     * 获取省分CODE-BD_REGIONAL_INFO  PROVINCE_CODE 跟王腾要内部接口
     *
     * @return PRVNCE_CODE - 省分CODE-BD_REGIONAL_INFO  PROVINCE_CODE 跟王腾要内部接口
     */
    public String getPrvnceCode() {
        return prvnceCode;
    }

    /**
     * 设置省分CODE-BD_REGIONAL_INFO  PROVINCE_CODE 跟王腾要内部接口
     *
     * @param prvnceCode 省分CODE-BD_REGIONAL_INFO  PROVINCE_CODE 跟王腾要内部接口
     */
    public void setPrvnceCode(String prvnceCode) {
        this.prvnceCode = prvnceCode;
    }

    /**
     * 获取仓库名称-
     *
     * @return WAREHOUSE_NAME - 仓库名称-
     */
    public String getWarehouseName() {
        return warehouseName;
    }

    /**
     * 设置仓库名称-
     *
     * @param warehouseName 仓库名称-
     */
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    /**
     * 获取ERP

     *
     * @return ERP_STORE_ENTITY_CD - ERP

     */
    public String getErpStoreEntityCd() {
        return erpStoreEntityCd;
    }

    /**
     * 设置ERP

     *
     * @param erpStoreEntityCd ERP

     */
    public void setErpStoreEntityCd(String erpStoreEntityCd) {
        this.erpStoreEntityCd = erpStoreEntityCd;
    }

    /**
     * 获取联系人-
     *
     * @return LINKMAN - 联系人-
     */
    public String getLinkman() {
        return linkman;
    }

    /**
     * 设置联系人-
     *
     * @param linkman 联系人-
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    /**
     * 获取联系电话-
     *
     * @return PHONE - 联系电话-
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话-
     *
     * @param phone 联系电话-
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取仓库地址-
     *
     * @return ADDRESS - 仓库地址-
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置仓库地址-
     *
     * @param address 仓库地址-
     */
    public void setAddress(String address) {
        this.address = address;
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
     * @return STOCK_ATTR
     */
    public String getStockAttr() {
        return stockAttr;
    }

    /**
     * @param stockAttr
     */
    public void setStockAttr(String stockAttr) {
        this.stockAttr = stockAttr;
    }

    /**
     * @return IS_DIRECT_SUPPLY
     */
    public String getIsDirectSupply() {
        return isDirectSupply;
    }

    /**
     * @param isDirectSupply
     */
    public void setIsDirectSupply(String isDirectSupply) {
        this.isDirectSupply = isDirectSupply;
    }

    /**
     * @return COUNTY_CODE
     */
    public String getCountyCode() {
        return countyCode;
    }

    /**
     * @param countyCode
     */
    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    /**
     * @return SUPPLIER_NAME
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * @param supplierName
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
     * @return SUPPLIER_ID
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * @param supplierId
     */
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * 获取面单模板
     *
     * @return ORDER_PRINT - 面单模板
     */
    public String getOrderPrint() {
        return orderPrint;
    }

    /**
     * 设置面单模板
     *
     * @param orderPrint 面单模板
     */
    public void setOrderPrint(String orderPrint) {
        this.orderPrint = orderPrint;
    }

    /**
     * 获取出库单模板
     *
     * @return STOCK_OUT_CODE - 出库单模板
     */
    public String getStockOutCode() {
        return stockOutCode;
    }

    /**
     * 设置出库单模板
     *
     * @param stockOutCode 出库单模板
     */
    public void setStockOutCode(String stockOutCode) {
        this.stockOutCode = stockOutCode;
    }

    /**
     * @return CHANNEL_CODE
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * @param channelCode
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    /**
     * @return ORDER_PRINT_MEMO
     */
    public String getOrderPrintMemo() {
        return orderPrintMemo;
    }

    /**
     * @param orderPrintMemo
     */
    public void setOrderPrintMemo(String orderPrintMemo) {
        this.orderPrintMemo = orderPrintMemo;
    }

    /**
     * @return ZF_ERP_TYPE
     */
    public String getZfErpType() {
        return zfErpType;
    }

    /**
     * @param zfErpType
     */
    public void setZfErpType(String zfErpType) {
        this.zfErpType = zfErpType;
    }

    /**
     * @return NEW_ZF_ERP_STORE_CD
     */
    public String getNewZfErpStoreCd() {
        return newZfErpStoreCd;
    }

    /**
     * @param newZfErpStoreCd
     */
    public void setNewZfErpStoreCd(String newZfErpStoreCd) {
        this.newZfErpStoreCd = newZfErpStoreCd;
    }

    /**
     * @return DISPATCH_CITY
     */
    public String getDispatchCity() {
        return dispatchCity;
    }

    /**
     * @param dispatchCity
     */
    public void setDispatchCity(String dispatchCity) {
        this.dispatchCity = dispatchCity;
    }

    /**
     * @return DISPATCH_CITY_CODE
     */
    public String getDispatchCityCode() {
        return dispatchCityCode;
    }

    /**
     * @param dispatchCityCode
     */
    public void setDispatchCityCode(String dispatchCityCode) {
        this.dispatchCityCode = dispatchCityCode;
    }
}