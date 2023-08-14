package com.xja.domain;

public class Users {
    private Integer userId;
    private String userName;
    private String userPass;
    private String userAddress;
    private String userPhone;


    public Users() {
    }

    public Users(Integer userId, String userName, String userPass, String userAddress, String userPhone) {
        this.userId = userId;
        this.userName = userName;
        this.userPass = userPass;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
    }

    /**
     * 获取
     * @return userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return userPass
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * 设置
     * @param userPass
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    /**
     * 获取
     * @return userAddress
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * 设置
     * @param userAddress
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    /**
     * 获取
     * @return userPhone
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 设置
     * @param userPhone
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String toString() {
        return "Users{userId = " + userId + ", userName = " + userName + ", userPass = " + userPass + ", userAddress = " + userAddress + ", userPhone = " + userPhone + "}";
    }
}
