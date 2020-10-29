package com.asahi.personalnote.common;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * 用户登录退出后的操作
 */
public class LoginStatus {
    public static void setLogin(HttpServletRequest request,HttpServletResponse response,UserSession userSession){
        RedisUtil redisUtil = new RedisUtil();
        //获取用户状态
        String oldToken = getUserStatus(request);
        Boolean exists = redisUtil.exists(Constant.SESSIONID + ":" + oldToken);

        //判断redis中用户信息是否存在
        if (!exists){
            //将用户基本信息放入session
            request.getSession().setAttribute("userSession",userSession);
            //为用户生成token
            String token = UUID.randomUUID().toString();
            //用户信息写入Redis
            //key:SESSIONID:TOKEN
            //value:userSession
            redisUtil.set(Constant.SESSIONID+":"+token, JSON.toJSONString(userSession));
            //设置过期时间
            redisUtil.expire(Constant.SESSIONID.getVal()+":"+token,(Integer) Constant.SESSION_EXPIRE.getVal());
            //写入cookie
            CookieUtils.setCookie(response,String.valueOf(Constant.TOKEN.getVal()),token);
        }else{
            //存在就更新一下Redis过期时间
            redisUtil.set(Constant.SESSIONID+":"+oldToken, JSON.toJSONString(userSession));
            redisUtil.expire(Constant.SESSIONID.getVal()+":"+oldToken,(Integer) Constant.SESSION_EXPIRE.getVal());
        }
    }
    public static  void setExit(HttpServletRequest request,HttpServletResponse response){
        request.getSession().removeAttribute("userSession");
        String token = CookieUtils.getCookieValue(request, String.valueOf(Constant.TOKEN.getVal()));
        RedisUtil redisUtil = new RedisUtil();
        redisUtil.del(Constant.SESSIONID+":"+token);
        CookieUtils.delCookie(response,String.valueOf(Constant.TOKEN.getVal()));
    }
    public static String getUserStatus(HttpServletRequest request){
        String token = CookieUtils.getCookieValue(request, String.valueOf(Constant.TOKEN));
        if (token!=null){
            return token;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Constant.SESSIONID);
        System.out.println(Constant.SESSION_EXPIRE);
    }

}
