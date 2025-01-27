package com.kathy.weblog.web;

import com.kathy.weblog.common.domain.dos.UserDO;
import com.kathy.weblog.common.domain.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
@Slf4j
class WeblogWebApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testLog() {
        log.info("这是一行 Info 级别日志");
        log.warn("这是一行 Warn 级别日志");
        log.error("这是一行 Error 级别日志");

        // 占位符
        String author = "王康欣";
        log.info("这是一行带有占位符日志，作者：{}", author);
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    void insertTest() {
        // 构建数据库实体类
        UserDO userDO = UserDO.builder()
                .username("kathy")
                .password("$2a$10$TXD7U1vAetCAbSZbCnPdGuI2ClPlX8MuUx01jAXWKCPC12L3.U2aO")
                .createTime(new Date())
                .updateTime(new Date())
                .isDeleted(false)
                .build();

        userMapper.insert(userDO);
    }
    // 运行过换个test后，再运行就会报错，因为数据库中已经有一条这样的记录了
    // password 由 PasswordEncoderConfig 生成
}
