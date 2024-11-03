package com.seok._4;

import java.util.Scanner;

public class code_55_1 {
    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scin.nextInt();
        while (n>0){

            System.out.println(n%10);
            n/=10;
        }
        scin.close();
    }
}