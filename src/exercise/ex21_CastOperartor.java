package exercise;

public class ex21_CastOperartor {
	public static void main(String[] args) {
		//2�� ������ ���õ� ������
		
		int i = 0xffff; //655535 = 2^16 -1 ��
		short s; //
		
		s = (short) i;
		System.out.println("i = " + i);
		System.out.println("s = "+ s);
	}
}
