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

//���̳� : ���̻� ��� �� �� ���ٴ� �ǹ̰� ��(���� �Ұ�)

public class ex64_FinalTest {
	public static void main(String[] args) {
		Card c = new Card("Heart", 10);	
					// �����ڷ� ���� ���� �ʱ�ȭ.
//		c.Number=5;	        // final �����̱� ������ ����Ұ�.
		System.out.println(c.Kind);
		System.out.println(c.Number);
	}
}
