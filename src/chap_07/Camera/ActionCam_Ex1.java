package chap_07.Camera;

public class ActionCam_Ex1 extends Camera {
    public final String lens; //이렇게 값을 초기화 해주지 않아도 됩니다만
    //ALT + Insert -> Constructor 누르고 엔터 누르기
    public ActionCam_Ex1() {
        super("액션 카메라");
        lens = "광각렌즈"; //이렇게 생성자 내에서 초기화 해 주는 경우도 있다.
    }

    public void makeVideo() {
        //게다가 여기 메소드에서도 같은 클래스 인데도 불구하고 this.name에다가 값을 변경할 수 없다
        //this.lens = "값 변경";
        System.out.println(this.name + " : " +this.lens+  "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}
