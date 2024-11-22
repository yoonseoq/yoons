package com.javaextra.day03;

public class Aespa {
    String name ;
    String nationality;
    String birth;
    String position;

    void sing(){
        System.out.println(name +"(이)가 노래를 부른다.");
    }
    void dance(){
        System.out.println(name + "(이)가 춤을 춘다.");
    }
    void from(){
        System.out.printf("%s(은)는 %s출신 이다.\n",name,nationality);
    }

    void rap(){
        System.out.printf("%s인 %s이(가) 랩을 한다\n",position,name);
    }
}
class AespaTest{
    public static void main(String[] args) {
        Aespa kar = new Aespa();
        kar.name="카리나";
        kar.sing();

        Aespa ning = new Aespa();
        ning.name="닝닝";
        ning.nationality="중국";
        ning.from();

        Aespa gell = new Aespa();
        gell.name="지젤";
        gell.position="메인래퍼";
        gell.rap();

        Aespa win = new Aespa();
        win.name="윈터";
        win.dance();

    }
}