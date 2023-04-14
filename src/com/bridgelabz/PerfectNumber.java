package com.bridgelabz;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = s.nextInt();
        int divider = 0;
        if (num > 3) {
            for (int i = 1; i < num / 2; i++) {
                if (num % i == 0) {
                    divider = divider + i;
                }
            }
        }
        if(num <= 3){
            System.out.println("The Number "+num+" is a perfect Number.");
        }
        if (num > 3) {
            if (num == divider + divider) {
                System.out.println("The Number " + num + " is a perfect Number.");
            } else {
                System.out.println("The Number " + num + " is not a perfect number.");
            }
        }
    }
}
