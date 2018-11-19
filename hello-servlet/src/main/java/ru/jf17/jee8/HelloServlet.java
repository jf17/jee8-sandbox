package ru.jf17.jee8;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        try {
			writer.println("<!DOCTYPE html>");
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<title>Java EE 8. Hello, Servlet !</title>");            
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<h2>Hello from <font color=\"#green\">HelloServlet.java</font></h2>");
			writer.println("</body>");
            writer.println("</html>");
        } finally {
            writer.close();  
        }
    }
}