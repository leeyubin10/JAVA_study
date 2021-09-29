package example.account;
import java.util.Scanner;

public class InheritanceExample1 {
	public static void main(String args[]) {
		printMannual();
	}
	
	private void printMannual() {
		Scanner scan = new Scanner(System.in);
		CheckingAccount obj = new CheckingAccount("111-22-33333333", "ȫ�浿", 0, "5555-6666-7777-8888");	//��ü ����
		obj.deposit(100000);	//�ʱ� �ܾ� 100000������ ����
		
		try {
			System.out.println("�ش� ��ȣ�� �������� \n1.����\n2.����\n3.ī�� ����\n4.����");
			int num = scan.nextInt();
			
			if(num==1) {	//������ ���
				System.out.print("�����Ͻ� �ݾ��� �Է��ϼ���: ");
				int amount = scan.nextInt();
				obj.deposit(amount);
				System.out.println("�ܾ�:" + obj.getBalance());
			}
			else if(num==2) {	//������ ���
				System.out.print("�����Ͻ� �ݾ��� �Է��ϼ���:");
				int amount = scan.nextInt();
				obj.withdraw(amount);	//���� �ݾ��� �ܾ׺��� Ŭ ��� ���� �߻�
				System.out.println("�ܾ�:" + obj.getBalance());
			}
			else if(num==3) {	//ī�� ������ ���
				try {
					System.out.print("�����Ͻ� �ݾ��� �Է��ϼ���: ");
					int payment = scan.nextInt();
					int paidAmount = obj.pay("5555-6666-7777-8888", payment);	//���Ҿ��� �ܾ׺��� Ŭ ��� ���� �߻�
					System.out.println("���Ҿ�:" + paidAmount);
					System.out.println("�ܾ�:" + obj.getBalance());
				}
				catch (Exception e) {	//���� ó��
					String msg = e.getMessage();
					System.out.println(msg);
					printMannual();	//�����
				}
			}
			else if(num==4) {	//������ ���
				System.out.print("����Ǿ����ϴ�.");
			}
			else {	//1~4�� �̿��� ��ȣ�� ������ ��� ���� �߻�
				throw new Exception("�߸� �����̽��ϴ�.\n");
			}
		}
		catch(Exception e) {	//���� ó��
			String msg = e.getMessage();
			System.out.print(msg);
			printMannual();	//�����
		}
	}
}
