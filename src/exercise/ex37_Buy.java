package exercise;


//clone�� �ѹ� �ٲ㺸��

class Fruit {
	   int apple = 5;   // ��ü ���� ����
	   int straw = 10;
	   int grapes = 15;
	}


public class ex37_Buy extends Fruit{
	   public static void main(String[] args) {
           int quantity1, quantity2;

           Fruit f1 = new Fruit();  //��� �����͸����ε� Ŭ���� ���𰡴�
           Fruit f2 = f1;
           quantity1 = f1.apple + f1.straw + f1.grapes;
           quantity2 = f2.apple + f2.straw + f2.(grapes;
           System.out.println("��ü f1�� �ʱ� ���� ���� "+quantity1+"��");
           System.out.println("��ü f2�� �ʱ� ���� ���� "+quantity2+"��");
           f1.apple = 10;
           f2.straw = 20;
           f1.grapes = 30;
           quantity1 = f1.apple + f1.straw + f1.grapes;
           quantity2 = f2.apple + f2.straw + f2.grapes;
           System.out.println("��ü f1�� �� ���� �� ���� "+quantity1+"��");
           System.out.println("��ü f2�� �� ���� �� ���� "+quantity2+"��");
   }
}
