package com.seok.Static;

public class PrimitiveVsReference {



}

class ADC{
    public static void main(String[] args) {

        int hp = 10;//여기있는 멤버필드는  Supporter 와 다른부분
        yumi(hp);
        System.out.println("내피통: "+hp);


        Supporter heal = new Supporter();
        heal.hp= 50;
        System.out.println("meet yumi: "+heal.hp);
        yumi(heal);
        System.out.println("got healed by yumi: "+heal.hp);
        System.out.println(hp);
    }

    public static void yumi(int hp){

        hp=100;
    }

    public static void yumi(Supporter heal){
       // heal = new Supporter();

        heal.hp=100;
    }
}



class Supporter{
    int hp; // 멤버필드
}