package chap_07;

import chap_07.Camera.ActionCam;
import chap_07.Camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args){
        //Final

        // public (final) class ..
        // public (final) void ...
        // public private protected> abstract > static > fianl > ....
        ActionCam actionCam = new ActionCam();
        //actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("--------------------");

        SlowActionCam slowActionCam = new SlowActionCam();
//        slowActionCam.recordVideo();
        slowActionCam.makeVideo();

        System.out.println("-----------");

        //ActionCam 만들었던 분이 렌즈도 무조건 광각렌즈로 이렇게 고집을 한 것 처럼
        //makeVideo도 슬로우 모드 비디오로 만드는 것을 싫어했던 거에요

        //그래서 메이크 비디오 자체를 아예 메소드 오버라이딩을 못 하도록 바꾸고 싶은 거에요
        //그럴 때는 final 키워드를 쓸 수 있습니다.
    }
}
