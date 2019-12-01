package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class onJConsumer implements Consumer<Integer> {
    public void accept(Integer i) {
	   System.out.println("Consumer impl i::" + i);
    }
}

public class ex81_RandomTest {
    public static void main(String[] args) {
	List<Integer> testList = new ArrayList<Integer>();
	
	// for��
	for (int i = 0; i < 5; i++)
		testList.add(i);

	// ������ for��
	for (int i : testList) {
		System.out.println("������ for�� i::" + i);
	}

	// forEach��1
	testList.forEach(new Consumer<Integer>() {
		public void accept(Integer i) {
			System.out.println("forEach i::" + i);
		}
	});

	// forEach��2
	onJConsumer action = new onJConsumer();
	testList.forEach(action);

	// forEach���ٽ�
	testList.forEach((i) -> System.out.println("���ٽ� i::" + i));

	// forEach ::
	testList.forEach(System.out::println);

	}
}
