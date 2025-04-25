
public class Taiyaki {
	
		String filling;
		
		public void setFilling(String value) {
			filling = value;
		}
		
		public void showFilling() {
			System.out.println("このたい焼きの中身は：" + filling + "です。");
		}
		
		public static void main(String[] args) {
			Taiyaki taiyaki = new Taiyaki();
			Taiyaki taiyaki1 = new Taiyaki();
			
			taiyaki.filling = "クリーム";
			taiyaki1.filling = "あんこ";
			
			taiyaki.showFilling();
			taiyaki1.showFilling();
		}
		
}
