package com.mybatis.mapper;

import com.mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 用户表 数据层
 * 
 * @author xiaochao
 */
@Mapper
@Component
public interface SysUserMapper
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
    public int countUserById(Long userId);



    User getUserById(long l);
}
