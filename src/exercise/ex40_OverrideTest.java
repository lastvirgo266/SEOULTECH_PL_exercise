package exercise;

class Java{
	String teacher = "방혜자 교수님";
	public void print(String className){
		System.out.println(teacher + "의 " + className);
	}
}
class PL extends Java{
	@Override //이거붙여주는게 좋음
	public void print(String className){
		System.out.println("Over ride" + teacher + "의 " + className);
	}
}

public class ex40_OverrideTest {
	public static void main(String[] args){
		String class_1 = "Java 수업";
		String class_2 = "PL 수업";
		Java j = new Java();
		PL p = new PL();
		j.print(class_1);
		p.print(class_2);
		System.out.println("===================");
		Java jp = new PL(); // 자바로 해도 PL로  될수있음
		jp.print(class_2);
		
		//p = new Java(); //에러남
		//p = (PL) new Java(); //이러면 에러 안남
		//p.print(class_2); // 하지만 실행되면 에러남
		
	}
}
