package jp.co.aforce.pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeTest3 {
	
	public static void main(String[] args) {
		List<String> bunnbougu = new ArrayList<String>();
		
		bunnbougu.add("シャープペンシル");
		bunnbougu.add("ボールペン");
		bunnbougu.add("リングノート");
		bunnbougu.add("クリップ");
		bunnbougu.add("消しゴム");
		
		String bunnbougu1 = bunnbougu.get(1);
		System.out.println(bunnbougu1);
		
		List<String> syainn = new ArrayList<String>() ;
		
		syainn.add("山田太郎");
		syainn.add("鈴木花子");
		syainn.add("佐藤次郎");
		syainn.add("山田太郎");
		syainn.add("高橋三郎");
		
		String syainn1 = syainn.get(2);
		System.out.println(syainn1);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(15);
		list1.add(16);
		list1.add(19);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(12);
		list2.add(18);
		list2.add(20);
		
		list1.addAll(list2);
		Collections.sort(list1);
		for(Integer number: list1) {
			System.out.println(number);
		}
		
		System.out.println("");
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(13);
		list3.add(14);
		list3.add(17);
		list3.add(21);
		
		list1.add(13);
		list1.add(14);
		list1.add(17);
		list1.add(21);
		Collections.sort(list1);
		for(Integer number: list1) {
			System.out.println(number);
		}
		
		
		
		
		
		
		
	}
}
