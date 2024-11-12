package com.javaextra.day02;

public class Method {
 /*  접근수준 지시자/static/ return type / method name (parameter) { 구현부 }

    static 은 객체화 자체가 필요가 없다
    class method : static, instance method : non-static
    호출방법이 달라지기 때문에 구분할 수 있어야 한다

    선언부 + 구현부 = 그냥메소드

    그리고 구현부가 없는 메소드는 abstract 추상메소드이다.

    메소드를 만드는것은 메소드를 정의한다고 볼 수 있다
    정의한 메소드를 사용하는 것은 메소드를 호출한다고 본다.

  */
    public static void main(String[] args) {

        /*
        class(static)메소드 호출, 클래스명.메소드명(). 객체화 과정이 필요없다
        클랴스명은 해당 클래스 메소드가 소속된 클래스명
        static 은 프로그램이 시작되면 메모리에 바로 올라간다

         */
        Method.sum(5,5);
        //메인메소드와 sum 메소드가 같은 소속 클래스이기 때문에 클래스명은 생략가능
        //혹은 import static 기능을 이용하면 클래스명 생략이 가능하다.
        sum(1,1);

        Method method= new Method();
        // 레퍼런스 변수 = Method 클라스의 주소값 이 복사되어서 넘어간다
        // 여기서 레퍼런스 변수(reference variable)는 객체의 주소값을 저장한다.

        method.sum2(5,5);

    }

    public static void sum(int n1, int n2){
        System.out.println("static num : "+(n1+n2));
    }

    public void sum2(int n1, int n2){
        System.out.println("instance num : "+(n1+n2));
    }
}
