package day44;

public class ShareBank {

	public static void main(String[] args) {
		Atm atm=new Atm();
		Thread mom=new Thread(atm,"엄마");
		Thread son=new Thread(atm,"아들");
		
		mom.start();
		son.start();
	}

}
class Atm implements Runnable{
	int money=100000;
	public void run() {
		for(int i=0;i<30;i++) {
			withdraw(1000);
			printInfo();
			try {
				Thread.sleep(800);
			}catch(Exception e) {}
		}
		
	}
	synchronized void withdraw(int money) {
		Thread.yield();
		this.money-=money;
		System.out.println(Thread.currentThread().getName()+"이(가)"+money);
	}
	void printInfo() {
		System.out.println("현재금액:"+this.money);
	}
}