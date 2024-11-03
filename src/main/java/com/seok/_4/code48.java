package com.seok._4;

import java.util.Scanner;

public class code48 {
    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);
        System.out.println("Enter a:");
        int a=scin.nextInt();
        System.out.println("Enter b:");
        int b=scin.nextInt();

        int max =0;
        if (a>b) max=a;
        else if (a==b) {
            System.out.println("draw");
        } else max=b;

        System.out.println("max:"+max);
        scin.close();
    }
}
