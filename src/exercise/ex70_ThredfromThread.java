package exercise;

class ThreadTest extends Thread {
	  public void run() {
	    try {
	      for (int i=0 ; i<10 ; i++) {
	        Thread.sleep(200);
	        System.out.println("�˱⽱�� �ؼ��� �ڹ� :" + i);
	      }
	    }
	    catch(InterruptedException e ) {
	    System.out.println(e);
	    }
	  }
	}

public class ex70_ThredfromThread {
	public static void main(String args[]) {
	    ThreadTest t = new ThreadTest();     
	    t.start();
	    // �����带 �����ϰ� ���۽�Ų��
	    }
}
