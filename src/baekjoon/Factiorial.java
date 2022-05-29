package baekjoon;

import java.util.Scanner;

public class Factiorial {

	public static void main(String[] args) {
		/*
		 * 문제 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
		 * 
		 * 출력 첫째 줄에 N!을 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		System.out.println(factorial(n));
	}
	
	public static int factorial(int n) {
		int rs=0;
		if(n==0) {
			// 0! = 1이므로 조건을 넣어준다.
			rs = 1;
		}else {
			rs = factorial(n-1)*n;
		}
		return rs;
		
	}

}
