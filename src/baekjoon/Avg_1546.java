package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Avg_1546 {
	/*
	 * ���� �����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ����
	 * M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
	 * 
	 * ���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
	 * 
	 * �������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����. ��° �ٿ� �������� ���� ������ �־�����. ��
	 * ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.
	 * 
	 * ��� ù° �ٿ� ���ο� ����� ����Ѵ�. ���� ����� ��°��� ������� �Ǵ� �������� 10-2 �����̸� �����̴�.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double[] scores = new double[n];
		double sum = 0;
		
		for(int i = 0 ; i<scores.length;i++) {
			scores[i] = sc.nextInt();
		}
		
		Arrays.sort(scores);
	
		for(int i = 0 ; i <scores.length; i++) {
			scores[i] = scores[i]/scores[scores.length-1]*100;
			sum +=scores[i];
		}
		double avg = sum/scores.length;
		System.out.println(avg);
	
	}
}
