package com.java.fundamentals;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age :");
        byte age = sc.nextByte();
        System.out.println("Age : " + age);

        System.out.println("Enter marks :");
        short marks = sc.nextShort();
        System.out.println("marks : " + marks);

        System.out.println("Enter salary");
        int salary = sc.nextInt();
        System.out.println("salary : " + salary);

        System.out.println("Enter phoneNo");
        long phoneNo = sc.nextLong();
        System.out.println("phoneNo : " + phoneNo);

        System.out.println("Enter population");
        double population = sc.nextDouble();
        System.out.println("Enter population : " + population);

        System.out.println("Enter gender");
        char gender = sc.next().charAt(0);
        System.out.println("Enter gender : " + gender);

        System.out.println("isFemale");
        boolean isFemale = sc.nextBoolean();
        System.out.println("isFemale : " + isFemale);

        System.out.println("Enter discountPercentage");
        float discountPercentage = sc.nextFloat();
        System.out.println("discountPercentage : " + discountPercentage);

        sc.close();

    }

}
