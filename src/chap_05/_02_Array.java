package chap_05;

public class _02_Array {
    public static void main(String[] args) {
        //배열의 순회(1차원 배열)
        String[] coffees = {"카페라떼", "아메리카노" , "카푸치노" , "에스프레소 "};

        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + "하나");
        }
        System.out.println("주세요");

        System.out.println("-----------");
        
        //배열의 길이를 이용한 순회
        for(int i=0; i< coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("---------------");

        // enhanced for (for-each) 향상된 for 반복문
        for (String coffee : coffees){
            System.out.println(coffee + "하나");
        }
        System.out.println("주세요");

        System.out.println("------------------------");

    //enhanced for (for-each) 반복문
        for(String coffee:
                coffees ){
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");
    }

}
