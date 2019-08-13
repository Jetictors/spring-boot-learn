package com.jetictors.example.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Desc           :  用户尸体类
 * Author         :  Jetictors
 * Time           :  2019/8/13 15:10
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @Column(name = "user_id", length = 32)
    private String userId;

    @Column(name = "user_name", length = 11)
    private String userName;

    @Column(name = "user_pwd", length = 16)
    private String userPwd;

    private String nickName;

    private int age;

    private int sex;

    public User() { }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}

