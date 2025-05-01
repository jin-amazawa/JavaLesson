package jp.co.aforce.ennshuu_teams;

import org.apache.commons.lang3.StringUtils;

public class ennshuu1 {
	public static void main(String[] args) {
		int a = 76;
		
		if (a > 60) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
		
		String reversed = StringUtils.reverse("example");
		System.out.println(reversed);
		
		String trimmed = StringUtils.trim(" example ");
		System.out.println(trimmed);
		
		boolean contains = StringUtils.contains("example", "amp");
		System.out.println(contains);

		
		
	}
}
