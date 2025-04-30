package jp.co.aforce.ennshuu_teams;

public class ennshuu2 {
	public static void main(String[] args) {
		int score = 45;
		boolean submittedReport = true;
		
		if(score > 60 || submittedReport) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
	}
}
