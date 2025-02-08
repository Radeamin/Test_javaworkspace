package chap_07.Camera;

// FactoryCam is a Camera. (IS-A)
public class FactoryCam extends Camera{

    public FactoryCam() {
        //this.name = "공장 카메라";
        super("공장 카메라");
    }

//    public void  takePicture() {
//        // 사진 촬영
//        //부모 클래스의 생성자를 호출하는 방법
//
//        System.out.println("사진을 촬영합니다.");
//    }
//recordVideo는 부모 클래스에 있다.
    public void recordVideo() {
        //동영상 녹화
        super.recordVideo(); //Camera.recordVideo() 메소드안에서 카메라 동영상을 녹화합니다.
        detectFire(); //화재를 감지합니다.
    }


//    public void recordVideo() {
//        // 동영상 녹화       //부모 클래스의 메소드를 이용하는 방법
//        super.recordVideo(); //부모 클래스에서 recordVideo를 수행 하고 나서 추가로 자식 클래스에서 제공하는
//                             // 화재 감지 기능을 함께 수행하게 되는 것이다.
//        System.out.println("동영상을 녹화합니다.");
//        detectFire();
//    }

    public void detectFire() {
        //화재 감지
        System.out.println("화재를 감지합니다.");
    }

    public void showMainFeature(){
        System.out.println(this.name +"의 주요 기능: " + "사진 촬영, 동영상 녹화");
    }

}
