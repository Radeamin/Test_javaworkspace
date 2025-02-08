package chap_06;

public class _Quiz_06 {
    public static String getHiddenData( ){

        String[]  never_give_up = new String[] { "나코딩", "990130-1234567", "010-1234-5678" };
        never_give_up[0] = "나**";
        never_give_up[1] = "990130-1******";
        never_give_up[2] ="010-1234-****";

        return never_give_up[0] +"\n"+ never_give_up[1] + "\n" + never_give_up[2];
    }

    public static void main(String[] args) {
        //개인 정보를 비공개로 전환하는 메소드 작성
        //하나의 메소드에서 모든 동작 처리
        //각 정보는 아래 위치부터 비공개 적용
        String name = "나도코딩"; //이름
        String id = "990130-1234567"; //주민번호
        String phone = "010-1234-5678"; // 전화번호

        System.out.println("이름, id, 폰 번호 : " + getHiddenData());
        }
}
