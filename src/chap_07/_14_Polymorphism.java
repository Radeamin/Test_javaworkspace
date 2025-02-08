package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        //다형성

        // class Person : 사람
        // class Student extends Person: 학생 (학생은 사람이다. Student is a person)
        // class Teacher extends Person: 선생님( 선생님은 사람이다. Teacher is a person)
        // 모든 사람이 학생도 아니고 선생님도 아니다 따라서
        //상속은 자식 클래스와 부모 클래스 관의 is A 관계가 있다.

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        //앞에 있는 부분은 부모 클래스를 정의해 줄 수 있다.
        Camera speedCam = new SpeedCam();
        //
        //부모 클래스는 또 다른 자식을 품을 수 있고

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();


        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();


        for (Camera cam : cameras) {
            cam.showMainFeature();
        }
//  참고 : SpeedCam speedCam = new SpeedCam(); 과 같이
        
//  생성된 객체도 cameras 배열로 관리는 할 수 있습니다.
        
//  부모 클래스를 먼저 앞에 적어줌으로써 부모 클래스 / 객체 이름 = new 예약어 / 부모 클래스 또는 자식 클래스

        System.out.println("-------------");

//        factoryCam.detectFire();
//        speedCam.checkSpeed();
//        speedCam.recognizeLicensePlate();

        if (camera instanceof Camera) {
            System.out.println("카메라입니다.");
        }
        if (factoryCam instanceof FactoryCam) {
//            factoryCam.detectFire();
            ((FactoryCam)factoryCam).detectFire();
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizecensePlate();
        }

//  모든 자바 클래스는 Object라는 클래스를 여러분들도 모르게 상속하고 있다.
        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();
//  그래서 모든 클래스는 우리가 Extends를 통해 가지고 Object를 적어 주지는 않지만
//  기본 적으로 자바에서는 Object라는 클래스를 상속하고 있고 그렇기 때문에 이렇게
//  오브젝트 배열을 쓰게 되면은 어떤 형태의 건 간에 우리가 모든 클래스 객체를
//  집어 넣을 수 있어서 한꺼번에 관리할 수도 있다는 것을 참고로 설명을 드립니다.

    }
}
