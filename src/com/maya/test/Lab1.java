package com.maya.test;

public class Lab1 {
    public static void main(String [] args){
        //write a function that takes value N and return the sum of 1 to n
        System.out.println(sum(5));
        //compute factorial
        System.out.println(fact(5));
        // write 3 functions that return min, average and max of an array
        int[] length = {80,-88,100};
        System.out.println("Minimum Value is " +findMin(length));
        System.out.println("Maximum Value is " +findMax(length));
        System.out.println("Sum of array" +findAverage(length));
    }

    public static int findAverage (int[] arr){

        int sum = 0;
        for (int n=0; n<arr.length; n++){
            sum = sum + arr[n];

        }return sum/arr.length;
    }
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;

    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i=0; i>arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }

        } return max;
    }


    public static int sum(int n){
        int sum = 1;
        for(int i= 1; i<=n; i++){
            System.out.print(sum + "+" + i);
            sum = sum * i;
            System.out.println("=" + sum);
        }return sum;
    }
    public static int fact(int n){
        if (n == 0){
            return 1;

        }
        return fact(n-1) * n;
    }



    }






