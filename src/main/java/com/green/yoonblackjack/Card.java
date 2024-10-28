package com.green.yoonblackjack;

public class Card {

    /*
    이 카드클래스의 존재 이유는 카드타입을 설정하기 위한 것이다.
    카드에 대한 멤버필드는 두개이다. 고정값인 패턴과 숫자.
     */
    private final String pattern;//무늬
    private final String denomination;//무늬
    /*
    프라이빗 값을 넣을 떄 setter메소드나 생성자를 사용
    값을 빼낼떄는 getter메소드를 사용한다
     */
    Card(final String pattern,final String denomination){//카드생성자 만들어주기

        /*
        this.을 오ㅐ 쓰는가?
        멤버필드와 매개변수가 동일할때 구분짓기 위해서.
         */

        this.pattern=pattern;
        this.denomination=denomination;
    }


    public String getPattern(){
        return pattern; //어딘가 반환할듯
    }
    public String getDenomination(){
        return denomination; //숫자값 반환
    }
    public String toString(){//toString 이란 객체를 문자열로 표현하기 위해 존재한다.
        return String.format("%s(%s)",pattern,denomination);
        //카드 출력할때 문양(숫자) 형식으로 함
    }

}
