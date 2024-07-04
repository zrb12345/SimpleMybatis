package com.mvc2.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * 用户和岗位关联 sys_user_post
 * 
 * @author xiaochao
 */
@Data
//别名
@Alias("hello")
public class SysUser
{
    /** 用户ID */
    private Long id;
    private String name;
    private String pwd;
    
    /** 岗位ID */
}
