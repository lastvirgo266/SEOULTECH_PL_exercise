package exercise;

public class ex20_AssignmentOperators {
	public static void main(String[] args) {
		int x, y = 2;
		
		
		//Integer.toBinaryString(x) --> 2진수로 보여줌 [앞에 오는 0은 모조리 없애줌]
		
		x = 10; x += y; System.out.println(" 1. x = "+ x);
		x = 10; x -= y; System.out.println(" 2. x = "+ x);
		x = 10; x *= y; System.out.println(" 3. x = "+ x);
		x = 10; x /= y; System.out.println(" 4. x = "+ x);
		x = 10; x%= y; System.out.println(" 5. x = "+ x);
		
		// 논리곱 논리합
		x = 10; x &=y; System.out.println(" 6. x = "+ x);
		x = 10; x |= y; System.out.println(" 7. x = "+ x);
		
		
		x = 10; x ^= y; System.out.println(" 8. x = "+ x);
		x = 10; x <<= y; System.out.println(" 9. x = "+ x);
		x = 10; x >>= y; System.out.println("10. x = "+ x);
		
		//꺾쇠 3개 : 자바에는 unsigned 자료형이 없어서 unsigned를 유지한채로
		//실무에서는 쓸일 없음
		// <<< 는 없음
		x = 10; x >>>= y; System.out.println("11. x = "+ x);//msb가 1이 아닌 0이 되서 양수의 값이 튀어나옴
		x = -10; x >>= y; System.out.println("12. x = "+ x);
		x = -10; x >>>= y; System.out.println("13. x = "+ x);
	}
}
