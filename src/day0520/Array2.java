package day0520;

public class Array2 {

	public static void main(String[] args) {
		
		int[][] score = new int[5][];
		
		score[0] = new int[4];
		score[1] = new int[3];
		score[2] = new int[5];
		score[3] = new int[2];
		score[4] = new int[1];
		
		int[][] arr = {
						{1,1,1,1,1},
						{2,2,2},
						{3,3,3,3},
						{4,4},
						{5}
		};
		
//		for(int i=0; i<score.length; i++) {
//			for(int j=0; j<score[i].length; j++) {
//				System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
//			}
//		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("arr[%d][%d] = %d\n", i, j, arr[i][j]);
			}
		}
	}
}
