package ch12.sec10;

import java.util.regex.Pattern;

public class PatterExample {
    public static void main(final String[] args) {
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-123-4567";
        boolean result = Pattern.matches(regExp, data);
        if (result) {
            System.out.println("정규식과 일치합니다.");
        }else{
            System.out.println("정규식과 일치하지 않습니다.");
        }
        // \\w+: word(문자-영어대소문자,숫자 포함)가 1개 이상인지
        // \\.\\w+: . 뒤에
        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data = "angle@mycompanycom";
        result = Pattern.matches(regExp, data);
        if(result){
            System.out.println("정규식과 일치합니다.");
        }else {
            System.out.println("정규식과 일치하지 않습니다.");
        }
    }
}
