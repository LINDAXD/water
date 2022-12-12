package Water;

import java.util.Scanner;

public class Answer {

	public static void main(String[] args) {

		int m1=0;
		int m2=0;
		int p1=0;
		int p2=0;
		int total = 0; //추가
		String offline = null;
		String online = null;
		reservation rv = new reservation(online, offline);

		Scanner admission = new Scanner(System.in);
		System.out.println("------------------------------------------------------------");
		System.out.println("-                 물답 워터파크에 오신 것을 환영합니다.               -");
		System.out.println("------------------------------------------------------------");
		System.out.println("고객님의 입장권 구매방법을 선택해 주세요.");
		System.out.println("[1] 온라인");
		System.out.println("[2] 오프라인");
		int adm = admission.nextInt();
		if(adm == 1) {
			for(;;) {

				System.out.println("번호를 입력해 주세요.");
				Scanner sc1 = new Scanner(System.in);
				int aaaa = admission.nextInt();
				System.out.println("입력하신 번호가 맞습니까? [1] 맞습니다 , [2] 아닙니다");
				int bbbb = admission.nextInt();
				if(bbbb==1) {
					System.out.println("온라인 티켓을 발급하겠습니다.");  //
					System.out.println("------------------------------------------------------------");
					break;
				}
				System.out.println("번호를 다시 입력해 주세요.");
			}System.out.println("완료되었습니다.");

		}else {

			int age;
			String[] play={"[1]블라스터", "[2]워터플렉스", "[3]부메랑고", "[4]더블스핀", "[5]레이싱", "[6]토네이도", "[7]메가스톰", "[8]튜브라이드", "[9]서핑라이드"};
			Scanner inp = new Scanner(System.in);
			System.out.println("구매하실 상품을 선택해 주세요.");
			System.out.println("[1]자유이용권	\n  [성인 60,000원 / 청소년 48,000원]"); // 성인 60000원 / 48000원
			System.out.println("[2]BIG 3 \n  [성인 35,000원 / 청소년 23,000원]"); // 성인 35000원 / 23000원
			System.out.println("[3]BIG 5 \n  [성인 40,000원 / 청소년 28,000원]"); // 성인 40000원 / 28000원
			int a = inp.nextInt();



			if (a == 1) {
				//자유이용권일 때! // 성인 60000원 / 48000원
				m1 = 60000;
				m2 = 48000;
				System.out.println("성인의 인원수를 입력해 주세요.");
				Scanner number = new Scanner(System.in);
				p1 = number.nextInt();
				System.out.println("청소년의 인원수를 입력해 주세요.");
				Scanner number1 = new Scanner(System.in);
				p2 = number.nextInt();
				System.out.println("성인은 " + p1 + "명, " + "청소년은 " + p2 + "명, " +
						"총 인원수는 " + (p1 + p2) + "명이고, " + "가격은 " + (( m1 * p1 ) + ( m2 * p2 )) + "원 입니다." );
				total = ( m1 * p1 ) + ( m2 * p2 );

			}//BIG3일 때

			else if (a == 2) {
				System.out.println("이용하실 어트랙션을 선택해 주세요. ");
				Scanner num =new Scanner(System.in);
				System.out.printf(play[0] + "\t" + play[1] + "\t" + play[2] + "\n");
				System.out.printf(play[3] + "\t" + play[4] + "\t"+"\t" + play[5] + "\n");
				System.out.printf(play[6] + "\t" + play[7] + "\t" + play[8] + "\n");
				int b = num.nextInt();
				int c = num.nextInt();
				int d = num.nextInt();
				System.out.println("선택하신 기구는: " + play[b-1] + ", " + play[c-1] + ", " + play[d-1] + " 입니다.");
				int m3 = 35000;
				int m4 = 23000;
				System.out.println("성인의 인원수를 입력해 주세요.");
				Scanner number2 = new Scanner(System.in);
				int p3 = number2.nextInt();
				System.out.println("청소년의 인원수를 입력해 주세요.");
				Scanner number3 = new Scanner(System.in);
				int p4 = number3.nextInt();
				System.out.println("성인은 " + p3 + "명, " + "청소년은 " + p4 + "명, " +
						"총 인원수는 " + ( p3 + p4 ) + "명이고, " + "가격은 " + (( m3 * p3 ) + ( m4 * p4 )) + "원 입니다." );
				total = ( m3 * p3 ) + ( m4 * p4 );
			} else if (a == 3) { // BIG5일 때
				System.out.println("이용하실 어트랙션을 선택해 주세요. ");
				Scanner numb =new Scanner(System.in);
				System.out.printf(play[0] + "\t" + play[1] + "\t" + play[2] + "\n");
				System.out.printf(play[3] + "\t" + play[4] + "\t"+"\t" + play[5] + "\n");
				System.out.printf(play[6] + "\t" + play[7] + "\t" + play[8] + "\n");
				int e = numb.nextInt();
				int f = numb.nextInt();
				int g = numb.nextInt();
				int h = numb.nextInt();
				int i = numb.nextInt();
				System.out.print("선택하신 기구는: " + play[e-1] + ", " +  play[f-1] + ", " + play[g-1] + ", " + play[h-1] + ", " + play[i-1] + " 입니다.");
				// BIG5일 때 // 성인 40000원 / 28000원
				int m5 = 40000;
				int m6 = 28000;
				System.out.println("성인의 인원수를 입력해 주세요.");
				Scanner number4 = new Scanner(System.in);
				int p5 = number4.nextInt();
				System.out.println("청소년의 인원수를 입력해 주세요.");
				Scanner number5 = new Scanner(System.in);
				int p6 = number5.nextInt();
				System.out.println("성인은 " + p5 + "명, " + "청소년은 " + p6 + "명, " +
						"총 인원수는 " + ( p5 + p6 ) + "명이고, " + "총 가격은 " + (( m5 * p5 ) + ( m6 * p6 )) + "원 입니다." );
				total = ( m5 * p5 ) + ( m6 * p6 );
			} else {
				System.out.println("다시 입력해 주세요.");
			}
		}
		//입장권
		
		
		//부대시설 및 대여용품 예매 시작
		int price[] = {20000,40000,70000};
		int seat[] = new int[10];
		int erved;
		int additional_facilities=0;
		int total1=0;
		int total2=0;
		Rentalgoods rg = new Rentalgoods();
		
		Scanner input = new Scanner(System.in);
		System.out.println("------------------------------------------------------------");
		System.out.println("-                     부대시설 및 대여용품                       -");
		System.out.println("------------------------------------------------------------");

		System.out.println("이용하실 상품의 번호를 입력해 주세요.");
		System.out.println("[1] 부대시설 & 대여용품");
		System.out.println("[2] 이용안함");
		int Howenter = input.nextInt();
		if(Howenter==2) {
			System.out.println("부대시설 및 대여용품은 이용하지 않으셨습니다.");
		}else{		
			System.out.println("부대시설을 예약하시겠습니까?");
			System.out.println("[1] 네");
			System.out.println("[2] 아니오");
			int facilities = input.nextInt();
			if(facilities==1){
				System.out.println("이용하실 부대시설을 선택해 주세요.");
				System.out.println("[1] 선베드 [20,000원]");
				System.out.println("[2] 평상 [40,000원]");
				System.out.println("[3] 카바나 [70,000원]");
				additional_facilities = input.nextInt();
				for (int i = 0; i < 10; i++) {      // 좌석 번호를 반복문을 통해 표현
					System.out.print((i + 1) + " ");
				}
				System.out.println();
				for (int i : seat) {              // => for(int i = 0; i < seat.length; i++) {
					System.out.print(i + " ");    //       System.out.println(seat[i] + " ");
				}                                 //    }
				System.out.println();
				System.out.print("예약하실 좌석을 선택해 주세요.");
				erved = input.nextInt();
				if (seat[erved - 1] == 0) {
					seat[erved - 1] = 1;
					Amenities am1 = new Amenities(additional_facilities,erved); //Amenities 클래스 am1은 이름을 지어줌
					am1.status(seat); // am1 = amenities 클래스 안에 들어있는 status 값을 가져옴
	
					total1 = (price[additional_facilities-1]);
				} 
			}
			
			//대여용품
			System.out.println("대여용품 예약하시겠습니까?");
			System.out.println("[1] 네");
			System.out.println("[2] 아니오");
			int good = input.nextInt();
			
			if(good==1){
				rg.rent_rocker();
				rg.rent_towel();
				total2 = rg.rocker*4000+(rg.towelSmall*3000) +(rg.towelBig*5000);
			
			}
		}

		System.out.println("------------------------------------------------------------");
		System.out.println("선택하신 최종 상품은 아래와 같습니다.상품이 맞는지 다시 한 번 확인해 주세요.");
		System.out.println("------------------------------------------------------------");
		System.out.println("\t1.부대시설 상품 목록");
		System.out.println("------------------------------------------------------------");
		if(additional_facilities == 0) {
			System.out.println("예약된 부대시설이 없습니다.");
		}else if(additional_facilities == 1) {
			System.out.println("선베드 : "+total1+"을 선택하였습니다.");
		}else if(additional_facilities==2) {
			System.out.println("평상 : "+total1+"을 선택하였습니다.");
		}else {
			System.out.println("카바나 : "+total1+"을 선택하였습니다.");
		}
		System.out.println("\t2.대여하는 상품 목록");
		System.out.println("------------------------------------------------------------");
		System.out.println("락커 : "+ rg.rocker +"개"+" / "+"타월 소(수건) : "+rg.towelSmall+"개"+" / "+"타월 대(비치타올) : "+rg.towelBig+"개");
				

		int total3=total+total1+total2;

		System.out.println("입장권까지 포함한 총 금액은 "+total3+"원 입니다.");
		Answer.main_discount(args);
	}



