package day05;

public class Logic_operator {

	public static void main(String[] args) {
		boolean a=true;
		boolean b=false;
		boolean c=true;
		
		System.out.println(a&&b); //a값과 b 값이 모두 참 때만 결과가 참 : AND
		System.out.println(a&&c); //a값과 c 값이 모두 참일 때만 결과가 참 : AND
		System.out.println((2<4)&&(4<5)); //true&&true = true
		
		System.out.println(a||b); //a 혹은 b가 true라면 결과가 true : OR
		System.out.println(a||c); //a 혹은 c가 true라면 결과가 true : OR
		System.out.println(b||b); //false == false: OR
		
		System.out.println(!a); //a가 true면 false, false면 true

	}

}
