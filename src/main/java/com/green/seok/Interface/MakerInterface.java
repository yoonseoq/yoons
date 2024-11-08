package com.green.seok.Interface;

public class MakerInterface {
    public static void main(String[] args) {

        Report0 rpt0= new Report0("feelyou");
        Report1 rpt1=new Report1();
        Report2 rpt2=new Report2();
        Report3 rpt3=new Report3();

        Printer prn = new Printer();
        prn.printContents(rpt0);
        prn.printContents(rpt1);
        prn.printContents(rpt2);
        prn.printContents(rpt3);
    }
}
// 모든 인터페이스는 암묵적으로 오브젝트 글래스의 메소드를 암묵적으로 상속을 받는다.
interface Printable2{
    String getContents();
}
/*
    public abstract String getContents(); 이것이 원형이다.
     이 인터페이스를 구현하는 클래스는
    무조건 이 메소드를 오버라이드하여 String타입의 값을 반환하여야 한다.
 */

interface Upper {

}
interface Lower {

}
class Report0 implements Printable2,Upper{
    // printable2를 상속받아서 getContents 를 구현해야한다. 무.조.건

    private String contents;
    //

    Report0(String contents){
        this.contents= contents;
        /*생성자에서 필드 초기화
          필드를 초기화하지 않으면 필드값이 기본값 (예: int는 0, String은 null)으로 설정이 된다.
           그래서 초기화는 객체가 올바르게 작동하도록 하기위함
           그리고 컴파일 오류나 런타임 오류발생을 방지하기 위함. 즉 잘못된값 방지
           클래스목적에 맞는 데이터설정
         */
    }
    @Override
    public String getContents(){
        return contents;
        /* 반환값이 contents인 이유는

        interface Printable2{
           String getContents();
        }
        에서 인터페이스의 메소드는 String 타입의 값이 무조건 반환되어야 한다.
        그리고 레포트0에서의 멤버필드에서는 printable2를 구현했고 딸려오는 메소드를 선언된 변수
        private String contents 라는 변수가 있어서 contents라는 이름으로 반환해야한다
         */
    }

}
class Report1 implements Printable2,Lower{
    public String getContents(){
        return "Simple Funny News!";
    }
}

class Report2 implements Printable2,Upper{
    public String getContents(){
        return "Simple Funny News!";
    }
}

class Report3 implements Printable2,Upper,Lower{
    public String getContents(){
        return "Simple Funny News!";
    }
}

class Printer{
    public void printContents(Printable2 doc){
        if (doc instanceof Upper){

            /*
             instanceof란 doc이 Upper를 구현한 객체인지 확인하고
             true 이면 getContents()를 호출하고 그 값을 대문자로 만들어준다
            */

            System.out.println(doc.getContents().toUpperCase());
        } else if (doc instanceof Lower) {
            System.out.println(doc.getContents().toLowerCase());
        }else {
            System.out.println("GoodGame");
        }
    }
}