package exercise;

import java.util.Vector;

public class ex74_VectorTest {
	public static void main(String[] args) {
		Vector v = new Vector(3,2);		
				// 3개의 배열 생성, 모자라면 2개씩 추가
		System.out.println(v.capacity());
		System.out.println();
		
		v.add("Start"); 		// {Start, ?, ?}
		v.addElement(10);	// {Start, 10, ?}
		v.add(1,"ok");		// {Start, ok, 10}
		
		System.out.println(v.get(1));
		System.out.println(v.capacity());
		System.out.println();
		
		v.addElement(20);	// {Start, ok, 10, 20, ?}
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println();
		
		v.add("End");		// {Start, ok, 10, 20, End}
		System.out.println(v.get(2));
		v.remove("ok");		// {Start, 10, 20, End, ?}
		v.remove(2);		// {Start, 10, End, ?, ?}
		System.out.println();
		
		System.out.println(v.capacity());
		v.trimToSize();		// {Start, 10, End}
		System.out.println(v.capacity());
		System.out.println();
		
		v.removeAllElements();	// {?, ?, ?}
		System.out.println(v.capacity());
		System.out.println(v.size());
	}
}




