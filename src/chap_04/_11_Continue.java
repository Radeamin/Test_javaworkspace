package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        //Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        //For
        int max = 20; //최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 손님이 노쇼
        for (int i = 1; i <= 50 ; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            //손님이 없다면? (noShow)
            if ( i == noShow){
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }

            sold++; //판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("----------------");

        //While 문
        sold =0;
        int index = 0; //손님 번호
        //while (index < 50) { //while 조건 (index< 50)으로 설정해줌 그렇지 않으면 대기 손님이 총 51명이 되는 상태이다.
        while (true){
            index++;
            System.out.println(index + "번 손님 주문하신 치킨 나왔습니다.");

            //손님이 없다면(noshow)
            if( index == noShow) {
                System.out.println(index +"번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
        //   index++;
                continue;
            }

            sold++;  //판매 처리(판매 수량)
            if( sold == max){
                System.out.println("재료가 모두 소진되었습니다.");
                break;
            }
        //  index++; //계속 반복문 돌리기 위해 필요한 후위 증가 연산
        }
        System.out.println("영업을 종료합니다.");
    }
}

