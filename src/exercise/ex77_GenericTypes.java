package exercise;
import java.util.*;

public class ex77_GenericTypes {
	public static void main(String[] args) {
		//이전 자바
		ArrayList list = new ArrayList();

		list.add(0, new Integer(42));

		int total=((Integer)list.get(0)).intValue();

		System.out.println(total);

		//////////////////////////////////////////////////

		//자바 5.0 - 일반화 문법으로 캐스팅 없이 해결
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list2.add(0,new Integer(42));
		int total2 = list2.get(0).intValue();

		System.out.println(total2);
	}
}
