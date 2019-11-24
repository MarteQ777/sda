package com.javagda28.jsp.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/calculate.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



    String pierwszaLiczba = req.getParameter("pierwszaLiczba");
        String drugaLiczba = req.getParameter("drugaLiczba");
        String dzialanie = req.getParameter("dzialanie");

        try {
            double pierwsza = Double.parseDouble(pierwszaLiczba);
            double druga = Double.parseDouble(drugaLiczba);
            double wynik;

            switch (dzialanie) {
                case "/":
                    wynik = pierwsza / druga;
                    break;
                case "*":
                    wynik = pierwsza * druga;
                    break;
                case "+":
                    wynik = pierwsza + druga;
                    break;
                case "-":
                    wynik = pierwsza - druga;
                    break;
                default:
                    wynik = 0;

            }


        System.out.println("Wynik = " + wynik);
        req.setAttribute("wynik", wynik);


        } catch (NumberFormatException|NullPointerException nfe) {
            nfe.printStackTrace();
        }

        req.getRequestDispatcher("/calculate.jsp").forward(req,resp);
    }
}
