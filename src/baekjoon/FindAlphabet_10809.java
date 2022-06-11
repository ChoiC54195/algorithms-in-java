package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindAlphabet_10809 {

	public static void main(String[] args) throws IOException {
		/*
		 * ���� ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��,
		 * ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� ù° �ٿ� �ܾ� S�� �־�����. �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
		 * 
		 * ��� ������ ���ĺ��� ���ؼ�, a�� ó�� �����ϴ� ��ġ, b�� ó�� �����ϴ� ��ġ, ... z�� ó�� �����ϴ� ��ġ�� �������� �����ؼ�
		 * ����Ѵ�.
		 * 
		 * ����, � ���ĺ��� �ܾ ���ԵǾ� ���� �ʴٸ� -1�� ����Ѵ�. �ܾ��� ù ��° ���ڴ� 0��° ��ġ�̰�, �� ��° ���ڴ� 1��°
		 * ��ġ�̴�.
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // �ҹ��ڷθ� �̷���� �ܾ� s

		char[] ss = new char[s.length()];

		int[] index = new int[26]; // a~z���� ��

		for (int i = 0; i < s.length(); i++) {
			ss[i] = s.charAt(i); // �ѱ��ھ� �迭�� ����
		}

		for (int i = 0; i < 26; i++) {
			index[i] = -1; // ���� -1�� �ʱ�ȭ
		}

		for (int i = 0; i < ss.length; i++) {
			for (int j = 0; j < 26; j++) {
				if (index[j] == -1) {// ���� ó�� ��ġ�� �����ϹǷ�
					if (ss[i] == (j + 97)) {
						index[j] = i;
						break;
					}
				}
			}
		}

		for (int i = 0; i < index.length; i++) {
			System.out.print(index[i] + " ");
		}
		System.out.println();

	}

}
