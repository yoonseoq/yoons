package com.seok.game;

public class Vayne {
    public static void main(String[] args) {
        Enemy.attacked();
        Enemy.attacked();
        Enemy.attacked();
        Enemy.showhp();
        Enemy.attacked();
        Enemy.attacked();
        Enemy.attacked();
        Enemy.showhp();
    }
}
class Enemy{
    static int count;
    static int maxhp=3000;
    static int hp=maxhp;
    static void attacked(){
        count++;

        System.out.println(count);
    }
    static void showhp(){

    if(count%3==0){
        hp=hp-(int)(0.1*maxhp);
    }
        System.out.println(hp);
    }
}

