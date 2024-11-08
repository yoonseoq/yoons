package com.green.seok.TV.noneioc;

import com.green.seok.TV.Speaker;
import com.green.seok.TV.TV;

public class SamsungTV implements TV {
    private Speaker speaker;

    public SamsungTV(){
        speaker=new HarmanSpeaker();
    }




    public void sound() {
        System.out.println("SamsungTV: 너 이재용이야? 카리나야?");
        speaker.speakerSound();
    }
}
