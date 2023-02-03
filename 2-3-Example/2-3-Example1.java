package Java_1_19;

import java.util.Calendar;

// 1초마다 시간을 갱신하는 코드
public class Other1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar ca = Calendar.getInstance();

		Runner ch = new Runner();

		ch.run();
	}

}

class Runner implements Runnable {
	@Override

	public void run() {

		// TODO Auto-generated method stub

		try {

			while (true) {
				Calendar ca = Calendar.getInstance();

				Thread.sleep(1000);

				System.out.println(
						ca.get(Calendar.HOUR) + "시" + ca.get(Calendar.MINUTE) + "분" + ca.get(Calendar.SECOND) + "초");

			}

		} catch (InterruptedException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}
}

