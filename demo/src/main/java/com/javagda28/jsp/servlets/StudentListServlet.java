package com.javagda28.jsp.servlets;

import com.javagda28.jsp.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/students")
public class StudentListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //przekazujemy listę studentów do atrybutów ponieważ chcemy wyświetrlić ją w html
        req.setAttribute("students", StudentService.INSTANCE.getStudents());

        req.getRequestDispatcher("/student-list.jsp").forward(req, resp);
    }
}
