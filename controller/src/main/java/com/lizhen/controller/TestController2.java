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
    @Override
    public void init() throws ServletException {
        System.out.println("servlert 初始化!!!!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("接受请求并且处理......");
    }

    @Override
    public void destroy() {
        System.out.println("servlert销毁.......");
    }
}
