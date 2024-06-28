package com.mybatis.domain;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 用户和岗位关联 sys_user_post
 * 
 * @author xiaochao
 */
@Data
public class User
{
    /** 用户ID */
    private Long id;
    private String name;
    private String pwd;
    
    /** 岗位ID */
}
