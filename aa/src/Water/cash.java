package Water;

import java.util.Scanner;

public class cash {


    // 메인 한개. 메인 이동 없음.
    public static void main_cash(String[] args) {
        int m = 120000;                                         // ->>>>>>>>>>>>>>>>>>>>>>>>>>>> 값 임의로 넣음. 수정하기.
        System.out.println("현재 금액은" + m +"입니다");
        Scanner scanner1 = new Scanner(System.in);


        // 계산 넣기. 수정.

        System.out.println("현금 영수증을 하시겠습니까?");
        System.out.println("[1] 하겠습니다. [2] 하지않겠습니다");
        int receipt = scanner1.nextInt();

        System.out.println();


        for(;;) {
            if(receipt == 1) {
                System.out.println("번호를 입력해주세요");
                Scanner scanner2 = new Scanner(System.in);
                int num1 = scanner1.nextInt();
                System.out.println("입력하신 번호가 맞습니까? [1] 맞습니다 , [2] 아닙니다");
                int num2 = scanner2.nextInt();
                if(num2 == 1) {
                    System.out.println("현금 영수증을 발급하겠습니다");
                    point.main_point(args);
                    System.out.println("\n========================================="
                            + "===============================\n");
                    break;
                }
                System.out.println("번호를 다시 입력해주세요.");
            }
            System.out.println("완료되었습니다.");
            point.main_point(args);
            break;
        }
    }
}