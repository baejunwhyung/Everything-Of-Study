package day18;

public class SumEx {

	public static void main(String[] args) {
		sum(10,20);
		sum(3.14,1.23);
		sum(10,20,30);
		
	}
	//매서드의 매개변수 타입에 변화(오버로딩)
	static void sum(int x,int y) {
		System.out.println(x+y);
	}
	static void sum(double x,double y) {
		System.out.println(x+y);
	}
	//매서드의 매개변수 갯수에 변화
	static void sum(int x,int y,int z) {
		System.out.println(x+y+z);
	}
	

}
