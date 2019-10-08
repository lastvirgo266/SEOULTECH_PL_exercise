package exercise;

import java.util.Scanner;

public class ex30_SwitchSt {
	public static void main(String[] args) throws java.io.IOException{
		int month;
		System.out.println("Enter the Month Number 1~12");
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		String Mtos;
		
		switch(month){
		case 12: //이렇게하면 다중적인 케이스로 동일한 결과 산출가능
		case 1:
		case 2:
			Mtos = "겨울입니다.";
			break;
		case 3:
		case 4:
		case 5:
			Mtos = "봄입니다.";
			break;
		case 6:
		case 7:
		case 8:
			Mtos = "여름입니다.";
			break;
		case 9:
		case 10:
		case 11:
			Mtos = "가을입니다.";
			break;
		default:
			Mtos = "12개월 이내의 달이 아닙니다.";
		}
		System.out.println(month + "월은 " + Mtos);	
	}
}
