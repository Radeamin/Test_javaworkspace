package chap_05;

public class _Quiz_05P {
    public static void main(String[] args) {


        System.out.println("--------------------------------------");
        int[] cm_All = new int[10];
        int m_Me = 250;
        int m_length = 5;
        int index = 0;
        while (index < 10){


            cm_All[index] = m_Me + (5*index);
            System.out.println("사이즈 " + cm_All[index] + " (재고 있음)");
            index++;
        }
    }
}
