package exercise;

public class ex02_CharString {
	public static void main(String[] args) {
		int i = '1' + 10; // '1' -> 49
		int j = '1' + 'A'; // 'A' -> 65
		int k = 66;
		
		System.out.println("\'1\'  + 10  ="+ i);
		System.out.println("\'1\' + \'A\' = " + j);
		
		//정수 66을 문자로 형변환
		System.out.println("66은 유니코드 문자로" + (char)k + "입니다");
		System.out.println("\"I am a String.\"");
	}

}
