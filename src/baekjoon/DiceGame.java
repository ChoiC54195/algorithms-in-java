package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DiceGame {

	public static void main(String[] args) throws IOException {
		/*
		 * ���� 1�������� 6������ ���� ���� 3���� �ֻ����� ������ ������ ���� ��Ģ�� ���� ����� �޴� ������ �ִ�.
		 * 
		 * ���� ���� 3���� ������ 10,000��+(���� ��)��1,000���� ����� �ް� �ȴ�. ���� ���� 2���� ������ ��쿡�� 1,000��+(����
		 * ��)��100���� ����� �ް� �ȴ�. ��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)��100���� ����� �ް� �ȴ�. ���� ���,
		 * 3���� �� 3, 3, 6�� �־����� ����� 1,000+3��100���� ���Ǿ� 1,300���� �ް� �ȴ�. �� 3���� ���� 2, 2, 2��
		 * �־����� 10,000+2��1,000 ���� ���Ǿ� 12,000���� �ް� �ȴ�. 3���� ���� 6, 2, 5�� �־����� ���� ���� ū ����
		 * 6�̹Ƿ� 6��100���� ���Ǿ� 600���� ������� �ް� �ȴ�.
		 * 
		 * 3�� �ֻ����� ���� ���� �־��� ��, ����� ����ϴ� ���α׷��� �ۼ� �Ͻÿ�.
		 * 
		 * �Է� ù° �ٿ� 3���� ���� ��ĭ�� ���̿� �ΰ� ���� �־�����.
		 * 
		 * ��� ù° �ٿ� ������ ����� ��� �Ѵ�.
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int score=0;
		br.close();
		
		int[] dice = new int[3];
		
		for(int i = 0 ; i < 3; i++) {
			dice[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(dice);
		
		if(dice[0]==dice[1] && dice[1] ==dice[2]) {
			score = 10000+(dice[0]*1000);
		}else if(dice[0]==dice[1] || dice[0]==dice[2]) {
			score = 1000+(dice[0]*100);
		}else if(dice[1]==dice[2]) {
			score = 1000+(dice[1]*100);
		}else {
			score = dice[2]*100;
		}
		System.out.println(score);
		
		
	}

}
