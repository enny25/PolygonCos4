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
public class Customer {
    private String name;
    private String address;
    private int customerId;
    private String signupDate;

    public Customer(String name, String address, int customerId, String signupDate) {
        this.name = name;
        this.address = address;
        this.customerId = customerId;
        this.signupDate = signupDate;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getSignupDate() {
        return signupDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setSignupDate(String signupDate) {
        this.signupDate = signupDate;
    }
}
