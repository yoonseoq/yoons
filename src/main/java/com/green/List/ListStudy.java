package com.green.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListStudy {
    public static void main(String[] args) {
        List list=new ArrayList();//alt enter 두번누르면  임포트됨
        /*
        List 변수명=new ArrayList();
        List 변수명=new linkedList();
        이렇게 작성이 가능하다. 즉 나를 상속받는 누군가가 있다.
         */


        //임포트 되어있는곳 아니면 됨 아까는 java플젝에 임포트 되어서 안됨. toString 값이 오버라이딩 됨
        list.add(10);//0번 인덱스에 들어감
        list.add(20);//1번방에 들어감
        ArrayList list1=(ArrayList)list;
        /*
        부모타입 List 의 객체 list를 자식타입으로 명시적 형변환함
        지금까지 list배열에 있던 인덱스값들이 list1에 다 옮겨감.
         */
        list1.add(30);//2번방에 들어감
        list1.add("（笑笑）");//3번방에 들어감
        //잠시만요 왜 정수만 넣다가 문자열 타입으 ㄹ넣으시나요? 오브젝트 타입은 아무거나 다 들어 갈 수 있다

        int[] arr=new int[3];//3개의 방의 정수배열을 만들어보자

        Object[] arr2=new Object[4];
        arr2[0]=10;
        arr2[1]="^오^";

        int val0=(int)list1.get(0);
        System.out.println(val0);
        //.get(0)은 Array리스트 자체에 있는 메소드이다. 해당 인덱스의 값은 불러내는역할
        String val3=(String) list1.get(3);
        int val2=(int) list.get(2);
        System.out.println(val2);
        System.out.println(val3);

        /*
        아니 근데 왜 list1에 값 넣었는데 list가에다 .get()을 해도 될까요
        왜냐하면 모두 동일한 객체를 참조하고 있기 때문이다.
        ArrayList list1=(ArrayList)list; 이 코드를 보면 list1 은 list를 형변환 한거기 때문
         */

        System.out.println(arr2);
        //[Ljava.lang.Object;@4c873330 이게뜨는이유. Arrays.toString()작업을 안해서
        System.out.println(Arrays.toString(arr2));//[10, ^오^, null, null]

        list.get(0);

        System.out.println(list);//두개 다 서로 공유하는 것이다.
        System.out.println(list1);
        //Arrays.toString()이런거 안써도 바로 배열이 된다.
        // ArrayList 자체에 심겨져 있기 때문



    }
}
