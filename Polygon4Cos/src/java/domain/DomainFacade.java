/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import dataSource.DBFacade;
import java.sql.Date;
import java.util.List;

public class DomainFacade {

    private ReportConclusion newReportConclusion;
    private RoomReport newRoomReport;
    private Report newReport;
    private Customer newCustomer;
    private Building newBuilding;
    private DBFacade dbf;

    private DomainFacade() {
        newBuilding = null;
        dbf = DBFacade.getInstance();
    }

    public static DomainFacade getInstance() {
        return new DomainFacade();
    }
    //----------------------

    public Building createBuilding(String name, String address, int customerID, double size) {
        newBuilding = new Building(name, address, customerID, size);

        boolean status = dbf.createBuilding(newBuilding);
        if (!status) {
            newBuilding = null;
        }

        return newBuilding;
    }

    public Customer createCustomer(String name, String pwd, String address, Date signupDate) {
        newCustomer = new Customer(name, pwd, address, signupDate);
        boolean status = dbf.createCustomer(newCustomer);
        if (!status) {
            newCustomer = null;
        }

        return newCustomer;
    }

    public Report createReport(Report r) {
        newReport = new Report(r.getBuildingName(), r.getAddress(), r.getPostnrCity(), r.getReportNr(), r.getDate(), r.getBuildingYear(), r.getSize(), r.getUseOfBuilding(), r.getRoof(), r.getOuterWalls());
        boolean status = dbf.createReport(newReport);
        if (!status) {
            newReport = null;
        }
        return newReport;
    }

    public RoomReport createRoomReport(RoomReport rr) {
        newRoomReport = new RoomReport(rr.getReportNr(), rr.getRoom(), rr.getDamageToTheRoom(), rr.getDamageDoneWhere(), rr.getWhatIsTheDamage(), rr.getWhatIsRepared(), rr.getDamage(), rr.getWalls(), rr.getCeiling(), rr.getFloor(), rr.getWindowsDoors(), rr.getHumidityScan());
        boolean status = dbf.createRoomReport(newRoomReport);
        if (!status) {
            newRoomReport = null;
        }
        return newRoomReport;
    }

    public ReportConclusion createReportConclusion(ReportConclusion rc) {
        newReportConclusion = new ReportConclusion(rc.getReportNr(), rc.getRoom(), rc.getRoomRecomendation(), rc.getReportAuthor(), rc.getBuildingOwner(), rc.getBuildingState());
        boolean status = dbf.createReportConclusion(newReportConclusion);
        if (!status) {
            newReportConclusion = null;
        }
        return newReportConclusion;

    }

    public void createReport(Report r, RoomReport rr, ReportConclusion rc) {
        createReport(r);
        createRoomReport(rr);
        createReportConclusion(rc);

    }

//    public List<Building> showBuilding() {
//        List <Building> allBuildings = dbf.showBuilding();
//        return allBuildings;
//    }

}
