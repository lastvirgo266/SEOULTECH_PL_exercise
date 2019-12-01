package practice;

public abstract class Calculator {
	final public static int CALCULATE_ADD = 1;		// µ¡¼À¿¬»ê
	final public static int CALCULATE_SQUARE_ADD = 2;	// Á¦°ö ÈÄ µ¡¼À¿¬»ê
	final public static int CALCULATE_REMAINDER = 3;	// ³ª¸ÓÁö ¿¬»ê

	private int value1;
	private int value2;
	
	public int getValue1() {
		return value1;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}
	
	public int getValue2() {
		return value2;
	}

	public void setValue2(int value2) {
		this.value2 = value2;
	}

	protected abstract int calculation();
	
	protected void printResultValue(int result){		
		System.out.println(result);
	}
}

class AddCalculationManager extends Calculator{
	protected int calculation(){
		int value1 = this.getValue1();
		int value2 = this.getValue2();
		int addResult = value1 + value2;
		
		return addResult;
	}
}


class RemainderCalculationManager extends Calculator{
	protected int calculation(){
		int value1 = this.getValue1();
		int value2 = this.getValue2();
		int remainderResult = value1 % value2;
		
		return remainderResult;
	}
}


class SquareAddCalculationManager extends Calculator{
	protected int calculation(){
		int value1 = this.getValue1();
		int value2 = this.getValue2();
		int squareAddResult = value1*value1 + value2+value2;
		
		return squareAddResult;
	}
}


class CalculatorFactory {
	static public Calculator getInstanse(int type){
		if (type == Calculator.CALCULATE_ADD) return new AddCalculationManager();
		else if (type == Calculator.CALCULATE_REMAINDER) return new RemainderCalculationManager();
		else if (type == Calculator.CALCULATE_SQUARE_ADD) return new SquareAddCalculationManager();
	    else throw new RuntimeException("Invalid type : " + type);
	}
}


//public static void main(String[] args) {
//	public static void main(String[] args) {
//		int type = Integer.parseInt(args[0]);
//		Calculator ca = CalculatorFactory.getInstanse(type);
//		ca.setValue1(5);
//		ca.setValue2(2);
//		int result = ca.calculation();
//		ca.printResultValue(result);
//	}
//}
