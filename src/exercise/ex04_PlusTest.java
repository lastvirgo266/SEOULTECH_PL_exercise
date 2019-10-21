package exercise;

public class ex04_PlusTest {
	public static void main(String[] args) 
	{
		short a, b, c;
		a = 1;
		b = 2;
		//c = a+b;
		/*
		 	두 피연산자 중 하나라도 double 형이면 다른 하나도 double 형으로 변환하고 결과도 double형이다.

			그렇지 않고 두 피연산자 중 하나라도 float 형이면 다른 하나도 float 형으로 변환하고 결과도 float형이다.

			그렇지 않고 두 피연산자 중 하나라도 long 형이면 다른 하나도 long 형으로 변환하고 결과도 long형이다.

			그렇지 않다면 두 피연산자를 모두 int 형으로 변환하고 결과도 int 형이다. <-- 중요함

		 */
		
		
		//compile error - 연산시 자동으로 int로 promotion이 일어남
		c = (short)(a+b);
		System.out.println(c);
		
		
		
		
		
	}
}
