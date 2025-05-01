package jp.co.aforce.kadai_ouyou3;

import java.util.Scanner;

public class toi7 {
	public static void main(String[] args) {
		System.out.println("整数を入力してください");
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		
		try {
			int num = Integer.parseInt(number);
			num = 10 / num ;
			System.out.println(num);
		}catch(NumberFormatException e) {
			System.err.println("エラー：整数を入力してください");
	    }catch (ArithmeticException e) {
            System.out.println("0で割ることはできません");
        }
		
		System.out.println("処理は続いているのだ✨✨✨✨✨");
	}
}
