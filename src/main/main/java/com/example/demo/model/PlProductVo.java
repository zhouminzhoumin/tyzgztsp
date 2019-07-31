package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "PL_PRODUCT")
public class PlProductVo {
    /**
     * 主键-
     */
	@Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 接口下发日期-
     */
    @Column(name = "INTERFACE_DATE")
    private Date interfaceDate;

    /**
     * 产品编码-
     */
    @Column(name = "PRODUCT_CD")
    private String productCd;

    /**
     * 产品型号-
     */
    @Column(name = "PRODUCT_MODEL")
    private String productModel;

    /**
     * 产品类型编码-
     */
    @Column(name = "PRODUCT_TYPE_CD")
    private String productTypeCd;

    /**
     * 产品小类编码-
     */
    @Column(name = "PRODUCT_SUBTYPE_CD")
    private String productSubtypeCd;

    /**
     * 厂商编码-
     */
    @Column(name = "MANUFACTURER_CD")
    private String manufacturerCd;

    /**
     * 厂商全称-
     */
    @Column(name = "MANUFACTURER_WHOLE_DESC")
    private String manufacturerWholeDesc;

    /**
     * 厂商简称-
     */
    @Column(name = "MANUFACTURER_SIMP_DESC")
    private String manufacturerSimpDesc;

    /**
     * 品牌编码-
     */
    @Column(name = "BRAND_CD")
    private String brandCd;

    /**
     * 品牌名称-
     */
    @Column(name = "BRAND_NAME")
    private String brandName;

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
     * 采购模式编码-
     */
    @Column(name = "GATHER_MODEL_CD")
    private String gatherModelCd;

    /**
     * 产品上市时间-
     */
    @Column(name = "PRODUCT_ONMARKET_DATE")
    private Date productOnmarketDate;

    /**
     * 产品名称-
     */
    @Column(name = "PRODUCT_NAME")
    private String productName;

    /**
     * 零售价-接口缺少这个字段
     */
    @Column(name = "RETAIL_PRICE")
    private BigDecimal retailPrice;

    /**
     * 产品市场定位-
     */
    @Column(name = "PRODUCT_MARKET_LOCATION")
    private String productMarketLocation;

    /**
     * 产品标准配置-
     */
    @Column(name = "PRODUCT_STANDARD_CONF")
    private String productStandardConf;

    /**
     * 芯片平台-
     */
    @Column(name = "CHIP_PLANTFORM")
    private String chipPlantform;

    /**
     * 上市销售软件版本-
     */
    @Column(name = "SOFT_VERSION")
    private String softVersion;

    /**
     * 网络频段-
     */
    @Column(name = "NET_BAND")
    private String netBand;

    /**
     * 待机类型-
     */
    @Column(name = "BANDBY_TYPE")
    private String bandbyType;

    /**
     * 外观类型-
     */
    @Column(name = "FACE_TYPE")
    private String faceType;

    /**
     * 天线设计-
     */
    @Column(name = "AERIAL_DESIGN")
    private String aerialDesign;

    /**
     * 产品尺寸-
     */
    @Column(name = "PRODUCT_SIZE")
    private String productSize;

    /**
     * 产品重量-
     */
    @Column(name = "PRODUCT_WIGHT")
    private String productWight;

    /**
     * 电源接口-
     */
    @Column(name = "POWER_INTERFACE")
    private String powerInterface;

    /**
     * 耳机接口-
     */
    @Column(name = "HEADPHONE_INTERFACE")
    private String headphoneInterface;

    /**
     * 屏幕数量-
     */
    @Column(name = "SCREEN_SUM")
    private String screenSum;

    /**
     * 主屏幕尺寸-
     */
    @Column(name = "MAIN_SCREEN_SIZE")
    private String mainScreenSize;

    /**
     * 显示分辩率-
     */
    @Column(name = "DISPLAY_RESOLUTION")
    private String displayResolution;

    /**
     * 触摸屏类型-
     */
    @Column(name = "TOUCH_SCREEN_TYPE")
    private String touchScreenType;

    /**
     * RAM-
     */
    @Column(name = "RAM")
    private String ram;

    /**
     * ROM-
     */
    @Column(name = "ROM")
    private String rom;

    /**
     * Flash内存-
     */
    @Column(name = "FLASH_ROM")
    private String flashRom;

    /**
     * 支持最大扩展卡-
     */
    @Column(name = "SUPPORT_MAX_EXPANDCARD")
    private String supportMaxExpandcard;

    /**
     * 主摄像头-
     */
    @Column(name = "MAIN_WEBCAM")
    private String mainWebcam;

    /**
     * 副摄像头-
     */
    @Column(name = "SECORD_WEBCAM")
    private String secordWebcam;

    /**
     * AP型号-
     */
    @Column(name = "AP_MODEL")
    private String apModel;

    /**
     * AP核数-
     */
    @Column(name = "AP_CORE")
    private String apCore;

    /**
     * AP主频-
     */
    @Column(name = "AP_FREQUENCY")
    private String apFrequency;

    /**
     * HDMI接口-
     */
    @Column(name = "HDMI_INTERFACE")
    private String hdmiInterface;

