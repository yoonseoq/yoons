package com.seok.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("첫번째 시나리오");
        try {
            System.out.println("a/b ..a?");
            int a = scan.nextInt();
            System.out.println("a/b ..b?");
            int b = scan.nextInt();

            System.out.printf("%d / %d = %d\n", a, b, a / b);
        }catch (InputMismatchException e){ // 입력미스
            System.err.println("입력오류: 정수만 입력 가능합니다");
        }catch (ArithmeticException e){
            System.err.println("수학적 오류"+e.getMessage());
            //어느게 수학적으로 오류가 터졌는지 보여준다
        }


         */
        System.out.println("두 번째 시나리오");
        try {
            System.out.print("a/b...a? ");
            int n1 = scan.nextInt();
            System.out.print("a/b...b? ");
            int n2 = scan.nextInt();

            System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
        } catch (InputMismatchException | ArithmeticException e) {
            System.err.println("오류: " + e.getMessage());
        }
    }
}
