package ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        String name = "홍길동";
        String job = "프로그래머";
        System.out.println(name);
        System.out.println(job);
//""는 문자열을 표시하므로 직접 문자열에 추가하기 위해서ㅣ는 \를 붙여줘야함
        String str = "나는\"자바\"를 배웁니다.";
        System.out.println(str);
//위에 정의한 str 변수를 변경해줌
//        \t: 탭 하나를 추가
        str = "번호\t이름\t직업";
        System.out.println(str);
//\n: 줄바꿈
//        print는 줄바꿈 없이 출력,println은 출력 후 줄바꿈
        System.out.print("나는\n");
        System.out.print("자바를\n");
        System.out.print("배웁니다.");
    }
}