    /**
     * 红外无线通信-
     */
    @Column(name = "INFRARED_WIFI_COMMUNICATE")
    private String infraredWifiCommunicate;

    /**
     * 蓝牙无线通信-
     */
    @Column(name = "BLUETOOTH_WIFI_COMMUNICATE")
    private String bluetoothWifiCommunicate;

    /**
     * WLAN无线通信-
     */
    @Column(name = "WLAN_WIFI_COMMUNICATE")
    private String wlanWifiCommunicate;

    /**
     * 电池类型-
     */
    @Column(name = "BATTERY_TYPE")
    private String batteryType;

    /**
     * 电池容量-
     */
    @Column(name = "BATTERY_CAPACITANCE")
    private String batteryCapacitance;

    /**
     * 重力感应器-
     */
    @Column(name = "WIGHT_INDUCTOR")
    private String wightInductor;

    /**
     * 方向感应器-
     */
    @Column(name = "DIR_INDUCTOR")
    private String dirInductor;

    /**
     * 智能操作系统-
     */
    @Column(name = "INTELLIGENT_SYSTEM")
    private String intelligentSystem;

    /**
     * 独立GPS-
     */
    @Column(name = "SIGNLE_GPS")
    private String signleGps;

    /**
     * JAVA-
     */
    @Column(name = "IS_JAVA")
    private String isJava;

    /**
     * FILED1-
     */
    @Column(name = "FILED1")
    private String filed1;

    /**
     * FILED2-
     */
    @Column(name = "FILED2")
    private String filed2;

    /**
     * FILED3-
     */
    @Column(name = "FILED3")
    private String filed3;

    /**
     * FILED4-
     */
    @Column(name = "FILED4")
    private String filed4;

    /**
     * FILED5-
     */
    @Column(name = "FILED5")
    private String filed5;

    /**
     * FILED6-
     */
    @Column(name = "FILED6")
    private String filed6;

    /**
     * FILED7-
     */
    @Column(name = "FILED7")
    private String filed7;

    /**
     * FILED8-
     */
    @Column(name = "FILED8")
    private String filed8;

    /**
     * FILED9-
     */
    @Column(name = "FILED9")
    private String filed9;

    /**
     * FILED10-
     */
    @Column(name = "FILED10")
    private String filed10;

    /**
     * FILED11-
     */
    @Column(name = "FILED11")
    private String filed11;

    /**
     * FILED12-
     */
    @Column(name = "FILED12")
    private String filed12;

    /**
     * FILED13-
     */
    @Column(name = "FILED13")
    private String filed13;

    /**
     * FILED14-
     */
    @Column(name = "FILED14")
    private String filed14;

    /**
     * FILED15-
     */
    @Column(name = "FILED15")
    private String filed15;

    /**
     * FILED16-
     */
    @Column(name = "FILED16")
    private String filed16;

    /**
     * FILED17-
     */
    @Column(name = "FILED17")
    private String filed17;

    /**
     * FILED18-
     */
    @Column(name = "FILED18")
    private String filed18;

    /**
     * FILED19-
     */
    @Column(name = "FILED19")
    private String filed19;

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
     * 智能机标示-
     */
    @Column(name = "IS_SMART")
    private String isSmart;

    /**
     * 产品是否编辑-0：否，1：是
     */
    @Column(name = "PRODUCT_STATUS")
    private String productStatus;

    /**
     * 是否串码管理-0：否，1：是
     */
    @Column(name = "STRCODE_GOVERN")
    private String strcodeGovern;

    @Column(name = "ERP_CODE")
    private String erpCode;

    @Column(name = "ERP_NAME")
    private String erpName;

    @Column(name = "ERP_STOCK_CODE")
    private String erpStockCode;

    @Column(name = "TAX_CLASSIFICATION_CODE")
    private String taxClassificationCode;

    @Column(name = "APPLE_MODELS")
    private String appleModels;

    @Column(name = "PARAM1")
    private String param1;

    @Column(name = "PARAM2")
    private String param2;

    @Column(name = "PARAM3")
    private String param3;

    @Column(name = "PARAM4")
    private String param4;

    @Column(name = "PARAM5")
    private String param5;

    @Column(name = "PARAM6")
    private String param6;

    @Column(name = "PARAM7")
    private String param7;

    @Column(name = "PARAM8")
    private String param8;

    @Column(name = "PARAM9")
    private String param9;

    @Column(name = "PARAM10")
    private String param10;

    @Column(name = "PARAM11")
    private String param11;

    @Column(name = "PARAM12")
    private String param12;

    @Column(name = "PARAM13")
    private String param13;

    @Column(name = "PARAM14")
    private String param14;

    @Column(name = "PARAM15")
    private String param15;

    @Column(name = "PARAM16")
    private String param16;

    @Column(name = "PARAM17")
    private String param17;

    @Column(name = "PARAM18")
    private String param18;

    @Column(name = "PARAM19")
    private String param19;

    @Column(name = "PARAM20")
    private String param20;

    @Column(name = "PARAM21")
    private String param21;

    @Column(name = "PARAM22")
    private String param22;

    @Column(name = "PARAM23")
    private String param23;

    @Column(name = "PARAM24")
    private String param24;

    /**
     * 产品销售卖点-
     */
    @Column(name = "PRODUCT_SELLING")
    private String productSelling;

