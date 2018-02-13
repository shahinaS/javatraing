package com.maya.test;

public class Strings {
    public static void main(String[] args){

        String bookTitle = "The Lord of the Rings";
        String wordChoice = "Ring";
        if (bookTitle.contains(wordChoice)){
            System.out.println("The book contains the word " + wordChoice );
        }
        String browser = "Chrome";
        if (browser.equalsIgnoreCase("chrome")){
            System.out.println("The browser is Chrome");
        }
        String firstName = "Shahina";
        String lastName = "Sarfraz";
        String ssn = "5973945";
        System.out.println("There are " +ssn.length()+ " digits in your SSN");
        //print my initials along with last four digits of SSN

        System.out.print(firstName.substring(0 ,1));
        System.out.print(lastName.substring(0,1));
        System.out.println(ssn.substring(3));
    }
}
