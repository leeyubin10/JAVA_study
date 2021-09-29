public class Car implements Movable
{
	int speed;
	Car(int speed){	// speed 매개변수를 갖는 생성자
		this.speed = speed;
	}
	Car(){	//기본 생성자
		speed = 0;
	};
	public void speedUp(int amount) {	// 속도증가
		System.out.println("속도를 "+ amount + " km/h로 높입니다.");
	}
	public void speedDown(int amount) {	// 속도감소
		System.out.println("속도를 "+ amount + " km/h로 늦춥니다.");
	}
	public void printSpeed() {	// 속도출력
		System.out.println("현재 속도는 "+speed +"입니다");
	}
	public void TurnLeft() {	// 왼쪽회전
		System.out.println("왼쪽으로 회전하였습니다.");
	}
	public void TurnRight() {	// 오른쪽회전
		System.out.println("오른쪽으로 회전하였습니다.");
	}
}