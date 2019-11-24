package com.javagda28.jsp.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
// http://localhost:8080/hello
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getParameter("imie");

        String imie = req.getParameter("imie");
                req.setAttribute("user_name", imie);
      //załaduj stronę html
        req.getRequestDispatcher("/hello.jsp").forward(req,resp);
    }
}
