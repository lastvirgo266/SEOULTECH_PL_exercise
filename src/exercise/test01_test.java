package exercise;

public class test01_test {
	public static void main(String [] args) {
		int twoD[][] = new int[4][];
		
		twoD[0] = new int[1];
		twoD[1] = new int[2];
		twoD[2] = new int[3];
		twoD[3] = new int[4];
		
		int i,j,num = 3;
		
		for(i = 0; i<4; i++)
			for(j = 0; j< twoD[i].length; j++) {
				twoD[i][j] =  (short)((i-num)>>>j);
				num +=i;
			}
		
		for(i=0; i<4; i++) {
			for(j = 0; j<i+1; j++)
				System.out.print(twoD[i][j] + " ");
			System.out.println();
		}
	}
	
}
