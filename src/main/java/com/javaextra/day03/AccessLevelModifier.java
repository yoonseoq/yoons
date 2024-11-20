package com.javaextra.day03;

public class AccessLevelModifier {
    /*

    private: 클래스 내부에서만 접근가능 외부에서는 불가능
    default: private + 같은 패키지에 있다면 접근가능, 다른 패키지면 접근 ㄴㄴ  >> 실무에서 안씀
    protected: default + 상속관계라면 다른 패키지에 있어도 접근가능
    public: 모두 접근 가능, 접근을 막을 수 없다

    객체는 멤버필드를 모드 private 처리한다>> 은닉화 캡슐화
    private 한 멤버필드에 접근 할 수 있게 차선을 마련한다 (직접적으로 접근이 불가능하지만 차선으로 접근 할 수 있게 해준다.)
    잘못된 값이 들어가지 않게 할 수 있게끔 처리하고 싶을 때

    private 한 멤버필드에 값 넣는 방법 2가지 : 생성자, setter
    private 한 멤버필드에 외부에다가 전달하는 방법 1가지: getter

    멤버필드인데 public 처리하는 방법. private final

     생성자는 메소드랑 다른점 2가지 : 클래스명과 똑같다, 리턴타입 자체가 없다
    생성자가 하나도 없으면 컴파일러가 자동으로 기본생성자를 정의
     */
    public static void main(String[] args) {
    Constructor constructor=new Constructor("z");
    // 생성자도 메소드의 한 종류이기 때문에 오버로딩 가능
        /* 생성자 사용하는 이유.
        1.객체생성위해
        2.멤버필드 초기화(값을 넣기 위해서) 하기 위해서
         */

    }

}
class Constructor{
    public Constructor(){

    }
    public Constructor(String str){
        System.out.println(str);
    }
}
