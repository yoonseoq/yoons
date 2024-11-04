package com.seok._4;

import java.util.Scanner;

public class code_60_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//스캐너란 곳에서 객체생성
        System.out.println("숫자를 입력하세요");
        int input = scan.nextInt();

        for (int i = 1; i <= input; i++) {
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
