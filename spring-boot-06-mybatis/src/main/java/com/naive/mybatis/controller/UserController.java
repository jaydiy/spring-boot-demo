package com.naive.mybatis.controller;

import com.naive.mybatis.model.User;
import com.naive.mybatis.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (user)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        return userService.selectByPrimaryKey(id);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getAll();
    }

    @PostMapping("/")
    public String addUser(@RequestBody User user) {
        userService.insertSelective(user);
        return "add user[" + user.getName() + "] success";
    }



}
