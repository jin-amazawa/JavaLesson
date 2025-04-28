package jp.co.aforce.pratice;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PracticeTest4 {
	
	public static void main(String[] args) {
		
		
		
//		String[] animal = { "犬", "猫", "うさぎ", "へび"};
//		
//		String animalName = "うさぎ";
//		String msg = "リストは含まれていません。";
//		
//		for(int i = 0; i < animal.length; i++) {
//			if(animal[i].equals(animalName)) {
//				
//			}
//		}
		
		
		
		
		List<String> animals = new ArrayList<String>();
		
		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("へび");
		
		String animal1 = "トラ";
		
		if(animals.contains(animal1)) {
			System.out.println(animal1 + "はリストに含まれています");
		} else {
			System.out.println(animal1 + "はリストに含まれていません");
		}
		
		
		
		
		
//		List<String> animals = new ArrayList<String>();
//		
//		animals.add("犬");
//		animals.add("猫");
//		animals.add("うさぎ");
//		animals.add("へび");
//		
//		
//		String animal1 = "へび";
//		
//		if(animals.contains(animal1)) {
//			System.out.println(animal1 + "はリストに含まれていません");
//		}else {
//			System.out.println(animal1 + "はリストに含まれていません");
//		}
		
		
//		switch(animal1) {
//		case"犬":
//			System.out.println("犬はリストに含まれています");
//			break;
//		case"猫":
//			System.out.println("猫はリストに含まれています");
//			break;
//		case"うさぎ":
//			System.out.println("うさぎはリストに含まれています");
//			break;
//		case"へび":
//			System.out.println("へびはリストに含まれています");
//			break;
//		default:
//			System.out.println(animal1 + "はリストに含まれていません");
//		}
		
		
		
		
		Calendar cl = Calendar.getInstance();
		int month =  cl.get(Calendar.MONTH);
		month++;
		
		switch(month) {
		case 1:
			System.out.println("冬物セール");
			break;
		case 2:
			System.out.println("春物を売る");
			break;
		case 3:
			System.out.println("春物を売る");
			break;
		case 4:
			System.out.println("春物を売る");
			break;
		case 5:
			System.out.println("春物セール");
			break;
		case 6:
			System.out.println("夏物を売る");
			break;
		case 7:
			System.out.println("夏物を売る");
			break;
		case 8:
			System.out.println("夏物セール");
			break;
		case 9:
			System.out.println("秋物を売る");
			break;
		case 10:
			System.out.println("冬物を売る");
			break;
		case 11:
			System.out.println("冬物を売る");
			break;
		case 12:
			System.out.println("冬物を売る");
			break;
		default:
			System.out.println("不正な月です");
		}
	}
	
}
