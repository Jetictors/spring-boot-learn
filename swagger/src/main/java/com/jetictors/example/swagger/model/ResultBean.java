package com.jetictors.example.swagger.model;

import java.io.Serializable;

/**
 * Desc           :  接口统一返回包装
 * Author         :  Jetictors
 * Time           :  2019/8/14 10:36
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
public class ResultBean<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final int SUCCESS = 0;
    public static final int FAIL = 1;
    public static final int NO_PERMISSION = 2;

    private String msg = "success";
    private int code = SUCCESS;
    private T data;

    public ResultBean() {
        super();
    }

    public ResultBean(T data) {
        super();
        this.data = data;
    }

    public ResultBean(Throwable e) {
        super();
        this.msg = e.toString();
        this.code = FAIL ;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

