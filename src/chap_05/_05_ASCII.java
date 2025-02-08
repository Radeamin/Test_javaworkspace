package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        char c= 'A'; //알파벳 대문자는 65 부터 시작, 소문자는 97 부터 시작, 숫자는 (0)은 48부터 시작
        System.out.println(c);
        System.out.println((int)c);


        c = 'B';

        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        //세로 크기 10 곱하기 가로 크기 15에 해당하는 영화관 좌석
        String[][] seats3 = new String[10][15];
        char ch = 'A';
        String[] eng = {"A","B","C","D","E","F","G","H","I","J"};
        for (int i = 0; i < seats3.length; i++) { //세로 (열)
            for (int j = 0; j < seats3[i].length; j++) { //가로 (행)
                seats3[i][j] = String.valueOf(ch) + (j+1);
                System.out.print(seats3[i][j] + " "  );
            }
            System.out.println();
            ch++;
        }
        System.out.println("---------------------------------------------------------------------------");
        //영화관 좌석 번호 확인
        for (int i = 0; i < seats3.length; i++) { //세로
            for (int j = 0; j < seats3[i].length ; j++) { //가로
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
