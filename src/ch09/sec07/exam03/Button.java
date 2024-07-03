package ch09.sec07.exam03;

public class Button {
    public static interface ClickListener {
        void onClick();
    }
    //필드
    //Button 클래스에서 ClickListener인터페이스를 필드로 가지고 있다
    private ClickListener clickListener;
//메소드
    //set 메소드에서는 ClickListener를 받아온 값으로 변경해준다
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }
//메소드는 소문자
    public void click() {
        this.clickListener.onClick();
    }
}
