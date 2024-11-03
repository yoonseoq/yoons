package com.seok._4;

import java.util.Scanner;

public class code_57 {
    public static void main(String[] args) {
        Scanner scin= new Scanner(System.in);
        System.out.print("Enter n:");
        int n=scin.nextInt();
        int count =0;
        //int i=0; 0으로 나누는 ㅄ짓은 하지말자;
        int i=1;
        while (n>=i){
            if(n%i==0){
                count++;
            }i++;
        }
        if (count==2) System.out.printf("%d은 소수입니다\n",n);
        else System.out.printf("%d는 합성수입니다\n",n);
        scin.close();
    }
}
