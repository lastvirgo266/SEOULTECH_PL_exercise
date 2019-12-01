package exercise;
import java.util.*;


public class ex79_EnhancedLoop {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		Integer[] a = {new Integer(1), new Integer(2), new Integer(3)};
		
		list.add(a[0]);
		list.add(a[1]);
		list.add(a[2]);

		// before
		for(Iterator i = list.iterator(); i.hasNext();) {
			Integer value = (Integer)i.next();
			System.out.println(value);	
		}

		////////////////////////////////////////////////////////////////

		// after
		for(Integer b : list) {
			System.out.println(b);
		}
		// for ( FormalParameter : Expression ) {
		//	statements;
		// }
		// Expression�κп��� ���� ���� ���� ���� data���� 
		// �����ϰ�, �ϳ��� FormalParameter�� �Ҵ�Ǹ鼭 
		// for���� ������ �ݺ������� ����.
	}
}
