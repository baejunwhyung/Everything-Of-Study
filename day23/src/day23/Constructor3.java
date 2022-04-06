package day23;

public class Constructor3 {

	public static void main(String[] args) {
		Bclass b=new Bclass("가길동");
		System.out.println(b.name);
		Bclass b1=new Bclass();
		System.out.println(b1);
	}

}
class Bclass{
	String name;
	//생산자오버로딩: 여러개 생성자 중복정의
	Bclass(){}
	Bclass(String name){
		System.out.println("Bclass의 매개변수 생성자()");
		this.name=name;
	}
}
