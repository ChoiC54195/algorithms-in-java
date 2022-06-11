package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindAlphabet_10809 {

	public static void main(String[] args) throws IOException {
		/*
		 * 문제 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
		 * 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
		 * 
		 * 출력 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서
		 * 출력한다.
		 * 
		 * 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째
		 * 위치이다.
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 소문자로만 이루어진 단어 s

		char[] ss = new char[s.length()];

		int[] index = new int[26]; // a~z까지 수

		for (int i = 0; i < s.length(); i++) {
			ss[i] = s.charAt(i); // 한글자씩 배열에 저장
		}

		for (int i = 0; i < 26; i++) {
			index[i] = -1; // 전부 -1로 초기화
		}

		for (int i = 0; i < ss.length; i++) {
			for (int j = 0; j < 26; j++) {
				if (index[j] == -1) {// 제일 처음 위치를 저장하므로
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
