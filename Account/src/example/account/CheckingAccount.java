package example.account;

public class CheckingAccount extends Account{	//Account 클래스를 상속하는 CheckingAccount 클래스
	private String cardNo;	//직불카드번호
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {	//생성자
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	int pay(String cardNo, int amount) throws Exception {	//사용액 지불
		if (!cardNo.equals(this.cardNo) || (getBalance() < amount))
			throw new Exception("지불이 불가능합니다.");
		return withdraw(amount);
	}

}
