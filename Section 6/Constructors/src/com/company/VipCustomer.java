package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unkown@gmail.com");
    }

    public VipCustomer (){
        this("Default name", 50000.00, "default@email.com");

    }
    public VipCustomer (String name, double creditLimit, String emailAddress){
        this.emailAddress = emailAddress;
        this.name = name;
        this.creditLimit = creditLimit;

    }

    public String getName() {
        return name;
    }

    public double getCreditlimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
