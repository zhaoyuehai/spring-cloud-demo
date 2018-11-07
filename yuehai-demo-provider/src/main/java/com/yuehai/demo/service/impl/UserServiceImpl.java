package com.yuehai.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.yuehai.demo.dao.UserDao;
import com.yuehai.demo.entity.UserBean;
import com.yuehai.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaoyuehai 2018/8/31
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public Long add(UserBean user) {
        return userDao.insert(user);
    }

    public Long delete(Long id) {
        return userDao.delete(id);
    }

    public Long update(UserBean user) {
        return userDao.update(user);
    }

    public UserBean getUser(Long id) {
        return userDao.selectById(id);
    }

    public List<UserBean> getAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userDao.selectAll();
    }

    public UserBean getUser(String username) {
        return null;
    }

}
