package day10;

import java.util.*;

public class UpdownGame {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		Random random=new Random();
		int num=random.nextInt(100)+1;
		int user= -1;
		while(user!=num) {
			System.out.print("숫자를 입력하세요:");
			user=sc.nextInt();
			//user ==num
			if(user==num) {
				System.out.println("정답입니당!");
				//user==num
			}
			//user>num
			else if(user>num) {
				System.out.println("Down!");
				
			}
			//user<down
			else {
				System.out.println("Up!");
				
			}
		}
	}

}
