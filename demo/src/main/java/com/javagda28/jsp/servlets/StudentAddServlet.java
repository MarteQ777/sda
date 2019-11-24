package com.javagda28.jsp.servlets;

import com.javagda28.jsp.model.Student;
import com.javagda28.jsp.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/student-add")
public class StudentAddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //ładujemy stronę z formularzem
    req.getRequestDispatcher("/student-form.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = loadStudentFromParameters(req);

        StudentService.INSTANCE.addStudent(student);

        resp.sendRedirect("/students");
    }
    private Student loadStudentFromParameters(HttpServletRequest req){
        Student student = new Student.StudentBuilder()
                .setFirstName(req.getParameter("name"))
                .setLastName(req.getParameter("surname"))
                .setIndexNumber(req.getParameter("index"))
                .setAge(Integer.parseInt(req.getParameter("age")))
                .setSuspended(req.getParameter("suspended")!=null ? req.getParameter("suspended").equals("on") : false)
                .createStudent();

        return student;
    }
}
