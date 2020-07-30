package com.woniu.user.service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zehui
 * @version 1.0
 * @date 2020/7/4
 * @see
 */
@EnableAutoConfiguration
@ImportResource("provider.xml")
public class ServiceApplication {
    public static void main(String[] args) {
        //SpringApplication.run(ServiceApplication.class);
        //说明不是web项目启动111
        new SpringApplicationBuilder(ServiceApplication.class).web(WebApplicationType.NONE).run();
    }
}
