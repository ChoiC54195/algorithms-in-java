package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticSequence_1065 {

	public static void main(String[] args) throws IOException {
		/*
		 * ���� � ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. ���������� ���ӵ� �� ���� ���� ���̰� ������ ������
		 * ���Ѵ�. N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� ù° �ٿ� 1,000���� �۰ų� ���� �ڿ��� N�� �־�����.
		 * 
		 * ��� ù° �ٿ� 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����Ѵ�.
		 */

		// �������� : A B C D ~
		// B-A == C-B

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()); // �ڿ��� N

		System.out.println(NumCnt(n));
		br.close();

	}

	private static int NumCnt(int n) {
		int cnt = 0; // �Ѽ��� ������ ������ ����

		if (n < 100) {
			return n; // 100���� ���� ���� ��� ���� ��������
		} else {
			cnt = 99;
			for (int i = 100; i <= n; i++) {
				int a = i / 100; // 100�� �ڸ���
				int b = (i / 10) % 10; // 10�� �ڸ���
				int c = i % 10; // 1�� �ڸ���

				if ((b - a) == (c - b)) {
					cnt++;
				}
			}
		}
		return cnt;
	}

}
