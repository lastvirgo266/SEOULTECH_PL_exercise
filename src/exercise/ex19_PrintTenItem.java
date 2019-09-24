package exercise;

public class ex19_PrintTenItem {
    public static void main(String[] args) {
	int i, n = 25;
	
	//주석을 해제해 보면 i값은 초기화가 안되있음(n은 초기화 되있음)
	//System.out.println("i의 값 : "+ i);
	
	for (i = 1; i <= n; ++ i) {
		// 삼항 연산자가 우선순위가 낮아서 꼭 괄호를 묶어서 실행시켜주어야함
		System.out.print(i + ((i % 10 == 0 || i == n ) ? "\n" : " "));
		}
	
	
	}
}
