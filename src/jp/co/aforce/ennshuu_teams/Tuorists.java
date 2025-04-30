package jp.co.aforce.ennshuu_teams;

import java.util.ArrayList;
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
	}
}
