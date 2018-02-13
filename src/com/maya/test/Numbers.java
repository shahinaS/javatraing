package com.maya.test;

public class Numbers {
    public static void main(String[] args){
        System.out.println("Program is Starting");
        //printName();
        int num1 = 10;
        int num2 = 60;
        addNumbers(num1, num2);
        int result =multiplyNumbers(num1,num2);
        System.out.println(result);

    }

    static void printName(){
        System.out.println("My Name is Arif");
    }
    static void addNumbers(int number1, int number2){
        int sum = number1 + number2;
        System.out.println("The sum of Number " +number1+ " and " +number2+ " is = " +sum);

    }
    static int multiplyNumbers(int value1, int value2) {
        int result = value1 * value2;
        addNumbers(result +50,result);
               return result;



    }
}

