package com.example.ex19.DTO;

public class userDataDTO {
    private String userID;
    private String userPW;
    private String userName;
    private String userEmail;
    private int userPostNum;
    private String[] userAddress;

    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }
    public String getUserPW() {
        return userPW;
    }
    public void setUserPW(String userPW) {
        this.userPW = userPW;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public int getUserPostNum() {
        return userPostNum;
    }
    public void setUserPostNum(int userPostNum) {
        this.userPostNum = userPostNum;
    }
    public String[] getUserAddress() {
        return userAddress;
    }
    public void setUserAddress(String[] userAddress) {
        this.userAddress = userAddress;
    }
}
