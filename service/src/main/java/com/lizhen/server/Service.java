package com.lizhen.server;

/**
 * Created by lizhen on 2018/3/8.
 */
public class Service {
    public String getUser(String id){
        if ("1".equals(id)){
            return  "I am Lizhen";
        }else {
            return "no peoperl";
        }

    }
}
