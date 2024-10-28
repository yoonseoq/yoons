package com.green.yoonblackjack;

//딜러는 포인트가 16점 이하면 카드를 하나 더 받는다.
public class Dealer extends Gamer {//딜러는 게이머의 특성을 가지고 있다.

    public void needMoreCard(CardDeck cd) {
        if (point <= 16) {
            receiveCard(cd.draw());
            //이 메소드 내에서만 새로운 카드덱을 호출해서
        }
    }
}
    /*
    public void needMoreCard(){
        CardDeck cd=new CardDeck();
        if(point<=16){
            receiveCard(cd.draw());
            //이 메소드 내에서만 새로운 카드덱을 호출해서
        }
    }

    public  void needMoreCard(CardDeck cd) {
        //16점 이하면 카드 하나 더 받는다.


        if(point<=16){

            receiveCard(cd.draw());
        }
    }
     */
//여기 두개가 뭔 차이인가.
// needMoreCard 메소드 스코프에서 CardDeck을 객체화한다면 그 카드덱은 메소드 호출하고 없어질수도 있다,
// 즉 새로운 카드덱을 까는것이다. 그러면 중복되는 카드가 나올수도 있다
// 대신에 매개변수에 카트덱 타입의 cd를 매개변수로 한다면
// 기존에 있는 카드덱에서의 값을 불러오기에 게임의 흐름에 방해를 하지 않는다.
