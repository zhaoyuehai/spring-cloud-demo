package com.yuehai.demo.entity;

import lombok.Getter;

/**
 * Created by zhaoyuehai 2018/9/11
 */
@Getter
public class ResponseBean {

    //http 状态码
    private int code;

    private String message;

    private Object data;

    public ResponseBean(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
