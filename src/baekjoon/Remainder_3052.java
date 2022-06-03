package baekjoon;

import java.util.Scanner;

public class Remainder_3052 {

	public static void main(String[] args) {
		/*
		 * 문제 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는
		 * 1, 2, 0, 2이다.
		 * 
		 * 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
		 * 
		 * 출력 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
		 */

		Scanner sc = new Scanner(System.in);
		boolean[] remainders = new boolean[42]; // 나머지는 0~41까지 있으므로

		int count = 0;

		for (int i = 0; i < 10; i++) {
			int r = sc.nextInt() % 42; // 입력 받은 값을 42로 나눈 나머지를 변수에 저장
			for (int j = 0; j < 42; j++) {
				if (r == j) { // 변수가 인덱스와 동일할 때 true로 값 변환
					remainders[j] = true;
				}
			}
		}

		for (int i = 0; i < remainders.length; i++) {
			if (remainders[i]) { // true일때만 count + 1
				count++;
			}
		}

		System.out.println(count);

	}

}
