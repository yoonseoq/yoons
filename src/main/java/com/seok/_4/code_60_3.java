package com.seok._4;

public class code_60_3 {
    public static void main(String[] args) {

        int n = 99;


        for (int i = 1; i <= n; i++) {
            boolean is369 = false;

            while (i > 0) {
                if ((i % 10 == 3) || (i % 10 == 6) || (i % 10 == 9)) {
                    is369 = true;
                    break;
                }

                i /= 10; //이렇게 가버리면 i를 10으로 무한대로 나눠버림

            }
            if (is369) {
                System.out.println("짝");
            } else {
                System.out.println(i);

            }
        }
    }
}
