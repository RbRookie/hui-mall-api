package com.example.huimallapi.cofig;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName: Swagger2Config
 * @Author: Rookie丶zimiao
 * @Date: 2023/4/13 21:29
 * @Description:
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiinfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("ltd.newbee.mall.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiinfo() {
        return new ApiInfoBuilder()
                .title("swagger-api文档")
                .description("swagger-api文档 by wanghui")
                .version("1.0")
                .build();
    }

}
