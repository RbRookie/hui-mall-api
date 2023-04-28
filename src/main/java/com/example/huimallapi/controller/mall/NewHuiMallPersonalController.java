package com.example.huimallapi.controller.mall;

import com.example.huimallapi.common.Constants;
import com.example.huimallapi.controller.mall.param.MallUserLoginParam;
import com.example.huimallapi.service.HuiMalUserService;
import com.example.huimallapi.util.Result;
import com.example.huimallapi.utill.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @ClassName: NewHuiMallPersonalController
 * @Author: Rookie丶zimiao
 * @Date: 2023/4/24 16:31
 * @Description:
 */
@RestController
@Api(value = "v1", tags = "商城用户操作相关接口")
@RequestMapping("/api/v1")
public class NewHuiMallPersonalController {

    @Resource
    private HuiMalUserService huiMalUserService;

    private static final Logger logger = LoggerFactory.getLogger(NewHuiMallPersonalController.class);

    @RequestMapping("/user/login")
    @ApiOperation(value = "登录接口", notes ="返回token")
    public Result<String> login(@RequestBody @Valid MallUserLoginParam mallUserLoginParam) {

        String loginResult = huiMalUserService.login(mallUserLoginParam.getLoginName(), mallUserLoginParam.getPasswordMd5());
        logger.info("login api,loginName={},loginResult={}", mallUserLoginParam.getLoginName(), loginResult);

        if (!StringUtils.hasLength(loginResult) && loginResult.length() == Constants.TOKEN_LENGTH) {
            Result result = ResultGenerator.genSuccessResult();
            result.setData(loginResult);
            return result;
        }
        return ResultGenerator.genFailResult(loginResult);
    }


}
