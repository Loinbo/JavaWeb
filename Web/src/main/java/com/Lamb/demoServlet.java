package com.Lamb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Time;
import java.util.Date;

/**
 * Created by Loinbo
 * DATE:2019/5/13
 * TIME:15:32
 */

//在浏览器显示Date
@WebServlet(name = "hello",urlPatterns = "/demoServlet")
public class demoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    /**
     * 将new Date()显示在浏览器上
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset = utf-8");
        PrintWriter pw = response.getWriter();

        pw.append("<html>")
                .append("<head><title>My First Servlet</title></head>")
                .append("<body>")
                .append("<h1>")
                .append("Data is = " + new Date())
                .append("Time is = " + new Time(0))
                .append("</h1>")
                .append("</body>")
                .append("</html>");
    }
}
