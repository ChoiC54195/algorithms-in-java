package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordStudy_1157 {
    public static void main(String[] args) throws IOException {
        /*문제
        알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

        입력
        첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

        출력
        첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] cnt = new int[26]; // 글자수를 각각 카운트
        String s = br.readLine();
        for(int i = 0 ; i < s.length(); i++) {
            if('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){
                //대문자일때
                cnt[s.charAt(i)-'A']++;
            }else{
                //소문자일때
                cnt[s.charAt(i)-'a']++;
            }
        }
        int max = 0;
        char ch = '?';
        for(int i = 0 ; i < 26; i++){
            if(max < cnt[i]){
                max = cnt[i];
                ch = (char) (i+65); // 대문자로 출력
            }else if(max == cnt[i]){
                // 제일 많은 단어의 수가 여러 개일 때 물음표 출력이므로
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
