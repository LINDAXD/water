package water_re;

public class Amenities {
	 int b; // 부대시설
	 int erved; //몇번째 좌석
	 	 
    public Amenities(int b,int erved) {
        this.b = b;
        this.erved = erved;
    }
    public void status(int[] seat) {
    	System.out.println("예약이 완료되었습니다.");
		System.out.println("------------------------------");
		System.out.println("현재의 예약상태는 다음과 같습니다.");
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
}
