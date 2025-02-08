package chap_06;
//        for (int i = 0; i < data.length()-index; i++) {
//            hiddenData += "*"; //주민번호 14 - 6  그 뒤에 있는 8자리들은 다 *이됨
//        }

//        for (int i = 0; i < data.length() - index; i++) {
//            hiddenData += "*"; //주민번호 14 - 6  그 뒤에 있는 8자리들은 다 *이됨
//        }
//
public class Quiz_06 {
    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0, index); //나코딩 -> 나**
        //for(int i = 0; i < data.length()-index; i++)
        for(int i= index; i< data.length(); i++){
            hiddenData += "*"; // 나**
        }
        return hiddenData;
    }
//-은 하이픈
    public static void main(String[] args) {
        //개인 정보를 비공개로 전환하는 메소드 작성
        //하나의 메소드에서 모든 동작 처리
        //각 정보는 아래 위치부터 비공개 적용
        String name = "나코딩"; //이름
        String id = "990130-1234567"; //주민번호
        String phone = "010-1234-5678"; // 전화번호

        System.out.println("이름 : " + getHiddenData(name, 1)); //개인정보, 비공개 시작 위치
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }

}
