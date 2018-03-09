package com.lizhen.controller;

import com.lizhen.server.Service;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2018/3/8.
 */
@WebServlet("/lizhen")
public class TestController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("进入方法.........");
        String id = req.getParameter("id");
        Service service = new Service();
        String user = service.getUser(id);
        req.setAttribute("user",user);
        req.getRequestDispatcher("index.jsp").forward(req,resp);

    }
}
