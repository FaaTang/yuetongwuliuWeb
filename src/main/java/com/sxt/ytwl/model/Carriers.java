package com.sxt.ytwl.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Carriers {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column carriers.carriersID
     *
     * @mbggenerated Fri Feb 22 19:24:52 CST 2019
     */
    private Integer carriersid;

    private String sendcompany;
    private String sendaddress;

    private String sendlinkman;

    private String sendphone;

    private String receivecompany;

    private String fkReceiveaddress;

    private String receivelinkman;

    private String receivephone;

    private Date leaverdate;

    private Date receivedate;

    private Integer finishedstate;

    private Float insurancecost;

    private Float transportcost;

    private Float othercost;

    private Float totalcost;

    private String remark;

    private Integer fkUserid;

    private Date checkintime;

    private Integer isdelete;

    private Date altertime;

    private Scheduling scheduling;

    public Scheduling getScheduling() {
        return scheduling;
    }

    public void setScheduling(Scheduling scheduling) {
        this.scheduling = scheduling;
    }

    public Integer getCarriersid() {
        return carriersid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.carriersID
     *
     * @param carriersid the value for carriers.carriersID
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setCarriersid(Integer carriersid) {
        this.carriersid = carriersid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carriers.sendCompany
     *
     * @return the value of carriers.sendCompany
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public String getSendcompany() {
        return sendcompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.sendCompany
     *
     * @param sendcompany the value for carriers.sendCompany
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setSendcompany(String sendcompany) {
        this.sendcompany = sendcompany == null ? null : sendcompany.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carriers.sendAddress
     *
     * @return the value of carriers.sendAddress
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public String getSendaddress() {
        return sendaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.sendAddress
     *
     * @param sendaddress the value for carriers.sendAddress
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setSendaddress(String sendaddress) {
        this.sendaddress = sendaddress == null ? null : sendaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carriers.sendLinkMan
     *
     * @return the value of carriers.sendLinkMan
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public String getSendlinkman() {
        return sendlinkman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.sendLinkMan
     *
     * @param sendlinkman the value for carriers.sendLinkMan
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setSendlinkman(String sendlinkman) {
        this.sendlinkman = sendlinkman == null ? null : sendlinkman.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carriers.sendPhone
     *
     * @return the value of carriers.sendPhone
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public String getSendphone() {
        return sendphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.sendPhone
     *
     * @param sendphone the value for carriers.sendPhone
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setSendphone(String sendphone) {
        this.sendphone = sendphone == null ? null : sendphone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carriers.receiveCompany
     *
     * @return the value of carriers.receiveCompany
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public String getReceivecompany() {
        return receivecompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.receiveCompany
     *
     * @param receivecompany the value for carriers.receiveCompany
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setReceivecompany(String receivecompany) {
        this.receivecompany = receivecompany == null ? null : receivecompany.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carriers.fk_receiveAddress
     *
     * @return the value of carriers.fk_receiveAddress
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public String getFkReceiveaddress() {
        return fkReceiveaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.fk_receiveAddress
     *
     * @param fkReceiveaddress the value for carriers.fk_receiveAddress
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setFkReceiveaddress(String fkReceiveaddress) {
        this.fkReceiveaddress = fkReceiveaddress == null ? null : fkReceiveaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carriers.receiveLinkMan
     *
     * @return the value of carriers.receiveLinkMan
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public String getReceivelinkman() {
        return receivelinkman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.receiveLinkMan
     *
     * @param receivelinkman the value for carriers.receiveLinkMan
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setReceivelinkman(String receivelinkman) {
        this.receivelinkman = receivelinkman == null ? null : receivelinkman.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carriers.receivePhone
     *
     * @return the value of carriers.receivePhone
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public String getReceivephone() {
        return receivephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.receivePhone
     *
     * @param receivephone the value for carriers.receivePhone
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setReceivephone(String receivephone) {
        this.receivephone = receivephone == null ? null : receivephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.leaverDate
     *
     * @param leaverdate the value for carriers.leaverDate
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setLeaverdate(Date leaverdate) {
        this.leaverdate = leaverdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carriers.receiveDate
     *
     * @return the value of carriers.receiveDate
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getReceivedate() {
        return receivedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carriers.leaverDate
     *
     * @return the value of carriers.leaverDate
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getLeaverdate() {
        return leaverdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.receiveDate
     *
     * @param receivedate the value for carriers.receiveDate
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setReceivedate(Date receivedate) {
        this.receivedate = receivedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carriers.finishedState
     *
     * @return the value of carriers.finishedState
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public Integer getFinishedstate() {
        return finishedstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.finishedState
     *
     * @param finishedstate the value for carriers.finishedState
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setFinishedstate(Integer finishedstate) {
        this.finishedstate = finishedstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carriers.insuranceCost
     *
     * @return the value of carriers.insuranceCost
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public Float getInsurancecost() {
        return insurancecost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.insuranceCost
     *
     * @param insurancecost the value for carriers.insuranceCost
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setInsurancecost(Float insurancecost) {
        this.insurancecost = insurancecost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carriers.transportCost
     *
     * @return the value of carriers.transportCost
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public Float getTransportcost() {
        return transportcost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.transportCost
     *
     * @param transportcost the value for carriers.transportCost
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setTransportcost(Float transportcost) {
        this.transportcost = transportcost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carriers.otherCost
     *
     * @return the value of carriers.otherCost
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public Float getOthercost() {
        return othercost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.otherCost
     *
     * @param othercost the value for carriers.otherCost
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setOthercost(Float othercost) {
        this.othercost = othercost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carriers.totalCost
     *
     * @return the value of carriers.totalCost
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public Float getTotalcost() {
        return totalcost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.totalCost
     *
     * @param totalcost the value for carriers.totalCost
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setTotalcost(Float totalcost) {
        this.totalcost = totalcost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carriers.remark
     *
     * @return the value of carriers.remark
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.remark
     *
     * @param remark the value for carriers.remark
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carriers.fk_userID
     *
     * @return the value of carriers.fk_userID
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public Integer getFkUserid() {
        return fkUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.fk_userID
     *
     * @param fkUserid the value for carriers.fk_userID
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setFkUserid(Integer fkUserid) {
        this.fkUserid = fkUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carriers.checkInTime
     *
     * @return the value of carriers.checkInTime
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getCheckintime() {
        return checkintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.checkInTime
     *
     * @param checkintime the value for carriers.checkInTime
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setCheckintime(Date checkintime) {
        this.checkintime = checkintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carriers.isDelete
     *
     * @return the value of carriers.isDelete
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public Integer getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.isDelete
     *
     * @param isdelete the value for carriers.isDelete
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carriers.alterTime
     *
     * @return the value of carriers.alterTime
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public Date getAltertime() {
        return altertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carriers.alterTime
     *
     * @param altertime the value for carriers.alterTime
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setAltertime(Date altertime) {
        this.altertime = altertime;
    }
}