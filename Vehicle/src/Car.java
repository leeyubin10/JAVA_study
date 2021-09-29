
public class Car extends Vehicle {
	double drivedistance;	// 주행거리
	double fuels;	// 사용한 휘발유 양
	double fuelefficiency;	//연비
	Car(double dirvedistance, double fuels) {	// 주행거리, 휘발유 양을 매개변수로 갖는 생성자
		this.drivedistance = drivedistance;
		this.fuels = fuels;
	}
	Car() {		// 기본 생성자
		drivedistance = 124;
		fuels = 10;
	}
	double getkilosPerLiter() {		// 연비 반환 메소드 
		System.out.println("getkilosPerLiter()재정의!!");
		fuelefficiency = drivedistance / fuels;
		return fuelefficiency;
	}
}
