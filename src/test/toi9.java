package test;

import java.util.Scanner;

public class toi9 {
	public static void main(String[] args) {
		System.out.println("商品の単価を入力してください：");
		Scanner scanner = new Scanner(System.in);

		String tannka_string = scanner.nextLine();
		int tannka = Integer.parseInt(tannka_string);

		System.out.println("購入個数を入力してください");
		String amount_string = scanner.nextLine();
		int amount = Integer.parseInt(amount_string);

		double subtotal = tannka * amount;

		double discount_price = 0;
		int discount_amount = 0;
		if (subtotal >= 10000) {
			discount_price = subtotal * 0.1;
		} else if (subtotal > 5000) {
			discount_price = subtotal * 0.05;
		}

		if (amount >= 5) {
			discount_amount = amount * 100;
		} else if (amount >= 3) {
			discount_amount = amount * 50;
		}

		double total_discount = discount_price + discount_amount;
		double total = subtotal - total_discount;
		double shouhizei = total * 0.1;
		double zeikomi_price = total * 1.1;
		
		int subtotal1 = (int) subtotal;
		int total_discount1 = (int) total_discount;
		int total1 = (int) total;
		int shouhizei1 = (int) shouhizei;
		int zeikomi_price1 = (int) zeikomi_price;
		
		System.out.println("商品の単価：" + tannka);
		System.out.println("購入個数：" + amount);
		System.out.println("割引前の合計金額：" + subtotal1);
		System.out.println("割引額：" + total_discount1);
		System.out.println("割引後の価格：" + total1);
		System.out.println("消費税額：" + shouhizei1);
		System.out.println("税込み価格：" + zeikomi_price1);
		
		
		

	}
}
