
public class Main {

	public static void main(String[] args) {

		BankAccount bankAccountOne = new BankAccount("Peter", 50000, 1234567, "peterhasasmalldick");
		
		bankAccountOne.addBalance(25000);
		bankAccountOne.withdrawBalance(2000);
		bankAccountOne.inflation();
		
		System.out.println(bankAccountOne.getBalance() + "\n");
	}
	
	

}
