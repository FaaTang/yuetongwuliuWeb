package com.sxt.ytwl.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Truck {
    private Integer truckid;

    private String number;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date buydate;

    private String type;

    private String length;

    private Integer tonnage;

    private Integer fkTeamid;

    private Integer state;

    private String remark;

    private Truckteam truckteam;

    private Date checkintime;

    private Integer isdelete;

    private Date altertime;

    public Truckteam getTruckteam() {
        return truckteam;
    }

    public void setTruckteam(Truckteam truckteam) {
        this.truckteam = truckteam;
    }

    public Integer getTruckid() {
        return truckid;
    }

    public void setTruckid(Integer truckid) {
        this.truckid = truckid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getBuydate() {
        return buydate;
    }

    public void setBuydate(Date buydate) {
        this.buydate = buydate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getLength() {
        return length;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck.length
     *
     * @param length the value for truck.length
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setLength(String length) {
        this.length = length == null ? null : length.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck.tonnage
     *
     * @return the value of truck.tonnage
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public Integer getTonnage() {
        return tonnage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck.tonnage
     *
     * @param tonnage the value for truck.tonnage
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setTonnage(Integer tonnage) {
        this.tonnage = tonnage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck.fk_teamID
     *
     * @return the value of truck.fk_teamID
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public Integer getFkTeamid() {
        return fkTeamid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck.fk_teamID
     *
     * @param fkTeamid the value for truck.fk_teamID
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setFkTeamid(Integer fkTeamid) {
        this.fkTeamid = fkTeamid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck.state
     *
     * @return the value of truck.state
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck.state
     *
     * @param state the value for truck.state
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck.remark
     *
     * @return the value of truck.remark
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck.remark
     *
     * @param remark the value for truck.remark
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck.checkInTime
     *
     * @return the value of truck.checkInTime
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getCheckintime() {
        return checkintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck.checkInTime
     *
     * @param checkintime the value for truck.checkInTime
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setCheckintime(Date checkintime) {
        this.checkintime = checkintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck.isDelete
     *
     * @return the value of truck.isDelete
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public Integer getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck.isDelete
     *
     * @param isdelete the value for truck.isDelete
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column truck.alterTime
     *
     * @return the value of truck.alterTime
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getAltertime() {
        return altertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column truck.alterTime
     *
     * @param altertime the value for truck.alterTime
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setAltertime(Date altertime) {
        this.altertime = altertime;
    }
}