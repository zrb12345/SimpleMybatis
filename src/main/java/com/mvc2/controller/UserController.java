package com.mvc2.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mvc2.domain.SysUser;
import com.mvc2.mapper.SysUserMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private SysUserMapper userMapper;
//    @Transactional
    @GetMapping(value = "/get")
    public SysUser list( Long id) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",1L);
//        SysUser user =
//                userMapper.getUserById(1L);
        SysUser user =   userMapper.getUserById(1L);

        return  user;
    }
}
