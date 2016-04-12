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
public class Customer {

    private String name;
    private String pwd;
    private String address;
    private int customerId;
    private Date signupDate;

    public Customer(String name, String pwd, String address, Date signupDate) {
        this.name = name;
        this.pwd = pwd;
        this.address = address;
        this.signupDate = signupDate;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
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

    public Date getSignupDate() {
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

    public void setSignupDate(Date signupDate) {
        this.signupDate = signupDate;
    }
}
