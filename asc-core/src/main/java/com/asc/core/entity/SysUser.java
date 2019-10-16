package com.asc.core.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户管理
 * @author changxin
 */
@Data
@TableName("sys_user")
public class SysUser {
    /**
     * 主键id
     */
    @TableId(type= IdType.AUTO)
    private Long id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 密码
     */
    private String password;
    /**
     * 加密
     */
    private String salt;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 状态 0  禁用  1  正常
     */
    private int status;
    /**
     * 部门id
     */
    private Long deptId;

}
