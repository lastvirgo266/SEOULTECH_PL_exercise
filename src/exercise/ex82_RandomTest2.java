package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

class Developer {
	private String skill;
	private int carri;

	public Developer(String skill, int carri) {
		this.skill = skill;
		this.carri = carri;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getCarri() {
		return new Integer(carri);
	}

	public void setCarri(int carri) {
		this.carri = carri;
	}

	@Override
	public String toString() {
		return getSkill() + "::" + getCarri();
	}
}


public class ex82_RandomTest2 {
	public static void printAll(List<Developer> list) {
		// �Ʒ��͵���
		// list.forEach((x) -> system.out::println(x))
		list.forEach(System.out::println);
	}

	public static void printDevOrderBySkill(List<Developer> list) {
		Collections.sort(list, 
		(Developer d1, Developer d2) -> d1.getSkill()
		.compareTo(d2.getSkill()));
		list.forEach(System.out::println);
	}

     public static int sumAll(List<Integer> numbers, Predicate<Integer> p) {
		int total = 0;
		for (int number : numbers) {
			if (p.test(number)) {
				total += number;
			}
		}
		return total;
	}

	public static void main(String[] args) {
		// ������ ����, �������
		new Thread(new Runnable() {
			public void run() {
				System.out.println("thread1....");
			}
		}).start();

		// ������ ����, ���ٽĻ��
		new Thread(() -> System.out.println("thread2....")).start();

		List<Developer> dev = new ArrayList();
		dev.add(new Developer("JAVA", 10));
		dev.add(new Developer("C", 15));
		dev.add(new Developer("ORACLE", 7));
		dev.add(new Developer("ANDROID", 5));
		printAll(dev);
		System.out.println("-------------------------------");
		printDevOrderBySkill(dev);
		System.out.println("-------------------------------");
		List<Integer> list = Arrays.asList(1, 8, 3, 9, 4, 7);
		int sum1 = sumAll(list, n -> true);//��� �� ��
		int sum2 = sumAll(list, n -> n % 2 == 0);//¦�� ��
		int sum3 = sumAll(list, n -> n > 5);// 5���� ū �� ��
		
		//�������
		list.forEach(System.out::println);
		System.out.println("��� �� �� " + sum1);
		System.out.println("¦�� �� " + sum2);
		System.out.println("5���� ū �� ��" + sum3);
	}
}

