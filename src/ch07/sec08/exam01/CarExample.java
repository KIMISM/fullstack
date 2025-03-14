package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        //Car 객체 생성
        Car myCar = new Car();
//동일하게 myCar의 run 메소드를 호출했지만 다 다른 값이 출력됨=> 다형성

        //Tire 객체 장착
        //Tire 하나를 생성해서 Car 클래스의 tire필드에 넣어줌
//        Tire의 run 메소드 호출
        myCar.tire =new Tire();
        myCar.run();

        myCar.tire =new HankookTire();
//        HankookTire의 run 메소드 호출
        myCar.run();

        myCar.tire =new KumhoTire();
        //KumhoTire의 run 메소드 호출
        myCar.run();
    }
}
