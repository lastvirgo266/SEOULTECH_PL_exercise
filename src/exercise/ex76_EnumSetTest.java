package exercise;

import java.util.*;
public class ex76_EnumSetTest {
	public enum Mon {Jan, Feb, Mar, Apr, May, Jun,
		Jul, Aug, Sep, Oct, Nov, Dec}
	// ���� Mon�̶�� ���������� ǥ���ϴ�.

	public static void main(String args[]) {
		System.out.print("���� : ");
		for(Mon m: EnumSet.range(Mon.Jun, Mon.Aug)) {
			System.out.print(m + " ");
		}
	// EnumSet�� range()�޼ҵ带 �̿��ؼ� Jun�� Aug ������ ������ 
	// ����Ѵ�.

		System.out.println();
	}
}
