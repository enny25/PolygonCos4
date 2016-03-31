/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import domain.DomainFacade;
import domain.Building;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Minerva
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        DomainFacade df = DomainFacade.getInstance();
        String create = request.getParameter("create");
        try (PrintWriter out = response.getWriter()) {
            switch (create) {

                case "addBuilding":
                    newBuilding(request, response, df);
                    break;

            }

        }
    }

    private void newBuilding(HttpServletRequest request, HttpServletResponse response, DomainFacade df) {
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        int buildingID = Integer.parseInt(request.getParameter("buildingID"));
        double size = Double.parseDouble(request.getParameter("size"));

        Building building = df.createBuilding(name, address, buildingID, size);

        request.setAttribute("building", building);
    }

    private void showBuildings(HttpServletRequest request, HttpServletResponse response, DomainFacade df) throws ServletException, IOException {
        List<Building> buildings = df.showBuildings();
        request.setAttribute("buildings", buildings);

        RequestDispatcher dispatcher = request.getRequestDispatcher("ShowData.jsp");
        dispatcher.forward(request, response);
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