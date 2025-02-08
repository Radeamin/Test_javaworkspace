package chap_07;

import java.sql.SQLOutput;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        //특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
        System.out.println("-개발 전-");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        //개발 전이라 false로 뜸
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);
        //똑같은 값이 나옴 하지만 클래스 변수이기 때문에 객체 점이 아니고
        //클래스 명 '점'을 통해서 지금 접근이 가능한 것이다.


        /*기능 개발 */
        BlackBox.canAutoReport = true;
        //canAutoReport라는 클래스 변수 하나만 바꿨는데 아래는 다 true로 출력됨
        System.out.println("-개발 전-");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);

    }
}
