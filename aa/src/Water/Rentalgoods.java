package Water;

import java.util.Scanner;

public class Rentalgoods {
	int rock_room; // 락커선택
	int erved; //몇번째 자리

	public Rentalgoods(int rock_room,int erved) {
		this.rock_room = rock_room;
		this.erved = erved;
	}
	public void status(int[] seat) {
		System.out.println("예약되었습니다.");
		System.out.println("------------------------------");
		System.out.println("현재 예약상태는 다음과 같습니다.");
		System.out.println("------------------------------");

		for (int i = 0; i < 10; i++) {      // 좌석 번호를 반복문을 통해 표현
			System.out.print((i + 1) + " ");
		}
		System.out.println();
		for (int i : seat) {              // => for(int i = 0; i < seat.length; i++) {
			System.out.print(i + " ");
			//       System.out.println(seat[i] + " ");
		}
		System.out.println();
		System.out.println("------------------------------");
	}
//
//
//	public class Rentaltowel {
//		int towel_rental;
//		int towelSmall;
//		int towelBig;
//
//		public Rentaltowel(int towel_rental,int towelSmall,int towelBig) {
//			this.towel_rental = towel_rental;
//			this.towelSmall = towelSmall;
//			this.towelBig =towelBig;
//
//		}
//
//		public void status(int[] seat) {
//			Scanner input = new Scanner(System.in);
//			System.out.println("타월을 대여하시겠습니까? [3,000원~]");
//			System.out.println("[1] 네");
//			System.out.println("[2] 아니오");
//			towel_rental = input.nextInt();
//
//			if(towel_rental==1) {
//				System.out.println("대여하실 소(수건)[3,000원]의 수량을 입력해 주세요.");
//				towelSmall = input.nextInt();
//				System.out.println("대여하실 대(비치타올)[5,000원]의 수량을 입력해 주세요.");
//				towelBig = input.nextInt();
//				//					Towel t = new Towel(towelSmall,towelBig);
//
//			}
//
//		}
//	}
}