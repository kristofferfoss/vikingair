package servlets.logio;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

//Denne servletten er en kontroller.
@WebServlet(name = "LogoutServlet", urlPatterns ={"/LogoutServlet"})
public class LogoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();

        request.getRequestDispatcher("index.html").include(request, response);

        HttpSession session = request.getSession();
        session.invalidate();

        out.print("You are logged out!");

        out.close();
    }
}
