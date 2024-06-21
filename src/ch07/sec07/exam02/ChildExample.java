package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        
        Child child = new Child();
        
        Parent parent = child;
        
        parent.method1();
        parent.method2();
        //부모 타입은 자식 타입으로 자동 변환되지 않기 때문에 컴파일 에러
    }
}
