package oop1.ex;

public class AccountMain {
	public static void main(String[] args) {
		Account account = new Account();

		//입금
		account.deposit(10000);

		//출금
		account.withdraw(5000);

		//잔액부족
		account.withdraw(6000);

		System.out.println("잔액: " + account.balance);
	}
}
