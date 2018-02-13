package com.maya.test;

public class test1 {
    public static void main(String[] args){

        int[] arr= {89,55,18,22,-98,199,17};
        System.out.println(findMin(arr));
        System.out.println(findAverage(arr));
    }

    public static int findAverage(int[] avg){
        int b = 0;
        for(int i=0; i<avg.length; i++){

            b = b+avg[i];

        }return b/avg.length;

    }
    public static int findMin(int[] array){
        int min = 0;
        for (int i=0; i<array.length; i++){

            if (array[i]<min){

                min=array[i];
            }
        }return min;

    }
}
