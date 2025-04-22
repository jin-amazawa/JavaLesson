import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		System.out.println("こんにちは、Javaの世界！");	
		
		//3章以降
		int num = 10;
		System.out.println(num);
		
		
		int a = 8;
		int b = 5;
		int sum = a + b;
		System.out.println(sum);
		
		
		int width = 7;
		int height = 4;
		int area = width * height;
		System.out.println(area);
		
		String name = "Java";
		double version = 17.0;
		boolean ifFun = true;
		System.out.println(name + version + true);
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("あなたの名前を入力してください");
		String name1 = scanner.nextLine();
		System.out.println("こんにちは" + name1 + "さん！");
		
		
		System.out.print ("名前を入力してください：");
		String name2 = scanner.nextLine();
		
		System.out.print("年齢を入力してください:");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("誕生日をyyyy-mm-ddで入力してください");
		String birthdaystr = scanner.nextLine();
		
		String message = String.format("名前:%s, 年齢: %d歳, 誕生日: %s", name2, age, birthdaystr);
		System.out.println(message);
		
		
        System.out.print("商品名を入力してください：");
        String productName = scanner.nextLine();
        System.out.print("価格を入力してください（円）：");
        int price = scanner.nextInt();
        System.out.print("購入個数を入力してください：");
        int quantity = scanner.nextInt();
        int total = price * quantity;
        System.out.println("商品: " + productName + "は、価格：" + price + "円なので、" + quantity + "個買うと" + total + "円です。");
		
		
		scanner.close();
		
		
        Date todayDate = new Date();
        LocalDate today = todayDate
        		.toInstant()
        		.atZone(ZoneId.systemDefault())
        		.toLocalDate();
        
        LocalDate inputBirthday = LocalDate.parse(birthdaystr);
        LocalDate birthday = LocalDate.of(today.getYear(), 
        								inputBirthday.getMonth(), 
        								inputBirthday.getDayOfMonth());

        if (birthday.isBefore(today) || birthday.equals(today)) {
            birthday = birthday.plusYears(1);
        }
        
        long daysUntil = ChronoUnit.DAYS.between(today, birthday);
        System.out.println("あなたの誕生日まであと " + daysUntil + " 日です！");
    }

	
}
