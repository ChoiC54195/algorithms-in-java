package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumNum_11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * ���� N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.
		 * 
		 * ��� �Է����� �־��� ���� N���� ���� ����Ѵ�.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // ���� N�� �Է�
		
		String number = br.readLine();
		String[] numbers = new String[number.length()]; // �ѱ��ھ� �߶� �ֱ� ���� �迭
		
		numbers = number.split("");
		
		int sum = 0;
		
		for(int i= 0; i<numbers.length; i++) {
			sum += Integer.parseInt(numbers[i]);
		}
		
		System.out.println(sum);
	}

}
