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
public class MapperCustomer {

    public boolean createBuilding(Building b, Connection con) {
        int rowsInserted = 0;
        String sql = "insert into building (buildingName, customerId, address, size) values (?,?,?,?)";
        try (PreparedStatement statement
                = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            //== insert tuple
            statement.setString(1, b.getName());
            statement.setInt(2, b.getCustomerID());
            statement.setString(3, b.getAddress());
            statement.setInt(4, b.getSize());
            rowsInserted = statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Exception = " + e);

        }
        return rowsInserted == 1;
    }

    public Building getBuilding(Building b, Connection conn) {
        String sqlString = "select * from building where customerId=?";
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement(sqlString);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                b = new Building(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4));
            }
        } catch (SQLException ex) {
            System.out.println("Exception = " + ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.out.println("Exception = " + ex);
            }
        }
        return b;
    }

    public boolean createCustomer(Customer c, Connection con) {
        int rowsInserted = 0;
        String sql = "insert into customer (name, pwd, address, signupDate) values (?,?,?,?)";
        try (PreparedStatement statement
                = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            //== insert tuple
            statement.setString(1, c.getName());
            System.out.println("Name " + c.getName());
            statement.setString(2, c.getPwd());
            System.out.println("pasword " + c.getPwd());
            statement.setString(3, c.getAddress());
            System.out.println("address " + c.getAddress());
            statement.setDate(4, c.getSignupDate());
            rowsInserted = statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Exception = " + e);

        }
        return rowsInserted == 1;
    }

    List<Building> getBuilding(Connection con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
