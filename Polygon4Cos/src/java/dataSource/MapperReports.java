/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import domain.RoomReport;
import domain.Report;
import domain.ReportConclusion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *1
 * @author Diana
 */
public class MapperReports {

    boolean createReport(Report r, Connection con) {
        int rowsInserted = 0;
        String sql = "insert into report (reportNr, buildingName, address, postNrCity, date, buildingYear, size, useOfBuilding, roof, outerWalls ) values (?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement statement
                = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            //== insert tuple

            statement.setInt(1, r.getReportNr());
            statement.setString(2, r.getBuildingName());
            statement.setString(3, r.getAddress());
            statement.setString(4, r.getPostnrCity());
            statement.setDate(5, r.getDate());
            statement.setInt(6, r.getBuildingYear());
            statement.setDouble(7, r.getSize());
            statement.setString(8, r.getUseOfBuilding());
            statement.setString(9, r.getRoof());
            statement.setString(10, r.getOuterWalls());

            rowsInserted = statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Exception = " + e);

        }
        return rowsInserted == 1;
    }

    boolean createRoomReport(RoomReport rr, Connection con) {

        int rowsInserted = 0;
        String sql = "insert into roomReport (reportNr, room, damageToTheRoom, damageDoneWhen, damageDoneWhere, whatIsTheDamage, whatIsRepared, damage, walls, ceiling, floor, windowsDoors, humidityScan) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement statement
                = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            //== insert tuple

            statement.setInt(1, rr.getReportNr());
            statement.setString(2, rr.getRoom());
            statement.setString(3, rr.getDamageToTheRoom());
            statement.setString(4, rr.getDamageDoneWhen());
            statement.setString(5, rr.getDamageDoneWhere());
            statement.setString(6, rr.getWhatIsTheDamage());
            statement.setString(7, rr.getWhatIsRepared());
            statement.setString(8, rr.getDamage());
            statement.setString(9, rr.getWalls());
            statement.setString(10, rr.getCeiling());
            statement.setString(11, rr.getFloor());
            statement.setString(12, rr.getWindowsDoors());
            statement.setString(13, rr.getHumidityScan());

            rowsInserted = statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Exception = " + e);

        }
        return rowsInserted == 1;
    }

    boolean createReportConclusion(ReportConclusion rc, Connection con) {

        int rowsInserted = 0;
        String sql = "insert into reportConclusion (reportNr, room, roomRecomendation, reportAuthor, buildingOwner, buildingState) values (?,?,?,?,?,?)";
        try (PreparedStatement statement
                = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            //== insert tuple

            statement.setInt(1, rc.getReportNr());
            statement.setString(2, rc.getRoom());
            statement.setString(3, rc.getRoomRecomendation());
            statement.setString(4, rc.getReportAuthor());
            statement.setString(5, rc.getBuildingOwner());
            statement.setInt(6, rc.getBuildingState());

            rowsInserted = statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Exception = " + e);

        }
        return rowsInserted == 1;
    }

}
