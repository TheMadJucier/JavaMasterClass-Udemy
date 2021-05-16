package com.company;

public class Account {
    private String Number;
    private double Balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999", 100.55, customerName,customerEmailAddress,customerPhoneNumber);
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public  Account(){
        this("56789", 2.50, "Default name", "Default Address", "Default phone");
        // creates defaults for an object and these are used if no parameters are created upon initialization
        System.out.println("Empty constructor ");
    }

    public Account (String Number, double balance,String customerName, String customerEmailAddress, String customerPhoneNumber){
        System.out.println("Constructor with parameters created");
        this.Number = Number;
        this.Balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }


    public void deposit (double depositAmount){
        this.Balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.Balance);
    }

    public void withdrawl (double withdrawlAmount){
        if(this.Balance - withdrawlAmount < 0){
            System.out.println();
        } else {
            this.Balance -= withdrawlAmount;
            System.out.println("Withdrawl of " + withdrawlAmount + " processed. Remaining balance = " + this.Balance);
        }
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String tNumber) {
        this.Number = tNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
