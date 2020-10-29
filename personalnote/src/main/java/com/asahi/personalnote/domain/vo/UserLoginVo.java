package com.asahi.personalnote.domain.vo;

import lombok.Data;

@Data
public class UserLoginVo {
    /**
     * 查询条件
     */
    private String query;
    /**
     * 密码
     */
    private String password;
}
