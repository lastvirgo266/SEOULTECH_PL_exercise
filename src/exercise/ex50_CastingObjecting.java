package exercise;

// 이거 진짜 중요한 문제임!

class AA  { 
	int var = 10; 
	void method()  { 
		System.out.println("1"); 
	} 
}


class BB extends AA  { 
	int var = 20; 
	void method()  { 
		System.out.println("2 var :" + var); 
	} 
}
	
public class ex50_CastingObjecting {
	public static void main(String[] args)  { 
		AA a = new BB();
		System.out.println(a.var); 
		a.method(); 
	} 
}
