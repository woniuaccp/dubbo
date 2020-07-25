package com.woniu.user.service.impl;

import com.woniu.user.service.FileService;

/**
 * @author zehui
 * @version 1.0
 * @description TODO
 * @date 2020-07-05 22:29
 */
public class FileServiceImpl implements FileService {
    @Override
    public void upload(String msg) {
        System.out.println("服务被调用"+msg);
    }
}
