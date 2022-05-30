package baekjoon;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		/*
		 * 문제 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
		 * 
		 * 출력 입력으로 주어진 글자의 아스키 코드 값을 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		char input = sc.next().charAt(0);
		// sc.next() -> String 타입
		// String으로 저장된 문자열 중 한 글자만 선택해서 char타입으로 변환해주는 메서드
		// () <-안에는 인덱스 번호가 들어간다 "0"->문자열 중 첫번째 문자의미
		sc.close();
		
		int num = (int)input; 		// 형변환을 해준다.
		
		System.out.println(num);
		
	}

}
