package oop;

public class BankAccountApp {

    public static void main(String[] args){
            //creating a new bank account
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.accountNumber = "430999";
        bankAccount1.toString();
        //bankAccount1.name = "Shahina Sarfraz";
        bankAccount1.balance = 8000;
        bankAccount1.setName("Shahina Sarfraz");
        System.out.println(bankAccount1.getName());
        bankAccount1.setSsn("123");
        System.out.println("SSN Number: " +bankAccount1.getSsn());
        bankAccount1.setRate();
        bankAccount1.increaseRate();
        bankAccount1.deposit(9000);
        bankAccount1.deposit(2000);
        bankAccount1.withdraw(4000);
        //bankAccount1.routingNumber = "43";
        BankAccount bankAccount2 = new BankAccount("Hello");
        bankAccount2.accountNumber = "84735";
        System.out.println(bankAccount2);
        bankAccount2.checkBalance();
        BankAccount bankAccount3 = new BankAccount("Saving Account", 5000);
        bankAccount3.checkBalance();
        System.out.println(bankAccount3.toString());
        bankAccount3.accountNumber = "9789";



        //demo for inheritance

        CdAccount cd1 = new CdAccount();

        //cd1.name = "Arif Mehmood";
        cd1.balance = 3000;
        cd1.accountNumber="0091";
        cd1.InterestRate = "4.5";
        cd1.accountType = "CD Account";
        System.out.println(cd1.toString());
        cd1.compound();




    }


}
