package day0520;

public class Exam3 {

	public static void main(String[] args) {
		
		//길이가 10인 배열을 만들어 0부터 9까지의 임의값으로 초기화
		//배열에 저장된 숫자가 각각 몇 번씩 나오는 지 출력
		
		int[] num = new int[10];
		int[] count = new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random() * 9);
			
			System.out.print(num[i]);
		}
		
		for(int i=0; i<num.length; i++) {
			count[num[i]]++;
		}
		
		for(int i=0; i<num.length; i++) {
			System.out.println(i + "의 개수 : " + count[i]);
		}
	// i == num[j] 사용해보자	
	}

}
