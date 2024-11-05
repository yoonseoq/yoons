package com.green.seok;

public class StaticStudy {
    public static void main(String[] args) {
        StaticNumberBox.n1=10; // 굳이 객체화 안시켜도 클래스 끌고와서 변수 초기화 가능
        StaticNumberBox.n2=10; //스태틱이 되어있는 StaticNumberBox 의 n1,n2
        StaticNumberBox.sum(1,2);
        StaticNumberBox.sum(11,2);
        //메소드도 클래스.메소드 형식으로 하면 무적권 스태틱 메소드 이다

        new StaticNumberBox().hi();
        //<<.hi() 이 메소드는 static 이 아니라서 객체화해야함

        new StaticNumberBox().sum2(5,4);

        StaticNumberBox.sum3(5,5);

        NonStaticNumberBox nnb = new NonStaticNumberBox();
        //스태틱이 안되어있는 메소드는 클래스를 객체화 해야함

        nnb.nsum();
        NonStaticNumberBox.nsum2();
        System.out.println(nnb.nsum3(2,2));
        nnb.nsum4(8,2);




    }
}
class StaticNumberBox{
    //스태틱이 들어간 변수와 아닌변수를 비교해보자

    static int n1;
    static int n2;
    int n3;
    int n4;

    static void sum (int n1,int n2){ //스태틱 보이드 메소드
        System.out.println(n1+n2);
    }
    void hi(){
        System.out.println("hi");
    }
    void sum2(int n3,int n4){
        System.out.println(n3+n4);
    }
    static void sum3 (int n3,int n4){ //스태틱 보이드 메소드
        System.out.println(n3+n4);
    }
}
class NonStaticNumberBox{
    int n1;
    int n2;
    static int n3;
    static int n4;


    void nsum(){
        System.out.println(n1+n2);
    }
    static void nsum2(){
        System.out.println(n3+n4);
    }
    int nsum3(int n1,int n2){
        return n1+n2;
    }
    int nsum4(int n3,int n4){
        return n3+n4;
    }



    static void bye(){//스태틱
        System.out.println("bye");
    }
    void soso(){//스태틱
        System.out.println("soso");
    }
}
