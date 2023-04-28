package com.example.huimallapi.service;

/**
 * @ClassName: HuiMalUserService
 * @Author: Rookie丶zimiao
 * @Date: 2023/4/27 16:13
 * @Description:
 */
public interface HuiMalUserService {

    /**
     * 用户注册
     * @param loginName
     * @param password
     * @return
     */
    String register(String loginName, String password);

    /**
     * 用户登录
     * @param loginName
     * @param passwordMD5
     * @return
     */
    String login(String loginName, String passwordMD5);


}
