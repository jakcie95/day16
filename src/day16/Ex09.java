package day16;

import java.util.Scanner;
interface Test01{
	public static final String NAME="홍길동";
	public String N = "aaa"; //static final 생략은 가능하나 들어가는 있음
}
public class Ex09 {
public static void main(String[] args) {
	System.out.println(Test01.NAME);
	
	//AA지상군 지상군 = new AA지상군();
	//BB공군 공군 = new BB공군();
	공방 u;
	System.out.println("적이 처들어 왔습니다.");
	System.out.println("1.지상군 2.공군");
	int choice = 0, num;
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	if(num == 1) {
		u =new AA지상군();
		System.out.println("지상군을 선택하셨습니다.");
	}else {
		u = new BB공군();
		System.out.println("공군을 선택하셨습니다.");
	}
	System.out.println("1.공격 , 2.방어");
	choice = sc.nextInt();
	if(choice == 1) u.attack();
	else if(choice == 2) u.defense();
}
}