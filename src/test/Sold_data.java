package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sold_data {
	private String book_name;
	private String author;
	private int sold_amount;
	private int price;
	
	public Sold_data(String book_name, String author, int sold_amount, int price) {
		this.book_name = book_name;
		this.author = author;
		this.sold_amount = sold_amount;
		this.price = price;
	}
	
	public static void main(String[] args) {
		List<Sold_data> data_list = new ArrayList<>();
		
		data_list.add((new Sold_data("Python入門","山田太郎", 1500, 2500)));
		data_list.add((new Sold_data("データ分析の基礎","鈴木花子", 1200, 3000)));
		data_list.add((new Sold_data("AI技術最前線","佐藤一郎", 800, 4000)));
		data_list.add((new Sold_data("Webデザイン講座","田中美咲", 2000, 2000)));
		data_list.add((new Sold_data("初めての機械学習","中村健一", 900, 3500)));
		
		int total_sold_price = 0;
		
		/**
		 * 総売り上げの計算
		 */
		for(Sold_data a: data_list) {
			total_sold_price += a.sold_amount * a.price;
		}
		System.out.println("総売上額：　" + total_sold_price + "円");
		
		/**
		 * 改行
		 */
		System.out.println("");
		
		/**
		 * 販売数が１０００を超える書籍を抽出する機能
		 */
		System.out.println("販売数が1000を超える書籍");
		for(Sold_data a: data_list) {
			int b = a.sold_amount;
			String c = a.book_name;
			if(b > 1000) {
				System.out.println("【" + c + "】");
			}
		}
		
		/**
		 * 価格当たりの販売効率が最も高い書籍を特定する機能
		 */
		System.out.println("");
		System.out.println("最も販売効率が高い書籍");
		
		/**
		 * 新しいリストを作成し、(販売数/価格)の値のみをそのリストに格納する
		 */
		List<Integer> hannbaikouritu = new ArrayList<Integer>();
		for(Sold_data a: data_list) {
			int b = a.sold_amount;
			int c = a.price;
			int d = b / c;
			hannbaikouritu.add(d);
		}
		
		/**
		 * ソート機能を使い、（一番値が大きい＝販売効率が高い）書籍をインデックス０に持ってくる
		 */
		hannbaikouritu.sort(Comparator.reverseOrder());
		int top_hannbaisuu = hannbaikouritu.get(0);
		
		for(Sold_data a: data_list) {
			int b = a.price;
			int c = top_hannbaisuu * b;
			int d = a.sold_amount;
			String e = a.book_name;
			if(c == d) {
				System.out.println("【" + e + "】");
			}
		}
		
		
	}
}
