
public class BankAccount {

private String accountOwner;
private int balance;
private int cardNumber = 0;
private String password;
	

public BankAccount(String Owner, int startingBalance, int cardNumber, String password) {
	this.accountOwner = Owner;
	this.balance = startingBalance;
	this.cardNumber = cardNumber;
	this.password = password;

}
	
public String getOwner() {
	return accountOwner;
}

public int getBalance() {
	return balance;
}

public int getCardNumber(String password) {
	if (password == this.password) {
		return this.cardNumber;
	} else {
		return 0;
	}
}

public void addBalance(int amount) {
	this.balance = this.balance + amount;
}

public void withdrawBalance(int amount) {
	this.balance = this.balance - amount;
}

public void inflation() {
	this.balance *= 0.95;
}

}
