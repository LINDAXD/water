package Water;

import java.util.Scanner;

public class point {

    // 메인 한개
    public static void main_point(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n========================================="
                + "===============================\n");
        System.out.println("* 포인트를 적립하시겠습니까? *");
        System.out.println("[1] 포인트 적립 하기\n[2] 포인트 적립 안함");

        int point = scanner.nextInt();
        if(point == 1) {
            System.out.println("휴대폰 번호를 입력해주세요.  ex)01012341234");
            String phone_number = scanner.next();
            System.out.println("적립되었습니다.");
            System.out.println("안녕히 가세용 ~.~");
            System.out.println("========================================="
                    + "===============================\n");
        }else{
            System.out.println("안녕히 가세용 ~.~");
        }
    }
}