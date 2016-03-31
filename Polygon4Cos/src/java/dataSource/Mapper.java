/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;


import domain.Building;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minerva
 */
public class Mapper {

    public boolean createPlayer(Building p, Connection con) {
        int rowsInserted = 0;
        String sql = "INSERT INTO player (Player_name, Player_position, Player_number, Team_id) VALUES(?,?,?,?)";
        try (PreparedStatement statement
                = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            //== insert tuple
            statement.setString(1, p.getName());
            statement.setString(2, p.getPosition());
            statement.setInt(3, p.getNumber());
            statement.setString(4, p.getTeam().getTeamName());
            rowsInserted = statement.executeUpdate();
   
        } catch (Exception e) {
            e.printStackTrace();

        }
        return rowsInserted == 1;
    }
    public boolean createGoal(Goal g, Connection con) {
        int rowsInserted = 0;
        String sql = "INSERT INTO goal (Player_id, Match_id) VALUES((SELECT Player_id FROM player WHERE Player_name = ?),?)";
        try (PreparedStatement statement
                = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            //== insert tuple
            statement.setString(1, g.getPlayer());
            statement.setInt(2, g.getMatch());

            rowsInserted = statement.executeUpdate();
   
        } catch (Exception e) {
            e.printStackTrace();

        }
        return rowsInserted == 1;
    }
    
    public boolean createMatch(Match match, Connection con) {
        int rowsInserted = 0;
        String sql = "INSERT INTO `match`(Team1_id,Team2_id) values(?,?)";
        try (PreparedStatement statement
                = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            //== insert tuple
            statement.setString(1, match.getTeam1().getTeamName());
            statement.setString(2, match.getTeam2().getTeamName());            
            rowsInserted = statement.executeUpdate();
   
        } catch (Exception e) {
            e.printStackTrace();

        }
        return rowsInserted == 1;
    }
    public List<Building> showPlayers2(Connection con) {
        return showPlayers(con);
    }
        private List<Building> showPlayers(Connection con) {
        ArrayList<Building> players = new ArrayList<Building>();
        String SQLString = "select * from player";
               
        try (PreparedStatement statement = con.prepareStatement(SQLString)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                    Team t = new Team(rs.getString("Team_id"));
                    Building p = new Building(
                    rs.getString("Player_name"),
                    rs.getString("Player_position"),
                    rs.getInt("Player_number"), t);
                    players.add(p);
                }
            
            return players;
        } catch (Exception e) {
            System.out.println("Fail1 in OrderMapper - getOrder");
            System.out.println(e.getMessage());
            return null;
        }
    }

        public int getGoalId (String player, int match, Connection con){
            String SQLString = "select Goal_id from Goal where Player_id =(select Player_id from player where Player_name = ?) and Match_id = ?";
            int goalId=0;
            try (PreparedStatement statement = con.prepareStatement(SQLString)) {
                //== insert tuple
            statement.setString(1, player);
            statement.setInt(2, match);
           
                ResultSet rs = statement.executeQuery();
                goalId = rs.getInt(goalId);
            
        } catch (SQLException ex) {
            System.out.println("Fail1 in OrderMapper - getOrder");
            System.out.println(ex.getMessage());
            
        }
            return goalId;
        }

        boolean deleteGoal(Goal g, Connection con) {
        int rowsUpdated = 0;
        String SQLString
                = "delete from goal where Goal_id = ?";
        g.setGoalId(getGoalId(g.getPlayer(),g.getMatch(),con));
        PreparedStatement statement = null;
        try {

            statement = con.prepareStatement(SQLString);
            statement.setInt(1,g.getGoalId());
            rowsUpdated = statement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Fail1 in OrderMapper - updateOrder");
            System.out.println(e.getMessage());
        } finally // must close statement
        {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Fail2 in OrderMapper - updateOrder");
                System.out.println(e.getMessage());
            }
        }
        return rowsUpdated == 1;
    }
    
    
}
