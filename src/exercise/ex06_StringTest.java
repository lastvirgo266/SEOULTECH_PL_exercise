package exercise;

public class ex06_StringTest {

	public static void main(String[] args){
		int a = 7;
		String b = " ";

		//왼쪽에서 순서대로 결합됨
		//String이 아닌 것과 연산을 할때는 새로운 스트링이 만들어짐(?)
		System.out.println(a + b);
		System.out.println(b + a);
		System.out.println(a + a + b);
		System.out.println(b + a + a);
	}

}
