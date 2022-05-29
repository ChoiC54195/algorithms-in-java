package baekjoon;

import java.util.Scanner;

public class Factiorial {

	public static void main(String[] args) {
		/*
		 * ���� 0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� ù° �ٿ� ���� N(0 �� N �� 12)�� �־�����.
		 * 
		 * ��� ù° �ٿ� N!�� ����Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		System.out.println(factorial(n));
	}
	
	public static int factorial(int n) {
		int rs=0;
		if(n==0) {
			// 0! = 1�̹Ƿ� ������ �־��ش�.
			rs = 1;
		}else {
			rs = factorial(n-1)*n;
		}
		return rs;
		
	}

}
