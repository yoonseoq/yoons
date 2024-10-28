package com.green.yoonblackjack;

public class CardDeck {
    //Card의 객체주소값 52개를 저장 할 수 있어야 한다.
    private final Card[] cards;
    //카드 객체 주소값,Card[]배열은 이전에 카드클래스의 카드객체를 담고 있으며
    // 따라서 cards배열은 카드타입을 표현하고 카드게임에서 카드관련한 로직을 처리하는데 사용됨
    private final String[] patterns;//4개의 패턴을 모은 패턴배열

    private int selectedIdx=0;
    //외부에 줘야 할 카드 인덱스 값이다. 카드가 빠져나가묜 null이 된다

    public CardDeck(){
        cards = new Card[52];//카드배열은 52개의 인덱스가 있다
        patterns = new String[]{"Diamond","Heart","Spade","Clubs"};
        //이렇게 네개의 방이 있다고 설명 할 수 있다,

        int idx=0;//인덱스값
        for (int i = 0; i < patterns.length; i++) {//일단 무늬방 4개에 각각의 방에 13개의 숫자가 있다
            String pattern=patterns[i];
            for (int j = 1; j <= 13; j++) {//1~13까지 숫자
                String denomination=getDenomination(j);//getDenomination 메소드 호출
                cards[idx++]=new Card(pattern,denomination);
                //cards[idx++]=new Card(patterns[i],getDenomination(j));
                /*
                이거 이런식으로 for문을 만들어 버린다면
                아무리 denomination에 예외를 설정해놔도 배열이 성립이 안되는거?

                yes!! 왜냐하면 카드배열의 크기는 각 방에 13개씩으로 초기화 되어 있지만
                cards[idx++]=new Card(pattern,denomination);
                cards[idx++]=new Card(patterns[i],getDenomination(j));
                이런식으로 되면 총 26개의 인덱스가 추가되므로 배열범위 초과 에러.
                ArrayIndexOutOfBoundsException 이 발생한다.
                 */
            }
        }
        shuffle();//배열이 다 되었으면 한번 섞어보자
    }
    //자 이제 덱을 섞어보자
    private void shuffle(){
        for (int i = 0; i < cards.length; i++) {
            int rIdx=(int)(Math.random()*cards.length);//랜덤인덱스
            Card tmp=cards[i];//해당 인덱스의 값을 임의의 카드타입의 배열  tmp로 옮긴다.
            cards[i]=cards[rIdx];//랜덤 인덱스 값을 해당 인덱스에 넣어준다
            cards[rIdx]=tmp; //그리고 넣어놨던 인덱스값을 랜덤 인덱스에 넣어준다.


        }
    }
    public String getDenomination(int n){
     if(n<1||n>13){
         throw new IllegalArgumentException("Invalid denomination: " + n);
     }
     switch (n){
         case 1:return "A";
         case 11:return "J";
         case 12:return "Q";
         case 13:return "K";
         default:return String.valueOf(n);//String.valueOf(n) 기존의 숫자열 값을 문자열화 시킨다
     }
    }
    public Card draw(){
        Card selectedCard=cards[selectedIdx];
        cards[selectedIdx]=null;
        selectedIdx++;
        return selectedCard;//뽑은카드는 줘버린다.
    }
    public void checkCards(){ //카드가 뭐뭐있는지 보여주세요.
        for(Card c:cards){//카드배열의 카드타입 객체"(패턴)숫자"
            System.out.println(c);
        }
    }
}
