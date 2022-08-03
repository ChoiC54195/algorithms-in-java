package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class President_2775 {
    public static void main(String[] args) throws IOException {
        /*
         * ����
         * ��� �ݻ�ȸ�� �����ϴ� ���� �����ϴ� ����� �̹� ��ȸ�� �γ�ȸ���� �ǰ� �;� �� ���� ������� �ҷ� ��� �ݻ�ȸ�� �����Ϸ��� �Ѵ�.
         * �� ����Ʈ�� ���ָ� �Ϸ��� ������ �ִµ�,
         * ��a���� bȣ�� ����� �ڽ��� �Ʒ�(a-1)���� 1ȣ���� bȣ���� ������� ���� �ո�ŭ ������� ������ ��ƾ� �Ѵ١� �� ��� ������ �� ��Ű�� ���;� �Ѵ�.
         * ����Ʈ�� ����ִ� ���� ���� ��� ���ֹε��� �� ��� ������ ��Ű�� �Դٰ� �������� ��,
         * �־����� ���� ���� k�� n�� ���� k���� nȣ���� �� ���� ��� �ִ��� ����϶�.
         * ��, ����Ʈ���� 0������ �ְ� �������� 1ȣ���� ������, 0���� iȣ���� i���� ���.

         * �Է�
         * ù ��° �ٿ� Test case�� �� T�� �־�����. �׸��� ������ ���̽����� �Է����� ù ��° �ٿ� ���� k, �� ��° �ٿ� ���� n�� �־�����
         *
         *
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // Test case

        int[][] apart = new int[15][15];

        for (int i = 0; i < 15; i++) {
            apart[i][1] = 1;    // i�� 1ȣ
            apart[0][i] = i;    // 0�� iȣ
        }


        for (int i = 1; i < 15; i++) {    // 1������ 14������

            for (int j = 2; j < 15; j++) {    // 2ȣ���� 14ȣ����
                apart[i][j] = apart[i][j - 1] + apart[i - 1][j];
            }
        }

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine()); // ����
            int n = Integer.parseInt(br.readLine()); // �������� ȣ��

            System.out.println(apart[k][n]);
        }
    }

}
