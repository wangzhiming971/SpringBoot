package com.dongfang.springboot.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class HelloAppTest {
    // 日志记录器
    Logger logger = LoggerFactory.getLogger(HelloAppTest.class);

    @Test
    public void testLogger() {
        // 日志级别，由低到高
        // 日志框架 可以调整需要输出的日志级别，日志只会在此级别以后的高级别记录
        logger.trace("这是trace日志。。。。。。");
        // Spring Boot默认调整为debug级别
        logger.debug("这是debug日志");
        logger.info("这是info日志");
        logger.warn("这是warn日志");
        logger.error("这是error日志");


    }

}
