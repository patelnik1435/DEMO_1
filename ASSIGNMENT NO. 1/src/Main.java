class Bank {

	int manager(int accounts, int fd) {
		return accounts + fd;
	

	}

	int manager(int accounts) {
		return accounts;
	}
}

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println(bank.manager(125, 4500));
		System.out.println(bank.manager(450));

	}

}
