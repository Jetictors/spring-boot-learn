package com.jetictors.example.properties.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Desc           :  User配置文件(User属性)
 * Author         :  Jetictors
 * Time           :  2019/8/8 12:05
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */

@Component
@ConfigurationProperties(prefix = "user")
public class UserProperty {

    private int userId;

    private String userName;

    private String pwd;

    private String nickName;

    private int age;

    private int sex;

    public UserProperty() { }

    public UserProperty(int userId, String userName, String pwd, String nickName, int age, int sex) {
        this.userId = userId;
        this.userName = userName;
        this.pwd = pwd;
        this.nickName = nickName;
        this.age = age;
        this.sex = sex;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
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
        return "UserProperty{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}

