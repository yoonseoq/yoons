package com.seok._4;

public class code_60_2 {
    public static void main(String[] args) {

        int n = 300;

        for (int i = 1; i <= n; i++) {
            boolean is369 = false;
            int tmp = i;
            while (tmp > 0) {
                if ((tmp % 10 == 3) || (tmp % 10 == 6) || (tmp % 10 == 9)) {
                    is369 = true;
                    break;
                }
                tmp /= 10;
            }
            if (is369) {
                System.out.println("짝");
            } else {
                System.out.println(i);
            }
        }
    }
}
