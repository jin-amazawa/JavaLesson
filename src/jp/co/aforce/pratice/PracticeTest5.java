package jp.co.aforce.pratice;

import java.util.ArrayList;
import java.util.Random;

public class PracticeTest5 {
	
	public static void main(String[] args) {
		
		
		Random random = new Random();
		int fortune = random.nextInt(5);
		String result = "";		
		
		switch(fortune) {
		case 1:
			result = "吉です";
			break;
		case 2:
			result = "中吉です";
			break;
		case 3:
			result = "大吉です";
			break;
		case 4:
			result = "凶です";
			break;
		default:
			result = "大凶です";
		
		}
		System.out.println(result);
		
//		int r = new java.util.Random().nextInt();
//		
//		int fortune = r;
		
//		System.out.println("fortune " + r);
		
		
		
//		Random rnd = new Random();
//		int fortune = rnd.nextInt(4) + 1;
//		switch(fortune) {
//		case 1:
//			System.out.println("吉です");
//			break;
//		case 2:
//			System.out.println("中吉です");
//			break;
//		case 3:
//			System.out.println("大吉です");
//			break;
//		default:
//			System.out.println("凶です");
//		}
		
		
		for(int i = 1; i <= 100; i++) {
			if(i % 7 == 0) {
				System.out.print(i + ",");
			}
		}
		
		
		for(int i = 1; i <=9; i++) {
			System.out.println();
			
			for(int j = 1; j < 9; j++) {
				System.out.printf("%3d", (i*j));
			}
		}
		
		for(int num = 10; num <= 19; num++) {
			System.out.println();
			
			for(int num1 = 10; num1 < 19; num1++) {
				System.out.printf("%3d ", (num*num1));
			}
		}
		
		ArrayList<String> employees = new ArrayList<>();					
		employees.add("斎藤");					
		employees.add("田中");					
		employees.add("山田");					
		employees.add("鈴木");					
		employees.add("高橋");					
							
		ArrayList<String> submitters = new ArrayList<>();					
		submitters.add("斎藤");					
		submitters.add("高橋");	
		
		String submitter1 = submitters.get(0);
		String submitter2 = submitters.get(1);
		
		employees.remove(submitter1);
		employees.remove(submitter2);
		
		System.out.println("");
		System.out.println("未提出者は：");
		System.out.println(employees);
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	}
	
}
