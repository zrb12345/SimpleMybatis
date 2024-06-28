package com.mybatis;

import com.mybatis.controller.UserController;
import com.mybatis.domain.User;
import com.mybatis.mapper.SysUserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@MapperScan("com.mybatis.mapper")
@ComponentScan("com.mybatis.mapper")
@SpringBootApplication
//
public class MybatisApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext application= SpringApplication.run(MybatisApplication.class, args);
        Environment env = application.getEnvironment();
//        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = env.getProperty("server.port");
        System.out.println("\n\t\tಥ_ಥ  SleepFish启动成功  ^o^y \n\n" +
                "      (\\\\___//)\n" +
                "      (⸝⸝^_~⸝⸝ )     swagger文档：http://localhost:"+port+"/doc.html\n" +
                "      ど     づ      swagger文档：http://192.168.10.19:"+port+ "/doc.html\n" +
                "       しーＪ\n");
        //1.返回IOC容器
        String[] names = application.getBeanDefinitionNames();
        for (String name :names ) {
            System.out.println(name );
        }


    }

}
