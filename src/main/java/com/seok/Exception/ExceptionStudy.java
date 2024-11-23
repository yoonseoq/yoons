package com.seok.Exception;

public class ExceptionStudy {
    public static void main(String[] args) {

        String str = "123";
        int inVal = myParseInt(str);
        System.out.println(inVal+1);//아예 숫자가 되어서 1이 더해짐

        String str1 ="123a";
        int inVal1 = myParseInt(str1);
        // 순수 정수가 아니라 a가 섞여있는경우
        System.out.println(inVal1);//0이 나옴
        System.out.println(inVal1+1);//1이 나옴

       // div(10,2)=0;
        // 오ㅐ 빨간줄이 뜰까요. unhandled exception 이다.
        /*
        해당메소드는 예외를 던지고 호출부에서 받았기에  여기서 try-catch로 이해해야 한다.
         */
        int r =0;
        try {
            r=div(10,0);
        } catch (ArithmeticException e) {//수학적 예외를 잡아버리자
            System.err.println("what's problem?"+e.getMessage());
            r =-1;
        }
        System.out.println("r:"+r);
    }

    static int div(int n1,int n2) throws ArithmeticException{
        // 수학적 에러 발생시 호출한곳으로 에러를 던짐. 예외를 던지면 어디선가는 해결해야함
        return n1/n2;
    }

    static  int myParseInt(String str){
        try {
            return Integer.parseInt(str);//문자열 타입을 정수하 시킴 다만 숫자만 있는경우
        }catch (Exception e){
            return 0; // 예외를 터트리기 싫어요.
        }
    }

}
