package com.java.fundamentals;

public class Operators {
    public static void main(String[] args) {
        //Assignment operator
//        byte no1 = 100;
//        byte no2;
//        no2 = no1;
//        System.out.println(no2);
//        int result = 10 + 20 -30 * 40 / 50 % 60;
//        System.out.println(result);
//        int res = 10 + (20 -30) * 40 / 50 % 60;
//        System.out.println(res);

        //increment and decrement operator
        //--x -> pre decrement, x-- -> post decrement
        //++x -> pre increment, x++ -> post increment
        int num1 = 10;
        int num2 = 20;
        int re = ++num1 + --num1 + num1++ + num2++ - num1++ + --num2;
        System.out.println(re);

        /* Type conversions
        byte to int -> int(byte)
        based on range
         */
        int no1 = 358946725;
        int no2 = 975264835;
        long res = no1 + no2;
        System.out.println(res);

        byte b1 = 127;//byte range = -128 to +127
        byte b2 = 127;//max range
        short sum = (short)(b1 + b2);
        System.out.println(sum);

    }
}
