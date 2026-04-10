package com.java.fundamentals;

import java.util.Scanner;

public class PrintEvenNumbersWhileLoop {
    public static void main(String[] args) {
//      Take input(range)
//      print all even numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = sc.nextInt();
        int num = 1;
        while (num <= range){
            if (num % 2 == 0){
                System.out.println(num);
            }
            num++;
        }
    }
}
