package com.javaextra.day02;

public class Test2 {
    public static void main(String[] args) {

    int v1=10,v2=5;

    MyMath.multi(v1,v2);
    MyMath myMath = new MyMath();

    myMath.divide(v1,v2);

// 파라미터만 다르면 똑같은 이름의 메소드를 만들 수 있는것을 오버로딩이라고 한다
// 부모가 가지고 있는 메소드를 자식이 쓸수 있게 다시 만드는 즉 재정의 하는것을 오버라이딩이라고 한다.

    }
}


class MyMath{
    public static void multi(int n1, int n2){
        System.out.println(n1*n2);
    }
    public  void divide(int n1,int n2){
        System.out.println(n1/n2);
    }
}
