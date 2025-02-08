package chap_07.Camera;

public class Camera { //부모 클래스
    public String name;
    public String doubleCamera;

    public Camera() {
//        this.name = "카메라";
        this("카메라");

    }



    protected Camera(String name) { // 부모 클래스의 이름값 전달 받아서 호출해 주는 겁니다.
        this.name = name;

    }

    public void DoubleCamera() {
        this.doubleCamera = "망원경";
        System.out.println(this.doubleCamera + " 입니다.");
    }

    public void takePicture(){
        //사진 촬영
        System.out.println(this.name +" : 사진을 촬영합니다.");
        //카메라 : 사진을 촬영합니다. //카메라 : 사진을 촬영합니다. // 카메라: 사진을 촬영합니다.
    }



    public void recordVideo() {
        //동영상 녹화
        System.out.println(this.name + " : 동영상을 녹화합니다.");
    }

    public void showMainFeature(){
         System.out.println(this.name +"의 주요 기능: " + "사진 촬영, 동영상 녹화");
    }


}
