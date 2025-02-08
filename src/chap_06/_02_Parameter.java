package chap_06;

public class _02_Parameter {
//    Parameter의 뜻은 전달값이다. 많이 사용되니 기억하자
    public static void power(int number){
        int result = number * number;
        System.out.println(number + "의 2승은 " + result );
    }
    public static void powerByExp(int number, int exponent) { //number 2 , exponent 3
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;    //result = result * number; // 1 * 2 // 2 * 2 // 4 * 2
        }
        System.out.println(number + "의 " + exponent + "승은 " + result);
    }
    public static void main(String[] args) {
    //전달값, Parameter
    System.out.println();
    power(2); //2 * 2 = 4;

    power(3); // 3 * 3 = 9;

    powerByExp(2,3);

    powerByExp(3,3); // 3*3*3 = 27

    powerByExp(10, 0); // 1
}

}
