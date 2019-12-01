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
	
	// for문
	for (int i = 0; i < 5; i++)
		testList.add(i);

	// 개선된 for문
	for (int i : testList) {
		System.out.println("개선된 for문 i::" + i);
	}

	// forEach문1
	testList.forEach(new Consumer<Integer>() {
		public void accept(Integer i) {
			System.out.println("forEach i::" + i);
		}
	});

	// forEach문2
	onJConsumer action = new onJConsumer();
	testList.forEach(action);

	// forEach람다식
	testList.forEach((i) -> System.out.println("람다식 i::" + i));

	// forEach ::
	testList.forEach(System.out::println);

	}
}
