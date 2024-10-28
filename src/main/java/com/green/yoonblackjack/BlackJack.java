package com.green.yoonblackjack;

public class BlackJack {//실전게임
    public static void main(String[] args) {
        System.out.println("ゲームスタート");
        //일단 지금까지 만든 모든 클래스들 생성자로 소환해보자.

        CardDeck cd=new CardDeck();
        Rule rule=new Rule();
        Dealer dealer=new Dealer();
        Gamer gamer=new Gamer();


        //일단 번갈아가면서 게이머와 딜러가 2장의 카드를 받을 수 있게하자.
        for (int i = 0; i < 2; i++) {
            gamer.receiveCard(cd.draw());
            dealer.receiveCard(cd.draw());
        }
        dealer.needMoreCard(cd);//근데 딜러의 점수가 모잘라면 ワンモーアーカード
        dealer.showYourCards();
        gamer.showYourCards();
        rule.getWinner(dealer,gamer);
        System.out.println("一旦ここまでお終い！");
    }
}
