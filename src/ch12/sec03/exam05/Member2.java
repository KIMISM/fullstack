package ch12.sec03.exam05;

//Ctrl+alt+O : 안쓰는 import 제거
import lombok.Data;
import lombok.NonNull;

//@Data: ReauiredArgsConstructor, Getter, Setter,Equals, HashCode, ToString 메소드 모두 포함
//@NoArgsConstructor : 기본 생성자 만들어줌
//@AllArgsConstructor: 모든 필드 포함시키는 생성자 만들어줌
@Data


public class Member2 {
    private String id;
    //@NonNull: null이면 안되는 필수 항목,
    //따라서 @RequiredArgsConstructor에 의해 해당 필드를 포함하는 생성자가 만들어진다
    @NonNull
    private String name;
    private int age;
}
