package com.green.seok.TV.ioc;

import com.green.seok.TV.Speaker;
import com.green.seok.TV.Woofer;

public class BoseSpeaker implements Speaker {
    private Woofer woofer;

    public BoseSpeaker(Woofer woofer){
        this.woofer=woofer;
    } // 왜 이건 매개변수가 들어갈까>? 왜냐하면 위에서 직접 값을 넣어야 하기때문

    @Override
    public void speakerSound() {
        System.out.println("BoseSpeaker: 짱 짱");
        woofer.baseSound();
    }
}
