package day17;

public class Method3 {

	public static void main(String[] args) {
		System.out.println("사각형의 넓이:"+calcurator(10,20));
		
	}
	static int calcurator(int a,int b) {
		System.out.println("<계산을 시작합니다.>");
		int area= a*b;
		return area;
	}

}
