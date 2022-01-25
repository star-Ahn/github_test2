package thread_test;

import java.util.Random;

public class horse extends Thread {
	int horse=0;
	Random r=new Random();
	
	public horse(int horse) {
		this.horse=horse;
	}
	public void run() {
		System.out.println(horse+"번마 출발!");
		try {
			for (int i = 0; i <= 100; i++) {
				i += r.nextInt(10);
				if (i > 100) {
				int t = i - 100;
				i -= t;
				}
				System.out.println(horse+"번마 목표지점"+ i);
				if(i == 100) {
					System.out.println(horse+"번마 도착!");
				}
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		horse h1=new horse(1);
		horse h2=new horse(2);
		h1.start();
		h2.start();
	}
}
