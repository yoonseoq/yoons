package com.seok.TV.noneioc;

import com.seok.TV.HanilWoofer;
import com.seok.TV.Speaker;
import com.seok.TV.Woofer;

public class HarmanSpeaker implements Speaker {
    private Woofer woofer;

    public HarmanSpeaker(){
        this.woofer=new HanilWoofer();
    }

    public void speakerSound(){
        System.out.println("HarmanSpeaker: 야 야 야");
        woofer.baseSound();
    }
}
