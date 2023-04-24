package com.example.huimallapi.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Author: Rookie丶zimiao
 * @Date: 2022/11/29 15:26
 * @Description:
 */
@RestController
public class TestController {

    @ApiOperation(value = "测试Swagger")
    @RequestMapping("/test")
    public String TestMethod() {

        return "SpringBoot!";
    }

}
