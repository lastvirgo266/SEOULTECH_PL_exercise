package exercise;

interface IStack {
	  void push(int item); 
	  int pop(); 
}



	class FixedStack implements IStack {
	  private int stack[];
	  private int tos;

	  FixedStack(int size) {
	    stack = new int[size];
	    tos = -1;
	  }

	  public void push(int item) {  // �������̽����� ���ǵ� �޼ҵ� ����
	    if(tos==stack.length-1)  
	      System.out.println("������ ��ã��");
	    else 
	      stack[++tos] = item;
	  }

	  public int pop() {  // �������̽����� ���ǵ� �޼ҵ� ����
	    if(tos < 0) {
	      System.out.println("������ �����");
	      return 0;
	    }
	    else 
	      return stack[tos--];
	  }
	}

//default��� ����� �ڹٿ� �߰��Ǿ���
	
public class ex66_InterfaceTest {
	public static void main(String args[]) {
	    FixedStack mystack1 = new FixedStack(10);
	    FixedStack mystack2 = new FixedStack(5);

	    for(int i=0 ; i<10 ; i++) 
	      mystack1.push(i);
	    for(int i=0 ; i<5 ; i++) 
	      mystack2.push(i);

	    System.out.println("���� : mystack1");
	    for(int i=0 ; i<10 ; i++) 
	       System.out.print(mystack1.pop() + "  ");
	    
	    System.out.println();
	    System.out.println("���� : mystack2");
	    for(int i=0 ; i<5 ; i++) 
	       System.out.print(mystack2.pop() + "  ");
	  }
}
