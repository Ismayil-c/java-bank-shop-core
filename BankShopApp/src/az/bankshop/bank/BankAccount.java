package az.bankshop.bank;

public class BankAccount {
	 private double balance;

	    public BankAccount(double balance) {
	        this.balance = balance;
	    }

	    public boolean canPay(double amount) {
	        return balance >= amount;
	    }

	    public void pay(double amount) {
	        balance -= amount;
	    }

	    public double getBalance() {
	        return balance;
	    }
}
