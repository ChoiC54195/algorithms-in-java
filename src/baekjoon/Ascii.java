package baekjoon;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		/*
		 * ���� ���ĺ� �ҹ���, �빮��, ���� 0-9�� �ϳ��� �־����� ��, �־��� ������ �ƽ�Ű �ڵ尪�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� ���ĺ� �ҹ���, �빮��, ���� 0-9 �� �ϳ��� ù° �ٿ� �־�����.
		 * 
		 * ��� �Է����� �־��� ������ �ƽ�Ű �ڵ� ���� ����Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		char input = sc.next().charAt(0);
		// sc.next() -> String Ÿ��
		// String���� ����� ���ڿ� �� �� ���ڸ� �����ؼ� charŸ������ ��ȯ���ִ� �޼���
		// () <-�ȿ��� �ε��� ��ȣ�� ���� "0"->���ڿ� �� ù��° �����ǹ�
		sc.close();
		
		int num = (int)input; 		// ����ȯ�� ���ش�.
		
		System.out.println(num);
		
	}

}
