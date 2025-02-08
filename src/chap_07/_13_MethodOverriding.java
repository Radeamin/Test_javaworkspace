package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _13_MethodOverriding {

    public static void main(String[] args) {
        //메소드 오버라이딩 : 자식 클래스에서 부모 클래스의 메소드를 덮어쓰기 (재정의)
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedcam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedcam.showMainFeature();
//  메소드 오버라이딩을 하게 되면은 자식 클래스에서 부모 클래스에 있는
//  즉, SpeedCam에 있는 showMainFeature() 메소드 이렇게 똑같은 형태로
//  만들어 주면 되고 이렇게 하면 자식 클래스에서 부모 클래스의 메소드를 덮어 쓰기 때문에
//  같은 이름의 메소드임에도 불구하고 객체 마다 서로 다른 동작을 할 수 있다.
//  자식 클래스에서는 자식 클래스의 메소드를
//  부모 클래스에서는 부모 클래스의 메소드를 호출하게 된다.
    }
}
