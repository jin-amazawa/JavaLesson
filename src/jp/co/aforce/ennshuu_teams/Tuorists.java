package jp.co.aforce.ennshuu_teams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Tuorists {
	private String city;
	private int japanese;
	private int foreigh;
	
	public Tuorists(String city, int japanese, int foreigh) {
		this.city = city;
		this.japanese = japanese;
		this.foreigh = foreigh;
	}
	
	public static void main(String[] args) {
		
		Tuorists Tokyo = new Tuorists("東京", 1500000, 2500000);
		Tuorists Osaka = new Tuorists("大阪", 1200000, 1800000);
		Tuorists Kyoto = new Tuorists("京都", 800000, 1200000);
		Tuorists Fukuoka = new Tuorists("福岡", 500000, 800000);
		Tuorists Sapporo = new Tuorists("札幌", 400000, 600000);
		
		List<Tuorists> tuorist = new ArrayList<>();
		tuorist.add(Tokyo);
		tuorist.add(Osaka);
		tuorist.add(Kyoto);
		tuorist.add(Fukuoka);
		tuorist.add(Sapporo);
		
		int total = 0;
		for(Tuorists data : tuorist) {
			int subtotal = data.japanese + data.foreigh;
			total += subtotal;
		}
		System.out.println("全都市の総観光客数：" + total);
		
		System.out.println("");
		
		System.out.println("100万人を超える都市：");
		for(Tuorists big_city : tuorist) {
			int subtotal = big_city.japanese + big_city.foreigh;
			if(subtotal > 1000000) {
				String large_city = big_city.city;
				System.out.print(large_city + "  ");
			}
		}
		
		System.out.println("");
		System.out.println("");
		
		List<Integer> foreign_number = new ArrayList<Integer>();
		for(Tuorists data : tuorist) {
			int a = data.foreigh;
			foreign_number.add(a);
		}
		
		foreign_number.sort(Comparator.reverseOrder());
		int biggest = foreign_number.get(0);
		
		for(Tuorists data : tuorist) {
			if(data.foreigh == biggest) {
				String biggest_city = data.city;
				System.out.println("外国人が最も多い都市は　：" + biggest_city);
			}
		}
		
	}
}
