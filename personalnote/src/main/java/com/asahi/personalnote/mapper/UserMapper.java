package com.asahi.personalnote.mapper;

import com.asahi.personalnote.domain.base.User;
import com.asahi.personalnote.domain.base.UserExample;
import java.util.List;

import com.asahi.personalnote.domain.dto.QueryUserDto;
import com.asahi.personalnote.domain.dto.UserDto;
import com.asahi.personalnote.domain.vo.QueryUserVo;
import com.asahi.personalnote.domain.vo.UserInfoVo;
import com.asahi.personalnote.domain.vo.UserLoginVo;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<QueryUserDto> getUserByQuery(QueryUserVo vo);


    UserDto userLogin(UserLoginVo vo);
    int addUser(UserInfoVo vo);
    int updateUser(UserInfoVo vo);
    int delUser(Integer id);
}