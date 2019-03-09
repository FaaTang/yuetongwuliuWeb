package com.sxt.ytwl.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class User {


    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", fkRoleid=" + fkRoleid +
                ", checkintime=" + checkintime +
                ", isdelete=" + isdelete +
                ", altertime=" + altertime +
                ", role=" + role +
                '}';
    }

    private Integer userid;

    private String username;

    private Integer sex;

    private String account;

    private String password;

    private String phone;

    private String email;

    private Integer fkRoleid;

    private Date checkintime;

    private Integer isdelete;

    private Date altertime;
    private Role role;


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userID
     *
     * @return the value of user.userID
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.userID
     *
     * @param userid the value for user.userID
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userName
     *
     * @return the value of user.userName
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.userName
     *
     * @param username the value for user.userName
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sex
     *
     * @param sex the value for user.sex
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.account
     *
     * @return the value of user.account
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.account
     *
     * @param account the value for user.account
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phone
     *
     * @return the value of user.phone
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phone
     *
     * @param phone the value for user.phone
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.fk_roleID
     *
     * @return the value of user.fk_roleID
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public Integer getFkRoleid() {
        return fkRoleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.fk_roleID
     *
     * @param fkRoleid the value for user.fk_roleID
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setFkRoleid(Integer fkRoleid) {
        this.fkRoleid = fkRoleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.checkInTime
     *
     * @return the value of user.checkInTime
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    @JsonFormat(pattern = "yyyy-MM-hh")
    public Date getCheckintime() {
        return checkintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.checkInTime
     *
     * @param checkintime the value for user.checkInTime
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setCheckintime(Date checkintime) {
        this.checkintime = checkintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.isDelete
     *
     * @return the value of user.isDelete
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public Integer getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.isDelete
     *
     * @param isdelete the value for user.isDelete
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.alterTime
     *
     * @return the value of user.alterTime
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getAltertime() {
        return altertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.alterTime
     *
     * @param altertime the value for user.alterTime
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    public void setAltertime(Date altertime) {
        this.altertime = altertime;
    }

    public static class Users {
        private List<User> userss;

        @Override
        public String toString() {
            return "Users{" +
                    "users=" + userss +
                    '}';
        }

        public List<User> getUserss() {
            return userss;
        }

        public void setUserss(List<User> userss) {
            this.userss = userss;
        }
    }
}