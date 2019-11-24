package com.javagda28.jsp.servlets;

import com.javagda28.jsp.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/student-remove")
public class StudentRemoveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       String studentIndexNumber = req.getParameter("indexNumber");

        StudentService.INSTANCE.removeStudent(studentIndexNumber);

        resp.sendRedirect("/students");

    }
}
