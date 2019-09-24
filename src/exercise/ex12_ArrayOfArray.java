package exercise;

public class ex12_ArrayOfArray {
	//방혜자 교수님이 사랑하는 예제임
	
	
	public static void main(String[] args) {
		int[][] matrix = new int[3][];
		int i, j;

		for (i = 0; i < matrix.length; i++) {
			matrix[i] = new int[i+3];
		}

		for (i = 0; i < matrix.length; i++) {
			for (j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = i * matrix[i].length + j;
			}
		}

		for (i = 0; i < matrix.length; i++) {
			for (j = 0; j < matrix[i].length; j++) {
				System.out.print(" " + matrix[i][j]);
			}
			System.out.println();
		}
	}
}
