package com.green.List;

public class MyArrayList {

    private int[] arr=new int[0];
    public MyArrayList(){
       // clear();
    }
    public void add(int n){
        int[] tmp=new int [arr.length+1];//기존의 배열크기보다 크게하는것
        tmp[arr.length]=n;//숫자n을 넣을때마다 그 숫자가 그때그때 인덱스에 들어감
        for (int i = 0; i < arr.length; i++) {
            tmp[i]=arr[i];//그전까지 값 추가. 기존의 원본에서 값을 복사한다
        }
        arr=tmp;
    }
    public int size(){
        return arr.length;
    }





















    @Override
    public String toString(){
        if(arr.length==0){
            return "[]";
        }
        StringBuilder sb=new StringBuilder("[");
        sb.append(arr[0]);//0번칸먼저 만들기
        for (int i = 1; i <arr.length ; i++) {
            sb.append(","+arr[i]);
        }
        sb.append("]");
        return sb.toString();
    }



}