package chap_07.review;

public class _06_ClassMehod {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.callServiceCenter();
        BlackBox b2 = new BlackBox();
        b2.callServiceCenter();

        BlackBox.callServiceCenter();
    }
//
//        String s = String.valueOf(3); //valueOf도 클레스 메소드이다.
//        String s = BlackBox.callServiceCenter();
//
}
