package com.green.seok.TV.ioc;

import com.green.seok.TV.Speaker;
import com.green.seok.TV.Woofer;

public class GenericSpeaker implements Speaker {
    private Woofer woofer;

    public GenericSpeaker(Woofer woofer){
        this.woofer=woofer;
    } // 왜 이건 매개변수가 들어갈까>? 왜냐하면 위에서 직접 값을 넣어야 하기때문

    @Override
    public void speakerSound() {
        System.out.println("GenericSpeaker: 부드러운 소리");
        woofer.baseSound();
    }
}
