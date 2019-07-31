package com.example.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "IM_LOGIC_WAREHOUSE")
public class ImLogicWarehouseVo {
    /**
     * ID-
     */
	@Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 目前存商品库、赠品库、盒损库逻辑库的ID
     */
    @Column(name = "PARENT_ID")
    private String parentId;

    /**
     * 实体库ID-
     */
    @Column(name = "WAREHOUSE_ID")
    private String warehouseId;

    @Column(name = "SUPPLIER_ID")
    private String supplierId;

    @Column(name = "SUPPLIER_NAME")
    private String supplierName;

    @Column(name = "SUPPLIER_CODE")
    private String supplierCode;

    /**
     * 仓库物权-
     */
    @Column(name = "PROPERTY_CODE")
    private String propertyCode;

    /**
     * 仓库名称-
     */
    @Column(name = "WAREHOUSE_NAME")
    private String warehouseName;

    /**
     * 仓库编码-编码规则定义：实体库用erp，名称和编码做唯一性校验
     */
    @Column(name = "WAREHOUSE_CODE")
    private String warehouseCode;

    /**
     * 仓库类型-来源数据字典（商品，赠品，礼品）
     */
    @Column(name = "WAREHOUSE_TYPE")
    private String warehouseType;

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
     * 获取目前存商品库、赠品库、盒损库逻辑库的ID
     *
     * @return PARENT_ID - 目前存商品库、赠品库、盒损库逻辑库的ID
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置目前存商品库、赠品库、盒损库逻辑库的ID
     *
     * @param parentId 目前存商品库、赠品库、盒损库逻辑库的ID
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
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
     * @return SUPPLIER_CODE
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * @param supplierCode
     */
    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    /**
     * 获取仓库物权-
     *
     * @return PROPERTY_CODE - 仓库物权-
     */
    public String getPropertyCode() {
        return propertyCode;
    }

    /**
     * 设置仓库物权-
     *
     * @param propertyCode 仓库物权-
     */
    public void setPropertyCode(String propertyCode) {
        this.propertyCode = propertyCode;
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
     * 获取仓库编码-编码规则定义：实体库用erp，名称和编码做唯一性校验
     *
     * @return WAREHOUSE_CODE - 仓库编码-编码规则定义：实体库用erp，名称和编码做唯一性校验
     */
    public String getWarehouseCode() {
        return warehouseCode;
    }

    /**
     * 设置仓库编码-编码规则定义：实体库用erp，名称和编码做唯一性校验
     *
     * @param warehouseCode 仓库编码-编码规则定义：实体库用erp，名称和编码做唯一性校验
     */
    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    /**
     * 获取仓库类型-来源数据字典（商品，赠品，礼品）
     *
     * @return WAREHOUSE_TYPE - 仓库类型-来源数据字典（商品，赠品，礼品）
     */
    public String getWarehouseType() {
        return warehouseType;
    }

    /**
     * 设置仓库类型-来源数据字典（商品，赠品，礼品）
     *
     * @param warehouseType 仓库类型-来源数据字典（商品，赠品，礼品）
     */
    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType;
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
}