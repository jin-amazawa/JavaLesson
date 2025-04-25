
public class Book {
	String title;
	String author;
	int price;
	
	void showInfo() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
	
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book(String title, String author) {
		this(title, author, 1500);
	}
	
	
//	public static void main(String[] args) {
//		Book book = new Book();
//		
//		book.title = "サンプル";
//		book.author = "佐藤";
//		book.price = 23;
//		
//		book.showInfo();
//		
//		
//	}
	
}
