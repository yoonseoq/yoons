package com.green.seok.Abstract;

public abstract class AbstractStudy {
    /*
        class 키워드 앞에 abstract 키워드를 붙이면 추상클래스가 된다.
        추상클래스가 되면 객체화가 불가능하다. 오로지 부모역할만 한다.. 이제 무슨소리냐. 이 클래스는
        다른 클래스에 상속당해야 한다.

        class 앞에 abstract 붙이는 것은 선택사항이나
        .. 만약 추상메소드를 가진다면 선택이 아니라 필수이다.

        클래스긴의 공통적인 부분을 부모에 작성을 해서 상속받지 않도록 하기 위한것이다.
        그리고 추상메소드를 구현해야 하는 강제성이 존재한다. 추상메소드 구현은 implements
        implement 하고 바로 중괄호 때려서 구현해야 한다.

        추상메소드를 정의할때도 abstract 를 붙인다
        이런거는 선언부만 있고 구현부가 없다
    */

    public abstract void sum();

    public void multiply(int n1, int n2) {
        System.out.println(n1 * n2);
    }
    // 이렇게 추상클래스도 구현부가 있는 메소드를 가진다.
}

abstract class ImplementsStudy2 extends AbstractStudy {

}

class ImplementsStudy extends AbstractStudy {
    @Override // 오버라이딩은 부모 메소드를 쓸때 사용. 뭔가 에러 터질라고 하면 여기서 빨간줄뜸
    public void sum() {
        System.out.println("숫자더함");
    }
}

class AbstractStudyTest{
    public static void main(String[] args) {
        AbstractStudy as= new ImplementsStudy();
        as.sum();




        //as.sum();


    }
}


