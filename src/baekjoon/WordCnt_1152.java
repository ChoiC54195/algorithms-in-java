package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCnt_1152 {
    public static void main(String[] args) throws IOException {
        /*����
        ���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����.
        �� ���ڿ����� �� ���� �ܾ ������?�̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
        ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.

        �Է�
        ù �ٿ� ���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����.
        �� ���ڿ��� ���̴� 1, 000, 000 �� ���� �ʴ´�.
        �ܾ�� ���� �� ���� ���еǸ�, ������ �����ؼ� ������ ���� ����.
        ���� ���ڿ��� �������� �����ϰų� ���� �� �ִ�.

        ���
        ù° �ٿ� �ܾ��� ������ ����Ѵ�.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //���ڿ� �Է�
        String S = br.readLine();
        int cnt = 0;
        S = S.trim(); // ���� �� ���� ����

        if(S.isEmpty()==false){ // ���鸸 �־��� ��쿡�� 0�� ���;� �Ѵ�
            String[] words = S.split(" ");
            cnt = words.length;
        }

        System.out.println(cnt);
    }
}
