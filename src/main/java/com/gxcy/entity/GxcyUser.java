package com.gxcy.entity;

import java.sql.Timestamp;

/**
 * 用户信息实体类
 */
public class GxcyUser {

    private String id;

    //用户openid
    private String openId;

    //昵称
    private String nickName;

    //手机号
    private String phoneNum;

    //创建时间
    private Timestamp ctm;

    //状态
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Timestamp getCtm() {
        return ctm;
    }

    public void setCtm(Timestamp ctm) {
        this.ctm = ctm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "GxcyUser{" +
                "id='" + id + '\'' +
                ", openId='" + openId + '\'' +
                ", nickName='" + nickName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", ctm=" + ctm +
                ", status='" + status + '\'' +
                '}';
    }
}
