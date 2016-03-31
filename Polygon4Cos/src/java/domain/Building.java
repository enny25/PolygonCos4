/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Minerva
 */
public class Building {
    private String name;
    private String address;
    private int buildingID;
    private int customerID;
    private double size;

    public Building(String name, String address, int buildingID, int customerID, double size) {
        this.name = name;
        this.address = address;
        this.buildingID = buildingID;
        this.customerID = customerID;
        this.size = size;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBuildingID() {
        return buildingID;
    }
    
     public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    
    
    
}
