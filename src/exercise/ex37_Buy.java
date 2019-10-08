package exercise;


//clone로 한번 바꿔보기

class Fruit {
	   int apple = 5;   // 객체 참조 변수
	   int straw = 10;
	   int grapes = 15;
	}


public class ex37_Buy extends Fruit{
	   public static void main(String[] args) {
           int quantity1, quantity2;

           Fruit f1 = new Fruit();  //상속 받은것만으로도 클래스 선언가능
           Fruit f2 = f1;
           quantity1 = f1.apple + f1.straw + f1.grapes;
           quantity2 = f2.apple + f2.straw + f2.(grapes;
           System.out.println("객체 f1의 초기 과일 개수 "+quantity1+"개");
           System.out.println("객체 f2의 초기 과일 개수 "+quantity2+"개");
           f1.apple = 10;
           f2.straw = 20;
           f1.grapes = 30;
           quantity1 = f1.apple + f1.straw + f1.grapes;
           quantity2 = f2.apple + f2.straw + f2.grapes;
           System.out.println("객체 f1의 값 변동 후 개수 "+quantity1+"개");
           System.out.println("객체 f2의 값 변동 후 개수 "+quantity2+"개");
   }
}
