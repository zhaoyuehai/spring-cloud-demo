package com.yuehai.demo.service;


import com.yuehai.demo.entity.UserBean;

import java.util.List;

/**
 * Created by zhaoyuehai 2018/8/31
 */
public interface UserService {
    /**
     * 增
     *
     * @param user user
     * @return ？
     */
    Long add(UserBean user);

    /**
     * 删
     *
     * @param id id
     * @return ？
     */
    Long delete(Long id);

    /**
     * 改
     *
     * @param user user
     * @return ？
     */
    Long update(UserBean user);

    /**
     * 查单条
     *
     * @param id id
     * @return id对应元素
     */
    UserBean getUser(Long id);

    /**
     * 查所有
     *
     * @return 元素列表
     */
    List<UserBean> getAll(int pageNum, int pageSize);

    /**
     * 查单条
     * @param username 用户名
     * @return 用户名对应用户
     */
    UserBean getUser(String username);
}
