package day0520;

public class Exam1 {

	public static void main(String[] args) {
		
		//로또 번호 추출
		
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		
		int j = 0;
		int temp = 0;
		for(int i=0; i<6; i++) {
			j = (int)(Math.random() * 45) + 1;
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		for(int i=0; i<6; i++) {
			System.out.printf("ball[%d] : %d\n", i, ball[i]);
		}
		
		System.out.println("--------------------------");
		
//		int[] ball = new int[6];
//		
//		for(int i=0; i<ball.length; i++) {
//			ball[i] = (int)(Math.random() * 45) + 1;
//			
//			for(int j=0; j<i; j++) {
//				if(ball[i] == ball[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		for(int i=0; i<ball.length; i++) {
//			System.out.println(ball[i]);
//		}
		
	}

}
