package baekjoon;

import java.util.Scanner;

public class OX_8958 {

	public static void main(String[] args) {
//		����
//		"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
//
//		"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
//
//		OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 0���� ũ�� 80���� ���� ���ڿ��� �־�����. ���ڿ��� O�� X������ �̷���� �ִ�.
//
//		���
//		�� �׽�Ʈ ���̽����� ������ ����Ѵ�.

		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		String[] score = new String[testCase];

		for (int i = 0; i < score.length; i++) {
			score[i] = sc.next();

		}
		sc.close();		
		for (int i = 0; i < score.length; i++) {		
			int count = 0; // O�� �������̸� +1�� ����
			int sum = 0; // ����
			
			for (int j = 0; j < score[i].length(); j++) {

				if (score[i].charAt(j) == 'O') {
					count++;
				} else {
					count = 0;
				}
				
				sum+=count;
			}
			
			System.out.println(sum);
		}
	}

}
