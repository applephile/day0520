package day0520;

public class Arraycopy1 {

	public static void main(String[] args) {
		
		//1. for문을 사용하여 복사
		int[] number = {1, 2, 3, 4, 5};
		int[] newNumber = new int[10];
		
		for(int i=0; i<number.length; i++) {
			newNumber[i] = number[i];
		}
		for(int i=0; i<newNumber.length; i++) {
			System.out.print(newNumber[i] + ", ");
		}

		System.out.println("\n------------------------");
		
		//2. arraycopy
		
		String[] oldStrArr = {"green", "java", "copy"};
		String[] newStrArr = new String[5];
		
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);
		
		for(int i=0; i<newStrArr.length; i++) {
			System.out.print(newStrArr[i] + ", ");
		}
		
		System.out.println("\n------------------------");
		
		char[] arr1 = {'1', '2', '3', '4', '5'};
		char[] arr2 = {'A', 'B', 'C', 'D', 'E'};
		
		System.arraycopy(arr1, 1, arr2, 2, 2);
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + ", ");
		}
	}

}
