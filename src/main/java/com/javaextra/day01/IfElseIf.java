package com.javaextra.day01;

public class IfElseIf {
    public static void main(String[] args) {
        int score=(int)(Math.random()*101);
        System.out.println(score);
        if (score>=90){
            System.out.printf("%d,grade is A\n",score);
        }else if (score>=80){
            System.out.printf("%d,grade is B\n",score);
        }else {
            System.out.printf("%d,grade is C! get out!\n",score);
        }


        switch (score){

            case 100:
                System.out.println("A++++++++++");

        }



    }
}
