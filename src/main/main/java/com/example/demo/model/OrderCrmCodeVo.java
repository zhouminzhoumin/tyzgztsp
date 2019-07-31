package com.example.demo.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "ORDER_CRM_CODE")
public class OrderCrmCodeVo {
	@Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "CRM_NAME")
    private String crmName;

    @Column(name = "LOGISTICS")
    private String logistics;

    @Column(name = "LINKMAN")
    private String linkman;

    @Column(name = "TELEPHONE")
    private String telephone;

    @Column(name = "FIELD1")
    private String field1;

    @Column(name = "FIELD2")
    private String field2;

    @Column(name = "FIELD3")
    private String field3;

    @Column(name = "FIELD4")
    private String field4;

    @Column(name = "FIELD5")
    private String field5;

    @Column(name = "ORG_ID")
    private String orgId;

    @Column(name = "PROVINCE_NAME")
    private String provinceName;

    @Column(name = "PROVINCE_CODE")
    private String provinceCode;

    @Column(name = "ORG_ADDRESS")
    private String orgAddress;

    @Column(name = "CANCEL_HOUR_DXFH")
    private String cancelHourDxfh;

    @Column(name = "CANCEL_HOUR_PTDD")
    private String cancelHourPtdd;

    @Column(name = "ORDER_ZDQS")
    private String orderZdqs;

    /**
     * 0-前支付，1-后支付
     */
    @Column(name = "PAYMENT_MODE")
    private String paymentMode;

    @Column(name = "NUMBER_THRESHOLD")
    private Long numberThreshold;

    @Column(name = "AMOUNT_THRESHOLD")
    private BigDecimal amountThreshold;

    /**
     * 分账登陆号
     */
    @Column(name = "PAYMENT_LOGIN_CODE")
    private String paymentLoginCode;

    @Column(name = "STOCK_OUT_CODE")
    private String stockOutCode;

    @Column(name = "CREDITS_AMOUNT")
    private BigDecimal creditsAmount;

    @Column(name = "IS_SPECIFICATION")
    private String isSpecification;

    @Column(name = "IS_RECORD")
    private String isRecord;

    @Column(name = "IS_EVALUATE")
    private String isEvaluate;

    @Column(name = "IS_ADDRESS_AUDIT")
    private String isAddressAudit;

    /**
     * 订单信息接口(FTP)是否开启 0-关闭，1-开启
     */
    @Column(name = "ORDER_FTP")
    private String orderFtp;

    /**
     * 订单信息接口(FTP)接口编码
     */
    @Column(name = "ORDER_FTP_BUSCODE")
    private String orderFtpBuscode;

    /**
     * 信息接口(FTP)是否开启 0-关闭，1-开启
     */
    @Column(name = "CHANNEL_FTP")
    private String channelFtp;

    /**
     * 会员信息接口(FTP)接口编码
     */
    @Column(name = "CHANNEL_FTP_BUSCODE")
    private String channelFtpBuscode;

    /**
     * 是否启用出库接口
     */
    @Column(name = "ORDER_STRCODE_FTP")
    private String orderStrcodeFtp;

    /**
     * 出库信息接口业务编码
     */
    @Column(name = "ORDER_STRCODE_BUSCODE")
    private String orderStrcodeBuscode;

    /**
     * 落地方省分编码
     */
    @Column(name = "ORDER_STRCODE_CODE")
    private String orderStrcodeCode;

    @Column(name = "ORDER_FTP_DST_SYS_ID")
    private String orderFtpDstSysId;

    /**
     * 会员信息接口(FTP)落地方编码
     */
    @Column(name = "CHANNEL_FTP_CODE")
    private String channelFtpCode;

    /**
     * 猜你喜欢 001-同品牌，002-价格相近，003-同供货商
     */
    @Column(name = "GUESS_YOU_LIKE")
    private String guessYouLike;

    @Column(name = "IS_JS_SH_CRM")
    private String isJsShCrm;

    @Column(name = "IS_ENTERPRISE_WHITE")
    private String isEnterpriseWhite;

    /**
     * 多地址订单待分货取消时间
     */
    @Column(name = "CANCEL_HOUR_WAITDIST")
    private String cancelHourWaitdist;

    /**
     * 价保返利失效比例，值为0-100，设置为0不失效，100为全部失效
     */
    @Column(name = "REBATES_EXPIRE_PERCENT")
    private String rebatesExpirePercent;

    /**
     * 价保返利失效延长日期，单位：天
     */
    @Column(name = "REBATES_EXPIRE_EXTEND_DEADLINE")
    private Integer rebatesExpireExtendDeadline;

    @Column(name = "REBATES_PROVINCE_CONTROL")
    private String rebatesProvinceControl;

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
     * @return CRM_NAME
     */
    public String getCrmName() {
        return crmName;
    }

    /**
     * @param crmName
     */
    public void setCrmName(String crmName) {
        this.crmName = crmName;
    }

    /**
     * @return LOGISTICS
     */
    public String getLogistics() {
        return logistics;
    }

    /**
     * @param logistics
     */
    public void setLogistics(String logistics) {
        this.logistics = logistics;
    }

    /**
     * @return LINKMAN
     */
    public String getLinkman() {
        return linkman;
    }

    /**
     * @param linkman
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    /**
     * @return TELEPHONE
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return FIELD1
     */
    public String getField1() {
        return field1;
    }

    /**
     * @param field1
     */
    public void setField1(String field1) {
        this.field1 = field1;
    }

    /**
     * @return FIELD2
     */
    public String getField2() {
        return field2;
    }

    /**
     * @param field2
     */
    public void setField2(String field2) {
        this.field2 = field2;
    }

    /**
     * @return FIELD3
     */
    public String getField3() {
        return field3;
    }

    /**
     * @param field3
     */
    public void setField3(String field3) {
        this.field3 = field3;
    }

    /**
     * @return FIELD4
     */
    public String getField4() {
        return field4;
    }

    /**
     * @param field4
     */
    public void setField4(String field4) {
        this.field4 = field4;
    }

    /**
     * @return FIELD5
     */
    public String getField5() {
        return field5;
    }

    /**
     * @param field5
     */
    public void setField5(String field5) {
        this.field5 = field5;
    }

    /**
     * @return ORG_ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * @param orgId
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
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
     * @return ORG_ADDRESS
     */
    public String getOrgAddress() {
        return orgAddress;
    }

    /**
     * @param orgAddress
     */
    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }

    /**
     * @return CANCEL_HOUR_DXFH
     */
    public String getCancelHourDxfh() {
        return cancelHourDxfh;
    }

    /**
     * @param cancelHourDxfh
     */
    public void setCancelHourDxfh(String cancelHourDxfh) {
        this.cancelHourDxfh = cancelHourDxfh;
    }

    /**
     * @return CANCEL_HOUR_PTDD
     */
    public String getCancelHourPtdd() {
        return cancelHourPtdd;
    }

    /**
     * @param cancelHourPtdd
     */
    public void setCancelHourPtdd(String cancelHourPtdd) {
        this.cancelHourPtdd = cancelHourPtdd;
    }

    /**
     * @return ORDER_ZDQS
     */
    public String getOrderZdqs() {
        return orderZdqs;
    }

    /**
     * @param orderZdqs
     */
    public void setOrderZdqs(String orderZdqs) {
        this.orderZdqs = orderZdqs;
    }

    /**
     * 获取0-前支付，1-后支付
     *
     * @return PAYMENT_MODE - 0-前支付，1-后支付
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /**
     * 设置0-前支付，1-后支付
     *
     * @param paymentMode 0-前支付，1-后支付
     */
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    /**
     * @return NUMBER_THRESHOLD
     */
    public Long getNumberThreshold() {
        return numberThreshold;
    }

    /**
     * @param numberThreshold
     */
    public void setNumberThreshold(Long numberThreshold) {
        this.numberThreshold = numberThreshold;
    }

    /**
     * @return AMOUNT_THRESHOLD
     */
    public BigDecimal getAmountThreshold() {
        return amountThreshold;
    }

    /**
     * @param amountThreshold
     */
    public void setAmountThreshold(BigDecimal amountThreshold) {
        this.amountThreshold = amountThreshold;
    }

    /**
     * 获取分账登陆号
     *
     * @return PAYMENT_LOGIN_CODE - 分账登陆号
     */
    public String getPaymentLoginCode() {
        return paymentLoginCode;
    }

    /**
     * 设置分账登陆号
     *
     * @param paymentLoginCode 分账登陆号
     */
    public void setPaymentLoginCode(String paymentLoginCode) {
        this.paymentLoginCode = paymentLoginCode;
    }

    /**
     * @return STOCK_OUT_CODE
     */
    public String getStockOutCode() {
        return stockOutCode;
    }

    /**
     * @param stockOutCode
     */
    public void setStockOutCode(String stockOutCode) {
        this.stockOutCode = stockOutCode;
    }

    /**
     * @return CREDITS_AMOUNT
     */
    public BigDecimal getCreditsAmount() {
        return creditsAmount;
    }

    /**
     * @param creditsAmount
     */
    public void setCreditsAmount(BigDecimal creditsAmount) {
        this.creditsAmount = creditsAmount;
    }

    /**
     * @return IS_SPECIFICATION
     */
    public String getIsSpecification() {
        return isSpecification;
    }

    /**
     * @param isSpecification
     */
    public void setIsSpecification(String isSpecification) {
        this.isSpecification = isSpecification;
    }

    /**
     * @return IS_RECORD
     */
    public String getIsRecord() {
        return isRecord;
    }

    /**
     * @param isRecord
     */
    public void setIsRecord(String isRecord) {
        this.isRecord = isRecord;
    }

    /**
     * @return IS_EVALUATE
     */
    public String getIsEvaluate() {
        return isEvaluate;
    }

    /**
     * @param isEvaluate
     */
    public void setIsEvaluate(String isEvaluate) {
        this.isEvaluate = isEvaluate;
    }

    /**
     * @return IS_ADDRESS_AUDIT
     */
    public String getIsAddressAudit() {
        return isAddressAudit;
    }

    /**
     * @param isAddressAudit
     */
    public void setIsAddressAudit(String isAddressAudit) {
        this.isAddressAudit = isAddressAudit;
    }

    /**
     * 获取订单信息接口(FTP)是否开启 0-关闭，1-开启
     *
     * @return ORDER_FTP - 订单信息接口(FTP)是否开启 0-关闭，1-开启
     */
    public String getOrderFtp() {
        return orderFtp;
    }

    /**
     * 设置订单信息接口(FTP)是否开启 0-关闭，1-开启
     *
     * @param orderFtp 订单信息接口(FTP)是否开启 0-关闭，1-开启
     */
    public void setOrderFtp(String orderFtp) {
        this.orderFtp = orderFtp;
    }

    /**
     * 获取订单信息接口(FTP)接口编码
     *
     * @return ORDER_FTP_BUSCODE - 订单信息接口(FTP)接口编码
     */
    public String getOrderFtpBuscode() {
        return orderFtpBuscode;
    }

    /**
     * 设置订单信息接口(FTP)接口编码
     *
     * @param orderFtpBuscode 订单信息接口(FTP)接口编码
     */
    public void setOrderFtpBuscode(String orderFtpBuscode) {
        this.orderFtpBuscode = orderFtpBuscode;
    }

    /**
     * 获取信息接口(FTP)是否开启 0-关闭，1-开启
     *
     * @return CHANNEL_FTP - 信息接口(FTP)是否开启 0-关闭，1-开启
     */
    public String getChannelFtp() {
        return channelFtp;
    }

    /**
     * 设置信息接口(FTP)是否开启 0-关闭，1-开启
     *
     * @param channelFtp 信息接口(FTP)是否开启 0-关闭，1-开启
     */
    public void setChannelFtp(String channelFtp) {
        this.channelFtp = channelFtp;
    }

    /**
     * 获取会员信息接口(FTP)接口编码
     *
     * @return CHANNEL_FTP_BUSCODE - 会员信息接口(FTP)接口编码
     */
    public String getChannelFtpBuscode() {
        return channelFtpBuscode;
    }

    /**
     * 设置会员信息接口(FTP)接口编码
     *
     * @param channelFtpBuscode 会员信息接口(FTP)接口编码
     */
    public void setChannelFtpBuscode(String channelFtpBuscode) {
        this.channelFtpBuscode = channelFtpBuscode;
    }

    /**
     * 获取是否启用出库接口
     *
     * @return ORDER_STRCODE_FTP - 是否启用出库接口
     */
    public String getOrderStrcodeFtp() {
        return orderStrcodeFtp;
    }

    /**
     * 设置是否启用出库接口
     *
     * @param orderStrcodeFtp 是否启用出库接口
     */
    public void setOrderStrcodeFtp(String orderStrcodeFtp) {
        this.orderStrcodeFtp = orderStrcodeFtp;
    }

    /**
     * 获取出库信息接口业务编码
     *
     * @return ORDER_STRCODE_BUSCODE - 出库信息接口业务编码
     */
    public String getOrderStrcodeBuscode() {
        return orderStrcodeBuscode;
    }

    /**
     * 设置出库信息接口业务编码
     *
     * @param orderStrcodeBuscode 出库信息接口业务编码
     */
    public void setOrderStrcodeBuscode(String orderStrcodeBuscode) {
        this.orderStrcodeBuscode = orderStrcodeBuscode;
    }

    /**
     * 获取落地方省分编码
     *
     * @return ORDER_STRCODE_CODE - 落地方省分编码
     */
    public String getOrderStrcodeCode() {
        return orderStrcodeCode;
    }

    /**
     * 设置落地方省分编码
     *
     * @param orderStrcodeCode 落地方省分编码
     */
    public void setOrderStrcodeCode(String orderStrcodeCode) {
        this.orderStrcodeCode = orderStrcodeCode;
    }

    /**
     * @return ORDER_FTP_DST_SYS_ID
     */
    public String getOrderFtpDstSysId() {
        return orderFtpDstSysId;
    }

    /**
     * @param orderFtpDstSysId
     */
    public void setOrderFtpDstSysId(String orderFtpDstSysId) {
        this.orderFtpDstSysId = orderFtpDstSysId;
    }

    /**
     * 获取会员信息接口(FTP)落地方编码
     *
     * @return CHANNEL_FTP_CODE - 会员信息接口(FTP)落地方编码
     */
    public String getChannelFtpCode() {
        return channelFtpCode;
    }

    /**
     * 设置会员信息接口(FTP)落地方编码
     *
     * @param channelFtpCode 会员信息接口(FTP)落地方编码
     */
    public void setChannelFtpCode(String channelFtpCode) {
        this.channelFtpCode = channelFtpCode;
    }

    /**
     * 获取猜你喜欢 001-同品牌，002-价格相近，003-同供货商
     *
     * @return GUESS_YOU_LIKE - 猜你喜欢 001-同品牌，002-价格相近，003-同供货商
     */
    public String getGuessYouLike() {
        return guessYouLike;
    }

    /**
     * 设置猜你喜欢 001-同品牌，002-价格相近，003-同供货商
     *
     * @param guessYouLike 猜你喜欢 001-同品牌，002-价格相近，003-同供货商
     */
    public void setGuessYouLike(String guessYouLike) {
        this.guessYouLike = guessYouLike;
    }

    /**
     * @return IS_JS_SH_CRM
     */
    public String getIsJsShCrm() {
        return isJsShCrm;
    }

    /**
     * @param isJsShCrm
     */
    public void setIsJsShCrm(String isJsShCrm) {
        this.isJsShCrm = isJsShCrm;
    }

    /**
     * @return IS_ENTERPRISE_WHITE
     */
    public String getIsEnterpriseWhite() {
        return isEnterpriseWhite;
    }

    /**
     * @param isEnterpriseWhite
     */
    public void setIsEnterpriseWhite(String isEnterpriseWhite) {
        this.isEnterpriseWhite = isEnterpriseWhite;
    }

    /**
     * 获取多地址订单待分货取消时间
     *
     * @return CANCEL_HOUR_WAITDIST - 多地址订单待分货取消时间
     */
    public String getCancelHourWaitdist() {
        return cancelHourWaitdist;
    }

    /**
     * 设置多地址订单待分货取消时间
     *
     * @param cancelHourWaitdist 多地址订单待分货取消时间
     */
    public void setCancelHourWaitdist(String cancelHourWaitdist) {
        this.cancelHourWaitdist = cancelHourWaitdist;
    }

    /**
     * 获取价保返利失效比例，值为0-100，设置为0不失效，100为全部失效
     *
     * @return REBATES_EXPIRE_PERCENT - 价保返利失效比例，值为0-100，设置为0不失效，100为全部失效
     */
    public String getRebatesExpirePercent() {
        return rebatesExpirePercent;
    }

    /**
     * 设置价保返利失效比例，值为0-100，设置为0不失效，100为全部失效
     *
     * @param rebatesExpirePercent 价保返利失效比例，值为0-100，设置为0不失效，100为全部失效
     */
    public void setRebatesExpirePercent(String rebatesExpirePercent) {
        this.rebatesExpirePercent = rebatesExpirePercent;
    }

    /**
     * 获取价保返利失效延长日期，单位：天
     *
     * @return REBATES_EXPIRE_EXTEND_DEADLINE - 价保返利失效延长日期，单位：天
     */
    public Integer getRebatesExpireExtendDeadline() {
        return rebatesExpireExtendDeadline;
    }

    /**
     * 设置价保返利失效延长日期，单位：天
     *
     * @param rebatesExpireExtendDeadline 价保返利失效延长日期，单位：天
     */
    public void setRebatesExpireExtendDeadline(Integer rebatesExpireExtendDeadline) {
        this.rebatesExpireExtendDeadline = rebatesExpireExtendDeadline;
    }

    /**
     * @return REBATES_PROVINCE_CONTROL
     */
    public String getRebatesProvinceControl() {
        return rebatesProvinceControl;
    }

    /**
     * @param rebatesProvinceControl
     */
    public void setRebatesProvinceControl(String rebatesProvinceControl) {
        this.rebatesProvinceControl = rebatesProvinceControl;
    }
}