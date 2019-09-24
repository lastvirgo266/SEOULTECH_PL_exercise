package exercise;

public class ex17_InDecOperators {
	public static void main(String[] args) {
		int x = 3, y = 5;
		int a, b;
		
		++x; --y;
		System.out.println("x = " + x + " , y = " + y);
		
		a = (++x) + 1;
		System.out.println("x = " + x + " , a = " + a);
		
		b = (y++) + 1; // (여기서 y의 값은 4임)
		// 이 이후부터 y의 값은 5임
		System.out.println("y = " + y + " , b = "+ b);
		System.out.println("b = " + b);
		
		
		/*
		 * 전위 연산자가 후위연산자보다 속도 가 더 빠름
		 * ---> 후위연산자가 복사해서 일어나기 때문에 더 느림
		 * 
		 * 아래는 예시임
		 * ++x func(){ return x+1; }
		 * x++ func(){int a = new int; a = x+1 return a;}
		 */
	}
}
