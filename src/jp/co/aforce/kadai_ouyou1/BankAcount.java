package jp.co.aforce.kadai_ouyou1;

public class BankAcount {
	private int balance;
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
	
	public static void main(String[] args) {
		
		BankAcount acount = new BankAcount();
		acount.setBalance(25);
		acount.deposit(45);
		
		System.out.println(acount.amount);
	}
	
}
