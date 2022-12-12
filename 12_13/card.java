package Water;

import java.util.Scanner;

public class card {
	//  메인 두개.
	public static void main_card(String[] args) {                                    // main1
		int m = 120000;                                          // ->>>>>>>>>>>>>>>>>>>>>>>>>>>> 값 임의로 넣음. 수정하기.
		System.out.println("결제할 금액은 " + m + "원 입니다.\n");


		System.out.println("{카드 할인 정보} \n* 카드 할인은 1인, 일1회, 연5회 제공됩니다.\n");
		System.out.println("- 삼성카드 : 이용권 30% 할인\n"
				+ "- 하나카드 : 이용권 50% 할인\n"
				+ "- 신한카드 : 이용권 30% 할인\n"
				+ "- 현대카드 : 이용권 30% 할인\n"
				+ "- B  C카드 : 이용권 50% 할인\n");
		System.out.println("[1] 결제취소\n[2] 카드결제");


		Scanner scanner = new Scanner(System.in);
		int card1 = scanner.nextInt();

		if(card1 == 1) {
			System.out.println("* 결제 수단 선택 *");
			System.out.println("[1] 카드 결제\n[2] 현금 결제\n[3] 상품권 결제");

			int pay1 = scanner.nextInt();

			if(pay1 == 1) {
				card.main_card(args);                                       // card로 이동
			}else if(pay1 == 2) {
				cash.main_cash(args);                                       // cash로 이동
			}else {
				gift_card.main_gift_card1(args);                            // gift_card의 첫번째 메인으로 이동
			}
		}else {
			try {												// 딜레이 넣음.
				System.out.println("카드를 삽입하세요.");
				Thread.sleep(2000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("결제 되었습니다.");
			point.main_point(args);
		}
	}
	public static void main_card2(String[] args) {                      // main2
		Scanner scanner = new Scanner(System.in);

		int m = 120000;
		System.out.println("결제할 금액은 " + m + "원 입니다.\n");
		System.out.println("[1] 결제취소\n[2] 카드결제");

		int card2 = scanner.nextInt();

		if(card2 == 1) {
			System.out.println("* 결제 수단 선택 *");
			System.out.println("[1] 카드 결제\n[2] 현금 결제\n[3] 상품권 결제");

			int pay1 = scanner.nextInt();

			if(pay1 == 1) {
				card.main_card(args);                                       // card로 이동
			}else if(pay1 == 2) {
				cash.main_cash(args);                                       // cash로 이동
			}else {
				gift_card.main_gift_card1(args);                            // gift_card의 첫번째 메인으로 이동
			}
		}else {
			try {												// 딜레이 넣음.
				System.out.println("카드를 삽입하세요.");
				Thread.sleep(2000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("결제 되었습니다.");
			point.main_point(args);
		}
	}
}