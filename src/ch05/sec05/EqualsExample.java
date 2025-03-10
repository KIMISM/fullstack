package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";
        //같은 문자열은 기본적으로 같은 주소값을 가리킨다.
        //따라서 주소값을 비교하는 ==의 경우 true가 나온다
        if(strVar1 == strVar2){
            System.out.println("strVar1과 strVar2는 참조가 같음");
        }else{
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }
           if(strVar1.equals(strVar2)) {
               System.out.println("strVar1과 strVar2는 문자열이 같음");
           }
        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if(strVar3 == strVar4){
            System.out.println("strVar3과 strVar4는 참조가 같음");
        }else{
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }
        if(strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4는 문자열이 다름");
        }
        }
    }

