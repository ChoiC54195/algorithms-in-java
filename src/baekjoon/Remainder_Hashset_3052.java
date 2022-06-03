package baekjoon;

import java.util.Scanner;
import java.util.HashSet;

public class Remainder_Hashset_3052 {

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
		// Hashset�� �ߺ��� ������� �ʴ� �ڹ� �÷���
		HashSet<Integer> hs = new HashSet<Integer>();

		for(int i = 0; i<10; i++) {
			hs.add(sc.nextInt()%42);
		}
		System.out.println(hs.size());

	}

}
