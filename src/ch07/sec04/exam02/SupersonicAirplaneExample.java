package ch07.sec04.exam02;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();

        sa.takeOff();
        //static 값은 클래스명으로 접근.
        //flyMode가 SUPERSONIC으로 변경됐으므로
        sa.fly();
        sa.flyMode=SupersonicAirplane.SUPERSONIC;

        sa.fly();
        sa.flyMode=SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
