package com.jetictors.example.mybatis.model;

/**
 * Desc           :  用户实体类对象
 * Author         :  Jetictors
 * Time           :  2019/8/6 14:12
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
public class User {

    private long userId;

    private String userName;

    private String pwd;

    private String nickName;

    private int age;

    private int sex;

    public User(){}

    public User(long userId, String userName, String pwd, String nickName, int age, int sex) {
        this.userId = userId;
        this.userName = userName;
        this.pwd = pwd;
        this.nickName = nickName;
        this.age = age;
        this.sex = sex;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
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

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}


