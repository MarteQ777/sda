package com.javagda28.jsp.servlets;

import com.javagda28.jsp.model.Student;
import com.javagda28.jsp.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet
public class StudentEditServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //ładujemy indeks z parametru
        String indexNumber = req.getParameter("indexNumber");

        //szukamy studenta w serwisie. Ponieważ jest szansa że studenta o danym indeksie nie będzie to metoda ma zwrócić optionala
        // żeby uniknąć nula
        Optional<Student> studentOptional = StudentService.INSTANCE.getStudentWithIndex(indexNumber);

        //po wyszukaniu sprawdzamy czy udało się odnaleźć studenta
       if(studentOptional.isPresent()){
           // jeśli udało się go odnaleźć to możemy go edytować, więc przekazujemy go jako atrybut i ładujemy stronę
           req.setAttribute("student", studentOptional.get());
           req.getRequestDispatcher("/student-form.jsp").forward(req, resp);
       } else {
           //jeśli nie  udało się odnaleźć studenta to wracamy na listę studentów
           resp.sendRedirect("/students");
       }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
