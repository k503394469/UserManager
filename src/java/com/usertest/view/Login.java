package com.usertest.view;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {
   
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        }
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setCharacterEncoding("text/html;");
        response.setCharacterEncoding("utf-8");
        PrintWriter out=response.getWriter();
        out.println("<h1>UserLogin</h1>");
        //action原则：/项目名称/Servlet名称
        out.println("<form action='/UserManager/LoginController' method='post'>");
        out.println("Account   :<input type='text' name='user_id' /><br />");
        out.println("PassWord:<input type='password' name='user_password'><br/>");
        out.println("<input type='submit' value='Login'>");
        out.println("</form>");
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