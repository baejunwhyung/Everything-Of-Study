package day08;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		//int book=2;
		Scanner sc = new Scanner(System.in);
		System.out.println("책 읽은 수를 입력하세요!");
		System.out.print("입력:");
		int book = sc.nextInt();
		switch(book/10) {
		case 0:
			System.out.println("조금더 노력하세요!");
			break;
		case 1:
			System.out.println("책 읽는 것을 즐기시는 분이네요!");
			break;
		case 2:
			System.out.println("책을 사랑하는 분이시네요!");
			break;
		default:
			System.out.println("당신은 다독왕입니다.");
		}
	}

}
