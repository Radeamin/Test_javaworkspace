package chap_05;

import java.sql.SQLOutput;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열)

        //소규모 영화관 좌서
        //A1 - A5
        //B1 ~ B5
        //C1 ~ C5

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        //3 x 5 크기의 2차원 배열
        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"}, //0
                {"B1", "B2", "B3", "B4", "B5"}, //1
                {"C1", "C2", "C3", "C4", "C5"} //2
        };


        //B3
        System.out.println(seats[1][2]);


        // B2에 접근 하려면?
        System.out.println(seats[1][1]);


        // C5레 접근하려면?
        System.out.println(seats[2][4]);


        //첫 줄에는 3칸, 둘쨰 줄에는 4칸, 셋쨰 줄에는 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C!", "C2", "C3", "C4", "C5"}
        };
        //A3에 접근 하려면?
        System.out.println(seats2[0][2]);

        //A5에 접근하려면?
        // System.out.println(seats2[0][4]);

        // 3차원 배열 만들기 (세로 x 가로 x 높이) 3x3x3
        String[][][] Bible = new String[][][]{
                {
                        {
                                "창세기(창세,창)", "출애굽기(탈출,출)", "레위기(레위,레)"
                        }, {
                                "민수기(민수,민)", "신명기(신)", "여호수아(수)"
                        }, {
                                "사사기(삿)", "룻시(룻)", "사무엘 상(삼상)"
                           }
                },
                {
                        {
                                "사무엘하(삼하)", "열왕기상(왕상)", "열왕기하(왕하)"
                        }, {
                                "역대상/역대기_상(대상)", "역대하/역대기_하(대하)", "에스라/에즈라(스)"
                        }, {
                                "느혜미야(느)", "에스더/에스테르(에)", "욥기(욥)"
                        }
                },
                {
                        {
                                "시편(시)", "잠언(잠)", "전도서/코헬렛(전)"
                        }, {
                                "아가(아)", "이사야(사)", "예레미야(렘)"
                        }, {
                               "예레미야애가/애가", "에스겔/에제키엘(겔)", "다니엘(단)"
                        }
                }
        };

        System.out.println(Bible[0][0][0]); /*창세기, 출애굽기, 레위기*/
        System.out.println(Bible[0][0][2]); /*레위기*/
    }
}

