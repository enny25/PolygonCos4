/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import domain.Employee;
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

    private MapperEmployee mapEmp;
    private MapperReports mapRep;
    private MapperCustomer mapCus;
    private Connection con;
    public static boolean test = false;

    // Singleton start
    private static DBFacade instance;

    private DBFacade() {
        mapEmp = new MapperEmployee();
        mapRep = new MapperReports();
        mapCus = new MapperCustomer();
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

        return mapCus.createBuilding(b, con);
    }

    public boolean createCustomer(Customer c) {
        if(test){
            return true;
        }

        return mapCus.createCustomer(c, con);
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
//        return mapEmp.deleteBuilding(b, con);
//    }
//    public boolean updateReport(Report report) {
//        return mapRep.updateReport(con, report);
//    }

    
    public List<Building> showAllBuildings() {
        return mapEmp.showAllBuildings(con);
    }

    public List<Building> getBuilding() {
        return mapCus.getBuilding(con);
    }


}
