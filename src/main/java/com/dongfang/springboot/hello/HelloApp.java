package com.dongfang.springboot.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 *              标注在某个类上，说明这个类是Spring Boot的主配置类，
 *              Spring Boot就应该运行这个类的main方法来启动Spring Boot应用
 *
 *              @SpringBootConfiguration:
 *                  SpringBoot的配置类，标注在某个类上，表示这是一个SpringBoot的配置类
 *              @Configuration: 配置类上来标注这个注解：
 *                  配置类：---配置文件，配置类也是容器中的一个组件
 *              @EnableAutoConfiguration 开启自动配置功能
 *                      以前我们需要配置的东西，Spring Boot帮我们自动配置，这个注解告诉Spring Boot开启自动配置功能，
 *                      这样自动配置才能生效
 *
 */
@SpringBootApplication
public class HelloApp {
    public static void main(String[] args) {
        // Spring应用启动起来
        SpringApplication.run(HelloApp.class, args);
    }
}
