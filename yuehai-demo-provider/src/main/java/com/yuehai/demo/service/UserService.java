package com.yuehai.demo.service;


import com.yuehai.demo.entity.User;

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
    Long add(User user);

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
    Long update(User user);

    /**
     * 查单条
     *
     * @param id id
     * @return id对应元素
     */
    User getUser(Long id);

    /**
     * 查所有
     *
     * @return 元素列表
     */
    List<User> getAll(int pageNum, int pageSize);

}
