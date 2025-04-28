import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConfirmFruits1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("あなたの購入したい果物は？");
		String fruit = scanner.nextLine();
		scanner.close();
		
		Map<String,Integer> prices = new HashMap<>();
		prices.put("りんご", 100);
		prices.put("みかん", 80);
		prices.put("バナナ", 150);
		prices.put("イチゴ", 300);
		
		if(prices.containsKey(fruit)) {
			int price = prices.get(fruit);
			System.out.println(fruit + ":" + price + "円");
		}else {
			System.out.println("申し訳ありませんが、その商品は取り扱っておりません。");
		}
		
	}
}
