package jp.co.aforce.kadai_ouyou3;

import java.util.Scanner;

public class reigai {
	public static void main(String[] args) {
		System.out.println("整数を入力してください");
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		
		try {
			int num = Integer.parseInt(number);
			num = num / 2;
			System.out.println(num);
		}catch(NumberFormatException e) {
			System.err.println("エラー：整数を入力してください");
		}finally{
			scanner.close();
		}
		
		System.out.println("処理を継続します");
		
		
	}
}
