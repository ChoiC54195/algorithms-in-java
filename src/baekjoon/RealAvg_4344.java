package baekjoon;

import java.util.Scanner;

public class RealAvg_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt(); // �׽�Ʈ���̽� ����
		
		for(int i = 0 ; i < testCase; i++) {
			int st = sc.nextInt(); // �л� ��
			
			double[] score = new double[st]; // �л����� ����
			
			double sum = 0; // ����
			double avg = 0; // ���
			
			double[] realAvg = new double[st];//���� ����̻� ����
			
			for(int j = 0 ; j < st; j++) {
				score[j] = sc.nextDouble(); //�л����� ������ �Է¹���
				sum += score[j]; // ������ ���Ѵ�
			}
			avg=sum/st; // ����� ����
			
			int count = 0;
			double avgCount = 0; // ����� ���� �л����� ����
			
			for(int j = 0 ; j < st ; j++) {
				if(score[j]>avg) { // ����� �Ѵ� �л� �� ����
					count++;
				}
			}
			
			avgCount = (double)count/st*100;
			
			System.out.printf("%.3f",avgCount);
			System.out.println("%");
						
		}
		
	}

}
