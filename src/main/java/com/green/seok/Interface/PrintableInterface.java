package com.green.seok.Interface;

public class PrintableInterface {
    public static void main(String[] args) {

        Printable p=new PrintableImpl();
        //Printable p2=new Printable();
        p.print("ddd");
        System.out.println(p.NUM);
        System.out.println(Printable.NUM);

    }
}
interface Printable {
    int NUM=10;
    void print(String doc);
}

class PrintableImpl implements Printable{
   @Override
    public void print(String doc){
       System.out.println(doc);
       System.out.println(NUM);
   }

}