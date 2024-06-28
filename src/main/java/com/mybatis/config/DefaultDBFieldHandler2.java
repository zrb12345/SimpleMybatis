package com.mybatis.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

/**
 * 通用参数填充实现类
 *
 * 如果没有显式的对通用参数进行赋值，这里会对通用参数进行填充、赋值
 *
 * @author hexiaowu
 */
@Slf4j
@Component
public class DefaultDBFieldHandler2 implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
//        try {
            log.debug("准备注入fill");
        this.strictInsertFill(metaObject,"createTime" ,Date.class, new Date());
        this.strictInsertFill(metaObject,"updateTime" ,Date.class, new Date());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
//        this.setFieldValByName("updateTime", new Long(111), metaObject);
        Timestamp time=new Timestamp(System.currentTimeMillis());
        if (metaObject.hasSetter("updateTime")) {
            this.setFieldValByName("updateTime", time, metaObject);
        }
        if (metaObject.hasSetter("updateDate")) {
            this.setFieldValByName("updateDate", time, metaObject);
        }

        this.setFieldValByName("updateTime", new Date(), metaObject);
        System.out.println("kankan1=======================");
        // 更新时间为空，则以当前时间为更新时间
        Object modifyTime = getFieldValByName("updateTime", metaObject);
        if (Objects.isNull(modifyTime)) {
            setFieldValByName("updateTime", new Date(), metaObject);
        }

        // 当前登录用户不为空，更新人为空，则当前登录用户为更新人
        Object modifier = getFieldValByName("updater", metaObject);
//        Long userName = SecurityUtils.getLoginUser().getUser().getUserId();
//        if (Objects.nonNull(userName) && Objects.isNull(modifier)) {
//            setFieldValByName("updater", userName.toString(), metaObject);
//        }
    }

}
