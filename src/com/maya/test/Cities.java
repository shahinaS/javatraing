package com.maya.test;

public class Cities {
    public static void main(String[] args){
       String[] cities = {"Sialkot", "Lahore", "Karachi", "Islamabad", "Peshwar", "Multan"};
       // System.out.println(cities[2]);
        int a = 0;
        do {
            System.out.println(cities[a]);
            a = a +1;
        }while (a<6);


        String[] provision = new String[4];
        provision[0] = "Punjab";
        provision[1] = "Sind";
        provision[2] = "Sarhad";
        provision[3] = "Baloshitan";
        int i= 0;
        do {
            System.out.println(provision[i]);
            i = i + 1;
        }while (i < 4);
        System.out.println("Printing with for Loop\n");

        for (int x= 0; x < 4; x++){
            System.out.println(provision[x]);


        }

    }

}
