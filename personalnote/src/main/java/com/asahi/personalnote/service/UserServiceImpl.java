package com.asahi.personalnote.service;

import com.asahi.personalnote.domain.base.User;
import com.asahi.personalnote.domain.base.UserExample;
import com.asahi.personalnote.domain.dto.QueryUserDto;
import com.asahi.personalnote.domain.dto.UserDto;
import com.asahi.personalnote.domain.vo.QueryUserVo;
import com.asahi.personalnote.domain.vo.UserInfoVo;
import com.asahi.personalnote.domain.vo.UserLoginVo;
import com.asahi.personalnote.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired(required = false)
    private UserMapper userMapper;
    @Override
    public PageInfo<QueryUserDto> getUserByQuery(QueryUserVo vo) {

        PageHelper.startPage(1,10);
        List<QueryUserDto> userByQuery = userMapper.getUserByQuery(vo);
        PageInfo<QueryUserDto> pageInfo = new PageInfo<>(userByQuery);
        return pageInfo;
    }

    @Override
    public UserDto userLogin(UserLoginVo vo) {
        UserDto userDto = userMapper.userLogin(vo);
        return userDto;
    }

    @Override
    public Boolean addUser(UserInfoVo vo) {
        Boolean result = false;
        vo.setCreatetime(System.currentTimeMillis());
        vo.setModifytime(System.currentTimeMillis());
        vo.setIsdelete((byte)0);
        vo.setPower(1);
        int i = userMapper.addUser(vo);
        if (i>0){
            result = true;
        }
        return result;
    }

    @Override
    public Boolean updateUser(UserInfoVo vo) {
        Boolean result = false;
        int i = userMapper.updateUser(vo);
        if (i>0){
            result = true;
        }
        return result;
    }

    @Override
    public Boolean delUser(Integer id) {
        Boolean result = false;
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdEqualTo(id).andIsdeleteEqualTo((byte) 0);
        int i = userMapper.deleteByExample(userExample);
        if (i>0){
            result = true;
        }
        return result;
    }
}
