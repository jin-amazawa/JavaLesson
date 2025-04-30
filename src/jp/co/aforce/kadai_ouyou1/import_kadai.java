package jp.co.aforce.kadai_ouyou1;

import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.Scanner;

public class import_kadai {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();

		list1.add("太郎");
		list1.add("次郎");
		list1.add("三郎");

		System.out.println(list1);

		Scanner scanner = new Scanner(System.in);
		System.out.println("円の半径を入力してください");
		double radius = scanner.nextDouble();
		scanner.close();

		double menseki = PI * radius * radius;

		System.out.printf("半径%.2fの円の面積は%.4fです%n", radius, menseki);

	}
}
