package servlets.Employee;

import servlets.Employee.EmployeeLogic;
import servlets.Employee.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "employeeServlet", urlPatterns = {"/EmployeeServlet"})

public class EmployeeServlet extends HttpServlet {

    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException{
        response.setContentType("text/html");
        System.out.println("Hei");
    }
}
