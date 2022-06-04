package baekjoon;

import java.util.Scanner;

public class RealAvg_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt(); // 테스트케이스 개수
		
		for(int i = 0 ; i < testCase; i++) {
			int st = sc.nextInt(); // 학생 수
			
			double[] score = new double[st]; // 학생들의 점수
			
			double sum = 0; // 총합
			double avg = 0; // 평균
			
			double[] realAvg = new double[st];//실제 평균이상 비율
			
			for(int j = 0 ; j < st; j++) {
				score[j] = sc.nextDouble(); //학생들의 점수를 입력받음
				sum += score[j]; // 총합을 구한다
			}
			avg=sum/st; // 평균을 구함
			
			int count = 0;
			double avgCount = 0; // 평균을 넘은 학생들의 비율
			
			for(int j = 0 ; j < st ; j++) {
				if(score[j]>avg) { // 평균을 넘는 학생 수 구함
					count++;
				}
			}
			
			avgCount = (double)count/st*100;
			
			System.out.printf("%.3f",avgCount);
			System.out.println("%");
						
		}
		
	}

}
