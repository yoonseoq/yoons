package com.javaextra.day01;

public class Variable {
    public static void main(String[] args) {
        //메인메소드는 실행가능하게 하기위한 메소드
        /*
        변수선언:데이터를 저장하기 위함
        정해져있는 데이터만 저장ㅇ하고 싶다.>>데이터타입이 굉장히 중요하다. 이것은 곳 신뢰
        리터럴이란? 변하지 않는 값 자체
        고정된값
        변수=리터럴;
        변할수있는값 고정값
        최초로 값을 넣는 행위
        래퍼런스 변수(대문자)로 시작하는 것은 무조건 객체의 주소값을 저장한다.
        -타입 선언된 클래스를 객체화한 객체의 주소값을 저장할수 있다
      */
        String s="d";//스트링을 상속받은 자식클래스의 객체값을 저장 할 수 있다
        //이건 부모타입이 될 수 없다. 이유는 모름 상속금지

        //final + class 상속금지
        // final+변수선언 변경금지
        // final+메소드 오버라이딩 금지

        String s2=new String("d");//오리지날로 하면 이렇다


        /*소문자인 일반변수(primitive type)는 리터럴 값 그 자체를 저장한다

        멤버필드로는 string int 자주씀
        */


        int n;//선언은 딱 한번만 한다
        n=1;
        System.out.println(n);
        String s3="d";
        s3.length();//저장된 주소값ㄱ을 이용
        "d".length();//주소값 저장업ㅅ이 급 쓴거여서 한번 호출되면 사라짐
        "".length();//그냐
    }
}

