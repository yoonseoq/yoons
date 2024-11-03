package com.seok._4;

public class code_60_1 {
    public static void main(String[] args) {
        int n = 9;
        boolean is369 =false;
        for (int i = 1; i <= n; i++) {
            while (i > 0) {
                if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                    is369 = true;
                    System.out.println("Wkr");
                    continue;
                }
                i /= 10;
            }
                System.out.println(i);
        }
    }
}
