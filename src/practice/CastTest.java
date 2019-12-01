package practice;

class P1 {
	String name="성춘향";
	void print(){
	System.out.println("P1의 이름 : "+name);
	}
}

class P2 extends P1 {
	String name="이몽룡";
	void print(){
	System.out.println("P2의 이름 : "+name);
	}
}

class P3 extends P2 {
	String name="향단이";
	void print(){
	System.out.println("P3의 이름 : "+name);
	}
}
public class CastTest {
	public static void main(String[] args) {
	P1 p1_1,p1_2;	P2 p2_1,p2_2;  P3 p3_1;	
	
	p1_1=new P3();
	p1_2=new P2();
	p2_1=new P2();
	p2_2=new P3();	
	
	// 부모클래스로는 선언을 받지 못함
	//p3_1=new P1();
	//p3_1 = new P2();
	//p2_1 = new P1();
	
	p2_1=p2_2;
	p2_1.print();
	System.out.println(p2_1.name);
	//P3, 이몽룡
	
	
	//다운 캐스팅이 일어날때는 형변환이 일어남
//	p2_1=(P2)p1_2; //여기서 오류남
//	p2_1.print();
//	System.out.println(p2_1.name);
	//P2, 이몽룡
	
	p1_1=p2_2;
	p1_1.print();
	System.out.println(p1_1.name);
	//P3, 성춘향
	
	//업캐스팅
//	p2_2=(P3)p1_2;
//	System.out.println(p2_2.name);	
	//P3, 이몽룡
	
	}
	
}