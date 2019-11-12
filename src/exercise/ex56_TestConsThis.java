package exercise;

class Car1{
	String color;
	String size;
	int door;

	Car1() {
		this("white", "fullsize", 2);
	}
	
	Car1(String color) {
		this(color, "midsize", 4);
	}
	
	Car1(String color, String size) {
		this(color, size, 4);
	}

	Car1(String color, String size, int door) {
		this.color=color;
		this.size=size;
		this.door=door;
	}
	
}

public class ex56_TestConsThis {
	
	public static void main(String[] args) {
		Car1 c1 = new Car1();
		Car1 c2 = new Car1("blue");
		Car1 c3 = new Car1("red", "compact");
		
		System.out.println("c1ÀÇ color="+c1.color+", 						CarSize="+c1.size+", door="+c1.door);
		System.out.println("c2ÀÇ color="+c2.color+", 						CarSize="+c2.size+", door="+c2.door);
		System.out.println("c3ÀÇ color="+c3.color+", 						CarSize="+c3.size+", door="+c3.door);
	}
	
}
