package exercise;

class Card{
	final int Number;
	final String Kind;
	
	Card(String kind, int num){
		Kind = kind;
		Number = num;
	}
	Card(){
		this("Heart", 1);
	}
	public String toString(){
		return Kind + " " + Number;
	}
}

//파이널 : 더이상 상속 할 수 없다는 의미가 됨(수정 불가)

public class ex64_FinalTest {
	public static void main(String[] args) {
		Card c = new Card("Heart", 10);	
					// 생성자로 인해 변수 초기화.
//		c.Number=5;	        // final 변수이기 때문에 변경불가.
		System.out.println(c.Kind);
		System.out.println(c.Number);
	}
}
