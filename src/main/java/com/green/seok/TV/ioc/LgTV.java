package com.green.seok.TV.ioc;

import com.green.seok.TV.Speaker;
import com.green.seok.TV.TV;

public class LgTV implements TV {
   private Speaker speaker;

   LgTV(Speaker speaker){
       this.speaker=speaker;
   }

    @Override
    public void sound() {
        System.out.println("LgTV:두고봐라 갤럭시들");
        speaker.speakerSound();
    }
}
