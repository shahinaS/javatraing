package oop;

public class AccountApp {
    public static void main(String[] args){

        LoanAccount la = new LoanAccount();
        la.setRate();
        la.increaseRate();
        la.setTerm(3);

        //polymorphism changes where we are pointing
        IRate acc1 = new LoanAccount();
        acc1.increaseRate();
        acc1.setRate();
    }
}
