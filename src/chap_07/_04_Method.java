package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();

        b1.modelName = "까망이";

        b1.autoReport(); // 지원이 안되는 상태
        BlackBox.canAutoReport = true; //자동 신고 기능 개발 됨
        b1.autoReport(); // 지원 됨
        //이렇게 BlackBox.java라는 파일을 클래스 파일로 만들어
        // BlackBox클래스 파일 내에서 어떤 기능을 메소드로 정의해 가지고
        // 클래스로 부터 만들어진
        //객체로부터 직접 이렇게 메소드를 호출할 수 있도록 해볼 수 있다.

        b1.insertMemoryCard(256); //BlackBox 내에서는 256을 전달 받고 문장 출력 해줌

        int fileCount = b1.getVideoFileCount(1); //일반 영상
        System.out.println("일반 영상 파일 수 : " + fileCount +"개");

        fileCount = b1.getVideoFileCount(2); // 이벤트 영상(충돌)
        System.out.println("이벤트 영상 파일 수 : " + fileCount + "개");
    }
}
