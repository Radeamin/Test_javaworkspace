package chap_06;

public class _03_Return {
    //호텔 전화번호
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }
    //호텔 주소
    public static String getAddress() {
        return "서울시 어딘가";
    }
    //호텔 액티비티
    public static String getActivities() {
        return "볼링장, 탁구장, 노래방";
    }


    public static void main(String[] args) {
        // 반환값, Return
       // String contactNumber = getPhoneNumber();
        String phoneNumber = getPhoneNumber(); // phoneNumber는 getPhoneNumber()여기 안에 쓰인 phoneNumber랑은 다름
        System.out.println("호텔 전화번호 : " + phoneNumber);

        String address = getAddress();
        System.out.println("호텔 주소 : " + address);

        String place = getActivities();
        System.out.println("호텔 액티비티 : " + getActivities());
    }
}
