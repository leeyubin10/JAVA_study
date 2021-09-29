package example.account;

public class Account {
	private String accountNo;	//���¹�ȣ
	private String ownerName;	//������ �̸�
	private int balance;	//�ܾ�
	
	Account(String accountNo, String ownerName, int balance) {	//������
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	void setBalance(int balacne) {	//���� �ܾ� ����
		this.balance = balance;
	}
	
	int getBalance() {	//�ܾ� ��ȯ
		return balance;
	}
	
	void deposit(int amount) {	//����
		balance += amount;
	}
	
	int withdraw(int amount) throws Exception {	//����
		if (balance < amount)
			throw new Exception("�ܾ��� �����մϴ�.\n");
		balance -= amount;
		return amount;
	}

}
