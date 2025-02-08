package chap_07.Camera;

public class SlowActionCam { //extends ActionCam {
    // ActionCam이 final로 선언이 되었기 때문에 에러가 뜬다
    // 상속이나 오버라이딩이 그리고 변수를 못 바꾸게 하기 위해서이다.
    // 그래서 자체적으로 클래스를 따로 만들어야 하는 번거로움이 있다
//    public SlowActionCam() {
//        this.name = "슬로우 액션 카메라";
//  가장 조상인 카메라 클래스인 Name에 직접 접근해 가지고 값을 설정해 주도록 할게요
//  자 그리고 우리 슬로우 액션캠에서는 액션캠에서 제공되는 메이크 비디오란 기능이 있죠
//  makevideo를 메소드 오버라이딩을 통해 가지고 멋진 슬로우 비디오를 만든다고 가정해 보겠습니다.

//  }
//    public void makeVideo () { //!!!그러면은 SlowActionCam에서는 오버라이딩 자체가 불가능해집니다. 이거는 어쩔 수 없이 삭제를 해야 하는 거에요
//        //게다가 여기 메소드에서도 같은 클래스 인데도 불구하고 this.name에다가 값을 변경할 수 없다
//        //this.lens = "값 변경";
//        System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 멋진 슬로우모드 비디오를 제작합니다.");
//    }

    public void makeVideo(){
        System.out.println("자체 개발한 비디오 제작 기능");  
    };
}
