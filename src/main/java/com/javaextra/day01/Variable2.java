package com.javaextra.day01;

public class Variable2 {
    public static void main(String[] args) {
        int n = 10;
        n= n + 20; //변수n 을 읽고 쓰기
//  n= n + 20; n이란 값을 읽고
//  20을 더함(쓰기)
        System.out.println(n);

        n+=30;//복합식 기존값에 30을 더한다는 의미
        System.out.println(n);
        n/=2;
        System.out.println(n);

        n++;//증가식>>쓰기(변수의 값변경)만함 값변경만
        ++n;//증가식>>쓰기만함 값변경만
        //쓰기만 할 시 ++가 변수 앞,뒤 어디에 있어도 상관이 없다
        System.out.println(++n);//쓰고 읽기
        System.out.println(n++);//읽고 쓰기 일단 원래값 불러내고 나중에 계산
        System.out.println(n);



    }
}
