package chap_07.review;

public class BlackBox {
    String modelName; // 모델명
    String resolution; //해상도
    int price; //가격
    String color; //색상
    int serialNumber;

    static int counter = 0; // 시리얼 번호를 생성해 주는 역할(처음엔 0이었다 ++ 연산을 통해서 값을 증가)
    static boolean canAutoReport = false; //자동 신고 기능

    BlackBox() {
        System.out.println("기본 생성자 호출");
    }

    BlackBox(String modelName, String resolution, int price, String color) {
        System.out.println("사용자 정의 생성자 호출");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color; //this가 붙어있는 것은 클래스 인스턴스 변수인걸 명심하자
    }

    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }
        else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { //일반 영상
            return 9;
        }
        else if (type==2) {
            return 1;
        }
        return 10;
    }
    void record(boolean showDateTime, boolean showSpeed, int min){
        System.out.println("녹화를 시작합니다.");
        if(showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if(showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + " 분 단위로 표시됩니다.");
    }

    void record() {
        record(true,true,5);
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-8080)으로 연결합니다.");
//        modelName = "test";
//        modelName과 같이 인스턴스 변수는
//        객체가 만들어져야 만들어지는 인스턴스 변수이기 떼문에
//        static 클래스 메소드(클래스 메소드) 내에서는 직접 접근이 불가능하다
        canAutoReport = false;//이건 문제 x
//        무슨 말이냐면 static으로 선언한 클래스 변수는 static 메소드에서 바로 사용 가능함
//
    }

    void appendModelName(String modelName) {
        this.modelName += modelName; // 좌항에 있는 modelName(모델명)은 [클래스 인스턴스로 만들어진 모델명 변수이고(인스턴스 변수)]
                                // 우항에 있는 modelName(모델명)은 매개변수로 받은 modelName(모델명)을 뜻하는 것이다.


    // 부연 설명 하자면 메소드내에서는 [매개변수:모델명]에다가 우항 모델명을 다시 한번 더하는 '최신형' 더하기 '최신형'이라고 하고 끝나게 된다.
        //전달받은 파라미터를 하고 업데이트를 하고 끝나게 된다.
          //중요한 것은 모델네임을 파라미터가 아니고 이름이 똑같은 경우에는 클래스가 가지고 있는
          //인스턴스 변수의 모델네임을 명시하고 싶다면 this.modelName += modelName 이렇게 적어주면 된다.
          //디스 점 이렇게 해서 붙여주게 되면 클래스의 인스턴스 변수에 직접*10(직접 직접 직접 직접....... 직접) 접근할 수 있다.
          // modelName이라는 똑같은 이름이 들어와도 this를 붙이면 이거는 클래스 인스턴스 변수 modelName인것이고.
          // 아까 처럼 this가 없는 modelName은 그냥 파라미터로 전달받은 modelName이 된다.
            //그러나 파라미터가 S라면은 this.modelName += S; 이럴텐데 이때 좌항 우항 변수가 서로 다른 이름이라서 this가 없어도 된다.
            //따라서 메소드 안에서(내에서) 이렇게도 쓸 수 있다. modelName = S;
    }
//   BlackBox 클래스 파일 4번 줄에 있는 modelName 언급(modelName은 인스턴스 변수이다.)
   /* public void appendModelName(String modelName) {
        modelName = modelName +" "+ modelName + " "+modelName ;
    }*/

}
// usage는 관습 취급 용법인데 여기서 쓰이는 것이 내 갠적 생각으로는 용법과 관습에 더 가까운거 같다.
//
//    BlackBox() {
//  System.out.println("기본 생성자 추출");
//  this.serialNumber = ++counter;
//  System.out.println("새로운 시리얼 넘버를 발급받았습니다. : " + this.serialNumber);

//    }

//    BlackBox(String modelNmae, String resolution, int price, String color) {
//        this(); //기본 생성자 호출
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution
//        this.price = price;
//        this.color = color;
//    }





