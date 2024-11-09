package com.green.seok.TV.ioc;

import com.green.seok.TV.*;

public class TVFactory {
    private static TVFactory tvFactory;
  // 객체는 하나만 만들어서 돌려쓴다.
    //유일한 인스턴스를 반환
    //스태틱을 넣는 이유는 공간은 하나로 고정이고 같은값을 그대로 유지하기 위함
    public static TVFactory getInstance(){
           if (tvFactory==null){
               tvFactory=new TVFactory();
           }
           return tvFactory;
    }
    private TVFactory(){

    }


    public TV factory(String tvName, String speakerName, String wooferName){
        Woofer woofer=switch (wooferName){
            case "hanil" -> new HanilWoofer();
            case "marten" -> new MartenWoofer();
            default -> null;
        };
        Speaker speaker=switch (speakerName){
            case "generic" -> new GenericSpeaker(woofer);
            case "Bose" -> new BoseSpeaker(woofer);
            default -> null;
        };
        return switch (tvName){
            case "lg"->new LgTV(speaker);
            default -> null;
        };
    }
}
