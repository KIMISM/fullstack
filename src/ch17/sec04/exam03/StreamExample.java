package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
    public static int sum;

    public static void main(String[] args) {
        //range : 범위값 중 끝값을 포함하지 않는다
        //rangeClosed : 범위값 중 끝값을 포함한다.
        IntStream stream = IntStream.rangeClosed(0, 100);
//        stream을 돌면서 sum에 요소를 더해준다
        stream.forEach(a -> sum += a);
        System.out.println("총합: " + sum);
    }
}
