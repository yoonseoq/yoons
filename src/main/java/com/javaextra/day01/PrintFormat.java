package com.javaextra.day01;

public class PrintFormat {
    public static void main(String[] args) {
        String name="홍길동";
        int age=22000;
        double height=172.5;

        System.out.printf("제이름은 %s이고 나이는 %,d살 그리고 키는 %.1f살 입니다.\n",name,age,height);

        System.out.printf("제이름은 %s이고 나이는 %s살 그리고 키는 %s살 입니다.\n",name,age,height);
        //기능사용 안하고 냅다 문자열로 바꿔줌

        //값을 출력하지 않고 단순 저장하려는것
        String result=String.format("제이름은 %s이고 나이는 %,d살 그리고 키는 %.1f살 입니다.\n",name,age,height);
        System.out.println(result);//



    }//%,d 1000단위로 끊어줌
}
