package com.yuehai.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.yuehai.demo.dao.UserDao;
import com.yuehai.demo.entity.User;
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

    public Long add(User user) {
        return userDao.insert(user);
    }

    public Long delete(Long id) {
        return userDao.delete(id);
    }

    public Long update(User user) {
        return userDao.update(user);
    }

    public User getUser(Long id) {
        return userDao.selectById(id);
    }

    public List<User> getAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userDao.selectAll();
    }

}
