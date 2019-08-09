package com.jetictors.example.freemarker.model;

/**
 * Desc           :  接口返回基类
 * Author         :  Jetictors
 * Time           :  2019/8/7 15:20
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
public class BaseModel<T> {

    private int code;

    private String msg;

    private boolean status;

    private T data;

    public BaseModel() { }

    public BaseModel(int code, String msg, boolean status, T data) {
        this.code = code;
        this.msg = msg;
        this.status = status;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", status=" + status +
                ", data=" + data +
                '}';
    }
}

