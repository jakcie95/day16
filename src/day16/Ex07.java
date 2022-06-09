package day16;
interface 공방{
	public void attack();
	public void defense();
}
class AA지상군 implements 공방{
	public void 총알장전() {System.out.println("총알장전");}
	public void 전진앞으로() {System.out.println("");}
	public void attack() {
		총알장전();
		System.out.println("공격 개시~");
	}
	public void defense() {
		System.out.println("지상군 방어합니다.");
	}
}
class BB공군 implements 공방{
	public void attack() {
		System.out.println("공군이 공격합니다.");
	}
	public void defense() {
		System.out.println("공군 방어합니다.");
	}
}
class AB{
	public void printAttack(공방 aa) {
		aa.attack();
	}
	
}
public class Ex07 {
public static void main(String[] args) {
	AB ab = new AB();
	AA지상군 aa = new AA지상군();
	ab.printAttack(aa);
	
	ab.printAttack(new BB공군());
}
}
