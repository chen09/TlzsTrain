package jp.co.tlzs.train.servlet.chen09;

import java.io.IOException;
import java.io.PrintWriter;

public class FirstTestServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        {
            // Setting up the content type of web page
            response.setContentType("text/html");
            // Writing the message on the web page
            PrintWriter out = response.getWriter();
            out.println("<h1>" + "FirstTestServlet" + "</h1>");
            out.println("<p>" + "Hello FirstTestServlet!" + "</p>");
        }
    }
}
