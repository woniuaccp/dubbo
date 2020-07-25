package com.woniu.user.service.impl;

import com.woniu.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zehui
 * @version 1.0
 * @date 2020/7/4
 * @description TODO 用户服务实现
 */
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    public String sayHello() {
        LOGGER.info("方法被调用");
        return "hello";
    }
}
