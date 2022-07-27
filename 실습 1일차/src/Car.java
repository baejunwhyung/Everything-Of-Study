import java.util.Scanner;

public class Car {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        price pr=new price(2800,3000);
        int total=0;
        int num=0;
        while(true){
            System.out.println("=====================");
            System.out.println("기름 넣을 좋류를 고르시오.");
            System.out.println("1.휘발유");
            System.out.println("2.경유");
            System.out.println("=====================");
            System.out.print("선택하세요:");
             num=sc.nextInt();
             if(num==1){
                 System.out.println("몇 L 넣으시겠습니까?");
                 System.out.println("1. 1L");
                 System.out.println("2. 2L");
                 System.out.println("3. 3L");
                 System.out.println("4. 4L");
                 System.out.print("숫자를 입력하세요:");
                 num=sc.nextInt();

                 if(num==1){
                     total += pr.gasolinePrice * 1;
                     System.out.println(total+"원 입니다.");
                 }
                 else if(num==2){
                     total += pr.gasolinePrice *2;
                     System.out.println(total+"원 입니다.");
                 }
                 else if(num==3){
                     total += pr.gasolinePrice *3;
                     System.out.println(total+"원 입니다.");
                 }
                 else if(num==4){
                     total += pr.gasolinePrice *4;
                     System.out.println(total+"원 입니다.");
                 }
                 else{
                     System.out.println("                ");
                     System.out.println("다시 입력 해주세요.");
                     System.out.println("                ");
                     System.out.println("                ");
                 }




             }
             if(num==2){
                 System.out.println("몇 L 넣으시겠습니까?");
                 System.out.println("1: 1L");
                 System.out.println("2: 2L");
                 System.out.println("3: 3L");
                 System.out.println("4: 4L");
                 System.out.print("숫자를 입력하세요:");
                 num=sc.nextInt();
                 if(num==1){
                     total += pr.gasolinePrice*1;
                     System.out.println(total+"원 입니다.");
                 }
                 else if(num==2){
                     total += pr.gasolinePrice*2;
                     System.out.println(total+"원 입니다.");
                 }
                 else if(num==3){
                     total += pr.gasolinePrice*3;
                     System.out.println(total+"원 입니다.");
                 }
                 else if(num==4){
                     total += pr.gasolinePrice*4;
                     System.out.println(total+"원 입니다.");
                 }
                 else{
                     System.out.println("                ");
                     System.out.println("다시 입력 해주세요.");
                     System.out.println("                ");
                     System.out.println("                ");
                 }
             }

        }



    }
}

class price{
    int gasolinePrice;
    int diselPrice;

    price(int gasolinePrice,int diselPrice){
        this.gasolinePrice=gasolinePrice;
        this.diselPrice=diselPrice;

    }
}