
abstract class Vehicle {	// 추상 클래스
	int speed;	// 속도
	abstract double getkilosPerLiter();		// 연비 반환 추상 메소드
	public void printSpeed()	// 속도 출력 메소드
	{
		System.out.println("현재 속도는 "+speed +"입니다");
	}
}
