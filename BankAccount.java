package CS176L;

public class BankAccount {

	public double accountBalance;
	public String accountName;
	
	
	public BankAccount(String name, double amount) {
		accountName = name;
		accountBalance= amount;
		
	}
	
	public double Balance() {
		return accountBalance;
	}
	public void deposit(double amount) {
		accountBalance += amount;
		
		
	}
	public void withdraw(double amount) {
		accountBalance -= amount;

		
	}
	public double getBalance() {
	 return accountBalance;
	}
	
	public static void main(String[] args) {
		BankAccount liv = new BankAccount("Olivia", 1000);
		System.out.println("Account name: "+ liv.accountName );
		liv.deposit(200.0);
		liv.withdraw(100.0);
		System.out.println("Current Balance" + liv.getBalance());
		
		
		
		
		
		
		

	}

}
