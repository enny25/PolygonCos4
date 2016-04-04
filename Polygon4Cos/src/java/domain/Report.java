/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.Date;

/**
 *
 * @author Diana
 */
public class Report {

    private String buildingName;
    private String address;
    private String postnrCity;
    private int reportNr;
    private Date date;
    private int buildingYear;
    private double size;
    private String useOfBuilding;
    private String roof;
    private String outerWalls;

    public Report(String buildingName, String address, String postnrCity, int reportNr, Date date, int buildingYear, double size, String useOfBuilding, String roof, String outerWalls) {
        this.buildingName = buildingName;
        this.address = address;
        this.postnrCity = postnrCity;
        this.reportNr = reportNr;
        this.date = date;
        this.buildingYear = buildingYear;
        this.size = size;
        this.useOfBuilding = useOfBuilding;
        this.roof = roof;
        this.outerWalls = outerWalls;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostnrCity() {
        return postnrCity;
    }

    public void setPostnrCity(String postnrCity) {
        this.postnrCity = postnrCity;
    }

    public int getReportNr() {
        return reportNr;
    }

    public void setReportNr(int reportNr) {
        this.reportNr = reportNr;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getBuildingYear() {
        return buildingYear;
    }

    public void setBuildingYear(int buildingYear) {
        this.buildingYear = buildingYear;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getUseOfBuilding() {
        return useOfBuilding;
    }

    public void setUseOfBuilding(String useOfBuilding) {
        this.useOfBuilding = useOfBuilding;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getOuterWalls() {
        return outerWalls;
    }

    public void setOuterWalls(String outerWalls) {
        this.outerWalls = outerWalls;
    }
               
}
