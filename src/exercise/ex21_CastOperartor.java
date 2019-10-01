package exercise;

public class ex21_CastOperartor {
	public static void main(String[] args) {
		//2의 보수에 관련된 문제임
		
		int i = 0xffff; //655535 = 2^16 -1 임
		short s; //
		
		s = (short) i;
		System.out.println("i = " + i);
		System.out.println("s = "+ s);
	}
}
