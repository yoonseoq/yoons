package com.seok._4;

public class code_60_1 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {

                System.out.print(" 짝");
                continue;
            }
            System.out.print(" "+i);
        }
    }

}
