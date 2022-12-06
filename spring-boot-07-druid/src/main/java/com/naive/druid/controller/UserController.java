package com.naive.druid.controller;

import com.naive.druid.service.UserService;
import com.naive.druid.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@GetMapping("getUser")
public User selectOne(Integer id) {
return userService.selectByPrimaryKey(id);
}

    @GetMapping("getUsers")
    public List<User> getUsers() {
        return userService.findAll();
    }
}

