/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.boo
 */
package dataSource;

import domain.Building;
import domain.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @authorDiana
 */
public class Mapper {

    public boolean createBuilding(Building b, Connection con) {
        int rowsInserted = 0;
        String sql = "insert into building (buildingName, customerId, address, size) values (?,?,?,?)";
        try (PreparedStatement statement
                = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            //== insert tuple
            statement.setString(1, b.getName());
            statement.setInt(2, b.getCustomerID());
            statement.setString(3, b.getAddress());
            statement.setDouble(4, b.getSize());
            rowsInserted = statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Exception = " + e);

        }
        return rowsInserted == 1;
    }

    public boolean createCustomer(Customer c, Connection con) {
        int rowsInserted = 0;
        String sql = "insert into customer (name, pwd, address, signupDate) values (?,?,?,?)";
        try (PreparedStatement statement
                = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            //== insert tuple
            statement.setString(1, c.getName());
            statement.setString(2, c.getPwd());
            statement.setString(3, c.getAddress());
            statement.setDate(4, c.getSignupDate());
            rowsInserted = statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Exception = " + e);

        }
        return rowsInserted == 1;
    }

//    List<Building> showBuilding(Connection con) {
//        return showBuilding(con);
//    }
//    List<Building> showBuilding(Connection con) {
//        ArrayList<Building> building = new ArrayList<Building>();
//        String SQLString = "select * from building";
//
//        try (PreparedStatement statement = con.prepareStatement(SQLString)) {
//            ResultSet rs = statement.executeQuery();
//            while (rs.next()) {
//                Customer customer = new Customer(rs.getInt("Customer_id"));
//                Building building = new Building();
//                rs.getString("Building_name");
//                rs.getString("Building_address");
//                rs.getInt("Building_buildingID"), customer;
//                building.add(building);
//            }
//
//            return building;
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            return null;
//        }
//    }
    /*

        public int getBuildingID (String customer, int match, Connection con){
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

        boolean deleteBuilding(Building b, Connection con) {
        int rowsUpdated = 0;
        String SQLString
                = "delete from building where buildingID = ?";
        b.setbuildingID(getBuildingID(b.getCustomer(),b.getReport(),con));
        PreparedStatement statement = null;
        try {

            statement = con.prepareStatement(SQLString);
            statement.setInt(1,b.getBuildingID());
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
    
     */
}
