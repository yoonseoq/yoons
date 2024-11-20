package com.javaextra.day03;
/*
    클래스는 걍 문서(진짜가 아니다. 진짜를 만들기 위한 도구)

    붕어빵(객체)을 만들려면 붕어빵 틀이 필요하다.
    붕어빵 틀이 클래스라고 보면 된다.

    아파트가 객체라면 아파트 도면이 필요
    TV를 만들려면 TV설계도가 필요하다.

    클래스로 객체를 만든다고 보면 객체는 2가지로 이루어 질 수 있다.
    -멤버필드 (명사 담당)
    -멤버메소드 (동사 담당)

    정민(사람)
    -멤버필드: 이름, 생년월일, 성별 , 국적 , 키, 몸무게, 혈액형
    - 멤버메소드: 자다 뛰다 걷다 화내다 밥먹다

 */
public class Car {
    int wheel;
    String color;
    String model;
    int createdYear;
    int price;

    void drive(){
        System.out.println("차가 달린다");
    }
    void stop(){
        System.out.println("차가 멈춘다");
    }
    void fillOil(){
        System.out.println("기름을 넣다");
    }
}

class CarTest{
    public static void main(String[] args) {
        Car car = new Car();
        //레퍼런스 변수는 대문자로 시작 Car 타입의 변수에요

        int n = 0;
        // 소문자로 시작하는 애들은 일반변수 (primitive)기본변수라고 부름
        // 참조변수는 객체의 주소값을 저장: 객체의 주소값을 알면 접근 가능하다
        // 변수타입이 주소값을 제한한다
        // Car car 는 Car 클래스로 만들어진 객체주소값을 저장 할 수 있다
        // new 는 객체생성때 쓰는 키워드이다 Car()는 기본생성자를 호출한것
        // 모든생성자는 객체 생성 할 때만 호출이 가능. 그 이후에는 호출 할 수 없다.
        //객체의 능력을 사용하고 싶을 때 주고값. 을 이용


        car.color="Red"; // String 타입의 객체주소값만 저장
        //대문자로 시작하는 레퍼런스 변수가 주소값 저장 할 수 있다
        // 멤버필드는 객체안에 값을 저장 할 수 있다









    }
}
