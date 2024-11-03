package com.seok._4;

public class code_60 {
    public static void main(String[] args) {
        //369369369369
        int n=9;
        int m=0;
        for (int i = 0; i <=n; i++) {
            while (n>0){
                if (i%10==3||i%10==6||i%10==9){
                    System.out.println("짝");
                    m=1;
                }
                i/=10;
            }
            if(m==1){
                m=0;
                continue;
            }
            System.out.println(i);
        }
    }
}
