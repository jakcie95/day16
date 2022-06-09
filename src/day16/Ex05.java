package day16;
//추상화 상속에는 implements 사용
//추상화 상속시 추상화에 있는 메소드를 반드시 오버라이딩 해야함
class AAAA{
	public void aaa() {}
}
class Ex05Class extends AAAA implements Test{
	@Override
	public void test() {
		System.out.println("test");
	}
}		
public class Ex05 {
	public static void main(String[] args) {
		Ex05Class e = new Ex05Class();
		e.test();
	}
}
