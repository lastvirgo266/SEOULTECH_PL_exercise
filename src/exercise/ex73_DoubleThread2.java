package exercise;

class DoubleThreadTest2 extends Thread {
	public DoubleThreadTest2(String str) {
		setName(str);
	}
	public void run() {
		for (int i=1 ; i<=3 ; i++) {
			System.out.println(i + getName());
		}
		System.out.println("끝" + getName());
	}
}

public class ex73_DoubleThread2 {
	public static void main(String args[])throws Exception {
		DoubleThreadTest2 t1 = 
			new DoubleThreadTest2(" : 배우기 쉬운 자바");
		DoubleThreadTest2 t2 = 
			new DoubleThreadTest2(" : 배우기 어려운 자바");
		System.out.println("***** 스레드 시작 전 *****");
		t1.start();
		t2.start();
		//join 메서드는 쓰레드가 끝날때까지 기다리는 명령을 내리는 쓰레드
		t1.join();
		t2.join();
		System.out.println("***** 스레드 종료 후 *****");
	}
}
