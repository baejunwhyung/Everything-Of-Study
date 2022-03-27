package day13;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random =new Random();
		int lottoNum[]=new int[6];
		int userNum[]=new int[6];
		int bonus,bonusUser;
		int count=0;
		
		for(int i=0;i<6;i++) {
			lottoNum[i]=random.nextInt(45)+1;
		}
		bonus =random.nextInt(45)+1;
		
		System.out.print("숫자 6개 입력:");
		for(int i=0;i<6;i++) {
			userNum[i]=sc.nextInt();
			
		}
		System.out.print("보너스 값 입력:");
		bonusUser=sc.nextInt();
		
		for(int j=0;j<6;j++) {
			for(int i=0;i<6;i++) {
				if(lottoNum[j]==userNum[i]) {
					count++;
			}
			
		}
		
	}
		if (count==6) {
			System.out.println("축하해요 1등이에용!");
		}
		else if(count==5) {
			if(bonus==bonusUser) {
				System.out.println("축하해여 2등이에용!");
			}
			else {
				System.out.println("축하해여 3등이에용!");
			}
			
		}
		else if(count==4) {
			System.out.println("축하애여 4등이에요!");
		}
		else if(count==3) {
			System.out.println("축하애여 5등이에오,,");
		}
		else {
			System.out.println("운이 없으시네요,,,");
		}
			
	}
		
			
}

	
	
	
	
	
	
	
	
	
	
	
	