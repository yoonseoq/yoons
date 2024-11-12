package com.javaextra.day02;

public class Test3 {
    public static void main(String[] args){
        MyRandom.random();

        MyRandom mr = new MyRandom();

        mr.abs(30);

        //MyRandom.abs(10);
        int v = mr.abs(40);
        System.out.println(v);

        int v2 = mr.abs(-40);
        System.out.println(v2);

        MyRandom.printGugudan(5);

    }
}

class MyRandom{
    public int abs(int n){
        return (n<0?-n:n);
    }
    public static void random(){
        int n= (int)((Math.random())*5)+1;
        System.out.println(n);
    };

    public static void printGugudan(int n){
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%dX%d=%d\n",n,i,n*i);
        }
    }

/*abstract class MyRandom {
   abstract void random();
   // 추상메소드를 하나라도 가져야 추상메소드가 구현이 된다

 */

}

