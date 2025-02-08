package chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox  b1 = new BlackBox();
        b1.modelName = "까망이";
//이번에는 BlackBox 클래스에 녹화를 하는 메소드를 만들 것이다.

        //날짜, 시간 , 속도 표시를 안하고 싶은 경우도 가능성이 있음
        b1.record(false , false, 10);
        System.out.println("-------------------------------");
        b1.record(true,true,3);
        System.out.println("-------------------------------");
        b1.record();

        //String 클래스
        String s = "BalckBox";
        System.out.println(s.indexOf("a"));
    }
}
