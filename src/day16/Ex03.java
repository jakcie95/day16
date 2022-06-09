package day16;

import java.util.ArrayList;

class A1{
	public void print() {
		System.out.println("A클래스");
	}
}
class B1 extends A1{
	public void print() {
		System.out.println("B클래스");
	}
	public void bbb() {}
}
class C1 extends A1{
	public void print() {
		System.out.println("C클래스");
	}
	public void add(Object a) {
		double d = (double)a;
		System.out.println(a);
	}
}
public class Ex03 {
public static void main(String[] args) {
	/*
	A1 a;
	B1 b;
	C1 c;
	a = new A1(); a.print();
	b = new B1(); b.print();
	c = new C1(); c.print();
	*/
	//int a = (int)1.111;// 캐스팅 : 형변환
	//업캐스팅 : 자식 클래스에서 부모형태로 받아서 사용
	A1 a;
	a = new B1(); a.print();
	
	a = new C1(); a.print();
	//다운캐스팅 : 부모형태를 자식형태로 형변환
	B1 b =(B1)a;
	
	ArrayList arr = new ArrayList();
	//Object 는 모든 값에 대한 부모임으로 모든 변수값을 받을수있음
	Object i = b;
	arr.add("bbb");
	
	C1 cc =new C1();
	cc.add(1111);
	
}
}
