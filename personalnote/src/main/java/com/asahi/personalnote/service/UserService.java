package com.asahi.personalnote.service;

import com.asahi.personalnote.domain.base.User;
import com.asahi.personalnote.domain.dto.QueryUserDto;
import com.asahi.personalnote.domain.dto.UserDto;
import com.asahi.personalnote.domain.vo.QueryUserVo;
import com.asahi.personalnote.domain.vo.UserInfoVo;
import com.asahi.personalnote.domain.vo.UserLoginVo;
import com.github.pagehelper.PageInfo;

import java.text.ParseException;


public interface UserService {
    PageInfo<QueryUserDto> getUserByQuery(QueryUserVo vo);
    UserDto userLogin(UserLoginVo vo);
    Boolean addUser(UserInfoVo vo) throws ParseException;
    Boolean updateUser(UserInfoVo vo);
    Boolean delUser(Integer id);
}
