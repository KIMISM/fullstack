package ch14.sec03.exam02;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        //작업 스레드를 따로 만들었기 때문에 비프음 작업과 출력 작업이 동시에 진행됨
        Thread thread = new Thread(new Runnable(){//작업 스레드 생성
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                //하나의 메인 스레드에서 작동하므로 비프음 5번 발생 후 "띵" 5번 출력
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();//비프음 발생
                    try{Thread.sleep(500);}catch(Exception e){}//0.5초간 일시 정지
            }
        }

        });
        thread.start();//작업 스레드 실행
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {Thread.sleep(500);}catch(Exception e){}//0.5초간 일시 정지
        }
    }
}
