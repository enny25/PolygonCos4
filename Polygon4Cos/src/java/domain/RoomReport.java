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
public class RoomReport {
    private int reportNr;
    private String room;
    private String damageToTheRoom;
    private String damageDoneWhen;
    private String damageDoneWhere;
    private String whatIsTheDamage;
    private String whatIsRepared;
    private String damage;
    private String walls;
    private String ceiling;
    private String floor;
    private String windowsDoors;
    private String humidityScan;

    public RoomReport(int reportNr, String room, String damageToTheRoom, String damageDoneWhen, String damageDoneWhere, String whatIsTheDamage, String whatIsRepared, String damage, String walls, String ceiling, String floor, String windowsDoors, String humidityScan) {
        this.reportNr = reportNr;
        this.room = room;
        this.damageToTheRoom = damageToTheRoom;
        this.damageDoneWhen = damageDoneWhen;
        this.damageDoneWhere = damageDoneWhere;
        this.whatIsTheDamage = whatIsTheDamage;
        this.whatIsRepared = whatIsRepared;
        this.damage = damage;
        this.walls = walls;
        this.ceiling = ceiling;
        this.floor = floor;
        this.windowsDoors = windowsDoors;
        this.humidityScan = humidityScan;
    }

    RoomReport(int reportNr, String room, String damageToTheRoom, String damageDoneWhere, String whatIsTheDamage, String whatIsRepared, String damage, String walls, String ceiling, String floor, String windowsDoors, String humidityScan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getDamageToTheRoom() {
        return damageToTheRoom;
    }

    public void setDamageToTheRoom(String damageToTheRoom) {
        this.damageToTheRoom = damageToTheRoom;
    }

    public String getDamageDoneWhen() {
        return damageDoneWhen;
    }

    public void setDamageDoneWhen(String damageDoneWhen) {
        this.damageDoneWhen = damageDoneWhen;
    }

    public String getDamageDoneWhere() {
        return damageDoneWhere;
    }

    public void setDamageDoneWhere(String damageDoneWhere) {
        this.damageDoneWhere = damageDoneWhere;
    }

    public String getWhatIsTheDamage() {
        return whatIsTheDamage;
    }

    public void setWhatIsTheDamage(String whatIsTheDamage) {
        this.whatIsTheDamage = whatIsTheDamage;
    }

    public String getWhatIsRepared() {
        return whatIsRepared;
    }

    public void setWhatIsRepared(String whatIsRepared) {
        this.whatIsRepared = whatIsRepared;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getCeiling() {
        return ceiling;
    }

    public void setCeiling(String ceiling) {
        this.ceiling = ceiling;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWindowsDoors() {
        return windowsDoors;
    }

    public void setWindowsDoors(String windowsDoors) {
        this.windowsDoors = windowsDoors;
    }

    public String getHumidityScan() {
        return humidityScan;
    }

    public void setHumidityScan(String humidityScan) {
        this.humidityScan = humidityScan;
    }
    
}
