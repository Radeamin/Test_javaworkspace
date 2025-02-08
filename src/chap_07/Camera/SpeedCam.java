package chap_07.Camera;

// SpeedCam a Camera
public class SpeedCam extends Camera {


    public SpeedCam() {
        // this.name = "과속단속 카메라"
        super("과속단속 카메라");
    }

    @Override
    public void takePicture() {
        //사진 촬영
        super.takePicture(); //카메라: 사진을 촬영합니다.
        System.out.println(this.name + " : 사진을 촬영합니다."); //카메라: 사진을 촬영합니다.
        checkSpeed(); //속도를 측정합니다.
        recognizecensePlate(); // 차량 번호를 인식합니다.

    }

    //    public void takePicture() {
//        //사진 촬영
//        super.takePicture();
//        System.out.println(this.name + " : 사진을 촬영합니다.");
//        // System.out.println("사진을 촬영합니다.");
//        checkSpeed();
//        recognizecensePlate();
//    }
//
//    public void recordVideo() {
//        // 동영상 녹화
//        System.out.println("동영상을 녹화합니다.");
//    }

    public void checkSpeed() { //속도를 측정합니다.
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }
//    @Override //부모 클래스에 오버라이드 할 수있는 메소드가 없어라고 뜨고 있다
    public void recognizecensePlate() { //차량 번호를 인식합니다.
        // 번호 인식
        System.out.println("차량 번호를 인식합니댜.");
    }


    @Override   //annotaiton(없어도 동작하는데 문제는 없어요)
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }
}
