package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
//인터페이스 변수 선언과 구현 객체 대입
        Vehicle vehicle = new Bus();

        vehicle.run();
        //상위 개념에서 만든 객체에서는 하위 클래스 메소드에 접근 불가능
        //vehivle.checkFare();

        //Bus 타입으로 변환 후에는 Bus 클래스의 메소드 사용 가능
        Bus bus =(Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
