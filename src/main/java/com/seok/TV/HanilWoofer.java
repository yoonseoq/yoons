package com.seok.TV;

public class HanilWoofer implements Woofer {
    @Override
    public void baseSound(){
        // 우퍼를 상속받았으므로 우퍼에 달려있는 이 메소드를 가져와야함
        // baseSound()
        System.out.println("Hanil Woofer: 웅! 웅! 웅!");
    }
}
