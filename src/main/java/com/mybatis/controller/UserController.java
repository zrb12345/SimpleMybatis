package com.mybatis.controller;

import com.mybatis.domain.User;
import com.mybatis.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private  SysUserMapper userMapper;
    @GetMapping(value = "/get")
    public User list( @PathVariable Long id) {
        User user =  userMapper.getUserById(1L);
        return  user;
//        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
