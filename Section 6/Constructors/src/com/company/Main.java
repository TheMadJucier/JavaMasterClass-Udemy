package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Account bobsAccount = new Account("12345",0.00, "Bob Brown",
                "myemail@bob.com", "(213)-652-6236");
        /*bobsAccount.setNumber("1234568");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmailAddress("myemail@bob.com");
        bobsAccount.setCustomerPhoneNumber("(087) 123-4567");*/

        /*System.out.println(bobsAccount.getBalance());
        System.out.println(bobsAccount.getCustomerName());

        bobsAccount.withdrawl(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawl(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawl(100.0);*/

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        VipCustomer Me = new VipCustomer("Myself", 100.0);
        System.out.println(Me.getName());

        VipCustomer person1 = new VipCustomer("Mozambique", 100000, "csdacs@cs.net");
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Burr",565585, "billburr@gmail.com");
        System.out.println(person2.getName());

    }


}
