package chap_08;

//import chap_07.A;
//import chap_07.BlackBoxRefurbish;
//import chap_07.*;

import chap_07.*;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        //접근 제어자
        // private : 해당 클래스 내에서만  접근 가능
        // public : 모든 클래스에서 접근 가능
        // default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능
        // protected : 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; //public
        // b1.resolution = "FHD" // default
        // b1.price = 200000; // private
        // b1.color = "블랙"; // protected(자식 클래스가 아니고 다른 패키지이기 때문에 접근이 안된다.)

//      A a = new A(); //퍼블릭이 아니기 때문에 지금 패키지 밖에서는
        //접근할 수 없다

        BlackBox b2;
    }
}
