package example.account;

public class Account {
	private String accountNo;	//계좌번호
	private String ownerName;	//예금주 이름
	private int balance;	//잔액
	
	Account(String accountNo, String ownerName, int balance) {	//생성자
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	void setBalance(int balacne) {	//계좌 잔액 설정
		this.balance = balance;
	}
	
	int getBalance() {	//잔액 반환
		return balance;
	}
	
	void deposit(int amount) {	//예금
		balance += amount;
	}
	
	int withdraw(int amount) throws Exception {	//인출
		if (balance < amount)
			throw new Exception("잔액이 부족합니다.\n");
		balance -= amount;
		return amount;
	}

}
