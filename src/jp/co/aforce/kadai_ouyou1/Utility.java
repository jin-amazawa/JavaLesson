package jp.co.aforce.kadai_ouyou1;
import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utility {
	public static void greet() {
		System.out.println("おっす！");
	}
	
	public static void main(String[] args) {
		Utility.greet();
		
		Random random = new Random();
		List<Integer> numbers = new ArrayList<>();
		
		for(int i= 0; i < 10; i++) {
			int value = random.nextInt(100);
			numbers.add(value);
		}
		
		System.out.println(numbers);
		
		
		double a = 3.0;
		double b = 4.0;
		
		double syahenn = sqrt(pow(a, 2) + pow(b, 2));
		System.out.println("斜辺の長さ" + syahenn);
		
	}
}
