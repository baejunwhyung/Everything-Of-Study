import java.util.InputMismatchException;
import java.util.Scanner;

public class Car {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        price pr = new price(2800, 3000, 5600);

        int num = 0;
        while (true) {
            try {
                int total = 0;
                System.out.println("=====================");
                System.out.println("넣으실 유종을 골라주세요.");
                System.out.println("1.휘발유");
                System.out.println("2.경유");
                System.out.println("3.고급휘발유");
                System.out.println("=====================");
                System.out.print("선택하세요:");
                num = sc.nextInt();
                if (num == 1) {
                    System.out.println("몇 L 넣으시겠습니까?");
                    System.out.println("1. 1L");
                    System.out.println("2. 2L");
                    System.out.println("3. 3L");
                    System.out.println("4. 4L");
                    System.out.print("숫자를 입력하세요:");
                    num = sc.nextInt();
                    for (int i = 1; i < 5; i++) {
                        if (num == i) {
                            total += pr.gasolinePrice * 1;
                            System.out.println(total + "원 입니다.");
                        } else if (num == i) {
                            total += pr.gasolinePrice * 2;
                            System.out.println(total + "원 입니다.");
                        } else if (num == i) {
                            total += pr.gasolinePrice * 3;
                            System.out.println(total + "원 입니다.");
                        } else if (num == i) {
                            total += pr.gasolinePrice * 4;
                            System.out.println(total + "원 입니다.");
                        }

                    }
                    if (num >= 5) {
                        System.out.println("                ");
                        System.out.println("다시 입력 해주세요.");
                        System.out.println("                ");

                    }

                }
                if (num == 2) {
                    System.out.println("몇 L 넣으시겠습니까?");
                    System.out.println("1: 1L");
                    System.out.println("2: 2L");
                    System.out.println("3: 3L");
                    System.out.println("4: 4L");
                    System.out.print("숫자를 입력하세요:");
                    num = sc.nextInt();
                    for (int i = 1; i < 5; i++) {
                        if (num == i) {
                            total += pr.gasolinePrice * 1;
                            System.out.println(total + "원 입니다.");
                        } else if (num == i) {
                            total += pr.gasolinePrice * 2;
                            System.out.println(total + "원 입니다.");
                        } else if (num == i) {
                            total += pr.gasolinePrice * 3;
                            System.out.println(total + "원 입니다.");
                        } else if (num == i) {
                            total += pr.gasolinePrice * 4;
                            System.out.println(total + "원 입니다.");
                        }
                    }
                    if (num >= 5) {
                        System.out.println("                ");
                        System.out.println("다시 입력 해주세요.");
                        System.out.println("                ");
                    }
                }
                if (num == 3) {
                    System.out.println("몇 L 넣으시겠습니까?");
                    System.out.println("1: 1L");
                    System.out.println("2: 2L");
                    System.out.println("3: 3L");
                    System.out.println("4: 4L");
                    System.out.print("숫자를 입력하세요:");
                    num = sc.nextInt();
                    for (int i = 1; i < 5; i++) {
                        if (num == i) {
                            total += pr.gasolinePrice * 1;
                            System.out.println(total + "원 입니다.");
                        } else if (num == i) {
                            total += pr.gasolinePrice * 2;
                            System.out.println(total + "원 입니다.");
                        } else if (num == i) {
                            total += pr.gasolinePrice * 3;
                            System.out.println(total + "원 입니다.");
                        } else if (num == i) {
                            total += pr.gasolinePrice * 4;
                            System.out.println(total + "원 입니다.");
                        }
                    }

                    if (num >= 5) {
                        System.out.println("                ");
                        System.out.println("다시 입력 해주세요.");
                        System.out.println("                ");
                    }
                }

            }catch(InputMismatchException e){
            System.out.println(e+"정수가 아닙니다.");

        }
        finally{
            System.out.println("다시 진행 해 주세요.");
             break;
         }
        }




    }
}

class price{
    int gasolinePrice;
    int diselPrice;
    int premiumGasoline;

    price(int gasolinePrice,int diselPrice,int premiumGasoline){
        this.gasolinePrice=gasolinePrice;
        this.diselPrice=diselPrice;
        this.premiumGasoline=premiumGasoline;

    }
}



