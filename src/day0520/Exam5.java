package day0520;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		final int SIZE = 10;
		int x = 0, y = 0;
		
		char[][] board = new char [SIZE][SIZE];
		
		byte[][] shipBoard = {
								{0, 0, 0, 0, 0, 0, 0, 1, 0},
								{1, 0, 0, 0, 0, 0, 0, 0, 1},
								{0, 0, 0, 1, 0, 0, 0, 0, 0},
								{0, 0, 0, 0, 0, 1, 0, 0, 0},
								{0, 0, 0, 0, 0, 0, 0, 0, 0},
								{0, 0, 0, 0, 1, 0, 0, 0, 0},
								{0, 0, 1, 0, 0, 0, 0, 1, 0},
								{0, 0, 0, 0, 0, 0, 0, 0, 0},
								{0, 0, 0, 1, 0, 0, 1, 0, 0},
		};
		
		//숫자 -> 문자 변환 방법 : 숫자 + 문자
		for(int i=1; i<SIZE; i++) {
			board[0][i] = board[i][0] = (char)(i + '0');
			
//			System.out.print(" " + board[0][i]);
		}
		
		while(true) {
			System.out.println(" 좌표를 입력하세요 (종료 : 00)");
			
			String input = s.nextLine();
			
			
			if(input.length() == 2) {
				x = input.charAt(0) - '0';
				y = input.charAt(1) - '0';
				
				if(x == 0 && y == 0) {
					break;
				}
				
				if(input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
					System.out.println("잘못 입력 - 재입력 요망");
					continue;
				}
				
				if(shipBoard[x - 1][y - 1] == 1) {
					board[x][y] = 'O';
				} else {
					board[x][y] = 'X';	
				}
				
				for(int i=0; i<SIZE; i++) {
					System.out.println(board[i]);
				}
				System.out.println();
			}
		}
		
	}
	
}
