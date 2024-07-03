package ch09.sec04.exam01;

public class A {
    //로컬 클래스는 생성자나 메소드 내에서 선언된 클래스
    A(){
        class B{}

        B b = new B();
    }
    void method() {
        //로컬 클래스 선언
        class B {}
        B b = new B();
    }
}
