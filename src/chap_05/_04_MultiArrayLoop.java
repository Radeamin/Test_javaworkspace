package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        String[][] seats = new String[][] {
                { "A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}

        };
        //이차원 배열은 FOR 문을 두번 쓰면 된다.
        for (int i = 0; i < 3; i++) { //세로 기준
            for (int j = 0; j < 5; j++) { //가로 기준
                System.out.print(seats[i][j] + " "); //A1A2A3
                /*for (int k = 0; k < ; k++) { //높이 기준
                }*/
            }
            System.out.println();
        }
        System.out.println("--------------");
        String[][] seats2 = {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };
        for (int i = 0; i < seats2.length; i++) { //세로
            for (int j = 0; j < seats2[i].length ; j++) { //가로
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------");
        //세로 크기 10 곱하기 가로 크기 15에 해당하는 영화관 좌석
        String[][] seats3 = new String[10][15];
        String[] eng = {"A","B","C","D","E","F","G","H","I","J"};
        for (int i = 0; i < seats3.length; i++) { //세로
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i] + (j+1);
            }
        }

        System.out.println("---------------");
        //표 구매
        seats3[7][8] = "__"; //H9
        seats3[7][9] = "___"; //H10


        //영화관 좌석 번호 확인
        for (int i = 0; i < seats3.length; i++) { //세로
            for (int j = 0; j < seats3[i].length ; j++) { //가로
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }

        if(seats3[1][0].equals("B1")){
            String S = "나의 피난처 하나님 아버지";
            System.out.println(S);
        }

        //System.out.println(S); 조건문 안에서 쓰인 지역 변수는 조건문 밖에서 못씀
    }
}
