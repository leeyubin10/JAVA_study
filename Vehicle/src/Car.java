
public class Car extends Vehicle {
	double drivedistance;	// ����Ÿ�
	double fuels;	// ����� �ֹ��� ��
	double fuelefficiency;	//����
	Car(double dirvedistance, double fuels) {	// ����Ÿ�, �ֹ��� ���� �Ű������� ���� ������
		this.drivedistance = drivedistance;
		this.fuels = fuels;
	}
	Car() {		// �⺻ ������
		drivedistance = 124;
		fuels = 10;
	}
	double getkilosPerLiter() {		// ���� ��ȯ �޼ҵ� 
		System.out.println("getkilosPerLiter()������!!");
		fuelefficiency = drivedistance / fuels;
		return fuelefficiency;
	}
}
