package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
//            1번째 방법
//            int[] size = new int[10];
//            2번째 방법
//            int size[] = new int[];
//            3번째 방법
//            int[] size = new int[] { 250, 255, 260 , 265, 270,275, 280,285,290,295};
//            4번 방법
//            int[] size = {250, 255, 260 , 265, 270, 275, 280, 285, 290, 295};

        int[] size = new int[10];
//        int shooes_Size=250;
        for (int i = 0; i < size.length; i++) {
            size[i] = 250 + (5*i);

            System.out.println("사이즈" + size[i]  + "(재고 있음)" );
            //절대로 꼭 무조건 무슨 일이 있어도 반복적으로 증가시키려면 증가하는 식을 넣어야하니 주으해라
        }


        System.out.println("-------------------");
        for (int m :
                size)
        {
            System.out.println("사이즈" + m + " (재고 있음)");
        }
        }
    }

