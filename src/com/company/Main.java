package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int decimal, remainder;
    String hexdec = "";

    char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    Scanner sc = new Scanner(System.in);

    System.out.print("Input a decimal number: ");
    decimal = sc.nextInt();

    while(decimal>0) {
        remainder = decimal % 16;         // 775 / 16 = 48 rem 7 ; 48 / 16 = 3 rem 0 ; 3/16 = 0 rem 3 => 307
        hexdec = hex[remainder] + hexdec; // 307
        decimal = decimal/16;
    }
        System.out.println("Hexadecimal number is: " + hexdec);
    }
}
