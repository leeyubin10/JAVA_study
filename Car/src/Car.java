public class Car implements Movable
{
	int speed;
	Car(int speed){	// speed �Ű������� ���� ������
		this.speed = speed;
	}
	Car(){	//�⺻ ������
		speed = 0;
	};
	public void speedUp(int amount) {	// �ӵ�����
		System.out.println("�ӵ��� "+ amount + " km/h�� ���Դϴ�.");
	}
	public void speedDown(int amount) {	// �ӵ�����
		System.out.println("�ӵ��� "+ amount + " km/h�� ����ϴ�.");
	}
	public void printSpeed() {	// �ӵ����
		System.out.println("���� �ӵ��� "+speed +"�Դϴ�");
	}
	public void TurnLeft() {	// ����ȸ��
		System.out.println("�������� ȸ���Ͽ����ϴ�.");
	}
	public void TurnRight() {	// ������ȸ��
		System.out.println("���������� ȸ���Ͽ����ϴ�.");
	}
}