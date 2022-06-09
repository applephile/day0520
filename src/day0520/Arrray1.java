package day0520;

import java.util.Scanner;

public class Arrray1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String[][] type = {
							{"boolean", "1"},
							{"char", "2"},
							{"byte", "1"},
							{"short", "2"},
							{"int", "4"},
							{"long", "8"},
							{"float", "4"},
							{"double", "8"}
		};
		
		int count = 0;
		
		for(int i=0; i<10; i++) {
			int rndNum = (int)(Math.random() * type.length);
			
				System.out.printf("Q%d. %s의 길이는? ", i+1, type[rndNum][0]);
				
				String user = s.nextLine();
				
				if(user.equals(type[rndNum][1])) {
					System.out.println("정답입니다.\n");
					count++;
				} else {
					System.out.println("틀렸습니다. 정답은 1입니다.\n");
				}
			
		}
		System.out.println("정답은 "+ count +"번입니다.");

	}

}
