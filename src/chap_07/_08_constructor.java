package chap_07;

import java.sql.SQLOutput;

public class _08_constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙"; //CT[2]: 인스턴스 변수에다가(7번부터 11번 줄 까지) 값을 넣어주는 작업을
//  '기본 생성자 호출'은 'b1'에서 호출이 된 것이고
//  그 다음에 B2 객체가 만들어질 때는 사용자 정의 생성자 호출하고 나서
//  지금 "하양이","UHD", 300000, "화이트"이 값들이 모두 다 우리 인스턴스 변수에 들어갔다.
//  그 (클래스) 인스턴스 값들이 출력했을 때 결과 값에서 하양이, UHD, 300000, 화이트가 나오는 것을 알 수 있었다.
        System.out.println(b1.modelName);
        System.out.println(b1.serialNumber);

        System.out.println("-----------------------------");

        BlackBox b2 = new BlackBox("하양이","UHD", 300000, "화이트");
//      CT[3]: 여기 밑에서는 그냥 한 줄로(17번 줄), 처리 할 수 있다.
        System.out.println(b2.modelName);
        System.out.println(b2.serialNumber);
//        System.out.println(b2.resolution); CT[250118.22:56]:3줄 안쓰니 주석 처리함
//        System.out.println(b2.price);
//        System.out.println(b2.color);
    }
}
