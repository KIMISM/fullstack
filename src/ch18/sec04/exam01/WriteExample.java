package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) {
        //문자 기반 출력 스트림 생성(Writer)
        try{
            Writer writer = new FileWriter("C:/Temp/test.txt");
//1문자씩 출력
            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);
//char 배열 출력
            char[] arr = {'C', 'D', 'E'};
            writer.write(arr);
//문자열 출력
            writer.write("FGH");
            writer.flush();
//버퍼 잔류 문자들을 출력하고, 버퍼 비우기
            writer.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
