/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Diana
 */
public class ReportConclusion {
    private int reportNr;
    private String room;
    private String roomRecomedation;
    private String reportAuthor;
    private String buildingOwner;
    private int buildingState;

    public ReportConclusion(int reportNr, String room, String roomRecomedation, String reportAuthor, String buildingOwner, int buildingState) {
        this.reportNr = reportNr;
        this.room = room;
        this.roomRecomedation = roomRecomedation;
        this.reportAuthor = reportAuthor;
        this.buildingOwner = buildingOwner;
        this.buildingState = buildingState;
    }

    public int getReportNr() {
        return reportNr;
    }

    public void setReportNr(int reportNr) {
        this.reportNr = reportNr;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRoomRecomedation() {
        return roomRecomedation;
    }

    public void setRoomRecomedation(String roomRecomedation) {
        this.roomRecomedation = roomRecomedation;
    }

    public String getReportAuthor() {
        return reportAuthor;
    }

    public void setReportAuthor(String reportAuthor) {
        this.reportAuthor = reportAuthor;
    }

    public String getBuildingOwner() {
        return buildingOwner;
    }

    public void setBuildingOwner(String buildingOwner) {
        this.buildingOwner = buildingOwner;
    }

    public int getBuildingState() {
        return buildingState;
    }

    public void setBuildingState(int buildingState) {
        this.buildingState = buildingState;
    }

}
