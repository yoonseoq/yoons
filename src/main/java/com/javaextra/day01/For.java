package com.javaextra.day01;

public class For {
    public static void main(String[] args) {
        int dan=(int)(Math.random()*8.0)+2;
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d\n",dan,i,dan*(i));
        }
    }
}
class For2 {
    public static void main(String[] args) {
        //int dan=(int)(Math.random()*8)+2;
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <=9 ; j++) {

            System.out.printf("%d x %d = %d\t",j,i,j*i);
            }
            System.out.println();
        }
    }
}
