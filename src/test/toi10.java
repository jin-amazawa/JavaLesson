package test;

import java.util.ArrayList;
import java.util.List;

public class toi10 {
	public static void main(String[] args) {
		List<String> ID = new ArrayList<String>();
		ID.add("TASK001");
		ID.add("TASK002");
		ID.add("TASK003");
		ID.add("TASK001");
		ID.add("TASK004");
		ID.add("TASK002");
		

		System.out.println("処理済みのタスクIDの一覧：");

		for (String a : ID) {
			System.out.println("-" + a);
		}
		
		String new_ID1 = "TASK003";
		String new_ID2 = "TASK005";
		
		if(ID.contains(new_ID1)) {
			System.out.println("タスクID" + new_ID1 + "は既に処理済みです");	
		}else {
			System.out.println("タスクID" + new_ID1 + "は未処理です");
		}
		
		if(ID.contains(new_ID2)) {
			System.out.println("タスクID" + new_ID2 + "は既に処理済みです");	
		}else {
			System.out.println("タスクID" + new_ID2 + "は未処理です");
		}
		
		int i = 0;
		for(String a: ID) {
			i += 1;
		}
		System.out.println("処理済みのタスクの総数: " + i);
		
	}
}
