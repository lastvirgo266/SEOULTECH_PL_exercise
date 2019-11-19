package exercise;

class RunnableTest implements Runnable {
	  public void run() {
	    try {
	      for (int i=0 ; i<10 ; i++) {
	        Thread.sleep(200);
	        System.out.println("�˱⽱�� �ؼ��� �ڹ� :" + i);
	      }
	    }
	    catch(InterruptedException e ) {
	    e.printStackTrace();
	    }
	  }
}

public class ex71_ThreadfromRunnable {
	public static void main(String args[]) {
	    RunnableTest r = new RunnableTest();
	    // Runnable �������̽� ��ü�� r�� ����
	    Thread t = new Thread(r);
	    // r�� �Ű� ������ �Ͽ� ������ ��ü t�� ����
	    t.start();
	}
}
