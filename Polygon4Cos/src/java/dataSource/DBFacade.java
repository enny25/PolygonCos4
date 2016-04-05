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

/**
 *
 * @author
 */
public class DBFacade {

    private MapperReports mapRep;
    private Mapper map;
    private Connection con;

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

        return map.createBuilding(b, con);
    }

    public boolean createCustomer(Customer c) {

        return map.createCustomer(c, con);
    }

    public boolean createReport(Report r) {
       
        return mapRep.createReport(r, con);
    }
    
    public boolean createRoomReport(RoomReport rr) {
       
        return mapRep.createRoomReport(rr, con);
    }
    
    public boolean createReportConclusion(ReportConclusion rc) {
       
        return mapRep.createReportConclusion(rc, con);
    }

//    public List<Building> showBuildings() {
//        return map.showBuildings(con);
//    }
//
//    public boolean deleteBuilding(Building b) {
//        return map.deleteBuilding(b, con);
//    }
}
