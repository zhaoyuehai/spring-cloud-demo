package com.yuehai.demo.controller;

import com.yuehai.demo.entity.User;
import com.yuehai.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zhaoyuehai 2018/9/10
 */
@RestController
@RequestMapping("/yuehai/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 添加用户
     * @param user 新用户
     * @return 受影响的行数
     */
    @PostMapping("/add")
    public Long addUser(User user) {
        return userService.add(user);
    }

    /**
     * 根据id删除用户
     * @param id 用户id
     * @return 受影响的行数
     */
    @DeleteMapping("/delete/{id}")
    public Long deleteUser(@PathVariable("id") Long id) {
        return userService.delete(id);
    }

    /**
     * 更新用户
     * @param user 用户
     * @return 受影响的行数
     */
    @PutMapping("/update")
    public Long updateUser(User user) {
        return userService.update(user);
    }

    /**
     * 根据用户id查找单个用户
     * @param id 用户id
     * @return 单个用户
     */
    @GetMapping("/one/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userService.getUser(id);
    }

    /**
     * 查找所有用户
     * @param pageNum 第几页
     * @param pageSize 每页数量
     * @return 分页返回用户列表
     */
    @GetMapping("/all")
    public List<User> getUsers(int pageNum, int pageSize) {
        return userService.getAll(pageNum, pageSize);
    }
}
