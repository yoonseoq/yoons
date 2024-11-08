package com.green.seok.TV.ioc;

import com.green.seok.TV.HanilWoofer;
import com.green.seok.TV.Speaker;
import com.green.seok.TV.TV;
import com.green.seok.TV.Woofer;

public class IocTest { // 상부에서 미리 고정된 부속을 정함
    public static void main(String[] args) {
        Woofer woofer=new HanilWoofer();
        Speaker speaker=new BoseSpeaker(woofer);//위에 그 우퍼값 넣음
        TV tv =new LgTV(speaker);

        tv.sound();
    }
}

class IocTest2{
    public static void main(String[] args) {
        TVFactory tvFactory=TVFactory.getInstance();
        System.out.println(tvFactory);// 주소값만 불러옴
    }
}