interface Movable	//인터페이스 생성
{
	public void speedUp(int amount);	// speedUp() 메소드 생성
	public void speedDown(int amount);	// speedDown() 메소드 생성
	final int speed = 100;	// 변수 초기화
	public void printSpeed();	// printSpeed() 메소드 생성
}