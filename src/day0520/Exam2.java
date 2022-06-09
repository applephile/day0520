package day0520;

import java.util.Arrays;

public class Exam2 {

	public static void main(String[] args) {
		
		//1부터 9사이의 숫자들을 이용하여 
		//중복되지 않는 숫자로 이루어진 3자리 숫자 출력
		//System.arrayCopy 이용
		
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];
		
		for(int i=0; i<ballArr.length; i++) {
			int j = (int)(Math.random() * ballArr.length);
			
			int tmp = 0;
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		System.out.println(Arrays.toString(ball3));
		
		for(int i=0; i<ball3.length; i++) {
			System.out.print(ball3[i]);
		}
		
		
//		int[] num = new int[3];
//		int[] result = new int[3];
//		
//		
//		int sum = 0;
//		
//		for(int i=0; i<num.length; i++) {
//			num[i] = (int)(Math.random() * 8) + 1;
//			
//			for(int j=0; j<i; j++) {
//				if(num[i] == num[j]) {
//					i--;
//					break;
//				}
//			}
//			
//		}
//		
//		System.arraycopy(num, 0, result, 0, 3);
//		
//		result[0] *= 100;
//		result[1] *= 10;
//		result[2] *= 1;
//		
//		sum = result[0] + result[1] + result[2];
//		
//		for(int i=0; i<3; i++) {
//			System.out.println(result[i]);	
//		}
//		
//		System.out.println(sum);
		

	}

}
