package exercise;

public class ex02_CharString {
	public static void main(String[] args) {
		int i = '1' + 10; // '1' -> 49
		int j = '1' + 'A'; // 'A' -> 65
		int k = 66;
		
		System.out.println("\'1\'  + 10  ="+ i);
		System.out.println("\'1\' + \'A\' = " + j);
		
		//���� 66�� ���ڷ� ����ȯ
		System.out.println("66�� �����ڵ� ���ڷ�" + (char)k + "�Դϴ�");
		System.out.println("\"I am a String.\"");
	}

}
