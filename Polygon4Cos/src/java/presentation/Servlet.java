/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import domain.DomainFacade;
import domain.Goal;
import domain.Match;
import domain.Team;
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
        String action = request.getParameter("action");
        try (PrintWriter out = response.getWriter()) {
            switch (action){
            
                case "addPlayer":
                    newBuilding(request, response, df);
                    break;
                case "addGoal":
                    newGoal(request, response, df);
                    break;
                case "addMatch":
                    newMatch(request, response, df);
                    break;
                case "showPlayers":
                    showPlayers(request, response, df);
                    break;
                case "deleteGoal":
                    deleteGoal(request, response, df);
                    break;
            }
            


        }
    }
    
    private void newBuilding(HttpServletRequest request, HttpServletResponse response, DomainFacade df){
        String name = request.getParameter("name");
        String position = request.getParameter("position");
        int number = Integer.parseInt(request.getParameter("number"));
        String teamName = request.getParameter("team");

        Team team = new Team(teamName);
        Building player = df.createBuilding(name, position, number, team);
        
        request.setAttribute("player", player);
    }
    
    private void newGoal(HttpServletRequest request, HttpServletResponse response, DomainFacade df){
        String pname = request.getParameter("pname");
        int match_id = Integer.parseInt(request.getParameter("match_id"));
        Goal goal = df.createGoal(pname, match_id);
   
        request.setAttribute("goal", goal);
    }
    
    private void newMatch(HttpServletRequest request, HttpServletResponse response, DomainFacade df){
        String team1Name = request.getParameter("team1");
        String team2Name = request.getParameter("team2");

        Match match = df.createMatch(team1Name, team2Name);
   
        request.setAttribute("match", match);
    }
    
    private void showPlayers(HttpServletRequest request, HttpServletResponse response, DomainFacade df) throws ServletException, IOException 
    {
	List<Building> players = df.showBuildings();
	request.setAttribute("players", players);

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

    private void deleteGoal(HttpServletRequest request, HttpServletResponse response, DomainFacade df) throws ServletException, IOException {

        String playerName = request.getParameter("playerName");
        int match_id = Integer.parseInt(request.getParameter("match_id"));

       Goal g = df.deleteGoal(playerName, match_id);
       
        // show output        
        request.setAttribute("goal", g);
        RequestDispatcher dispatcher = request.getRequestDispatcher("DeleteGoal.jsp");
        dispatcher.forward(request, response);
    }

}
