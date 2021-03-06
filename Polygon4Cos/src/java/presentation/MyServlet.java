/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import domain.Employee;
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
public class MyServlet extends HttpServlet {

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

                case "register":
                    newCustomer(request, response, df);
                    break;

                case "addBuilding":
                    newBuilding(request, response, df);
                    break;

                case "uploadReport":
                    uploadReport(request, response, df);
                    break;

                case "back":
                    RequestDispatcher back = request.getRequestDispatcher("index.html");
                    back.forward(request, response);
                    break;

                case "showCustomersBuilding":
                    showCustomersBuilding(request, response, df);
                    break;

                case "deleteBuilding":
                    deleteBuilding(request, response, df);
                    break;

                case "showAllBuildings":
                    showAllBuildings(request, response, df);
                    break;
            }

        }
    }

    private void newBuilding(HttpServletRequest request, HttpServletResponse response, DomainFacade df) {
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        int customerID = Integer.parseInt(request.getParameter("customerID"));
        int size = Integer.parseInt(request.getParameter("size"));

        Building building = df.createBuilding(name, address, customerID, size);

        request.setAttribute("building", building);
    }

    private void newCustomer(HttpServletRequest request, HttpServletResponse response, DomainFacade df) {
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        String address = request.getParameter("address");
        Date signupDate = Date.valueOf(request.getParameter("sign-upDate"));

        Customer customer = df.createCustomer(name, pwd, address, signupDate);

        request.setAttribute("customer", customer);
    }

    private Report newReport(HttpServletRequest request, HttpServletResponse response) {
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

        Report report = new Report(name, address, postnrCity, reportNr, signupDate, buildingYear, size, useOfBuilding, roof, outerWalls);

        request.setAttribute("report", report);
        return report;
    }

    private RoomReport newRoomReport(HttpServletRequest request, HttpServletResponse response) {
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

        RoomReport roomReport = new RoomReport(reportNr, room, damageToTheRoom, damageDoneWhen, damageDoneWhere, whatIsTheDamage, whatIsRepared, damage, walls, ceiling, floor, windowsDoors, humidityScan);

        request.setAttribute("roomReport", roomReport);
        return roomReport;
    }

    private ReportConclusion newReportConclusion(HttpServletRequest request, HttpServletResponse response) {
        int reportNr = Integer.parseInt(request.getParameter("reportNr"));
        String room = request.getParameter("room");
        String roomRecomendation = request.getParameter("roomRecomedation");
        String reportAuthor = request.getParameter("reportAuthor");
        String buildingOwner = request.getParameter("buildingOwner");
        int buildingState = Integer.parseInt(request.getParameter("buildingState"));

        ReportConclusion reportConclusion = new ReportConclusion(reportNr, room, roomRecomendation, reportAuthor, buildingOwner, buildingState);

        request.setAttribute("reportConclusion", reportConclusion);
        return reportConclusion;
    }

    private void uploadReport(HttpServletRequest request, HttpServletResponse response, DomainFacade df) {
        Report r = newReport(request, response);
        RoomReport rr = newRoomReport(request, response);
        ReportConclusion rc = newReportConclusion(request, response);

        df.createReport(r, rr, rc);

    }

    private void showCustomersBuilding(HttpServletRequest request, HttpServletResponse response, DomainFacade df) throws ServletException, IOException {
        int buildingId = 1;
        buildingId = Integer.parseInt(request.getParameter("buildingId"));
        List<Building> building = df.getBuilding();
        //can add an arraylist later
        request.setAttribute("building", building);
        RequestDispatcher rd = request.getRequestDispatcher("ShowBuilding.jsp");
        rd.forward(request, response);

    }

    private void deleteBuilding(HttpServletRequest request, HttpServletResponse response, DomainFacade df) throws ServletException, IOException {

    }

    private void showAllBuildings(HttpServletRequest request, HttpServletResponse response, DomainFacade df) throws ServletException, IOException {
        List<Building> buildingList = df.getBuilding();
        request.setAttribute("buildingList", buildingList);

        request.setAttribute("buildingList", buildingList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("ShowBuilding.jsp");
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
