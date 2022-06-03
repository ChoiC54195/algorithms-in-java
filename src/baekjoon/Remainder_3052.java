package baekjoon;

import java.util.Scanner;

public class Remainder_3052 {

	public static void main(String[] args) {
		/*
		 * ���� �� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. ���� ���, 7, 14, 27, 38�� 3���� ���� ��������
		 * 1, 2, 0, 2�̴�.
		 * 
		 * �� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� ù° �ٺ��� ����° �� ���� ���ڰ� �� �ٿ� �ϳ��� �־�����. �� ���ڴ� 1,000���� �۰ų� ����, ���� �ƴ� �����̴�.
		 * 
		 * ��� ù° �ٿ�, 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ����Ѵ�.
		 */

		Scanner sc = new Scanner(System.in);
		boolean[] remainders = new boolean[42]; // �������� 0~41���� �����Ƿ�

		int count = 0;

		for (int i = 0; i < 10; i++) {
			int r = sc.nextInt() % 42; // �Է� ���� ���� 42�� ���� �������� ������ ����
			for (int j = 0; j < 42; j++) {
				if (r == j) { // ������ �ε����� ������ �� true�� �� ��ȯ
					remainders[j] = true;
				}
			}
		}

		for (int i = 0; i < remainders.length; i++) {
			if (remainders[i]) { // true�϶��� count + 1
				count++;
			}
		}

		System.out.println(count);

	}

}
