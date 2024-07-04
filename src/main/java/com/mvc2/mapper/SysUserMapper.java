package com.mvc2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mvc2.domain.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

/**
 * 用户表 数据层
 * 
 * @author xiaochao
 */
@Mapper
public interface SysUserMapper extends BaseMapper
{
    /**
     * 通过用户ID删除用户
     * 
     * @param userId 用户ID
     * @return 结果
     */
     int deleteUserById(Long userId);

    /**
     * 通过用户ID查询用户
     *
     * @param userId 用户ID
     * @return 结果
     */
    SysUser getUserById(long userId);
    int addUser(HashMap<String,Object> map);

    List<SysUser> selectLike(String wildName);

    List<SysUser> selectUsersPage(HashMap<String,Integer> map);
}
