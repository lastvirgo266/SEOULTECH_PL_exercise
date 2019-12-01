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
		// Expression부분에는 여러 개의 값을 갖는 data들이 
		// 존재하고, 하나씩 FormalParameter에 할당되면서 
		// for문의 내용이 반복적으로 수행.
	}
}
