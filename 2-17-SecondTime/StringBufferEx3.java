package 2-17-SecondTime;

package Pack1;

public class StringBufferEx3 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

//		String str = "";
//		StringBuffer str = new StringBuffer();
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < 1000000; i++) {
			str.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("실행시간: " + (end - start) / 1000 + "초");
		// 1000000번 기준 1558초 (오래 걸린다) - String (비효율)
		// 1000000번 기준 StringBuilder - 0초
		// 1000000번 기준 StringBuffer - 0초
	}
}
