package exercise;
import java.util.*;

public class ex77_GenericTypes {
	public static void main(String[] args) {
		//���� �ڹ�
		ArrayList list = new ArrayList();

		list.add(0, new Integer(42));

		int total=((Integer)list.get(0)).intValue();

		System.out.println(total);

		//////////////////////////////////////////////////

		//�ڹ� 5.0 - �Ϲ�ȭ �������� ĳ���� ���� �ذ�
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list2.add(0,new Integer(42));
		int total2 = list2.get(0).intValue();

		System.out.println(total2);
	}
}
