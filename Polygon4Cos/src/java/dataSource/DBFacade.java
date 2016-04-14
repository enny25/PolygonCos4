/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import domain.RoomReport;
import domain.Customer;
import domain.Building;
import domain.Report;
import domain.ReportConclusion;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author
 */
public class DBFacade {

    private MapperReports mapRep;
    private Mapper map;
    private Connection con;
    public static boolean test = false;

    // Singleton start
    private static DBFacade instance;

    private DBFacade() {
        mapRep = new MapperReports();
        map = new Mapper();
        con = DBConnector.getInstance().getConnection();
    }

    public static DBFacade getInstance() {
        if (instance == null) {
            instance = new DBFacade();
        }
        return instance;
    }
    // Singleton end

    public boolean createBuilding(Building b) {
        if(test){
            return true;
        }

        return map.createBuilding(b, con);
    }

    public boolean createCustomer(Customer c) {
        if(test){
            return true;
        }

        return map.createCustomer(c, con);
    }

    public boolean createReport(Report r) {
        if(test){
            return true;
        }

        return mapRep.createReport(r, con);
    }

    public boolean createRoomReport(RoomReport rr) {
        if(test){
            return true;
        }

        return mapRep.createRoomReport(rr, con);
    }

    public boolean createReportConclusion(ReportConclusion rc) {
        if(test){
            return true;
        }

        return mapRep.createReportConclusion(rc, con);
    }

//
//    public boolean deleteBuilding(Building b) {
//        return map.deleteBuilding(b, con);
//    }
//    public boolean updateReport(Report report) {
//        return mapRep.updateReport(con, report);
//    }

//    public List<Building> showBuilding() {
//        return map.showBuilding(con);
//    }
}
