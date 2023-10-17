package assignment_corejava;
import java.util.Scanner;
class insufficientFunds extends Exception{
	
	double amount;
	
	public insufficientFunds(double amount) {
		this.amount = amount;
	}
	
	double getAmount() {
		return this.amount;
	}	
}
	
class checkingAccount{
	long accono;
	double balance;
	
	public checkingAccount(long accono) {
		this.accono = accono;
		System.out.println("Account number :"+accono);
	}
	
	void deposite (double amt) {
		
		this.balance = this.balance+amt;
	}
	
	void withdraw (double amt) throws insufficientFunds {
		
		if(amt<= this.balance) {
			this.balance = this.balance-amt;
		}
		else {
			double needs = amt-this.balance;
			throw new insufficientFunds(needs);
		}
	}
	void checkBalance()
	{
		System.out.println("Current Balance : "+this.balance);
	}
}

public class A27_create_a_custom_exception_if_Customer_withdraw_amount {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter account no :");
	long accono = sc.nextLong();
	checkingAccount ca = new checkingAccount(accono);
	ca.checkBalance();
	
	//deposite
	
	System.out.println("Enter amount for deposite :");
	double amt = sc.nextDouble();
	ca.deposite(amt);
	ca.checkBalance();
	 
	//withdraw
	
	try {
		System.out.println("Enter the withdraw amout :");
		amt = sc.nextDouble();
		ca.withdraw(amt);
		ca.checkBalance();
		System.out.println("Withdraw succesfully");
		
	} catch (insufficientFunds e) {
		System.out.println("Sorry, insufficient balance, you need more "+e.getAmount()+" Rs. To perform this transaction");
		
	}
}
}
