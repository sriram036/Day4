package com.bridgelabz;

public class FibonacciSeries {
    public static void main(String[] args) {
        int firstNum = 0;
        int secondNum = 1;
        System.out.println(firstNum);
        System.out.println(secondNum);
        for (int i = 0; i < 20; i++){
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
            System.out.println(nextNum);
        }
    }
}
