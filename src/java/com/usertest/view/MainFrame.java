package com.usertest.view;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MainFrame extends HttpServlet {
   
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        }
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
         PrintWriter out=response.getWriter();
         out.print("Successd");
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