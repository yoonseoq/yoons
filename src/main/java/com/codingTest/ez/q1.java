package com.codingTest.ez;

import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        Solution s=new Solution();
        int [] arr={1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(s.solution(arr)));
    }
}
class Solution {
    public int[] solution(int[] arr) {

        int l=arr.length;
        int tmp=1;

        while (tmp<l){
            tmp *=2;
        }

        //일단 배열길이를 만들어 놓고 그 배열만큼 정답배열에 넣음
        /*
        코드에서 발생하는 오류는 answer[i]=arr[i]; 부분에서 IndexOutOfBoundsException입니다.
        arr 배열의 길이보다 answer 배열의 길이가 더 길기 때문에 arr[i]가 arr의 인덱스 범위를 넘어설 수 있습니다.
        이를 방지하려면 arr의 길이까지만 값을 복사해야 합니다.
        아래와 같이 for 루프에서 i가 arr의 길이 l보다 작을 때까지만 반복하도록 수정하면 됩니다:
         */

        int[] answer = new int[tmp];

        for (int i = 0; i < l; i++) {
            answer[i]=arr[i];
        }


        return answer;
    }
}