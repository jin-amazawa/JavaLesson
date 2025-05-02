package jp.co.aforce.kadai_ouyou1;

public class BankAcount {
	private int balance; //残高
	private int amount;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		this.amount =  balance + amount;
	}
	
	public void withdraw(int amount) {
		this.amount -= amount;
		if(this.amount < 0) {
			System.out.println("残高が不足しています");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		BankAcount acount = new BankAcount();
		acount.setBalance(25);
		acount.deposit(45);
		
		acount.withdraw(80);
		
		System.out.println(acount.amount + "円"); 5 666666666666666666667\^221345890-\114y32121212121212121212121212121212121212121212121212121212121212121212121212121212121212121212
	}
	
}
