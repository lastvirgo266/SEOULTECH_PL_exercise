package exercise;
import java.util.*;


public class ex78_Autoboxing {
	public static void main(String[] args) {
		// brfore
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(0, new Integer(42));
		int total = list.get(0).intValue();

		System.out.println(total);

		//////////////////////////////////////////////////

		// after - �����ڷ����� WrapperŬ�������� ��ȯ�� �ڵ�����		�� �̷������.

		//Wrapper
		
		// Autoboxing
		list.add(1, 43);
		// Auto-Unboxing
		int total2 = list.get(1);

		System.out.println(total2);
	}
}
