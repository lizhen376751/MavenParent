package com.lizhen.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2018/3/9.
 */
public class TestController2 extends HttpServlet {
    private volatile int i= 1;
    public TestController2(){
        System.out.println("无参构造函数");
    }
    @Override
    public void init() throws ServletException {
        System.out.println("servlert 初始化!!!!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("接受请求并且处理......");
        synchronized (TestController2.class){
            resp.getWriter().write("这是第几次"+i+"次请求");
            i++;
        }



    }

    @Override
    public void destroy() {
        System.out.println("servlert销毁.......");
    }
}
