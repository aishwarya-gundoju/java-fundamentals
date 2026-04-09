package com.java.fundamentals;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter productPrice");
        int productPrice = sc.nextInt();
        System.out.println("Enter customer membership");
        char customerMembership = sc.next().charAt(0);
        System.out.println("Enter Customer Age");
        byte customerAge = sc.nextByte();

        double discountPercentage;
        if (customerMembership == 'B') {
            discountPercentage = 10;
        } else if (customerMembership == 'S') {
            discountPercentage = 15;
        } else if (customerMembership == 'G') {
            discountPercentage = 20;
        } else {
            discountPercentage = 50;
        }
        System.out.println("discount percentage = " + discountPercentage + "%");

    double additionalDiscount;
    if (customerAge > 65){
        additionalDiscount = discountPercentage + 10;
    }
    else if (customerAge > 45 && customerAge < 65) {
        additionalDiscount = discountPercentage + 8;
    }
    else if (customerAge == 25){
        additionalDiscount = discountPercentage + 5;
    }
    else {
        additionalDiscount = 0;
    }

}
}