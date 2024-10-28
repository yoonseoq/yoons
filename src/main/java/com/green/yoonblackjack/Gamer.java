package com.green.yoonblackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    /*
    카드 객체 주소값 여러개를 저장 할 수 있어야 한다.
    배열리스트를 사용
    멤버필스 선언 변수명은 카드이다.
     */
    protected final List<Card> cards;
    protected int point;

    public Gamer(){
        cards= new ArrayList();
    }

    public void receiveCard(Card c1){//카드를라스에서 소환한 객체c1
        this.point+=switch (c1.getDenomination()){
            //숫자가 들어올때마다 점수가 계산이 됨
            case "A"->1;
            case "J","Q","K"->10;
            default -> Integer.parseInt(c1.getDenomination());
            //그냥 숫자값은 정수화 시켜줌

        };

            String str ="10";//10이라는 문자열 호출되면
            int Val = Integer.parseInt(str);//정수로 바꿈
            cards.add(c1);//현재 받은 카드를 리스트에 추가하는것.

    }

    public void showYourCards(){
        for(Card c: cards){
            System.out.println(c);
        }
        System.out.println(cards);
    }


    public List<Card> openCard(){
      return cards;
    }

    public int getPoint(){
        return point;
    }
}
