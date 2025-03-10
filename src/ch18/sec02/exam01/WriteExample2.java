package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {
    public static void main(String[] args) {
        //try 문 안쪽에 출력 스트림을 만드렁 주면 close할 필요 없이 자동으로 닫힌다.
        try(OutputStream os = new FileOutputStream("C:/Temp/test1.db")){


            byte a =10;
            byte b =20;
            byte c =30;

            os.write(a);
            os.write(b);
            os.write(c);
            
        } catch (IOException e) {
            //파일 입출력시 IOException 예외 처리 필수
            e.printStackTrace();
        }
    }
}
