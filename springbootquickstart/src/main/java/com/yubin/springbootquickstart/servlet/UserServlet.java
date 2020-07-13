package com.yubin.springbootquickstart.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: springproject
 * @description:
 * @author: jyb
 * @create: 2019-11-25 18:02
 **/
@WebServlet(name ="UserServlet",urlPatterns = "/user/v1/userServlet")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        resp.getWriter().print(name+" ,this is springboot2 servlet test");
        resp.getWriter().flush();
        resp.getWriter().close();
    }
}
