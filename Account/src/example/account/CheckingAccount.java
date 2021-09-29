package example.account;

public class CheckingAccount extends Account{	//Account Ŭ������ ����ϴ� CheckingAccount Ŭ����
	private String cardNo;	//����ī���ȣ
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {	//������
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	int pay(String cardNo, int amount) throws Exception {	//���� ����
		if (!cardNo.equals(this.cardNo) || (getBalance() < amount))
			throw new Exception("������ �Ұ����մϴ�.");
		return withdraw(amount);
	}

}
