package com.example.huimallapi;

import org.springframework.stereotype.Controller;
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

    @RequestMapping("/test")
    public String TestMethod() {

        return "SpringBoot!";
    }

}
