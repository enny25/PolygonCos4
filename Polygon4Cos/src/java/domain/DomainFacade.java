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

    public Customer createCustomer(String name, String address, Date signupDate) {
        newCustomer = new Customer(name, address, signupDate);

        boolean status = dbf.createCustomer(newCustomer);
        if (!status) {
            newCustomer = null;
        }

        return newCustomer;
    }

    public Report createReport(String buildingName, String address, String postnrCity, int reportNr, Date date, int buildingYear, double size, String useOfBuilding, String roof, String outerWalls) {
        newReport = new Report(buildingName, address, postnrCity, reportNr, date, buildingYear, size, useOfBuilding, roof, outerWalls);

        boolean status = dbf.createReport(newReport);
        if (!status) {
            newReport = null;
        }
        return newReport;
    }

    public RoomReport createRoomReport(int reportNr, String room, String damageToTheRoom, String damageDoneWhen, String damageDoneWhere, String whatIsTheDamage, String whatIsRepared, String damage, String walls, String ceiling, String floor, String windowsDoors, String humidityScan) {
        newRoomReport = new RoomReport(reportNr, room, damageToTheRoom, damageDoneWhen, damageDoneWhere, whatIsTheDamage, whatIsRepared, damage, walls, ceiling, floor, windowsDoors, humidityScan);
        boolean status = dbf.createRoomReport(newRoomReport);
        if (!status) {
            newRoomReport = null;
        }
        return newRoomReport;
    }

    public ReportConclusion createReportConclusion(int reportNr, String room, String roomRecomedation, String reportAuthor, String buildingOwner, int buildingState) {
        newReportConclusion = new ReportConclusion(reportNr, room, roomRecomedation, reportAuthor, buildingOwner, buildingState);
        boolean status = dbf.createReportConclusion(newReportConclusion);
        if (!status) {
            newReportConclusion = null;
        }
        return newReportConclusion;

    }
//     public List<Building> showBuildings(){
//        List <Building> allBuildings = dbf.showBuildings();
//        return allBuildings;
//}
}
