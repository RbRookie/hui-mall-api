package com.example.huimallapi.controller.mall.param;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @ClassName: MallUserLoginParam
 * @Author: Rookie丶zimiao
 * @Date: 2023/4/24 16:14
 * @Description:
 */
@Data
public class MallUserLoginParam {

    @ApiModelProperty("登录名")
    @NotEmpty(message = "登录名不能为空")
    private String loginName;

    @ApiModelProperty("用户密码（需要Md5加密）")
    @NotEmpty(message = "密码不能为空")
    private String passwordMd5;
}