    /**
     * 网络支持-
     */
    @Column(name = "NET_SUPPORT")
    private String netSupport;

    /**
     * 外壳材质-
     */
    @Column(name = "CASE_MATERIAL")
    private String caseMaterial;

    @Column(name = "ERP_STOCK_NAME")
    private String erpStockName;

    @Column(name = "PARAM25")
    private String param25;

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
     * 获取接口下发日期-
     *
     * @return INTERFACE_DATE - 接口下发日期-
     */
    public Date getInterfaceDate() {
        return interfaceDate;
    }

    /**
     * 设置接口下发日期-
     *
     * @param interfaceDate 接口下发日期-
     */
    public void setInterfaceDate(Date interfaceDate) {
        this.interfaceDate = interfaceDate;
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
     * 获取产品类型编码-
     *
     * @return PRODUCT_TYPE_CD - 产品类型编码-
     */
    public String getProductTypeCd() {
        return productTypeCd;
    }

    /**
     * 设置产品类型编码-
     *
     * @param productTypeCd 产品类型编码-
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
     * 获取厂商编码-
     *
     * @return MANUFACTURER_CD - 厂商编码-
     */
    public String getManufacturerCd() {
        return manufacturerCd;
    }

    /**
     * 设置厂商编码-
     *
     * @param manufacturerCd 厂商编码-
     */
    public void setManufacturerCd(String manufacturerCd) {
        this.manufacturerCd = manufacturerCd;
    }

    /**
     * 获取厂商全称-
     *
     * @return MANUFACTURER_WHOLE_DESC - 厂商全称-
     */
    public String getManufacturerWholeDesc() {
        return manufacturerWholeDesc;
    }

    /**
     * 设置厂商全称-
     *
     * @param manufacturerWholeDesc 厂商全称-
     */
    public void setManufacturerWholeDesc(String manufacturerWholeDesc) {
        this.manufacturerWholeDesc = manufacturerWholeDesc;
    }

    /**
     * 获取厂商简称-
     *
     * @return MANUFACTURER_SIMP_DESC - 厂商简称-
     */
    public String getManufacturerSimpDesc() {
        return manufacturerSimpDesc;
    }

    /**
     * 设置厂商简称-
     *
     * @param manufacturerSimpDesc 厂商简称-
     */
    public void setManufacturerSimpDesc(String manufacturerSimpDesc) {
        this.manufacturerSimpDesc = manufacturerSimpDesc;
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
     * 获取采购模式编码-
     *
     * @return GATHER_MODEL_CD - 采购模式编码-
     */
    public String getGatherModelCd() {
        return gatherModelCd;
    }

    /**
     * 设置采购模式编码-
     *
     * @param gatherModelCd 采购模式编码-
     */
    public void setGatherModelCd(String gatherModelCd) {
        this.gatherModelCd = gatherModelCd;
    }

    /**
     * 获取产品上市时间-
     *
     * @return PRODUCT_ONMARKET_DATE - 产品上市时间-
     */
    public Date getProductOnmarketDate() {
        return productOnmarketDate;
    }

    /**
     * 设置产品上市时间-
     *
     * @param productOnmarketDate 产品上市时间-
     */
    public void setProductOnmarketDate(Date productOnmarketDate) {
        this.productOnmarketDate = productOnmarketDate;
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
     * 获取零售价-接口缺少这个字段
     *
     * @return RETAIL_PRICE - 零售价-接口缺少这个字段
     */
    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    /**
     * 设置零售价-接口缺少这个字段
     *
     * @param retailPrice 零售价-接口缺少这个字段
     */
    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    /**
     * 获取产品市场定位-
     *
     * @return PRODUCT_MARKET_LOCATION - 产品市场定位-
     */
    public String getProductMarketLocation() {
        return productMarketLocation;
    }

    /**
     * 设置产品市场定位-
     *
     * @param productMarketLocation 产品市场定位-
     */
    public void setProductMarketLocation(String productMarketLocation) {
        this.productMarketLocation = productMarketLocation;
    }

    /**
     * 获取产品标准配置-
     *
     * @return PRODUCT_STANDARD_CONF - 产品标准配置-
     */
    public String getProductStandardConf() {
        return productStandardConf;
    }

    /**
     * 设置产品标准配置-
     *
     * @param productStandardConf 产品标准配置-
     */
    public void setProductStandardConf(String productStandardConf) {
        this.productStandardConf = productStandardConf;
    }

    /**
     * 获取芯片平台-
     *
     * @return CHIP_PLANTFORM - 芯片平台-
     */
    public String getChipPlantform() {
        return chipPlantform;
    }

    /**
     * 设置芯片平台-
     *
     * @param chipPlantform 芯片平台-
     */
    public void setChipPlantform(String chipPlantform) {
        this.chipPlantform = chipPlantform;
    }

    /**
     * 获取上市销售软件版本-
     *
     * @return SOFT_VERSION - 上市销售软件版本-
     */
    public String getSoftVersion() {
        return softVersion;
    }

    /**
     * 设置上市销售软件版本-
     *
     * @param softVersion 上市销售软件版本-
     */
    public void setSoftVersion(String softVersion) {
        this.softVersion = softVersion;
    }

    /**
     * 获取网络频段-
     *
     * @return NET_BAND - 网络频段-
     */
    public String getNetBand() {
        return netBand;
    }

    /**
     * 设置网络频段-
     *
     * @param netBand 网络频段-
     */
    public void setNetBand(String netBand) {
        this.netBand = netBand;
    }

    /**
     * 获取待机类型-
     *
     * @return BANDBY_TYPE - 待机类型-
     */
    public String getBandbyType() {
        return bandbyType;
    }

    /**
     * 设置待机类型-
     *
     * @param bandbyType 待机类型-
     */
    public void setBandbyType(String bandbyType) {
        this.bandbyType = bandbyType;
    }

    /**
     * 获取外观类型-
     *
     * @return FACE_TYPE - 外观类型-
     */
    public String getFaceType() {
        return faceType;
    }

    /**
     * 设置外观类型-
     *
     * @param faceType 外观类型-
     */
    public void setFaceType(String faceType) {
        this.faceType = faceType;
    }

    /**
     * 获取天线设计-
     *
     * @return AERIAL_DESIGN - 天线设计-
     */
    public String getAerialDesign() {
        return aerialDesign;
    }

    /**
     * 设置天线设计-
     *
     * @param aerialDesign 天线设计-
     */
    public void setAerialDesign(String aerialDesign) {
        this.aerialDesign = aerialDesign;
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
     * 获取产品重量-
     *
     * @return PRODUCT_WIGHT - 产品重量-
     */
    public String getProductWight() {
        return productWight;
    }

    /**
     * 设置产品重量-
     *
     * @param productWight 产品重量-
     */
    public void setProductWight(String productWight) {
        this.productWight = productWight;
    }

    /**
     * 获取电源接口-
     *
     * @return POWER_INTERFACE - 电源接口-
     */
    public String getPowerInterface() {
        return powerInterface;
    }

    /**
     * 设置电源接口-
     *
     * @param powerInterface 电源接口-
     */
    public void setPowerInterface(String powerInterface) {
        this.powerInterface = powerInterface;
    }

    /**
     * 获取耳机接口-
     *
     * @return HEADPHONE_INTERFACE - 耳机接口-
     */
    public String getHeadphoneInterface() {
        return headphoneInterface;
    }

    /**
     * 设置耳机接口-
     *
     * @param headphoneInterface 耳机接口-
     */
    public void setHeadphoneInterface(String headphoneInterface) {
        this.headphoneInterface = headphoneInterface;
    }

    /**
     * 获取屏幕数量-
     *
     * @return SCREEN_SUM - 屏幕数量-
     */
    public String getScreenSum() {
        return screenSum;
    }

    /**
     * 设置屏幕数量-
     *
     * @param screenSum 屏幕数量-
     */
    public void setScreenSum(String screenSum) {
        this.screenSum = screenSum;
    }

    /**
     * 获取主屏幕尺寸-
     *
     * @return MAIN_SCREEN_SIZE - 主屏幕尺寸-
     */
    public String getMainScreenSize() {
        return mainScreenSize;
    }

    /**
     * 设置主屏幕尺寸-
     *
     * @param mainScreenSize 主屏幕尺寸-
     */
    public void setMainScreenSize(String mainScreenSize) {
        this.mainScreenSize = mainScreenSize;
    }

    /**
     * 获取显示分辩率-
     *
     * @return DISPLAY_RESOLUTION - 显示分辩率-
     */
    public String getDisplayResolution() {
        return displayResolution;
    }

    /**
     * 设置显示分辩率-
     *
     * @param displayResolution 显示分辩率-
     */
    public void setDisplayResolution(String displayResolution) {
        this.displayResolution = displayResolution;
    }

    /**
     * 获取触摸屏类型-
     *
     * @return TOUCH_SCREEN_TYPE - 触摸屏类型-
     */
    public String getTouchScreenType() {
        return touchScreenType;
    }

    /**
     * 设置触摸屏类型-
     *
     * @param touchScreenType 触摸屏类型-
     */
    public void setTouchScreenType(String touchScreenType) {
        this.touchScreenType = touchScreenType;
    }

    /**
     * 获取RAM-
     *
     * @return RAM - RAM-
     */
    public String getRam() {
        return ram;
    }

    /**
     * 设置RAM-
     *
     * @param ram RAM-
     */
    public void setRam(String ram) {
        this.ram = ram;
    }

    /**
     * 获取ROM-
     *
     * @return ROM - ROM-
     */
    public String getRom() {
        return rom;
    }

    /**
     * 设置ROM-
     *
     * @param rom ROM-
     */
    public void setRom(String rom) {
        this.rom = rom;
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
     * 获取支持最大扩展卡-
     *
     * @return SUPPORT_MAX_EXPANDCARD - 支持最大扩展卡-
     */
    public String getSupportMaxExpandcard() {
        return supportMaxExpandcard;
    }

    /**
     * 设置支持最大扩展卡-
     *
     * @param supportMaxExpandcard 支持最大扩展卡-
     */
    public void setSupportMaxExpandcard(String supportMaxExpandcard) {
        this.supportMaxExpandcard = supportMaxExpandcard;
    }

    /**
     * 获取主摄像头-
     *
     * @return MAIN_WEBCAM - 主摄像头-
     */
    public String getMainWebcam() {
        return mainWebcam;
    }

    /**
     * 设置主摄像头-
     *
     * @param mainWebcam 主摄像头-
     */
    public void setMainWebcam(String mainWebcam) {
        this.mainWebcam = mainWebcam;
    }

    /**
     * 获取副摄像头-
     *
     * @return SECORD_WEBCAM - 副摄像头-
     */
    public String getSecordWebcam() {
        return secordWebcam;
    }

    /**
     * 设置副摄像头-
     *
     * @param secordWebcam 副摄像头-
     */
    public void setSecordWebcam(String secordWebcam) {
        this.secordWebcam = secordWebcam;
    }

    /**
     * 获取AP型号-
     *
     * @return AP_MODEL - AP型号-
     */
    public String getApModel() {
        return apModel;
    }

    /**
     * 设置AP型号-
     *
     * @param apModel AP型号-
     */
    public void setApModel(String apModel) {
        this.apModel = apModel;
    }

    /**
     * 获取AP核数-
     *
     * @return AP_CORE - AP核数-
     */
    public String getApCore() {
        return apCore;
    }

    /**
     * 设置AP核数-
     *
     * @param apCore AP核数-
     */
    public void setApCore(String apCore) {
        this.apCore = apCore;
    }

    /**
     * 获取AP主频-
     *
     * @return AP_FREQUENCY - AP主频-
     */
    public String getApFrequency() {
        return apFrequency;
    }

    /**
     * 设置AP主频-
     *
     * @param apFrequency AP主频-
     */
    public void setApFrequency(String apFrequency) {
        this.apFrequency = apFrequency;
    }

    /**
     * 获取HDMI接口-
     *
     * @return HDMI_INTERFACE - HDMI接口-
     */
    public String getHdmiInterface() {
        return hdmiInterface;
    }

    /**
     * 设置HDMI接口-
     *
     * @param hdmiInterface HDMI接口-
     */
    public void setHdmiInterface(String hdmiInterface) {
        this.hdmiInterface = hdmiInterface;
    }

    /**
     * 获取红外无线通信-
     *
     * @return INFRARED_WIFI_COMMUNICATE - 红外无线通信-
     */
    public String getInfraredWifiCommunicate() {
        return infraredWifiCommunicate;
    }

    /**
     * 设置红外无线通信-
     *
     * @param infraredWifiCommunicate 红外无线通信-
     */
    public void setInfraredWifiCommunicate(String infraredWifiCommunicate) {
        this.infraredWifiCommunicate = infraredWifiCommunicate;
    }

    /**
     * 获取蓝牙无线通信-
     *
     * @return BLUETOOTH_WIFI_COMMUNICATE - 蓝牙无线通信-
     */
    public String getBluetoothWifiCommunicate() {
        return bluetoothWifiCommunicate;
    }

    /**
     * 设置蓝牙无线通信-
     *
     * @param bluetoothWifiCommunicate 蓝牙无线通信-
     */
    public void setBluetoothWifiCommunicate(String bluetoothWifiCommunicate) {
        this.bluetoothWifiCommunicate = bluetoothWifiCommunicate;
    }

    /**
     * 获取WLAN无线通信-
     *
     * @return WLAN_WIFI_COMMUNICATE - WLAN无线通信-
     */
    public String getWlanWifiCommunicate() {
        return wlanWifiCommunicate;
    }

    /**
     * 设置WLAN无线通信-
     *
     * @param wlanWifiCommunicate WLAN无线通信-
     */
    public void setWlanWifiCommunicate(String wlanWifiCommunicate) {
        this.wlanWifiCommunicate = wlanWifiCommunicate;
    }

    /**
     * 获取电池类型-
     *
     * @return BATTERY_TYPE - 电池类型-
     */
    public String getBatteryType() {
        return batteryType;
    }

    /**
     * 设置电池类型-
     *
     * @param batteryType 电池类型-
     */
    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    /**
     * 获取电池容量-
     *
     * @return BATTERY_CAPACITANCE - 电池容量-
     */
    public String getBatteryCapacitance() {
        return batteryCapacitance;
    }

    /**
     * 设置电池容量-
     *
     * @param batteryCapacitance 电池容量-
     */
    public void setBatteryCapacitance(String batteryCapacitance) {
        this.batteryCapacitance = batteryCapacitance;
    }

    /**
     * 获取重力感应器-
     *
     * @return WIGHT_INDUCTOR - 重力感应器-
     */
    public String getWightInductor() {
        return wightInductor;
    }

    /**
     * 设置重力感应器-
     *
     * @param wightInductor 重力感应器-
     */
    public void setWightInductor(String wightInductor) {
        this.wightInductor = wightInductor;
    }

    /**
     * 获取方向感应器-
     *
     * @return DIR_INDUCTOR - 方向感应器-
     */
    public String getDirInductor() {
        return dirInductor;
    }

    /**
     * 设置方向感应器-
     *
     * @param dirInductor 方向感应器-
     */
    public void setDirInductor(String dirInductor) {
        this.dirInductor = dirInductor;
    }

    /**
     * 获取智能操作系统-
     *
     * @return INTELLIGENT_SYSTEM - 智能操作系统-
     */
    public String getIntelligentSystem() {
        return intelligentSystem;
    }

    /**
     * 设置智能操作系统-
     *
     * @param intelligentSystem 智能操作系统-
     */
    public void setIntelligentSystem(String intelligentSystem) {
        this.intelligentSystem = intelligentSystem;
    }

    /**
     * 获取独立GPS-
     *
     * @return SIGNLE_GPS - 独立GPS-
     */
    public String getSignleGps() {
        return signleGps;
    }

    /**
     * 设置独立GPS-
     *
     * @param signleGps 独立GPS-
     */
    public void setSignleGps(String signleGps) {
        this.signleGps = signleGps;
    }

    /**
     * 获取JAVA-
     *
     * @return IS_JAVA - JAVA-
     */
    public String getIsJava() {
        return isJava;
    }

    /**
     * 设置JAVA-
     *
     * @param isJava JAVA-
     */
    public void setIsJava(String isJava) {
        this.isJava = isJava;
    }

    /**
     * 获取FILED1-
     *
     * @return FILED1 - FILED1-
     */
    public String getFiled1() {
        return filed1;
    }

    /**
     * 设置FILED1-
     *
     * @param filed1 FILED1-
     */
    public void setFiled1(String filed1) {
        this.filed1 = filed1;
    }

    /**
     * 获取FILED2-
     *
     * @return FILED2 - FILED2-
     */
    public String getFiled2() {
        return filed2;
    }

    /**
     * 设置FILED2-
     *
     * @param filed2 FILED2-
     */
    public void setFiled2(String filed2) {
        this.filed2 = filed2;
    }

    /**
     * 获取FILED3-
     *
     * @return FILED3 - FILED3-
     */
    public String getFiled3() {
        return filed3;
    }

    /**
     * 设置FILED3-
     *
     * @param filed3 FILED3-
     */
    public void setFiled3(String filed3) {
        this.filed3 = filed3;
    }

    /**
     * 获取FILED4-
     *
     * @return FILED4 - FILED4-
     */
    public String getFiled4() {
        return filed4;
    }

    /**
     * 设置FILED4-
     *
     * @param filed4 FILED4-
     */
    public void setFiled4(String filed4) {
        this.filed4 = filed4;
    }

    /**
     * 获取FILED5-
     *
     * @return FILED5 - FILED5-
     */
    public String getFiled5() {
        return filed5;
    }

    /**
     * 设置FILED5-
     *
     * @param filed5 FILED5-
     */
    public void setFiled5(String filed5) {
        this.filed5 = filed5;
    }

    /**
     * 获取FILED6-
     *
     * @return FILED6 - FILED6-
     */
    public String getFiled6() {
        return filed6;
    }

    /**
     * 设置FILED6-
     *
     * @param filed6 FILED6-
     */
    public void setFiled6(String filed6) {
        this.filed6 = filed6;
    }

    /**
     * 获取FILED7-
     *
     * @return FILED7 - FILED7-
     */
    public String getFiled7() {
        return filed7;
    }

    /**
     * 设置FILED7-
     *
     * @param filed7 FILED7-
     */
    public void setFiled7(String filed7) {
        this.filed7 = filed7;
    }

    /**
     * 获取FILED8-
     *
     * @return FILED8 - FILED8-
     */
    public String getFiled8() {
        return filed8;
    }

    /**
     * 设置FILED8-
     *
     * @param filed8 FILED8-
     */
    public void setFiled8(String filed8) {
        this.filed8 = filed8;
    }

    /**
     * 获取FILED9-
     *
     * @return FILED9 - FILED9-
     */
    public String getFiled9() {
        return filed9;
    }

    /**
     * 设置FILED9-
     *
     * @param filed9 FILED9-
     */
    public void setFiled9(String filed9) {
        this.filed9 = filed9;
    }

    /**
     * 获取FILED10-
     *
     * @return FILED10 - FILED10-
     */
    public String getFiled10() {
        return filed10;
    }

    /**
     * 设置FILED10-
     *
     * @param filed10 FILED10-
     */
    public void setFiled10(String filed10) {
        this.filed10 = filed10;
    }

    /**
     * 获取FILED11-
     *
     * @return FILED11 - FILED11-
     */
    public String getFiled11() {
        return filed11;
    }

    /**
     * 设置FILED11-
     *
     * @param filed11 FILED11-
     */
    public void setFiled11(String filed11) {
        this.filed11 = filed11;
    }

    /**
     * 获取FILED12-
     *
     * @return FILED12 - FILED12-
     */
    public String getFiled12() {
        return filed12;
    }

    /**
     * 设置FILED12-
     *
     * @param filed12 FILED12-
     */
    public void setFiled12(String filed12) {
        this.filed12 = filed12;
    }

    /**
     * 获取FILED13-
     *
     * @return FILED13 - FILED13-
     */
    public String getFiled13() {
        return filed13;
    }

    /**
     * 设置FILED13-
     *
     * @param filed13 FILED13-
     */
    public void setFiled13(String filed13) {
        this.filed13 = filed13;
    }

    /**
     * 获取FILED14-
     *
     * @return FILED14 - FILED14-
     */
    public String getFiled14() {
        return filed14;
    }

    /**
     * 设置FILED14-
     *
     * @param filed14 FILED14-
     */
    public void setFiled14(String filed14) {
        this.filed14 = filed14;
    }

    /**
     * 获取FILED15-
     *
     * @return FILED15 - FILED15-
     */
    public String getFiled15() {
        return filed15;
    }

    /**
     * 设置FILED15-
     *
     * @param filed15 FILED15-
     */
    public void setFiled15(String filed15) {
        this.filed15 = filed15;
    }

    /**
     * 获取FILED16-
     *
     * @return FILED16 - FILED16-
     */
    public String getFiled16() {
        return filed16;
    }

    /**
     * 设置FILED16-
     *
     * @param filed16 FILED16-
     */
    public void setFiled16(String filed16) {
        this.filed16 = filed16;
    }

    /**
     * 获取FILED17-
     *
     * @return FILED17 - FILED17-
     */
    public String getFiled17() {
        return filed17;
    }

    /**
     * 设置FILED17-
     *
     * @param filed17 FILED17-
     */
    public void setFiled17(String filed17) {
        this.filed17 = filed17;
    }

    /**
     * 获取FILED18-
     *
     * @return FILED18 - FILED18-
     */
    public String getFiled18() {
        return filed18;
    }

    /**
     * 设置FILED18-
     *
     * @param filed18 FILED18-
     */
    public void setFiled18(String filed18) {
        this.filed18 = filed18;
    }

    /**
     * 获取FILED19-
     *
     * @return FILED19 - FILED19-
     */
    public String getFiled19() {
        return filed19;
    }

    /**
     * 设置FILED19-
     *
     * @param filed19 FILED19-
     */
    public void setFiled19(String filed19) {
        this.filed19 = filed19;
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
     * 获取智能机标示-
     *
     * @return IS_SMART - 智能机标示-
     */
    public String getIsSmart() {
        return isSmart;
    }

    /**
     * 设置智能机标示-
     *
     * @param isSmart 智能机标示-
     */
    public void setIsSmart(String isSmart) {
        this.isSmart = isSmart;
    }

    /**
     * 获取产品是否编辑-0：否，1：是
     *
     * @return PRODUCT_STATUS - 产品是否编辑-0：否，1：是
     */
    public String getProductStatus() {
        return productStatus;
    }

    /**
     * 设置产品是否编辑-0：否，1：是
     *
     * @param productStatus 产品是否编辑-0：否，1：是
     */
    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    /**
     * 获取是否串码管理-0：否，1：是
     *
     * @return STRCODE_GOVERN - 是否串码管理-0：否，1：是
     */
    public String getStrcodeGovern() {
        return strcodeGovern;
    }

    /**
     * 设置是否串码管理-0：否，1：是
     *
     * @param strcodeGovern 是否串码管理-0：否，1：是
     */
    public void setStrcodeGovern(String strcodeGovern) {
        this.strcodeGovern = strcodeGovern;
    }

    /**
     * @return ERP_CODE
     */
    public String getErpCode() {
        return erpCode;
    }

    /**
     * @param erpCode
     */
    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    /**
     * @return ERP_NAME
     */
    public String getErpName() {
        return erpName;
    }

    /**
     * @param erpName
     */
    public void setErpName(String erpName) {
        this.erpName = erpName;
    }

    /**
     * @return ERP_STOCK_CODE
     */
    public String getErpStockCode() {
        return erpStockCode;
    }

    /**
     * @param erpStockCode
     */
    public void setErpStockCode(String erpStockCode) {
        this.erpStockCode = erpStockCode;
    }

    /**
     * @return TAX_CLASSIFICATION_CODE
     */
    public String getTaxClassificationCode() {
        return taxClassificationCode;
    }

    /**
     * @param taxClassificationCode
     */
    public void setTaxClassificationCode(String taxClassificationCode) {
        this.taxClassificationCode = taxClassificationCode;
    }

    /**
     * @return APPLE_MODELS
     */
    public String getAppleModels() {
        return appleModels;
    }

    /**
     * @param appleModels
     */
    public void setAppleModels(String appleModels) {
        this.appleModels = appleModels;
    }

    /**
     * @return PARAM1
     */
    public String getParam1() {
        return param1;
    }

    /**
     * @param param1
     */
    public void setParam1(String param1) {
        this.param1 = param1;
    }

    /**
     * @return PARAM2
     */
    public String getParam2() {
        return param2;
    }

    /**
     * @param param2
     */
    public void setParam2(String param2) {
        this.param2 = param2;
    }

    /**
     * @return PARAM3
     */
    public String getParam3() {
        return param3;
    }

    /**
     * @param param3
     */
    public void setParam3(String param3) {
        this.param3 = param3;
    }

    /**
     * @return PARAM4
     */
    public String getParam4() {
        return param4;
    }

    /**
     * @param param4
     */
    public void setParam4(String param4) {
        this.param4 = param4;
    }

    /**
     * @return PARAM5
     */
    public String getParam5() {
        return param5;
    }

    /**
     * @param param5
     */
    public void setParam5(String param5) {
        this.param5 = param5;
    }

    /**
     * @return PARAM6
     */
    public String getParam6() {
        return param6;
    }

    /**
     * @param param6
     */
    public void setParam6(String param6) {
        this.param6 = param6;
    }

    /**
     * @return PARAM7
     */
    public String getParam7() {
        return param7;
    }

    /**
     * @param param7
     */
    public void setParam7(String param7) {
        this.param7 = param7;
    }

    /**
     * @return PARAM8
     */
    public String getParam8() {
        return param8;
    }

    /**
     * @param param8
     */
    public void setParam8(String param8) {
        this.param8 = param8;
    }

    /**
     * @return PARAM9
     */
    public String getParam9() {
        return param9;
    }

    /**
     * @param param9
     */
    public void setParam9(String param9) {
        this.param9 = param9;
    }

    /**
     * @return PARAM10
     */
    public String getParam10() {
        return param10;
    }

    /**
     * @param param10
     */
    public void setParam10(String param10) {
        this.param10 = param10;
    }

    /**
     * @return PARAM11
     */
    public String getParam11() {
        return param11;
    }

    /**
     * @param param11
     */
    public void setParam11(String param11) {
        this.param11 = param11;
    }

    /**
     * @return PARAM12
     */
    public String getParam12() {
        return param12;
    }

    /**
     * @param param12
     */
    public void setParam12(String param12) {
        this.param12 = param12;
    }

    /**
     * @return PARAM13
     */
    public String getParam13() {
        return param13;
    }

    /**
     * @param param13
     */
    public void setParam13(String param13) {
        this.param13 = param13;
    }

    /**
     * @return PARAM14
     */
    public String getParam14() {
        return param14;
    }

    /**
     * @param param14
     */
    public void setParam14(String param14) {
        this.param14 = param14;
    }

    /**
     * @return PARAM15
     */
    public String getParam15() {
        return param15;
    }

    /**
     * @param param15
     */
    public void setParam15(String param15) {
        this.param15 = param15;
    }

    /**
     * @return PARAM16
     */
    public String getParam16() {
        return param16;
    }

    /**
     * @param param16
     */
    public void setParam16(String param16) {
        this.param16 = param16;
    }

    /**
     * @return PARAM17
     */
    public String getParam17() {
        return param17;
    }

    /**
     * @param param17
     */
    public void setParam17(String param17) {
        this.param17 = param17;
    }

    /**
     * @return PARAM18
     */
    public String getParam18() {
        return param18;
    }

    /**
     * @param param18
     */
    public void setParam18(String param18) {
        this.param18 = param18;
    }

    /**
     * @return PARAM19
     */
    public String getParam19() {
        return param19;
    }

    /**
     * @param param19
     */
    public void setParam19(String param19) {
        this.param19 = param19;
    }

    /**
     * @return PARAM20
     */
    public String getParam20() {
        return param20;
    }

    /**
     * @param param20
     */
    public void setParam20(String param20) {
        this.param20 = param20;
    }

    /**
     * @return PARAM21
     */
    public String getParam21() {
        return param21;
    }

    /**
     * @param param21
     */
    public void setParam21(String param21) {
        this.param21 = param21;
    }

    /**
     * @return PARAM22
     */
    public String getParam22() {
        return param22;
    }

    /**
     * @param param22
     */
    public void setParam22(String param22) {
        this.param22 = param22;
    }

    /**
     * @return PARAM23
     */
    public String getParam23() {
        return param23;
    }

    /**
     * @param param23
     */
    public void setParam23(String param23) {
        this.param23 = param23;
    }

    /**
     * @return PARAM24
     */
    public String getParam24() {
        return param24;
    }

    /**
     * @param param24
     */
    public void setParam24(String param24) {
        this.param24 = param24;
    }

    /**
     * 获取产品销售卖点-
     *
     * @return PRODUCT_SELLING - 产品销售卖点-
     */
    public String getProductSelling() {
        return productSelling;
    }

    /**
     * 设置产品销售卖点-
     *
     * @param productSelling 产品销售卖点-
     */
    public void setProductSelling(String productSelling) {
        this.productSelling = productSelling;
    }

    /**
     * 获取网络支持-
     *
     * @return NET_SUPPORT - 网络支持-
     */
    public String getNetSupport() {
        return netSupport;
    }

    /**
     * 设置网络支持-
     *
     * @param netSupport 网络支持-
     */
    public void setNetSupport(String netSupport) {
        this.netSupport = netSupport;
    }

    /**
     * 获取外壳材质-
     *
     * @return CASE_MATERIAL - 外壳材质-
     */
    public String getCaseMaterial() {
        return caseMaterial;
    }

    /**
     * 设置外壳材质-
     *
     * @param caseMaterial 外壳材质-
     */
    public void setCaseMaterial(String caseMaterial) {
        this.caseMaterial = caseMaterial;
    }

    /**
     * @return ERP_STOCK_NAME
     */
    public String getErpStockName() {
        return erpStockName;
    }

    /**
     * @param erpStockName
     */
    public void setErpStockName(String erpStockName) {
        this.erpStockName = erpStockName;
    }

    /**
     * @return PARAM25
     */
    public String getParam25() {
        return param25;
    }

    /**
     * @param param25
     */
    public void setParam25(String param25) {
        this.param25 = param25;
    }
}