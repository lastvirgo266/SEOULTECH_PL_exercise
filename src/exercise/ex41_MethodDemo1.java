package exercise;

class Fruit1 {
	  int apple;
	  int straw;
	  int grapes;
	  int sum;
	  
	  Fruit1(int apple, int straw, int grapes) {
	    this.apple = apple ;
	    this.straw = straw ;
	    this.grapes = grapes ;
	    }
	  
	  public int count() {
	    sum = apple + straw + grapes;
	    return sum;
	  }
	}

public class ex41_MethodDemo1 {
	  public static void main(String[] args) {
		    int total;
		    Fruit1 f1 = new Fruit1(30, 30, 30);
		    total = f1.count();
		    System.out.println("객체 f1의 총 개수 = " + total);
		    System.out.println("객체 f1의 apple 개수 = " + f1.apple);
		    // 사과의 개수를 읽어 오기 위해 객체 속성 변수에 직접 접근
		    // 객체 속성 변수의 값을 직접 변경(f1.apple=90;)할 수도 있다
		    System.out.println("객체 f1의 straw 개수 = " + f1.straw);
		    System.out.println("객체 f1의 grapes 개수 = " + f1.grapes);
		  }
}
