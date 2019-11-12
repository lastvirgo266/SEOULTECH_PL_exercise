package exercise;

class Student{
	private String name;
	private int age;
	private int ID;
	
	public Student(String name, int age, int ID){
		setName(name);
		this.age=age;
		this.ID=ID;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void printAll(){
		System.out.println("name="+name+"\t age="+age+"\t ID="+ID);
	}
}

public class ex55_PassByValueStudent {
	public void passPrimitiveValue(int i){
		i=10;
	}
	
	public void passReferanceValue1(Student s){
		//레퍼런스 이기는 하나 새로운 객체를 만들어버림
		s = new Student("갑순이", 22, 98); //이 메서드가 끝나면 사라져 버림
		//s.printAll();
	}
	
	public void passReferanceValue2(Student s){
		s.setName("갑돌이");
	}
	
	public static void main(String[] args) {
		ex55_PassByValueStudent p = new ex55_PassByValueStudent();
		int i = 7;
		p.passPrimitiveValue(i);
		System.out.println("i="+i);
		Student s = new Student("홍길동", 20, 99);
		s.printAll();
		p.passReferanceValue1(s);
		s.printAll();
		p.passReferanceValue2(s);
		s.printAll();
	}
}
