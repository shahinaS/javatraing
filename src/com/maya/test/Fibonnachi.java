package com.maya.test;

public class Fibonnachi {
    public static void main(String[] args){
        //fibonnachi number is the sum of two previous fibonnachi numbers
        /*fib(0) = 0
          fib(1) = 1
          fib(2) = fib(1) + fib(2) = 0+1 = 1
          fib(3) = fib(2) + fib(1) = 1+1 = 2       */
        System.out.println(fib(9));

    }

    public static int fib(int n){
        if (n ==0){
            return 0;
        }
        else if (n ==1){
            return 1;
        }
        return (fib(n-1)+fib(n-2));
    }
}
