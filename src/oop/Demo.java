package oop;


public class Demo {
    public static void main(String[] args){

        String name = "Shahina";
        String email = "shena@mayalogic.com";
        String phone = "03316124099";

        walking(name);
        System.out.println(name + " is eating");

        String name1 = "Arif";
        String email1 = "info@mayalogic.com";
        String phone1 = "03217973662";

        walking(name1);
        System.out.println(name1 + "is eating");

    }

    static void walking(String n){

        System.out.println(n + " is walking");

    }
}
