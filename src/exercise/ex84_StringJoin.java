package exercise;

import java.lang.*;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class ex84_StringJoin {
	public static void main(String[] args) {
		//String.join 사용
		String result1 = String.join("-","2016","12","31");

		List<String> list = Arrays.asList("java","c","c++","oracle");
		String result2 = String.join(",",list);

		//StringJoiner 사용
		StringJoiner sj = new StringJoiner(".");
		sj.add("aaa");
		sj.add("bbb");
		sj.add("ccc");
		String result3 = sj.toString();

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
