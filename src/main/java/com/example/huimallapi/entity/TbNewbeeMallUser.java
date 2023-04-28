package com.example.huimallapi.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName tb_newbee_mall_user
 */
@Data
public class TbNewbeeMallUser implements Serializable {
    private static final long serialVersionUID = -8854968344930311015L;
    /**
     * 用户主键id
     */
    private Long userId;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 登陆名称(默认为手机号)
     */
    private String loginName;

    /**
     * MD5加密后的密码
     */
    private String passwordMd5;

    /**
     * 个性签名
     */
    private String introduceSign;

    /**
     * 注销标识字段(0-正常 1-已注销)
     */
    private Integer isDeleted;

    /**
     * 锁定标识字段(0-未锁定 1-已锁定)
     */
    private Integer lockedFlag;

    /**
     * 注册时间
     */
    private Date createTime;

}