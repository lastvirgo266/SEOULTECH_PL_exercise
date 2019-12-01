package exercise;

import java.util.*;
public class ex76_EnumSetTest {
	public enum Mon {Jan, Feb, Mar, Apr, May, Jun,
		Jul, Aug, Sep, Oct, Nov, Dec}
	// 달을 Mon이라는 열거형으로 표현하다.

	public static void main(String args[]) {
		System.out.print("여름 : ");
		for(Mon m: EnumSet.range(Mon.Jun, Mon.Aug)) {
			System.out.print(m + " ");
		}
	// EnumSet의 range()메소드를 이용해서 Jun과 Aug 사이의 값들을 
	// 출력한다.

		System.out.println();
	}
}
