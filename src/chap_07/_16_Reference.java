package chap_07;

import chap_07.Camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
    //소문자 시작    // 기본 자료형 (Primative Data Types) : int , float, double, long, boolean, ...
        int[] i = new int[3];
        System.out.println(i[0]); // 0
        

        double[] d = new double[3];
        System.out.println(d[0]); //0.0

    //대문자 시작    // 참조 자료형 (Non-Primative, Reference Data Types) : String, Camera, FactoryCam, SpeedCam, ...
        String[] s = new String[3];
        System.out.println(s[0]); //null;

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); // true

        ////////////////////////////////////////////////////////////////////////
        System.out.println("--------");
        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);

        b = 30;
        System.out.println(a);
        System.out.println(b);

        System.out.println("-------------");
        Camera c1 = new Camera();
        Camera c2 = new Camera();

        c1.name = "카메라1";
        c2.name = "카메라2";

        System.out.println(c1.name); //카메라 1
        System.out.println(c2.name); //카메라 2

        c2 = c1; //c2에다가 c1을 집어 넣었다. c1.name과 c2.name을 집어 넣었다.
        System.out.println(c1.name); //predict 카메라 1
        System.out.println(c2.name); //predict 카메라 1

        c2.name = "고장난 카메라";
        System.out.println(c1.name); //카메라 1 (예측 결과) X 고장난 카메라 (결과)
        System.out.println(c2.name); //고장난 카메라 (예측 결과)  O

        System.out.println("---------------");
        changeName(c2);

        System.out.println(c1.name);
        System.out.println(c2.name); //풍선의 이름 값을 바꿨기 떄문에 Camera 타입의 객체를 매게변수로 받는 camera와 c1과 c2는 모두 36번줄 첫 번째로 만들어진 new Camera(); 객체를
                                    //가리키고 있는 겁니다.

        // (94번 줄) 결국 메소드 안에서 값을 바꾸긴 했지만 그 밖에서도 실행해 보면 모두 '잘못된 카메라'라고 뜨는 것을 알 수 있습니다.
        // 이게 참조자료형의 개념이자 또 우리가 이런 식으로 객체의 값을 바꿀 때 주의를 해야 되는 부분입니다.

        /*참고로 57번 보면 c2가 가리키는 36번 줄 new Camera()란 풍선을 안 가리키고 싶다면 즉 붙잡는 관계를 끊고 싶다면*/
        c2 = null; //c2에다가 null을 넣어주면 된다. 이러면 그냥 손 놓고 '아무것도 없는 빈 공간' 즉, null이 되는 거에요 null인 채로 있게 되는 거에요
        System.out.println(c2.name); //여기서는 NullPointerException이라는 에러 문구가 발생하는 것을 알 수 있습니다.
        //그러면은 이렇게 지금 C2는 null이기 때문에 // c2.name을 출력하려고 하면은 빈 값인데
        //name 이라는 데이터에는 접근 할 수 없는 거에요

//  a와 b는 각각 별도로 변하게 돼서 마지막에 10, 30으로 되는데 50번과 51번 줄에서 왜 내가 a와 b 처럼 예측한 결과가 아니냐
//  그 이유는 C2라는 객체는 어딘가 메모리 공간상에 만들어진 이 객체를 참조하고 있게 되는 겁니다. 즉 가리키는 겁니다.
//  c2라는 객체는 메모리 공간상 어딘가에 만들어진 이 객체(new Camera())를 참조하고 있게 되는 겁니다.
//  어딘가 만들어진 객체(new Camera())를 손으로 쭉 뻗어 가지고 잡고 있다고 보면 됩니다.
//  비유를 들어서 설명하면
//  36번과 37번 줄에 new Camera()란 이 객체를 풍선이라고 가정한다면 이 풍선을 각각
//  잡고 있는 거에요 36번은 c1이 37번은 c2가 따라서
//  c2에 c1을 넣게 되면(45번 줄), c2라는 손을 뻗어서 c1이 잡고 있는 풍선을 잡게 되는 거에요(줄 45번 비유)
//  *****다시 말해 c2가 c1처럼 36번 줄에 있는 new Camera()를 가리키게 되는 거에요*****
//  C2.name이라는 것은 실제로는 C2가 잡고 있는 풍선의 이름이 바뀌게 되어져서
//  줄 36번 new Camera()를 잡고 있는 거에요
//  이 풍선의 이름이 바뀌었기 때문에(c2가 줄 36번 new Camera()를 가리키는것) c1도 똑같은 풍선을 카리키고 있어서
//  줄 46번 47번도 고장난 카메라가 되는 거에요
//  이 풍선도(c1이 가리키는) 고장난 카메라 C2에도 고장난 카메라 이렇게 된다.


//  어쨰서 윗줄 보면 a와 b 값을 바꿨을 때는 어떻게 해도 a, b는 서로 별도로 바뀌었는데
//  이번에 보면 c2에 c1을 집어 넣고 나서 c2의 이름만 바꿨는데 c1도 함께 바뀌었다
//  그 이유는 c2가 c1에 있는 객체를 가리켜서 c2가 바뀌어도 c1이 바뀌게 되는 것이다.


//  ********** 기본 자료형일 때는 29번 처럼 이렇게 값이 복사가 되는 건데 참조의 경우에는 지금 가리키는 대상이 달라지는 거다 **********
//  (진짜 많이 중요한 개념이다.)
    }

    public static void changeName(Camera camera) { //80에 있는 소문자 camera도 지금 c2가 가리키고 있는 Camera()(이 풍선을 가리키는 것이다.
        camera.name = "잘못된 카메라"; //이러면 c2가 가리킨 36번 new Camera() 즉 이 풍선의 이름을 바꾸게 되는 것이다.
//  그래서 이 메소드 호출 하고 나서 (55줄로 이동 )
    }
}
