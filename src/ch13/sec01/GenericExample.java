package ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
        //Bos<String> box1 = new Box<String>();
        //앞에 타입이 들어가면 뒤에<> 안에 타입은 생략 가능 (타입 추론)
        Box<String> box1 = new Box<>();
        box1.content = "안녕하세요.";
        String str = box1.content;
        System.out.println(str);
//generic에 들어가는 타입은 무조건 참조 형식이어야 한다.
        //Bos<Integer> box2 = new Box<Integer>();
//        Box 생성시 타입 파라미터인  T 대신 Integer로 들어감
        Box<Integer> box2 = new Box<>();
        box2.content = 100;
        int value = box2.content;
        System.out.println(value);
    }
}
