package com.usertest.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;


public class LoginController extends HttpServlet {
   
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        }
    

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setCharacterEncoding("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out=response.getWriter();
        
        String user_id=request.getParameter("user_id");
        String user_password=request.getParameter("user_password");
        
        if ("smallk".equals(user_id)&&"123".equals(user_password)) {
            //sendRedirect转向某个页面（Servlet） 原则:/项目名/ServletURL
            response.sendRedirect("/UserManager/MainFrame");
        }else{
            response.sendRedirect("/UserManager/Login");
        }
    } 

@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        this.doGet(request, response);
    }

@Override
    public String getServletInfo() {
        return null;
    }

}