package com.seok.String;

public class StringStudy {
    public static void main(String[] args) {

        String str1 = "tully's";
        String str2 = "coffee";

        String str3 =str1.concat(str2);
        System.out.println(str3);
        String str4 = str1+str2;
        System.out.println(str4);
        System.out.println(str3.equals(str4));

        String str6 = "abcdefghijklmnop";
        System.out.println(str6.substring(3));// 3번부터 끝까지 문자열 자르기
        System.out.println(str6.substring(3,8));//3번부터 시작해서 8번 인덱스 바로 전까지


        String str7 = "ArcanE";
        String str8 = "aRCanE";

        System.out.println(str7.equals(str8));
        System.out.println(str7.compareTo(str8));
        System.out.println(str7.compareTo("ArcanE"));// 하나도 안빼먹고 다 같을시 0
        System.out.println(str7.equalsIgnoreCase(str8));
        // 대소문자 다 무시하고 같은 부분인지

        int n = 10;
        String str9 = n+"K";
        String str10 = String.valueOf(n);// 모든타입을 문자열로 변경
        System.out.println(str9);
        System.out.println(str10);


        String lol= "league.of.Legend";
        System.out.println(".의 위치값: "+lol.indexOf("."));
        //왼쪽에서 오른쪽으로 가는 경로에서 찾은 .의 인덱스
        System.out.println(".의 위치값: "+lol.lastIndexOf("."));
        //오른쪽에서 왼쪽으로 가는 경로에서 찾은 .의 인덱스


        String str11 = "abcdefgcd";
        String str11result = str11.replace("cd","CD");
        System.out.println(str11result);
        System.out.println(str11.toUpperCase());// 전부 다 대문자로 바꿔줌
        System.out.println(str11result.toLowerCase());//전부 다 소문자로 바꿔줌









    }
}
