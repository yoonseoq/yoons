package com.javaextra.day01;

public class If {
    public static void main(String[] args) {
        int rVal = (int) (Math.random() * 20) + 1;
        //리턴할 값이 있어야 대입식이 있다
        //random():리턴 스태틱 메소드 왜 스태틱이어야 하는가?
        //객체화할필요 없어서 "클래스.메소드" 이렇게 직빵으로 사용가능하다
        System.out.println(rVal);
        if (rVal % 2 != 0) {
            System.out.printf("%d는(은)홀수입니다\n", rVal);
        } else {
            System.out.printf("%d는(은)짝수입니다\n", rVal);
        }
        System.out.println("----------------------");
        System.out.printf("%d는(은)%s수입니다", rVal, (rVal % 2 == 0) ? "짝" : "홀");
    }
}
