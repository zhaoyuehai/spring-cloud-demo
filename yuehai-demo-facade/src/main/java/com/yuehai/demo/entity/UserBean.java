package com.yuehai.demo.entity;

import lombok.Data;

/**
 * Created by zhaoyuehai 2018/8/31
 */
@Data
public class UserBean {

    private Long id;

    private String userName;

    private String password;

    private String email;

    private String nickName;

    private String phone;

    private String role;

    private String permission;
}
