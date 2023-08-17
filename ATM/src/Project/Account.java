package Project;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance =0;
	private double savingBalance =0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat= new DecimalFormat("'$' ###, ##0.00");
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	public double calCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	public double calCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	public double calSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: "+ moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from Checking Account: ");
		double amount = input.nextDouble();
		
		if ((checkingBalance - amount)>=0) {
			calCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance: "+ moneyFormat.format(checkingBalance));
			
		}else {
			System.out.println("Balance cannot be Negative." + "\n");
		}
	}
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance: "+ moneyFormat.format("savingBalance"));
		System.out.println("Amount you want to withdraw from saving Account: ");
		double amount = input.nextDouble();
		if((savingBalance - amount)>=0) {
			calCheckingWithdraw(amount);
			System.out.println("New saving Account Balance: "+ moneyFormat.format(savingBalance));
		}else {
			System.out.println("Balance Cannot be Negative."+ "\n");
		}
	}
	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance: "+ moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to Deposit from Checking Account: ");
		double amount = input.nextDouble();
		
		if ((checkingBalance +amount)>=0) {
			calCheckingDeposit(amount);
			System.out.println("New Checking Balance: "+ moneyFormat.format(checkingBalance));
		}else {
			System.out.println("Balance Cannot be Negative."+"\n");
		}
	}
	public void getSavingDeposit() {
		System.out.println("Saving Account Balance: "+ moneyFormat.format(savingBalance));
		System.out.println("Amount you want to Deposit from Saving Account: ");
		double amount = input.nextDouble();
		
		if((savingBalance + amount)>=0) {
			calSavingDeposit(amount);
			System.out.println("New saving Account Balance: "+ moneyFormat.format(savingBalance));
		}else {
			System.out.println("Balance Cannot be Negative."+"\n");
		}
	}
}
	
		
		
	


