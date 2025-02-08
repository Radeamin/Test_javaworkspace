package chap_07.review;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
//      클래스명 + 인스턴스 변수 + =(는) + new예약어 그리고 클래스명 생성자 + ; 땀 표시(세미콜론)
        b1.modelName = "까망이"; //까망이(최신형)
        b1.appendModelName("(최신형)");
//   alt키  + enter키 누르면  create method 'appendModelName' in 'BlackBox' 나옴 이걸 누르면
//   BlackBox 클래스 파일에서 appendModelName이라는 함수가 자동으로 줄바꿈 되어서 나온다.
//   인텔리제이 기능이다.
        System.out.println(b1.modelName);

//  히브리서 11장 1절 말씀 (믿음은 바라는 것들의 실상이요 보이지 않는 것들의 증거이니)
        


    }
}
