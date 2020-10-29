package com.asahi.personalnote.controller;

import com.asahi.personalnote.common.LoginStatus;
import com.asahi.personalnote.common.ReturnUtils;
import com.asahi.personalnote.common.UserSession;
import com.asahi.personalnote.domain.base.User;
import com.asahi.personalnote.domain.base.UserExample;
import com.asahi.personalnote.domain.dto.QueryUserDto;
import com.asahi.personalnote.domain.dto.UserDto;
import com.asahi.personalnote.domain.vo.QueryUserVo;
import com.asahi.personalnote.domain.vo.UserInfoVo;
import com.asahi.personalnote.domain.vo.UserLoginVo;
import com.asahi.personalnote.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     * @param hashMap
     * @param response
     * @param request
     * @return
     */
    @GetMapping("/login")
    public ReturnUtils login(@RequestBody HashMap<String,String> hashMap, HttpServletResponse response, HttpServletRequest request){
        String query = hashMap.get("query");
        String password = hashMap.get("password");
        UserDto userDto;
        if (!"".equals(query) && !"".equals(password)){
            UserLoginVo userLoginVo = new UserLoginVo();
            userLoginVo.setQuery(query);
            UserDto userDto1 = userService.userLogin(userLoginVo);
            if (userDto1==null){
                return ReturnUtils.error("用户不存在");
            }
            userLoginVo.setPassword(password);
            userDto = userService.userLogin(userLoginVo);
            if (userDto==null){
                return ReturnUtils.error("用户名或密码不正确");
            }
            //将获取到的登录用户信息进行存储
            UserSession userSession = new UserSession();
            userSession.setId(userDto.getId());
            userSession.setUsername(userDto.getUsername());
            userSession.setMail(userDto.getMail());
            userSession.setPhone(userDto.getPhone());
            LoginStatus.setLogin(request,response,userSession);
        }else {
            return ReturnUtils.error("用户名和密码不能为空");
        }
        return  ReturnUtils.success(userDto);
    }

    /**
     * 用户退出
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/exit")
    public ReturnUtils exit(HttpServletRequest request,HttpServletResponse response){
        LoginStatus.setExit(request,response);
        return ReturnUtils.success("成功退出登录");
    }

    /**
     * 通过条件查询用户
     * @param vo
     * @return
     */
    @GetMapping
    public ReturnUtils getUesr(@RequestBody QueryUserVo vo){
        PageInfo<QueryUserDto> userByQuery = userService.getUserByQuery(vo);
        ReturnUtils data = ReturnUtils.success(userByQuery);
        return data;
    }

    /**
     * 添加用户
     * @param vo
     * @return
     */
    @PostMapping
    public ReturnUtils addUser(@RequestBody UserInfoVo vo) throws ParseException {
        //先通过username和phone和邮箱查找用户是否存在
        QueryUserVo queryUserVo = new QueryUserVo();
        queryUserVo.setQuery(vo.getUsername());
        queryUserVo.setIsdelete((byte) 0);
        PageInfo<QueryUserDto> userByQuery = userService.getUserByQuery(queryUserVo);
        if (userByQuery.getList().size()!=0){
            return ReturnUtils.error("该用户名已被注册");
        }
        Boolean result = userService.addUser(vo);
        if (result){
            return ReturnUtils.success("创建用户成功！");
        }
        return ReturnUtils.error("用户创建失败！");
    }

    /**
     * 修改用户
     * @param map
     * @return
     */
    @PutMapping
    public ReturnUtils updateUser(@RequestBody HashMap<String,Object> map) {
        UserInfoVo userInfoVo = new UserInfoVo();
        userInfoVo.setId((Integer) map.get("id"));
        userInfoVo.setUsername((String) map.get("username"));
        userInfoVo.setRealname((String) map.get("realname"));
        userInfoVo.setPassword((String) map.get("password"));
        userInfoVo.setSex((Byte) map.get("sex"));
        userInfoVo.setMail((String) map.get("mail"));
        userInfoVo.setBirth((String) map.get("birth"));
        userInfoVo.setPhone((String) map.get("phone"));
        userInfoVo.setRemark((String) map.get("remark"));
        userInfoVo.setCreatetime((Long) map.get("createtime"));
        userInfoVo.setModifytime(System.currentTimeMillis());
        userInfoVo.setPower((Integer) map.get("power"));
        Boolean result = userService.updateUser(userInfoVo);
        if (result){
            return ReturnUtils.success("用户更新成功！");
        }
        return ReturnUtils.error("用户更新失败！");
    }

    /**
     * 删除用户（isdelete修改为1）
     * @param map
     * @return
     */
    @DeleteMapping
    public ReturnUtils delUser(@RequestBody HashMap<String,Object> map){
        Boolean result = userService.delUser((Integer) map.get("id"));
        if (result){
           return ReturnUtils.success("用户删除成功");
        }
        return ReturnUtils.error("用户删除失败");
    }


    public static void main(String[] args) throws ParseException {
        QueryUserDto queryUserDto = new QueryUserDto();
        queryUserDto.setId(1);
        queryUserDto.setUsername("123");
        queryUserDto.setMail("123");
        List<QueryUserDto> queryUserDtos = new ArrayList<>();
        queryUserDtos.add(queryUserDto);
       PageInfo<QueryUserDto> pageInfo = new PageInfo<>(queryUserDtos);
        System.out.println(ReturnUtils.success(pageInfo));

    }
}
