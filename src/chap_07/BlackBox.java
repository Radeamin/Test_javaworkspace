package chap_07;

public class BlackBox {
    //모델명, 해상도, 가격, 색상 을 한꺼번에 정의 할 수 있는 클래스 만들어보자 (강의 인스턴스 변수 부분)
    //여기서는 우리가 항상 메인 메소드를 만들었는데 이 클래스 안에서는 메인 메소드가 필요 없다.

    String modelName;// 모델명

    String resolution; //해상도

    int price; //가격

    String color; //색상
    int serialNumber; //시리얼 번호를 생성해 주는 역할을 하는 것이다.
                      // (처음에는 0이었다가 ++연산자를 해 가지고 1로 바꾸고 2로 바꾸고 ...이렇게 작업을 해 본다.)

    static int counter = 0;
    static boolean canAutoReport = false; //자동 신고 기능
    //static 붙이게 되면은 클래스 변수가 된다.
    // 따라서 이 클래스로 부터 만들어지는 모든 객체에
    //똑같이 적용이 되는 겁니다.
    //클래스에서 만들어진 클래스 변수는 객체별로 다르지 않고 모든 객체에 다 똑같이
    //공통적으로 접근이 가능하다. 그리고 일반적으로는 클래스명.canAutoReport로 접근가능하다.

    BlackBox() {
//      this("모델명", "해상도", 300000,"화이트"); // 이 this()문 실행하게 되면
//      41~44번줄가지의 동작이(인스턴스 변수에 파라미터 값이 들어가서 수행이 되는데 this에다가 아무것도 넣지 않고 지워버리면
//      BlackBox 생성자에도 지금 아무 파라미터 값이 없게 호출이 되는 거다.
        //이 this()는 내가 실험해보니 개인적인 생각으로는
        // 하나의 생성자에만 쓰이게 된 것 같다 b1에 this()가 쓰였다면 b2에는 안쓰인다.
        // this()이게 말이다.
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter; //생성자를 _08_counstructor에 불러오게 되면 serialNumber는 계속 증가하게 된다.
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다. : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
//        this(); //  *****기본 생성자 호출*****
//        //기본 생성자 BlackBox()를 접근하게 돼서 그대로 수행하고 나서
//        //아래쪽 생성자( BlackBox(String modelName, String resolution, int price, String color) { } )에 접근을 가능하게 한다.
//
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color; //this가 붙어있는 것은 (클래스) 인스턴스 변수인걸 명심하자
    }//CT[1]:한번에 값을 전달 받고 그 값들을 (클래스)인스턴스 변수에다가 직접 넣거나 또 다른 초기 작업을 생성자 내에서 할 수 있는 것 이다.

    //자동으로 신고하는 기능을 메소드로 먼저 만들어 봄
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    //usage는 사용 이용 적용 또는 방법 용법들을 나타냄
// void insertMemoryCard(int) 에서 지정자가 없는 것을 보아 
// default 접근 지정자로서 public 지정자가 생략됬다고 본다.
    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

//   블박 충돌을 고려해서 일반 영상과 충돌 이벤트 영상으로 분리함
//    일반 영상 : type: 1
//    이벤트 영상(충돌 감지) : type : 2

    int getVideoFileCount(int type) {
        if (type == 1) { //일반 영상
            return 9;
        } else if (type == 2) {
            return 1;
        }
        return 10;
    }

    // showDateTime : 날짜정보 표시 여부
    // showSpeed : 속도정보 표시여부
    // min : 영상 기록 단위 표시여부(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        //showDateTime은 날짜 시간 정보를 함께 넣을지 말지 결정하는 변수
        //showSpeed 운행하고 있을 당시의 속도 정보를
        //우리 블랙박스 녹화 파일 에다가 포함을 할지 말지를 정해 주는 변수
        //min 블랙박스 영상을 몇 분 단위로 끊어서 기록을 할지 정의해 주는 변수
        System.out.println("녹화를 시작합니다.");
        if (showDateTime){ //true이면 영상의 날짜 정보가 표시 됨
            System.out.println("영상에 날짜 시간 정보가 표시됨");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    /*void record() { //이렇게 써도 되긴 할건데 결론은
        // 비슷한 동작을 메소드 이름은 같으나 속은 서로 다른 코드로 이렇게 별도로 작성을 하게 된다면
        // 만약에 어떤 수정이 발생 한다면 여기서도 또 찾아서 바꿔줘야 하는
        // 번거로움이 있다

        System.out.println("녹화를 시작합니다.");
        System.out.println("영상에 날짜 시간 정보가 표시됨");
        System.out.println("영상에 속도정보가 표시됩니다.");
        System.out.println("영상은  5분 단위로 기록됩니다.");

    }*/

    void record() {
        //새롭게 메소드를 호출하는데 그때 값만 기본적으로 정의된 값을 던져준다.
        //그러면 b1이라는 reference 변수가 BlackBox라는 객체를 통해
        // 메소드를 호출할 때 아무 값을 몰라도 그냥 비워둔 채로 호출하게 되면
        //기본적인 값만 통해서 동작을 하게 됨
        record(true, true, 5); //MQ:약간 재귀함수 느낌이 나는데 그렇게 생각해도 돼나요?
    }
//static 키워드가 붙여진 것은 클래스 메소드이다.
//    이거는 개체가 만들어지지 않고도
//    클래스 이름 점 그리고 이 메소드 이름으로 바로 접근해 볼 수 있다.
    static void callServiceCenter()
    {
        System.out.println("서비스 센터(1588-0000) 로 연결합니다.");
//        modelname = "test";
        canAutoReport  = false; //이렇게 써도 문제 없음
        // static으로 선언한 클래스 변수는
        // 스태틱 메소드에서 바로 사용 가능함
        //그런데 modelname 같은 인스턴스 변수는 객체가 만들어져야
        //만들어지는 인스턴스 변수이기 때문에 여기 static 클래스
        //메소드 내에서는 직접 접근이 불가능하다.
        //그런데 우리 모델네임과 같이 인스턴스 변수는 [객체가 만들어져야(생성자)] 만들어지는 인스턴스 변수이기
        //때문에 여기 static 메소드 내에서는 직접 접근이 불가능하다

    }

    void appendModelName(String modelName) {
        this.modelName += modelName;
    }

    //Getter(값을 가져오는 메소드)   & Setter(값을 설정해 주는 메소드)
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName){
        this.modelName = modelName;
    }

    String getResolution() {
        if(resolution == null || resolution.isEmpty()) { //isEmpty는 빈 문자열 ""이다.
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
        this.price = price;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
