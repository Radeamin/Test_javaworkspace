package chap_07;

import java.util.Random;

public class _11_Package   {
    public static void main(String[] args) {
        // 패키지 (랜덤 클래스) //다른 패키지에서 주는걸 갖다 쓰는걸 연습하는 장
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt()); //int의 범위 내에서 정수형 값 반환
        System.out.println("랜덤 정수 (범위) : " + random.nextInt(10)); //0 이상 10 미만의 정수형 값
        System.out.println("랜덤 실수 : " + random.nextDouble()); // 0.0 이상  1.0 미만의 실수값
//  System.out.println("랜덤 실수  (범위) : " + random.nextDouble(10.0)); //nextDouble()에는 범위를 아쉽게도 지정할 수 없음

        // 만약 5.0이상 10.0 미만의 실수를 뽑으려면?
        double min = 5.0;
        double max = 10.0;                      // 5.0 + (10.0 - 5.0) * random.nextDouble()
                                                // -> 5.0 + (0.0에서 부터 5.0 까지 랜덤 수)
                                                // -> 더하기 돼서 5.0에서 부터 10.0까지 랜덤으로 수가 나오게 됨

        System.out.println("랜덤 실수 (범위) : " + ( min + (max - min) * random.nextDouble() ) );
        // 이렇게 하면 5.0 이상 10.0 미만 실수값이 랟덤으로 지정됨. // 그리고 이런 식으로 하면 문제가 없음

        // 호기심으로 진짜 문제가 없는지 한번 해 보기
        // test 1
        System.out.println("랜덤으로 실수 범위 지정 : " + (max * random.nextDouble() ) ); // 이렇게도 되긴 하는데 뭔가 찝찝하다.
        //찝찝한 이유는 이것이다. 10.0 곱하기를 하게되면 0.0 부터 10.0까지 되는데 21번 줄 코드는 그게 아니기 때문에 찝찝한 것이었다.
        //만약

        System.out.println("랜덤 boolean : " + random.nextBoolean() );

        // 로또 번호를 랜덤으로 뽑으려면? 1~45
        System.out.println("로또 번호 : " + ( random.nextInt(45) ) + 1); // 1 이상 46 미만의 값을 가지게 됨
        // nextInt(45) : 0 이상 45 미만의 수
        // nextInt(45) + 1 : 1이상 46 미만의 수를 가지게 됨 = 2 이상 45 이하의 랜덤수를 가지게 됨

        //Math, Scanner, StringBuilder, StringBuffer, StringTokenizer
        // BigInteger, BigDecimal
        // LocalDate, LocalTime, LocalDateTime , DateTimeFormatter, 등등 (****'자바 유용한 클래스'라고 구글에 검색*****)
    }
}
