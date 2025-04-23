import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConfirmFruits {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("購入した果物を入力してください");
		String fruit = scanner.nextLine();
		
		Map<String, Integer> prices = new HashMap<>();
		prices.put("りんご", 100);
		prices.put("みかん", 80);
		prices.put("バナナ", 120);
		prices.put("いちご", 300);
		
		if(prices.containsKey(fruit)) {
			int price = prices.get(fruit);
			System.out.println(fruit + ":" + price + "円");
		}else {
			System.out.println("申し訳ありませんが、その商品は取り扱っておりません。");
		}
		
		scanner.close();
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("購入したい果物を入力してください");
//		String fruit = scanner.nextLine();
//		String price;
//		
//		switch(fruit) {
//		case"apple":
//			price = "100円";
//			break;
//		case"orange":
//			price = "80円";
//			break;
//		case"banana":
//			price = "120円";
//			break;
//		case"strawberry":
//			price = "300円";
//			break;
//		default:
//			price = "申し訳ありませんが、その商品は取り扱っておりません。";
//			
//		}
//		
//		System.out.println(price);
//		
//		scanner.close();
		
	}
}
