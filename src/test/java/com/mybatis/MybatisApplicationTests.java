package com.mybatis;

import com.mybatis.domain.User;
import com.mybatis.mapper.SysUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisApplicationTests {
    @Autowired
    private SysUserMapper mapper;
    @Test
    void contextLoads() {
        User user = mapper.getUserById(1L);
        System.out.println(user);
    }
    @Test
    void deleteUsr()
    {

        int res = mapper.deleteUserById(1L);
        System.out.println(res);
    }

}
