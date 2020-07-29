package com.woniu.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zehui
 * @version 1.0
 * @description TODO 启动类
 * @date 2020-07-04 22:40
 */
@SpringBootApplication
@ImportResource("consumer.xml")
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class);
    }
}
