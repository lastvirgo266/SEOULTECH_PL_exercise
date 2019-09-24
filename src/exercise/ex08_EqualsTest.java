package exercise;

public class ex08_EqualsTest {

	public static void main(String[] args)  { 
		String str1, str2; 
		str1 = "������б�����б�"; 
		str2 = str1; 
		
		/*
		 * ���Ͱ��� ���´�
		 * 1 ---> "������б�����б�" <----2
		 * �̷������� 1�� 2 ��� "������б�����б�" �� ����Ű�Եȴ�.
		 */
		
		System.out.println("String1 : " + str1); 
		System.out.println("String2 : " + str2);
		System.out.println("Same object? " + (str1 == str2));
		
		str1 = "��ǻ�Ͱ��а�";

		System.out.println("String1 : " + str1); 
		System.out.println("String2 : " + str2);
		System.out.println("Same object? " + (str1 == str2));
		
		/*
		 * �̶� false�� �ߴ� ������
		 * str1 ---> "��ǻ�Ͱ��а�"
		 * str2 ---> "������б�����б�"
		 * �� ���� �ٸ��� ����Ű�� �����̴�.
		 */
		
		
		
		str1 = "������б�����б�";
		System.out.println("String1 : " + str1); 
		System.out.println("String2 : " + str2);
		System.out.println("Same object? " + (str1 == str2)); 
		
		/*
		 * �ٽ� str1 ---> "������б�����б�" <--- str2
		 * �̷������ΰ���Ű�� ������ true�� ����Ű�Եȴ�.
		 */
		// --> �ٽ� "������б�����б�" �� �����ѵ� true��� ǥ�õǴ� ������ JVM ������ �Ͼ�� �� ��.


		str2 = new String(str1); //���Ӱ� ������ �ߴ�(���Ӱ� ������ ��Ŵ)
		System.out.println("String1 : " + str1); 
		System.out.println("String2 : " + str2); 
		System.out.println("Same object? " + (str1 == str2)); 
		System.out.println("Same value? " + str1.equals(str2)); 
		
		
		/*
		 * str1 --> "������б�����б�"
		 * str2 --> "������б�����б�"
		 * 
		 */
		
		
		String str3, str4;
		str3 = "�����л�";
		str4 = str3;
		
		System.out.println("String1 : " + str3); 
		System.out.println("String2 : " + str4);
		System.out.println("Same object? " + (str3 == str4)); 
		
	}
	
}
