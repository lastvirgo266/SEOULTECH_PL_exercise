package exercise;

class Car2{
	String color;
	String size;
	int door;
	
	Car2(String color, String size, int door) {
		this.color=color;
		this.size=size;
		this.door=door;
	}
}

class ColorofCar extends Car2{
	ColorofCar(String color) {
		super(color, "midsize", 4);
	}
}


class SizeofCar extends Car2{
	SizeofCar(String size) {
		super("red", size, 4);
	}
}


class NumberofDoor extends Car2{
	NumberofDoor(int door) {
		super("white", "fullsize", door);
	}
}

public class ex58_TestConsSuper {
	
	public static void main(String[] args) {
		NumberofDoor c1 = new NumberofDoor(2);
		SizeofCar c2 = new SizeofCar("compact");
		ColorofCar c3 = new ColorofCar("black");
		
		System.out.println("c1ÀÇ color="+c1.color+", 						CarSize="+c1.size+", door="+c1.door);
		System.out.println("c2ÀÇ color="+c2.color+", 						CarSize="+c2.size+", door="+c2.door);
		System.out.println("c3ÀÇ color="+c3.color+", 						CarSize="+c3.size+", door="+c3.door);
	}
	
}
