package chap_07;


import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

public class _15_Super {
    public static void main(String[] args) {
        // Super
//        FactoryCam factoryCam = new FactoryCam();
//        SpeedCam speedCam = new SpeedCam();

        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo(); // 결과: 공장 카메라 동영상을 녹화합니다.
                                  // 결과: 화재를 감지합니다.
        System.out.println("-----------------");
        speedCam.takePicture(); //과속단속 카메라 : 사진을 촬영합니다.
//      factoryCam.recordVideo();
//      System.out.println("------------------");
//      speedCam.takePicture();
    }

}
