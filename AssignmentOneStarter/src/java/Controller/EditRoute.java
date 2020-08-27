/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.RoutesDB;
import Passengers.Passengers;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author John
 */
@WebServlet(name = "EditRoute", urlPatterns = {"/EditRoute"})
public class EditRoute extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
        Integer q1 = Integer.parseInt(request.getParameter("q1"));
        Integer q2 = Integer.parseInt(request.getParameter("q2"));
        Integer q3 = Integer.parseInt(request.getParameter("q3"));
        Integer q4 = Integer.parseInt(request.getParameter("q4"));
        String code = request.getParameter("code");
        String city = request.getParameter("city");
        String airport = request.getParameter("airport");
        
        Passengers p = new Passengers(code, city, airport, q1, q2, q3, q4);
        RoutesDB.updateRoute(p);
        request.setAttribute("route", p);
        
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/edit.jsp");
        rd.forward(request, response);
        }catch(Exception ex) {
            System.out.println(ex);
        }
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
