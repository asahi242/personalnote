package com.asahi.personalnote.common;

import com.github.pagehelper.PageInfo;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
@Data
public class ReturnUtils {
    private static final Integer SUCCESS_CODE = 1;
    private static final Integer ERROR_CODE = 0;
    private Integer code;
    private String message;
    private Object data;
    private String timestamp;

    public ReturnUtils() {
    }

    public static ReturnUtils success(){
        ReturnUtils returnUtils = new ReturnUtils();
        returnUtils.setCode(SUCCESS_CODE);
        returnUtils.setMessage("success");
        returnUtils.setTimestamp(String.valueOf(System.currentTimeMillis()));
        return returnUtils;
    }
    public static ReturnUtils error(){
        ReturnUtils returnUtils = new ReturnUtils();
        returnUtils.setCode(ERROR_CODE);
        returnUtils.setMessage("error");
        returnUtils.setTimestamp(String.valueOf(System.currentTimeMillis()));
        return returnUtils;
    }

    public static ReturnUtils success(String message){
        ReturnUtils returnUtils = new ReturnUtils();
        returnUtils.setCode(SUCCESS_CODE);
        returnUtils.setMessage(message);
        returnUtils.setTimestamp(String.valueOf(System.currentTimeMillis()));
        return returnUtils;
    }
    public static ReturnUtils error(String message){
        ReturnUtils returnUtils = new ReturnUtils();
        returnUtils.setCode(ERROR_CODE);
        returnUtils.setMessage(message);
        returnUtils.setTimestamp(String.valueOf(System.currentTimeMillis()));
        return returnUtils;
    }

    public static ReturnUtils success(Object data){
        ReturnUtils returnUtils = new ReturnUtils();
        returnUtils.setCode(SUCCESS_CODE);
        returnUtils.setMessage("success");
        returnUtils.setData(data);
        returnUtils.setTimestamp(String.valueOf(System.currentTimeMillis()));
        return returnUtils;
    }
    public static  ReturnUtils success(PageInfo pageInfo){
        HashMap<String,Object> hashMap = new HashMap<>();
        Map pageMessage = new HashMap();
        pageMessage.put("pageNum",pageInfo.getPageNum());
        pageMessage.put("pageSize",pageInfo.getPageSize());
        pageMessage.put("total",pageInfo.getTotal());
        hashMap.put("pageInfo",pageMessage);
        hashMap.put("list",pageInfo.getList());
        return ReturnUtils.success(hashMap);

    }
}
