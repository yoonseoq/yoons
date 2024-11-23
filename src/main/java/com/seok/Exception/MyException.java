package com.seok.Exception;


import java.util.Scanner;

public class MyException {
    public static void main(String[] args) {
        System.out.println("나이입력");
        try {
            int age = readAge();
            System.out.printf("입력된 나이: %d",age);
        }catch (ReadAgeException e){
            System.err.println(e.getMessage());//에러 메세지 보내줌
        }
    }

    public static int readAge() throws ReadAgeException{

        Scanner scan = new Scanner(System.in);//콘솔에 입력을 위한 스캐너임
        int age= scan.nextInt();//입력된 것을 age에다가 넘김
        if (age<0){ // 만약에 나이가 음수일경우
            scan.close(); // 스캐너 닫아버림.
            throw new ReadAgeException();
            // 그리고 호출부에다가 예외를 던져버림. 너가 불렀으니까 니가 처리해
        }
        System.out.println(">>if문 끝>>");
        scan.close();
        return age;

    }
}
class ReadAgeException extends Exception{
    ReadAgeException(){
    super("유효하지 않은 나이가 입력됨");
    }
}
