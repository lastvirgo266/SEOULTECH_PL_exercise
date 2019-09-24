package exercise;

public class ex08_EqualsTest {

	public static void main(String[] args)  { 
		String str1, str2; 
		str1 = "서울과학기술대학교"; 
		str2 = str1; 
		
		/*
		 * 위와같은 형태는
		 * 1 ---> "서울과학기술대학교" <----2
		 * 이런식으로 1과 2 모두 "서울과학기술대학교" 를 가리키게된다.
		 */
		
		System.out.println("String1 : " + str1); 
		System.out.println("String2 : " + str2);
		System.out.println("Same object? " + (str1 == str2));
		
		str1 = "컴퓨터공학과";

		System.out.println("String1 : " + str1); 
		System.out.println("String2 : " + str2);
		System.out.println("Same object? " + (str1 == str2));
		
		/*
		 * 이때 false가 뜨는 이유는
		 * str1 ---> "컴퓨터공학과"
		 * str2 ---> "서울과학기술대학교"
		 * 를 서로 다르게 가리키기 때문이다.
		 */
		
		
		
		str1 = "서울과학기술대학교";
		System.out.println("String1 : " + str1); 
		System.out.println("String2 : " + str2);
		System.out.println("Same object? " + (str1 == str2)); 
		
		/*
		 * 다시 str1 ---> "서울과학기술대학교" <--- str2
		 * 이런식으로가리키기 때문에 true를 가리키게된다.
		 */
		// --> 다시 "서울과학기술대학교" 로 가리켜도 true라고 표시되는 이유는 JVM 때문에 일어나는 것 임.


		str2 = new String(str1); //새롭게 생성을 했다(새롭게 생성을 시킴)
		System.out.println("String1 : " + str1); 
		System.out.println("String2 : " + str2); 
		System.out.println("Same object? " + (str1 == str2)); 
		System.out.println("Same value? " + str1.equals(str2)); 
		
		
		/*
		 * str1 --> "서울과학기술대학교"
		 * str2 --> "서울과학기술대학교"
		 * 
		 */
		
		
		String str3, str4;
		str3 = "성림학사";
		str4 = str3;
		
		System.out.println("String1 : " + str3); 
		System.out.println("String2 : " + str4);
		System.out.println("Same object? " + (str3 == str4)); 
		
	}
	
}
