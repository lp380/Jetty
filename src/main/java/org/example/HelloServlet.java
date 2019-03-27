package org.example;
 
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class HelloServlet extends HttpServlet
{

int totalNumberOfRequests = 0;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        /*
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("<h1>Hello Servlet</h1>");
        response.getWriter().println("session=" + request.getSession(true).getId());

        */

         totalNumberOfRequests++;

        response.setContentType("text/html; charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("<h1>Hello World</h1>");
        response.getWriter().println("Total of " + totalNumberOfRequests + " on this server");  
    }
}
