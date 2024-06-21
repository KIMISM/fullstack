package ch07.sec03.exam01;

//Phone 클래스의 자식 클래스
public class SmartPhone extends Phone {


    //자식 생성자 선언
    public SmartPhone(String model, String color) {
        super();
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }

    }

