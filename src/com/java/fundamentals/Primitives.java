package com.java.fundamentals;

public class Primitives {
    public static void main(String[] args) {
        //Primitives
        //byte
        //stores 1 byte of memory
        //range : -128 to +127
        byte age;
        byte subject1Marks, subject2Marks, subject3Marks, subject4Marks, subject5Marks;
        byte discountPercentage;
        byte rating;
        age = 100;
        subject1Marks = 90;
        subject2Marks = 80;
        subject3Marks = 70;
        subject4Marks = 60;
        subject5Marks = 50;
        System.out.println("Age: " + age);
        System.out.println("subject1 marks: " +subject1Marks);
        System.out.println("subject2 marks: " +subject2Marks);
        System.out.println("subject3 marks: " +subject3Marks);
        System.out.println("subject4 marks: " +subject4Marks);
        System.out.println("subject5 marks: " +subject5Marks);
        System.out.println("------------------");
        System.out.println("subject1 marks: " + subject1Marks + ", subject2 marks: " + subject2Marks + ", subject3 marks: " + subject3Marks + ", subject4 marks: " + subject4Marks + ", subject5 marks: " + subject5Marks);
        //short(-32728 to +32727) //16bit
        short manufacturingYear;
        byte daysInExpiry;
        manufacturingYear = 2022;
        daysInExpiry = 10;
        System.out.println("Manufacturing Year: " + manufacturingYear + ", Days in Expiry: " + daysInExpiry);
        //int 32bit,4 bytes -2,147,483,648 to 2,147,483,647
        //can be declared salary, otp, ...
        int empSalary = 30000;
        int price = 12000;
        int otp = 6214789;
        System.out.println("Employee Salary: " + empSalary + "/month");
        System.out.println("Price: " + price);
        System.out.println("OTP: " + otp);

        //long 8 bytes
        long aadhar = 733630946816L; //by default java takes the value integer. To avoid, use L.
        long mobileNumber = 7386802704L;
        long populationCount = 8625896345L;
        System.out.println("Aadhar: " + aadhar);
        System.out.println("Mobile number: " + mobileNumber);
        System.out.println("Population: " +populationCount);

        //boolean
        boolean isFemale = true;
        System.out.println(isFemale);

        //char
        char ch = 'a';
        System.out.println(ch);
    }

}
