package com.asahi.personalnote.common;

import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * cookie工具类
 * @author asahi
 * @time 2020-10-28
 */
public class CookieUtils {
    /**
     * 设置cookie(包括过期时间和路径)
     * @param response
     * @param key 键
     * @param val 值
     * @param expiry 生命周期
     * @param path 路径
     */
    public static void setCookie(HttpServletResponse response,
                          String key, String val,Integer expiry,String path){
        Cookie cookie = new Cookie(key,val);
        if (expiry!=null){
            cookie.setMaxAge(expiry);
        }
        if (path!=null){
            cookie.setPath(path);
        }
        response.addCookie(cookie);
    }

    /**
     * 设置cookie
     * @param response
     * @param key
     * @param val
     */
    public static void setCookie(HttpServletResponse response,String key,String val){
        setCookie(response,key,val,null,null);
    }

    /**
     * 设置cookie（包括过期时间）
     * @param response
     * @param key
     * @param val
     * @param expiry
     */
    public static void setCookie(HttpServletResponse response,String key,String val,Integer expiry){
        setCookie(response,key,val,expiry,null);
    }

    /**
     * 设置cookie（包括路径）
     * @param response
     * @param key
     * @param val
     * @param path
     */
    public static void setCookie(HttpServletResponse response,String key,String val,String path){
        setCookie(response,key,val,null,path);
    }

    /**
     * 获取所有cookie
     * @param request
     * @return
     */
    public static Cookie[] getCookies(HttpServletRequest request){
        return request.getCookies();
    }

    /**
     * 根据name获取cookie
     * @param request
     * @param key
     * @return
     */
    public static Cookie getCookie(HttpServletRequest request,String key){
        Cookie[] cookies = getCookies(request);
        if (cookies!=null){
            for (Cookie cookie:cookies){
                if (key.equals(cookie.getName())){
                    return cookie;
                }
            }
        }
        return null;
    }

    /**
     * 获取cookie的值
     * @param request
     * @param key
     * @return
     */
    public static String getCookieValue(HttpServletRequest request,String key){
        Cookie cookie = getCookie(request, key);
        if (cookie!=null){
            return cookie.getValue();
        }
        return null;
    }

    /**
     * 删除cookie
     * @param response
     * @param key
     */
    public static void delCookie(HttpServletResponse response,String key){
        setCookie(response,key,"",0,null);
    }

}
