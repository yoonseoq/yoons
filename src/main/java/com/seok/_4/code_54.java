package com.seok._4;

import java.util.Scanner;

public class code_54 {
    public static void main(String[] args) {
        //약수 구해보기
        Scanner scin = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scin.nextInt();
        int a = 1;
        while (a<=n){
            if(n%a==0){
                System.out.print(a+" ");
                //a++; 이 구문이 if문안에 있으면 만약에 안나눠지면 거기서 a증가는 끝
            }a++;//if문이 구현되고 나서 나누는 수를 증가시켜야함
        }scin.close();
    }
}
