package baekjoon;

import java.util.Scanner;

public class AplusB_10951 {

	public static void main(String[] args) {
		/*
		 * ���� �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
		 * 
		 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		 * 
		 * ��� �� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
		 */

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int sum = a+b;
			System.out.println(sum);
		}
		sc.close();
	}

}
