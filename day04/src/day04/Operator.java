package day04;

public class Operator {

	public static void main(String[] args) {
		int a=10; //a 변수에 10값 저
		int b=3; //b qustndp 3 값 저장
		double doubleB=3; //자동형 변환 
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println(a/doubleB); //정수/실수= 실수
		System.out.println(a%doubleB); //정수%실수= 실수 
		System.out.println(doubleB%b); //실수%정수= 실수
		

	}

}
