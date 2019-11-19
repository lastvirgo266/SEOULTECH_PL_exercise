package exercise;

class RunnableTest implements Runnable {
	  public void run() {
	    try {
	      for (int i=0 ; i<10 ; i++) {
	        Thread.sleep(200);
	        System.out.println("알기쉽게 해설한 자바 :" + i);
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
	    // Runnable 인터페이스 객체로 r을 생성
	    Thread t = new Thread(r);
	    // r을 매개 변수로 하여 스레드 객체 t를 생성
	    t.start();
	}
}
