package com.green.yoonblackjack;

public class Rule {
    private final int MAX_POINT=21;//기준점수
    public void getWinner(Dealer dealer,Gamer gamer){//딜러와 게이머 클래스에서 정보를 가져와야함!
        /*
        승자구하기: 딜러와 게이머의 점수를 가져온다.
        비긴경우:둘다 값이 같은 경우나 둘다 21을 초과한 경우
        딜러가 이긴경우:21을 안넘었다는 가정하에 게이머보다 점수가 높은경우, 혹은 게이머가 21을 넘어버린 상황
        아니면 게이머가 이김
         */

        int pointd=dealer.getPoint();//포인트를 반환해주는 리
        int pointg=gamer.getPoint();
        System.out.printf("Point of Dealer:%d,Point of Gamer:%d\n",pointd,pointg);
        if((pointd==pointg)||(pointd>MAX_POINT&&pointg>MAX_POINT)){
            System.out.println("Draw!!");
        } else if ((pointd<=MAX_POINT)&&(pointd>pointg||pointg>MAX_POINT)) {
            System.out.println("Dealer Win");
        }else {
            System.out.println("Gamer Win");
        }


    }
}
