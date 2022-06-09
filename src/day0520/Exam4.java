package day0520;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {

		//극장 예약 시스템
		//1~10번까지의 좌석
		//사용자가 원하는 좌석 번호 선택 시
		//선택된 좌석은 1로 표시
		//동일한 좌석 선택 시 "이미 예약된 좌석" 표시
		//-1 입력 시 종료
		Scanner s = new Scanner(System.in);
		
//		final int SIZE = 10;
//		int[] seats = new int[SIZE];
//		
//		while(true) {
//			System.out.println("-----------------------------");
//			for(int i=0; i<SIZE; i++) {
//				System.out.print((i+1) + "  ");
//			}
//			System.out.println("\n-----------------------------");
//			for(int i=0; i<SIZE; i++) {
//				System.out.print(seats[i] + "  ");
//			}
//			System.out.println("\n-----------------------------");
//			
//			System.out.print("원하는 좌석번호 입력 (종료 : -1)");
//			
//			int num = s.nextInt();
//			
//			if(num == -1) {
//				System.out.println("종료");
//				break;
//			}
//			
//			if(seats[num - 1] == 0) {
//				seats[num - 1] = 1;
//				System.out.println("예약\n");
//			} else {
//				System.out.println("예약된 좌석");
//			}
//			
//		}
		
		
		
		
		
		int[] seat = new int[10];
		
		movie : for(;;) {
			System.out.println("---------------------------------------------------------------------------");
			for(int i=0; i<seat.length; i++) {
				System.out.printf("%d\t", i+1);
			}
//			System.out.printf("1\t2\t3\t4\t5\t6\t7\t8\t9\t10\n");
			System.out.println("\n---------------------------------------------------------------------------");
			for(int i=0; i<seat.length; i++) {
				System.out.printf("%d\t",seat[i]);
			}
			System.out.println("\n---------------------------------------------------------------------------");
			
			System.out.print("원하는 좌석 번호 입력 (종료 : -1) : ");
			int user = s.nextInt();
			
			System.out.println();
			
			if(user == -1) {
				System.out.println("종료");
				break movie;
			}
		
			if(seat[user - 1] == 0) {
				seat[user - 1] = 1;	
			} else {
				System.out.println("이미 예약된 좌석\n");
			}
		
			
			
		}


	}

}
