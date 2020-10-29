package com.asahi.personalnote.common;

import jdk.nashorn.internal.parser.Token;

public enum Constant {
    //SESSIONID
    SESSIONID("SESSIONID","SESSIONID"),
    //过期时间
    SESSION_EXPIRE("SESSION_EXPIRE",30*60),
    //TOKEN
    TOKEN("TOKEN","TOKEN");
    private String key;
    private Object val;
    Constant(String key,Object val){
        this.key = key;
        this.val = val;
    }
    public String getKey(){
        return this.key;
    }
    public Object getVal(){
        return this.val;
    }
}
