package com.green.yoonblackjack;

import java.util.List;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd=new CardDeck();
        cd.checkCards();
        System.out.println(cd.getDenomination(1));//해당 숫자가 카드에선 어떻게 표현이 되는지
        System.out.println("-------------------------------------------------");
        Card c=cd.draw(); //카드를 플레이어한테 주고 준것을 카드타입 객체 c에다 준다
        System.out.println(c);//준 카드값을 보여준다.

        //cd.checkCards();//그 카드를 뺀 배열을 함 보자. 빠진카드는 null로 표시되어 있다

    }
}
class CardTest2{//gamer
    public static void main(String[] args) {
        CardDeck cd =new CardDeck();
        Card c1=cd.draw();//일단 카드하나 드로우 하고 c1값에 넘겨준다.
        // 이제부터 드로우 할때마다 c1에 그 카드값이 들어간다
        Gamer gamer=new Gamer();
        //Gamer 클래스 이름의 생성자를 호출하고 Gamer 타입의 gamer 객체생성.
        //gamer 객체를 통해 Gamer 클래스의 메서드와 속성에 접근가능하다.

        gamer.receiveCard(c1);//드로우한 카드를 받아내기.
        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        //에러도 해결했겠다, 카드 뿌리자
        gamer.showYourCards();//무슨카드 받아냈노?
        // Card c1=cd.draw();는 첫호출이니까
        System.out.println(gamer.getPoint());//각 카드마다 받은 포인트
        List<Card> list = gamer.openCard();
        /*
        게이머가 받은 카드를 리스트화 시켜서 가지고 있는것.
        showyourcard 메소드와 다르게 콘솔에 노출시키지 않음
         */
    }
}
class CardTest3{//dealer
    public static void main(String[] args) {

        CardDeck cd=new CardDeck();//이거는 기본적으로 써주자, 그리고 딜러 클래스 만들어올게
        Dealer dealer= new Dealer();
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.showYourCards();
        System.out.println(dealer.getPoint());
        dealer.needMoreCard(cd);//16점 이하인경우 카드 하나 더 가져옴
        dealer.showYourCards();
        System.out.println(dealer.getPoint());
    }
}
class CardTest4{//게임 룰이 잘 작동 하는지
    public static void main(String[] args) {
        Rule rule=new Rule();
        Gamer gamer=new Gamer();
        Dealer dealer=new Dealer();
        rule.getWinner(null,null);
    }
}