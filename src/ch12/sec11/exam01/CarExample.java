package ch12.sec11.exam01;

public class CarExample {
    public static void main(String[] args) throws Exception {
//클래스 가져오기1.class static 필드 이용
        Class clazz = Car.class;
        //클래스 가져오기2. 클래스 문자열 이용
        //Class clazz = Class.forname("ch12.sec11.exam01.Car");
        //클래스 가져오기3.

        System.out.println("패키지: " + clazz.getPackage().getName());
        System.out.println("클래스 간단 이름: " + clazz.getSimpleName());
        System.out.println("클래스 전체 이름: " + clazz.getName());
    }
}
