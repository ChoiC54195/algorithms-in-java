package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ovenTimer {

	public static void main(String[] args) throws IOException {
		/*
		 * ���� KOI ���ڿ����� �ǰ��� ���� ���ִ� ������������ �丮�� �����ϰ� ����� �ΰ����� ������ �����Ϸ��� �Ѵ�. �ΰ����� ������ ����ϴ�
		 * ����� ������ ���� ���� ���� ��Ḧ �ΰ����� ���쿡 ������ �ȴ�. �׷��� �ΰ����� ������ ���챸�̰� ������ �ð��� �� ������ �ڵ�������
		 * ����Ѵ�.
		 * 
		 * ����, KOI ������ �ΰ����� ���� �ո鿡�� ����ڿ��� ������������ �丮�� ������ �ð��� �˷� �ִ� ������ �ð谡 �ִ�.
		 * 
		 * �����������̸� �����ϴ� �ð��� ���챸�̸� �ϴ� �� �ʿ��� �ð��� �д����� �־����� ��, ���챸�̰� ������ �ð��� ����ϴ� ���α׷���
		 * �ۼ��Ͻÿ�.
		 * 
		 * �Է� ù° �ٿ��� ���� �ð��� ���´�. ���� �ð��� �� A (0 �� A �� 23) �� �� B (0 �� B �� 59)�� ������ ��ĭ�� ���̿�
		 * �ΰ� ������� �־�����. �� ��° �ٿ��� �丮�ϴ� �� �ʿ��� �ð� C (0 �� C �� 1,000)�� �� ������ �־�����.
		 * 
		 * ��� ù° �ٿ� ����Ǵ� �ð��� �ÿ� ���� ������ ���̿� �ΰ� ����Ѵ�. (��, �ô� 0���� 23������ ����, ���� 0���� 59������
		 * �����̴�. ������ �ð�� 23�� 59�п��� 1���� ������ 0�� 0���� �ȴ�.)
		 */
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		
		int time = Integer.parseInt(br.readLine());
		
		min += time;
		if(min > 59) {
			hour += (min/60);
			min-=(min/60*60);
		}
		if(hour > 23) {
			hour-=24;
		}
		System.out.println(hour+" "+min);
		
	}

}
