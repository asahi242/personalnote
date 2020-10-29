package com.asahi.personalnote.common;

import lombok.Data;

/**
 * 用户session
 */
@Data
public class UserSession {
    private Integer id;
    private String username;
    private String mail;
    private String phone;
}
