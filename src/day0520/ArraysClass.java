package day0520;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {

		//클래스 : 필드(속성), 메서드(함수)로 구성
		//Arrays 클래스 : 배열을 다루는데 유용한 기능을 제공
		
		//배열 비교 
		
		String[][] str2D = new String[][] {{"aaa", "bbb"}, {"ccc", "ddd"}};
		String[][] str2D2 = new String[][] {{"aaa", "bbb"}, {"ccc", "ddd"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		//1차원 배열을 비교할 때는 equals 사용
		//2차원 배열을 비교할 때는 deepEquals 사용
		
		//배열의 출력
		
		//toString : 요소를 문자열로 출력
		
		int[] arrNum = {0, 1, 2, 3, 4};
		int[][] arrNum2D = {{11, 22}, {33, 44}};
		
		System.out.println(arrNum);
		System.out.println(Arrays.toString(arrNum));
		
		System.out.println(arrNum2D);
		System.out.println(Arrays.deepToString(arrNum2D));
		
		//1차원 배열을 출력할 때는 toString 사용
		//2차원 배열을 비교할 때는 deepToString 사용
	}

}
