package day16;
/*
 Overriding
 - 상속 받은 자식에서 부모의 메소드와 동일하게 만드는것
 - 부모의 메소드가 실행되는게 아니라 자식의 메소드가 실행 되는것
 - 조건
 - 부모의 메소드와 형식이 같아야한다.
  //pri < pro < pu
  // 부모와 같거나 부모보다 크면 오버라이딩 가능
 */
class Ferrai{
	private int ye;
	public Ferrai(int ye) { this.ye = ye;}
	public int getYe() {return ye;}
	public void speed() {
		System.out.println(ye+"년식 페라리 속도 300km");
	}
}
class NewFerrai extends Ferrai{
	public NewFerrai(int y) {super(y);}
	public void autoSystem() {
		System.out.println("자동 운전 모드 시작합니다");
	}
	public void speed() {
		System.out.println(super.getYe()+"년식 페라리 400km");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		NewFerrai f = new NewFerrai(2023);
		f.speed();
		f.autoSystem();
	}
}
