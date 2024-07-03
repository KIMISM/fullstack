package ch12.sec12;

import lombok.val;

public class Service {
//    설정값이 없으므로 value="-",number=15로 설정됨
    @PrintAnnotation
    public void method1() {
        System.out.println("실행 내용1");
    }
    //기본값이 ㄴvalue만 설정이므로 value ="*",number =15로 설정됨
    @PrintAnnotation("*")
    public void method2() {
        System.out.println("실행 내용2");
    }
    //value="#",number=20으로 설정됨
    @PrintAnnotation(value ="#", number = 20)
    public void method3() {
        System.out.println("실행 내용3");
    }
}
