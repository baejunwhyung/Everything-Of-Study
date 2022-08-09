import java.util.InputMismatchException;
import java.util.Scanner;

public class Car {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        price pr = new price(2800, 3000, 5600);
        event et = new event("세차권", "티슈", "주유할인쿠폰");
        totalMoney tm = new totalMoney();
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
                int oilNum = sc.nextInt();
                if (oilNum == 1) {
                    System.out.println("몇 L 넣으시겠습니까?");
                    System.out.println("1. 1L");
                    System.out.println("2. 2L");
                    System.out.println("3. 3L");
                    System.out.println("4. 4L");
                    System.out.println("5. 직접입력 ");
                    System.out.print("입력하세요:");
                    int gasolineNum = sc.nextInt();

                    if (gasolineNum == 1) {
                        total += pr.gasolinePrice * 1;
                        System.out.println(total + "원 입니다.");
                    } else if (gasolineNum == 2) {
                        total += pr.gasolinePrice * 2;
                        System.out.println(total + "원 입니다.");
                    } else if (gasolineNum == 3) {
                        total += pr.gasolinePrice * 3;
                        System.out.println(total + "원 입니다.");
                    } else if (gasolineNum == 4) {
                        total += pr.gasolinePrice * 4;
                        System.out.println(total + "원 입니다.");
                    } else if (gasolineNum == 5) {
                        System.out.println("몇 L 주유 하시겠습니까?");
                        System.out.print("입력:");
                        gasolineNum = sc.nextInt();
                        total += pr.gasolinePrice * gasolineNum;
                        System.out.println(total + "원 입니다.");
                    } else {
                        System.out.println("                ");
                        System.out.println("다시 입력 해주세요.");
                        System.out.println("                ");

                    }

                }
                if (oilNum == 2) {
                    System.out.println("몇 L 넣으시겠습니까?");
                    System.out.println("1. 1L");
                    System.out.println("2. 2L");
                    System.out.println("3. 3L");
                    System.out.println("4. 4L");
                    System.out.println("5. 직접입력");
                    System.out.print("입력하세요:");
                    int diselNum = sc.nextInt();
                    if (diselNum == 1) {
                        total += pr.diselPrice * 1;
                        System.out.println(total + "원 입니다.");
                    } else if (diselNum == 2) {
                        total += pr.diselPrice * 2;
                        System.out.println(total + "원 입니다.");
                    } else if (diselNum == 3) {
                        total += pr.diselPrice * 3;
                        System.out.println(total + "원 입니다.");
                    } else if (diselNum == 4) {
                        total += pr.diselPrice * 4;
                        System.out.println(total + "원 입니다.");
                    } else if (diselNum == 5) {
                        System.out.println("몇 L 주유 하시겠습니까?");
                        System.out.print("입력:");
                        total += pr.diselPrice * diselNum;
                        System.out.println(total + "원 입니다.");

                    } else {
                        System.out.println("                ");
                        System.out.println("다시 입력 해주세요.");
                        System.out.println("                ");
                    }
                }


                if (oilNum == 3) {
                    System.out.println("몇 L 넣으시겠습니까?");
                    System.out.println("1. 1L");
                    System.out.println("2. 2L");
                    System.out.println("3. 3L");
                    System.out.println("4. 4L");
                    System.out.println("5. 직접입력");
                    System.out.print("숫자를 입력하세요:");
                    int premiumNum = sc.nextInt();

                    if (premiumNum == 1) {
                        total += pr.premiumGasoline * 1;
                        System.out.println(total + "원 입니다.");
                    } else if (premiumNum == 2) {
                        total += pr.premiumGasoline * 2;
                        System.out.println(total + "원 입니다.");
                    } else if (premiumNum == 3) {
                        total += pr.premiumGasoline * 3;
                        System.out.println(total + "원 입니다.");
                    } else if (premiumNum == 4) {
                        total += pr.premiumGasoline * 4;
                        System.out.println(total + "원 입니다.");
                    } else if (premiumNum == 5) {
                        System.out.println("몇 L 주유 하시겠습니까?");
                        System.out.print("입력:");
                        premiumNum = sc.nextInt();
                        total += pr.premiumGasoline * premiumNum;
                        System.out.println(total + "원 입니다.");
                    } else {
                        System.out.println("                ");
                        System.out.println("다시 입력 해주세요.");
                        System.out.println("                ");
                    }

                }

            } catch (InputMismatchException e) {
                System.out.println(e + "정수가 아닙니다.");


            }

        }

    }


}


class price {
    int gasolinePrice;
    int diselPrice;
    int premiumGasoline;

    public price(int gasolinePrice, int diselPrice, int premiumGasoline) {
        this.gasolinePrice = gasolinePrice;
        this.diselPrice = diselPrice;
        this.premiumGasoline = premiumGasoline;

    }
}

class event {
    String washCarTicket;
    String tissue;
    String saleCoupon;

    public event(String washCarTicket, String tissue, String saleCoupon) {
        this.washCarTicket = washCarTicket;
        this.tissue = tissue;
        this.saleCoupon = saleCoupon;
    }

}

class totalMoney {
    private int total;

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }
}
