package com.seok.TV.noneioc;

import com.seok.TV.Speaker;
import com.seok.TV.TV;

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
