package servlets.tickets;

import com.sun.deploy.net.HttpResponse;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletContext;

//Denne servletten er en kontroller.
@WebServlet(name = "TicketServlet", urlPatterns = {"/TicketServlet"})
public class TicketServlet extends HttpServlet {
        TicketLogic ticLog = new TicketLogic();

    /**protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String gate = request.getParameter("gate");
        int id = 1;
        try {
            request.setAttribute("gate", ticLog.showAll(id));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }*/
        protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            ServletContext sc = this.getServletContext();
            String action = request.getParameter("action");

            if (action.equalsIgnoreCase("delete")) {
                try {
                    deleteTicket(request,response);
                } catch (Exception ex) {
                    System.out.println(ex);
                }

                RequestDispatcher redirect = sc.getRequestDispatcher("profil.jsp");
                redirect.forward(request, response);
            }
        }


        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            int cus_id = Integer.parseInt(request.getParameter("cus_id"));
            ServletContext sc = this.getServletContext();
            try
            {
                HttpSession session = request.getSession();
                session.setAttribute("tickets", ticLog.showAll(cus_id));
            }
            catch (Exception e) {
                e.printStackTrace();
            }

            RequestDispatcher view = sc.getRequestDispatcher("/cusTicket.jsp");
            view.forward(request, response);
        }
    private void deleteTicket(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, SQLException {
        String tic_id = request.getParameter("tic_id");
        String cus_id = request.getParameter("cus_id");
        ServletContext sc = this.getServletContext();
        int ticID = 0;
        try {
            ticID = ticLog.getTicID(tic_id,cus_id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            ticLog.deleteTic(ticID);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        RequestDispatcher view = sc.getRequestDispatcher("/profil.jsp");
        view.forward(request, response);
    }
/**
        public void funksjon1(){
            TicketLogic.delete();
        }*/
}
