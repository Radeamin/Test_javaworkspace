package chap_06.practice;

import java.util.Arrays;

public class _1_4_practice {
//   int charge[] = new int[10];
//   java의 배열 매개변수는 크기 정보와 상관없이 배열 참조(reference)를 전달 받기 때문에 선언할때는 크기를 지정할 필요가 없다.
//   따라서 실제로도 지정할 수가 없다 MMF(int charge[10])//이건 안된단 말씀

//    배열의 길이를 메서드에서 정의하는 방법 1.새로운 배열을 생성하고 재사용하는 방법
//     String[][] seats3 = new String[10][15];
//     public static void MMF(int[] charge, String Fire){
//         charge[0] = 200;
//
//         for (int i = 0; i < charge.length; i++) {
//
//         }
//    }


    //메서드의 매개변수는 데이터 타입과 이름이 모두 명시가 되어야 한다. '
    // 따라서 charge[]를 저렇게 쓰는 건 안되고 int charge[] 이렇게 쓰거나
    // int[] charge 이렇게 써야만 한다.
//    public static void MMF( charge[] , String Fire){
//
//    } 결론: 자바의 규칙 때문에 매개 변수 자리에 저렇게 쓰는건 안됨

/*  배열의 길이를 메서드에서 정의하는 방법 1.새로운 배열을 생성하고 재사용 하는 방법
    public static void MMF(int[] charge, String Fire) {
        int[] localCharge = new int[10];

        for (int i = 0; i < localCharge.length; i++) {
            localCharge[i] = i * 2;
        }
        System.out.println("Fire message" + Fire);
        for (int value : localCharge) {
            System.out.println(value + " ");
        }
    }*/
/*  배열의 길이를 메서드에서 정의하는 방법 2.매개변수 대신에 크기만 전달 받는 방법

    public static void MMF(int size, String Fire) {
        int[] charge = new int[size];

        for (int i = 0; i< charge.length; i++) {
            charge[i] = i*2;
        }

        System.out.println("불타오르네 : " + Fire);
        for (int value : charge) {
            System.out.println(value + " ");
        }
    }
    public static void main(String[] args) {
        MMF(10, "재밌어 하며 힘내라 좌절,낙담,낙망 하지말고")
    } */


    // 배열의 길이를 메서드에서 정의하는 방법 3.매개변수 대신 길이만 전달받아 내부에서 배열 생성
    public static void MMF(int size, String Fire) {
        //전달받은 배열 charge와 문자열 Fire 처리
        int[] charge = new int[size];
        for (int i = 0; i < charge.length; i++) {
            charge[i] = i * 3;

        }
        System.out.println(Fire + charge[charge.length-1] );
//        for (int value : charge) {
//            System.out.println(value + " ");
//        }

    }
    public static void main(String[] args) {
        MMF(9,"포기하지 않는 마음" );
    }

}

//    public static void main(String[] args) {
//
//    }

/*   static void method1(int[] a, String[] s){
        System.out.println(Arrays.toString(a) + Arrays.toString(s));
    }*/