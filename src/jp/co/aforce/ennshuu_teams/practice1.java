package jp.co.aforce.ennshuu_teams;

import java.util.Scanner;

public class practice1 {
	public static void main(String[] args) {
		System.out.println("整数を入力してください");
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		
		int num = Integer.parseInt(number);
		
		num += 5;
		System.out.println(num);
		
		System.out.println("整数を入力してください");
		String  number1 = scanner.nextLine();
		int num1 = Integer.parseInt(number1);
		System.out.println(num1);
		
		System.out.println("整数を入力しろ");
		String number2 = scanner.nextLine();
		int num2 = Integer.parseInt(number2);
		
		num2 -= 8;
		
		System.out.println(num2);
		
	}
}
