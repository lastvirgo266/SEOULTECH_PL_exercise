package exercise;

class Name_1{
	String surName = "박";
	String s1, s2;

	public void print(String s1, String s2){
		this.s1 = s1;
		this.s2 = s2;
		System.out.println(surName + s1 + "의 직업은 " + s2);
	}
}

class Name_2 extends Name_1{
	String surName = "류";
	String s1, s2;

	public void print(String s1, String s2){
		this.s1 = s1;
		this.s2 = s2;
		System.out.println(surName + s1 + "의 직업은 " + s2);
	}
}

class Name_3 extends Name_2{
	String s1, s2;
	//Name3의 surName이 정의되어있지 않기때문에 Name_2의 surName을 불러옴
	
	public void print(String s1, String s2){
		this.s1 = s1;
		this.s2 = s2;
		System.out.println(surName + s1 + "의 직업은 " + s2 + "3번째임");
	}
}

public class ex63_CastingTest {
	public static void main(String[] args) {
		String givenName_1 = "지성";
		String givenName_2 = "세리";
		String givenName_3 = "현진";
		
		Name_1 n1 = new Name_1();
		Name_2 n2 = new Name_2();
		Name_3 n3 = new Name_3();
		
		n1.print(givenName_1, "축구선수");
		n3.print(givenName_3, "야구선수");

		n1 = n3;				
//		n2 = (Name_2)n1;	// n1 = n3;를 주석처리하면 
					// 컴파일은 가능하나 런타임 에러.
		System.out.println("이 선수의 성은 " + n1.surName);	
		n1.print(givenName_2, "골프선수");
		// 위에 두 문장에서 n1을 n2로 바꿔서 출력해 볼 것.
	}
}
