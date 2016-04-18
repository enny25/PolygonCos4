/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;
import domain.Report;
import domain.Customer;
import domain.Building;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diana
 */
public class MapperEmployee {

    boolean deleteBuilding(Building b, Connection con) {
        int rowsUpdated = 0;
        String SQLString
                = "delete from building where buildingID = ?";
        b.setbuildingID(getBuildingId(b.getCustomerID(), con));
        PreparedStatement statement = null;
        try {

            statement = con.prepareStatement(SQLString);
            statement.setInt(1, b.getBuildingID());
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

    List<Building> showAllBuildings(Connection con) {
        ArrayList<Building> building = new ArrayList<Building>();
        String SQLString = "select * from building";

        try (PreparedStatement statement = con.prepareStatement(SQLString)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                rs.getString("buildingName");
                rs.getString("buildingAddress");
                rs.getInt("buildingId");
            }

            return building;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
