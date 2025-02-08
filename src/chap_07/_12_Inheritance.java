package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        //상속
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        //카메라.사진촬영
        camera.takePicture();
        //공장.동영상녹화
        factoryCam.recordVideo();
        //과속단속카메라.사진촬영
        speedCam.takePicture();



        camera.takePicture();
        camera.recordVideo();
//
        factoryCam.takePicture();
        factoryCam.recordVideo();
        factoryCam.detectFire(); //화재 감지

        speedCam.takePicture(); //
        speedCam.recordVideo();
        speedCam.checkSpeed(); //속도 측정합니다.
        speedCam.recognizecensePlate(); //차량 번호를 인식합니다.

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizecensePlate();
    }
}

