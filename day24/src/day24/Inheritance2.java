package day24;

public class Inheritance2 {

	public static void main(String[] args) {
		Leader ld = new Leader();
		ld.say();
		
	}

}
class Student2{
	void learn() {
		System.out.println("배우기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("선생님 안녕하세요");
	}
}
class Leader extends Student2{
	void lead() {}
	void say() { //메서드 오버라이딩 (덮어쓰기)
		System.out.println("선생님께 인사!");
		super.say();
	}
	
}