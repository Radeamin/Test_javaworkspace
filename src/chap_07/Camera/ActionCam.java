package chap_07.Camera;

public final class ActionCam extends Camera {
    public final String lens ="광각렌즈"; //이렇게 final 예약어를 쓰면 어디에서도 공각렌즈라는 값을 바꿀 수 없습니다.
//ALT + Insert -> Constructor 누르고 엔터 누르기
    public ActionCam() {
        super("액션 카메라");
    }

    ////////////////////////
    /*!여기 앞에다가 public fianl void makeVideo를 해버리면은 이 makeVideo라는 메소드는 자식 클래스에서는 오버라이딩 할 수가 없게 됩니다.*/

    public final void makeVideo() {
        //게다가 여기 메소드에서도 같은 클래스 인데도 불구하고 this.name에다가 값을 변경할 수 없다
        //this.lens = "값 변경";
        System.out.println(this.name + " : " +this.lens+  "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
        /*!!그래서 여기 있는 동작을 훼손시키지 않고 나는 무조건 어떤 클래스건 내 클래스를 상속하는 경우에는
        * 이 메소드는 절대 변경하지 말고 무조건 이걸 써야되라고 하는 경우에는 이렇게 파이널 키워드를 넣어 줄 수가 있는 거에요 */
    }
}
