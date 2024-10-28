package com.green.List;

import java.util.ArrayList;
import java.util.List;

//리스트는 부모고 어레이 리스트랑 링크드 리스트는  상속받은 것들이다.
public class ListStudy2 {
    public static void main(String[] args) {
        /*
        Generic 제네릭이란 사용하면 실행시에 타입이 결정된다,
        제네릭"<>"을 사용하면 실행시에 타입이 결저ㅇ된다.
        제네릭을 사용한 클래스에 타입을 정의하지 않으면 그 타입은 오브젝트가 된다.
         */
        List<Integer> list = new ArrayList();//정수만 넣을 수 있게 미리박제

        list.add(10);//그냥 행 추가하고 더해주기
        list.add(20);
        list.add(30);

        int n1 = list.get(0);//형변환을 하지 않아도 된다.
        System.out.println("n1: " + n1);
        list.add(1, 30);//idx1번칸에 40을 넣고 기존에 있던칸은 한칸씩 뒤로 밀림

        System.out.println("list: " + list);//[10, 30, 20, 30] << ほら！
        System.out.println("list.size()" + list.size());
        list.remove(2);//해당 인덱스칸만 삭제함 그 값도 같이날라가버림

        System.out.println("list: " + list);//[10, 30, 30] << ほら！
        System.out.println("list.size()" + list.size());

        list.indexOf(30);
        //30의 값을 가지고 있는 인덱스 찾아내기
        //오른쪽에서부터 찾는다. 오른쪽에서부터 바로 첫번째!
        System.out.println("list.indexOf(30):" + list.indexOf(30));

        list.lastIndexOf(30);//30을 가지고 있는 마지막 인덱스
        System.out.println("list.lastIndexOf(30)" + list.lastIndexOf(30));

        list.clear();//배열 다 비워버리기
        System.out.println("Cleared List: " + list);
        System.out.println("Cleared List.size(): " + list.size());

        list.lastIndexOf(30);
        System.out.println("list.lastIndexOf(30)" + list.lastIndexOf(30));
         //list.lastIndexOf(30)-1 배열이 아예 없는경우는 -1이 나온다

    }
}
