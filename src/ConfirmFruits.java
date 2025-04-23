import java.util.Scanner;

public class ConfirmFruits {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("購入したい果物を英語で入力してください");
		String fruits = scanner.nextLine();
		String price;
		
		switch(fruits) {
		case"apple":
			price = "100円";
			break;
		case"orange":
			price = "80円";
			break;
		case"banana":
			price = "120円";
			break;
		case"strawberry":
			price = "300円";
			break;
		default:
			price = "申し訳ありませんが、その商品は取り扱っておりません。";
			
		}
		
		System.out.println(price);
		
	}
}
