package Water;

import java.util.Scanner;

// 상품권 선택 창
public class gift_card {


	// 메인 두개
	public static void main_gift_card1(String[] args){                   // main1
		Scanner scanner = new Scanner(System.in);

		for(;;) {
			System.out.println("상품권을 선택하세요.");
			System.out.println("[1] 롯데 상품권 \n[2] 문화 상품권");
			int gift_cash_1 = scanner.nextInt();

			if(gift_cash_1 == 1) {
				System.out.println("롯데 상품권을 선택하셨습니다.");
				break;
			}else if(gift_cash_1 == 2){
				System.out.println("문화 상품권을 선택하셨습니다.");
				break;
			}else {
				System.out.println("숫자를 다시 입력해주세요");
				System.out.println("\n========================================="
						+ "===============================\n");
			}
		}
		System.out.println("금액권을 선택해주세요.");
		System.out.println("[1] 100000 \n[2] 50000");
		int m = 100000;                                         // ->>>>>>>>>>>>>>>>>>>>>>>>>>>> 값 임의로 넣음. 수정하기.
		int gift_cash_2 = scanner.nextInt();

		if(gift_cash_2 == 1) {
			gift_cash_2 = 100000;
		}else {
			gift_cash_2 = 50000;
		}
		if(gift_cash_2 == m){
			System.out.println(m + " - " + gift_cash_2 + " = " + "0" +"모두 결제 하셨습니다.");
		}else {
			System.out.println("\n========================================="
					+ "===============================\n");
			System.out.println("잔액은: " + (m - gift_cash_2) + "원 입니다.");
			System.out.println("잔액 결제 수단을 선택해주세요.");
			gift_card.main_gift_card2(args);                       // gift_card 두번째 메인으로 이동
		}

	}

//--------------------------------------- 상품권 2 ---------------------------------------//

	public static void main_gift_card2(String[] args) {                 // main2  이거는 상품권은 아니고 상품권 결제 후 잔액 계산하는 부분
		Scanner scanner = new Scanner(System.in);
		System.out.println("[1] 카드 결제\n[2] 현금 결제");

		int pay3 = scanner.nextInt();

		if(pay3 == 1) {
			try {
				System.out.println("카드를 삽입하세요.");
				Thread.sleep(2000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("결제 되었습니다.");
			// 값 받아서 결제 넣기. 수정.
		}else{
			cash.main_cash(args);                                       // cash로 이동
		}
	}
}