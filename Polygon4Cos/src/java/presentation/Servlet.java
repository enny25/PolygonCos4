/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;
import domain.ReportConclusion;
import domain.RoomReport;
import domain.Report;
import domain.Customer;
import domain.DomainFacade;
import domain.Building;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
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

        String action = request.getParameter("action");
        try (PrintWriter out = response.getWriter()) {
            switch (action) {

                case "addBuilding":
                    newBuilding(request, response, df);
                    break;

                case "createCustomer":
                    newCustomer(request, response, df);
                    break;

                case "createReport":
                    newReport(request, response, df);
                    break;
                    
                    case "createRoomReport":
                    newRoomReport(request, response, df);
                    break;
                    
                    case "createReportConclusion":
                    newReportConclusion(request, response, df);
                    break;
            }

        }
    }

    private void newBuilding(HttpServletRequest request, HttpServletResponse response, DomainFacade df) {
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        int customerID = Integer.parseInt(request.getParameter("customerID"));
        double size = Double.parseDouble(request.getParameter("size"));

        Building building = df.createBuilding(name, address, customerID, size);

        request.setAttribute("building", building);
    }

    private void newCustomer(HttpServletRequest request, HttpServletResponse response, DomainFacade df) {
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        Date signupDate = Date.valueOf(request.getParameter("sign-upDate"));

        Customer customer = df.createCustomer(name, address, signupDate);

        request.setAttribute("customer", customer);
    }

    private void newReport(HttpServletRequest request, HttpServletResponse response, DomainFacade df) {
        String name = request.getParameter("buildingName");
        String address = request.getParameter("address");
        String postnrCity = request.getParameter("postnrCity");
        int reportNr = Integer.parseInt(request.getParameter("reportNr"));
        Date signupDate = Date.valueOf(request.getParameter("date"));
        int buildingYear = Integer.parseInt(request.getParameter("buildingYear"));
        double size = Double.parseDouble(request.getParameter("size"));
        String useOfBuilding = request.getParameter("useOfBuilding");
        String roof = request.getParameter("roof");
        String outerWalls = request.getParameter("outerWalls");

        Report report = df.createReport(name, address, postnrCity, reportNr, signupDate, buildingYear, size, useOfBuilding, roof, outerWalls);

        request.setAttribute("report", report);
    }
    
    private void newRoomReport(HttpServletRequest request, HttpServletResponse response, DomainFacade df){
        int reportNr = Integer.parseInt(request.getParameter("reportNr"));
        String room = request.getParameter("room");
        String damageToTheRoom = request.getParameter("damageToTheRoom");
        String damageDoneWhen = request.getParameter("damageDoneWhen");
        String damageDoneWhere = request.getParameter("damageDoneWhere");
        String whatIsTheDamage = request.getParameter("whatIsTheDamage");
        String whatIsRepared = request.getParameter("whatIsRepared");
        String damage = request.getParameter("damage");
        String walls = request.getParameter("walls");
        String ceiling = request.getParameter("ceiling");
        String floor = request.getParameter("floor");
        String windowsDoors = request.getParameter("windowsDoors");
        String humidityScan = request.getParameter("humidityScan");
        
        RoomReport roomReport = df.createRoomReport(RoomReport roomReport);

        request.setAttribute("roomReport", roomReport);
    }
    
    private void newReportConclusion(HttpServletRequest request, HttpServletResponse response, DomainFacade df){
        int reportNr = Integer.parseInt(request.getParameter("reportNr"));
        String room = request.getParameter("room");
        String roomRecomedation = request.getParameter("roomRecomedation");
        String reportAuthor = request.getParameter("reportAuthor");
        String buildingOwner = request.getParameter("buildingOwner");
        int buildingState = Integer.parseInt(request.getParameter("buildingState"));
        
        ReportConclusion reportConclusion = df.createReportConclusion(ReportConclusion reportConclusion);
        
        request.setAttribute("reportConclusion", reportConclusion);
    }

//    private void showBuildings(HttpServletRequest request, HttpServletResponse response, DomainFacade df) throws ServletException, IOException {
//        List<Building> buildings = df.showBuildings();
//        request.setAttribute("buildings", buildings);
//
//        RequestDispatcher dispatcher = request.getRequestDispatcher("ShowData.jsp");
//        dispatcher.forward(request, response);
//    }
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
