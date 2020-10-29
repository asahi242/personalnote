package com.asahi.personalnote.domain.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class QueryUserDto {
    /**
     * 用户ID
     */
    private Integer id;

    /**
     * 用户昵称
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 性别
     */
    private Byte sex;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 生日
     */
    private Date birth;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Long createtime;

    /**
     * 修改时间
     */
    private Long modifytime;

    /**
     * 是否删除：0不删除 1删除
     */
    private Byte isdelete;

    /**
     * 权限：0管理员 1用户
     */
    private Integer power;
}
