package ch17.sec08;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};

        //잘못 작성한 경우
        //최종 처리가 없으므로 동작하지 않음
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
//                peek: 요소를 반복하며 기능을 처리함, 중간 처리기능
                .peek(a -> System.out.println(a));

        //중간 처리 메소드 peek()을 이용해서 반복 처리
        //최종 처리 기능이 있으므로 잘 동작함
        int total = Arrays.stream(intArr)
                .filter(a -> a% 2 == 0)
                .peek(n -> System.out.println(n))
                //sum: 요소들의 합계를 계산해서 int로 반환, 최종 처리 기능
                .sum();
        System.out.println("총합: " + total + "\n");

        //최종 처리 메소드 forEach()를 이요해서 반복 처리
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
//                forEach: peek와 하는 역할은 동일하지만 forEach는 최종 처리 기능이다
                .forEach(n -> System.out.println(n));
    }
}
