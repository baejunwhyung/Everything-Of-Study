package day25;

public class Upcasting1 {

	public static void main(String[] args) {
		Student st=new Student("가길동",17,"게임하기",3);
	st.info();
	st.study();
	System.out.println(st.grade);
	//업캐스팅
	Human h1=new Student("나길동",17,"롤하기",3);
	h1.info();
//	h1.study();
//	System.out.println(h1.grade);
	}

}
class Human{
	String name;
	int age;
	String hobby;
	public Human(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	void info() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("hobby:"+hobby);
	}
}
class Student extends Human{
	int grade;
	public Student(String name,int age,String hobby,int grade) {
		super(name,age,hobby);
		this.grade=grade;
	}
	void info() {
		super.info();
		System.out.println("grade:"+grade);
	}
	void study(){
		System.out.println("공부하기");
	}
}
