package test;

import java.util.Scanner;

public class yuennti {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("年齢を入力してください");
		String old_string = scanner.nextLine();
		int old = Integer.parseInt(old_string);
		
		if(old < 0 || 100 < old) {
			System.out.println("正しい値を入力してください");
			return;
		}
		
		if(old <= 3) {
			System.out.println(old + "歳");
			System.out.println("無料です");
		}else if(4 <= old && old <= 12){
			System.out.println(old + "歳");
			System.out.println("入場料：５００円");
		}else if(13 <= old && old <=17) {
			System.out.println(old + "歳");
			System.out.println("入場料：８００円");
		}else if(18 <= old && old <= 59) {
			System.out.println(old + "歳");
			System.out.println("入場料：１２００円");
		}else {
			System.out.println(old + "歳");
			System.out.println("入場料：７００円");
		}
		
	}

}
