package ch13.sec02.exam03;

public class Box<T>{
    public T content;
//Box의 내용물이 같은지 비교
    public boolean compare(Box<T> other){
        //현재 객체의 content와 파라미터로 받아온 객체의 content를 비교해서
        //같으면 true,틀리면 false 리턴
        boolean result = content.equals(other.content);
        return result;
    }
}
