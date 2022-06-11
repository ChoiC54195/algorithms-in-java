package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticSequence_1065 {

	public static void main(String[] args) throws IOException {
		/*
		 * 문제 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을
		 * 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
		 * 
		 * 출력 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
		 */

		// 등차수열 : A B C D ~
		// B-A == C-B

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()); // 자연수 N

		System.out.println(NumCnt(n));
		br.close();

	}

	private static int NumCnt(int n) {
		int cnt = 0; // 한수의 개수를 저장할 변수

		if (n < 100) {
			return n; // 100보다 작을 때는 모든 수가 등차수열
		} else {
			cnt = 99;
			for (int i = 100; i <= n; i++) {
				int a = i / 100; // 100의 자리수
				int b = (i / 10) % 10; // 10의 자리수
				int c = i % 10; // 1의 자리수

				if ((b - a) == (c - b)) {
					cnt++;
				}
			}
		}
		return cnt;
	}

}
