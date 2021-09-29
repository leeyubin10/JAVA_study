package example.account;
import java.util.Scanner;

public class InheritanceExample1 {
	public static void main(String args[]) {
		printMannual();
	}
	
	private void printMannual() {
		Scanner scan = new Scanner(System.in);
		CheckingAccount obj = new CheckingAccount("111-22-33333333", "홍길동", 0, "5555-6666-7777-8888");	//객체 생성
		obj.deposit(100000);	//초기 잔액 100000원으로 설정
		
		try {
			System.out.println("해당 번호를 누르세요 \n1.저금\n2.인출\n3.카드 지불\n4.종료");
			int num = scan.nextInt();
			
			if(num==1) {	//저금할 경우
				System.out.print("저금하실 금액을 입력하세요: ");
				int amount = scan.nextInt();
				obj.deposit(amount);
				System.out.println("잔액:" + obj.getBalance());
			}
			else if(num==2) {	//인출할 경우
				System.out.print("인출하실 금액을 입력하세요:");
				int amount = scan.nextInt();
				obj.withdraw(amount);	//인출 금액이 잔액보다 클 경우 예외 발생
				System.out.println("잔액:" + obj.getBalance());
			}
			else if(num==3) {	//카드 지불할 경우
				try {
					System.out.print("지불하실 금액을 입력하세요: ");
					int payment = scan.nextInt();
					int paidAmount = obj.pay("5555-6666-7777-8888", payment);	//지불액이 잔액보다 클 경우 예외 발생
					System.out.println("지불액:" + paidAmount);
					System.out.println("잔액:" + obj.getBalance());
				}
				catch (Exception e) {	//예외 처리
					String msg = e.getMessage();
					System.out.println(msg);
					printMannual();	//재실행
				}
			}
			else if(num==4) {	//종료할 경우
				System.out.print("종료되었습니다.");
			}
			else {	//1~4번 이외의 번호를 눌렀을 경우 예외 발생
				throw new Exception("잘못 누르셨습니다.\n");
			}
		}
		catch(Exception e) {	//예외 처리
			String msg = e.getMessage();
			System.out.print(msg);
			printMannual();	//재실행
		}
	}
}
