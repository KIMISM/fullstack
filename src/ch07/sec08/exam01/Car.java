package ch07.sec08.exam01;

public class Car {
    //has-a 관계, 클래스가 다른 클래스 객체를 가지고 있다
    public Tire tire;

    public void run() {
        //tire 필드에 대입된 객체의 roll() 메소드 호출
        tire.roll();
    }
}
