package com.woniu.user.controller;

import com.woniu.user.service.FileService;
import com.woniu.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author zehui
 * @version 1.0
 * @description TODO 用户Controller
 * @date 2020-07-04 21:59
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private FileService fileService;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return userService.sayHello();
    }

    @RequestMapping("/upload")
    public void upload(@RequestParam(value = "msg") String msg){
        fileService.upload(msg);
    }
}