	//메인 한개.
	public static void main_discount(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("------------------------------------------------------------");
		System.out.println("* 할인 안내 *");
		System.out.println("- 카드 할인: 삼성, 하나, 신한, 현대, BC카드 최대 50% 할인"
				+ "\n- 통신사 할인: LG U+ 멤버십 30% 할인"
				+ "\n- 학생(중~고등학생, 대학(원)생) 할인: 입장권 20,000원"
				+ "\n- 우대 할인: 65세 이상 / 장애인 / 국가유공자"
				+ " 입장권 30,000원");
		System.out.println("------------------------------------------------------------");

		System.out.println("혜택 방법을 선택해 주세요.");
		System.out.println("[1] 카드할인\n[2] 통신사 할인\n[3] 학생 할인\n[4] 우대 할인");

		int a = scanner.nextInt();
		System.out.println("------------------------------------------------------------");
		for(;;) {
			if(a == 1) {
				Answer.main_card(args);                             // 카드로 이동.
				break;
			}else if(a == 2) {
				System.out.println("------------------------------------------------------------");
				try {												// 딜레이 넣음.
					System.out.println("LG U+ 멤버십 바코드를 스캔해 주세요.");
					Thread.sleep(2000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("확인이 완료되었습니다.\n");
				System.out.println("------------------------------------------------------------");

				Answer.main_pay2(args);                             // pay(결제 수단 선택)의 두번째 메인으로 이동
				break;
			}else if(a == 3) {
				try {												// 딜레이 넣음.
					System.out.println("학생증을 스캔해 주세요.");
					Thread.sleep(2000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}


				System.out.println("\n확인이 완료되었습니다.");
				System.out.println("------------------------------------------------------------");
				Answer.main_pay(args);                                  // pay(결제 수단 선택)의 첫번째 메인으로 이동
				return;

			}else if(a == 4) {
				try {												// 딜레이 넣음.
					System.out.println("확인 가능한 신분증을 스캔해 주세요.");
					Thread.sleep(2000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("\n확인이 완료되었습니다.");
				System.out.println("------------------------------------------------------------");
				Answer.main_pay(args);                                  // pay(결제 수단 선택)의 첫번째 메인으로 이동
				return;

			}
		}
	}

	//  메인 두개
	public static void main_pay(String[] args) {                          // main1
		Scanner scanner = new Scanner(System.in);

		System.out.println("* 결제 수단 선택 *");
		System.out.println("[1] 카드 결제\n[2] 현금 결제\n[3] 상품권 결제");

		int a = scanner.nextInt();

		if(a == 1) {
			Answer.main_card(args);                                       // card로 이동
		}else if(a == 2) {
			Answer.main_cash(args);                                       // cash로 이동
		}else {
			Answer.main_gift_card1(args);                            // gift_card의 첫번째 메인으로 이동
		}
	}
	public static void main_pay2(String[] args) {                          // main2
		Scanner scanner = new Scanner(System.in);

		System.out.println("* 결제 수단 선택 *");
		System.out.println("[1] 카드 결제\n[2] 현금 결제\n[3] 상품권 결제");

		int a = scanner.nextInt();

		if(a == 1) {
			Answer.main_card(args);                                       // card로 이동
		}else if(a == 2) {
			Answer.main_cash(args);                                       // cash로 이동
		}else {
			Answer.main_gift_card1(args);                            // gift_card의 첫번째 메인으로 이동
		}
	}



	//  메인 한개.
	public static void main_card(String[] args) {
		int m = 120000;
		System.out.println("결제할 금액은 " + m + "원 입니다.\n");
		System.out.println("------------------------------------------------------------");

		System.out.println("{카드 할인 정보} \n* 카드 할인은 1인, 일1회, 연5회 제공됩니다.\n");
		System.out.println("- 삼성카드 : 이용권 30% 할인\n"
				+ "- 하나카드 : 이용권 50% 할인\n"
				+ "- 신한카드 : 이용권 30% 할인\n"
				+ "- 현대카드 : 이용권 30% 할인\n"
				+ "- B  C카드 : 이용권 50% 할인\n");
		System.out.println("[1] 결제취소\n[2] 카드결제");


		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		if(a == 1) {
			Answer.main_pay(args);                                       // pay 첫번째 메인으로 이동
		}else {
			try {												// 딜레이 넣음.
				System.out.println("카드를 삽입해 주세요.");
				Thread.sleep(2000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("결제가 완료되었습니다.");

		}
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("* 포인트를 적립하시겠습니까? *");
		System.out.println("[1] 포인트 적립 하기\n[2] 포인트 적립 안 함");

		int b = scanner.nextInt();
		if(b == 1) {
			System.out.println("휴대폰 번호를 입력해주세요.  ex)01012341234");
			String c = scanner.next();
			System.out.println("적립이 완료되었습니다.");
			System.out.println("감사합니다.");
			System.out.println("------------------------------------------------------------");
		}else{
			System.out.println("감사합니다.");
		}
	}

	// 메인 한개. 메인 이동 없음.
	public static void main_cash(String[] args) {
		int asd = 120000;
		System.out.println("현재 금액은" + asd +"입니다");
		Scanner sc = new Scanner(System.in);


		// 계산 넣기. 수정.

		System.out.println("현금 영수증을 하시겠습니까?");
		System.out.println("[1]네 [2] 아니오");
		int asd_ca = sc.nextInt();

		System.out.println();


		for(;;) {
			if(asd_ca == 1) {
				System.out.println("번호를 입력해 주세요.");
				Scanner sc1 = new Scanner(System.in);
				int SC1 = sc1.nextInt();
				System.out.println("입력하신 번호가 맞습니까? [1] 맞습니다 , [2] 아닙니다");
				int SC2 = sc.nextInt();
				if(SC2 == 1) {
					System.out.println("현금 영수증을 발급하겠습니다.");  //
					System.out.println("------------------------------------------------------------");
					break;
				}
				System.out.println("번호를 다시 입력해 주세요.");
			}
			System.out.println("완료되었습니다.");
			break;
		} return;
	}


	// 메인 두개
	public static void main_gift_card1(String[] args){                   // main1
		Scanner scanner = new Scanner(System.in);

		for(;;) {
			System.out.println("상품권을 선택해 주세요.");
			System.out.println("[1] 롯데 상품권 \n[2] 문화 상품권");
			int gift_cash_1 = scanner.nextInt();

			if(gift_cash_1 == 1) {
				System.out.println("롯데 상품권을 선택하셨습니다.");
				break;
			}else if(gift_cash_1 == 2){
				System.out.println("문화 상품권을 선택하셨습니다.");
				break;
			}else {
				System.out.println("숫자를 다시 입력해 주세요.");
				System.out.println("------------------------------------------------------------");
			}
		}


		System.out.println("금액권을 선택해 주세요.");
		System.out.println("[1] 100,000원 \n [2] 50,000원");
		int total = 100000;   //  -------------------------------- 나중에 수정하기^^^^^^^
		int gift_cash_2 = scanner.nextInt();

		if(gift_cash_2 == 1) {
			gift_cash_2 = 100000;
		}else {
			gift_cash_2 = 50000;
		}
		if(gift_cash_2 == total){
			System.out.println(total + " - " + gift_cash_2 + " = " + "0" +"모두 결제가 완료되었습니다.");
		}else {
			System.out.println("------------------------------------------------------------");
			System.out.println("잔액은: " + (total - gift_cash_2) + "원 입니다.");
			System.out.println("잔액 결제 수단을 선택해 주세요.");
			Answer.main_gift_card2(args);                       // gift_card 두번째 메인으로 이동
		}

	}
	public static void main_gift_card2(String[] args) {                 // main2  이거는 상품권은 아니고 상품권 결제 후 잔액 계산하는 부분
		Scanner scanner = new Scanner(System.in);
		System.out.println("[1] 카드 결제\n[2] 현금 결제");

		int a = scanner.nextInt();

		if(a == 1) {
			try {
				System.out.println("카드를 삽입해 주세요.");
				Thread.sleep(2000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("결제가 완료되었습니다.");
			// 값 받아서 결제 넣기. 수정.2

		}else{
			Answer.main_cash(args);                                       // cash로 이동
		}
	}
}