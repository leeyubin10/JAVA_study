
abstract class Vehicle {	// �߻� Ŭ����
	int speed;	// �ӵ�
	abstract double getkilosPerLiter();		// ���� ��ȯ �߻� �޼ҵ�
	public void printSpeed()	// �ӵ� ��� �޼ҵ�
	{
		System.out.println("���� �ӵ��� "+speed +"�Դϴ�");
	}
}
