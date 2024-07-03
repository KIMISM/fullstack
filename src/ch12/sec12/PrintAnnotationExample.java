package ch12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) throws Exception {
        //서비스 클래스의 메소드들을
        Method[] declaredMethods = Service.class.getDeclaredMethods();
        for (Method method : declaredMethods) {
            //PrintAnnotation 가져오기
            PrintAnnotation printAnnotation = method.getAnnotation
                    (PrintAnnotation.class);
            //설정 정보를 이용해서 메소드 위에 선 출력
            printLine(printAnnotation);
// 실제
            method.invoke(new Service());

            printLine(printAnnotation);
        }
    }
    public static void printLine(PrintAnnotation printAnnotation) {
        if (printAnnotation != null) {
            int number = printAnnotation.number();
            for (int i = 0; i < number; i++) {
                //printAnnotation 내에 넣어둔 value 속성 값 얻기
                String value = printAnnotation.value();
                //number의 수만큼 value 값을 출력
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
