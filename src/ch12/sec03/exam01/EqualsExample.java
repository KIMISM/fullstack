package ch12.sec03.exam01;

public class EqualsExample {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        //obj1과 obj2는 같은 Member타입이고id도 동일하다=>true
        if (obj1.equals(obj2)) {
            System.out.println("obj1과 obj2는 동등합니다.");
        }else{
            System.out.println("obj1과 obj2는 동등하지 않습니다.");
        }
        //obj1과 obj3는 id가 동일하지 않다=>flase
        if (obj1.equals(obj3)) {
            System.out.println("obj1과 obj3는 동등합니다.");
        }else {
            System.out.println("obj1과 obj3는 동등하지 않습니다.");
        }
    }
}
