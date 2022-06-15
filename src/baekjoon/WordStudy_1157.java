package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordStudy_1157 {
    public static void main(String[] args) throws IOException {
        /*����
        ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.

        �Է�
        ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.

        ���
        ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] cnt = new int[26]; // ���ڼ��� ���� ī��Ʈ
        String s = br.readLine();
        for(int i = 0 ; i < s.length(); i++) {
            if('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){
                //�빮���϶�
                cnt[s.charAt(i)-'A']++;
            }else{
                //�ҹ����϶�
                cnt[s.charAt(i)-'a']++;
            }
        }
        int max = 0;
        char ch = '?';
        for(int i = 0 ; i < 26; i++){
            if(max < cnt[i]){
                max = cnt[i];
                ch = (char) (i+65); // �빮�ڷ� ���
            }else if(max == cnt[i]){
                // ���� ���� �ܾ��� ���� ���� ���� �� ����ǥ ����̹Ƿ�
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
