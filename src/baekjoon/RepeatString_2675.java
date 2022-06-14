package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatString_2675 {
    public static void main(String[] args) throws IOException {
        /*����
        ���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
        ��, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�.
        S���� QR Code "alphanumeric" ���ڸ� ����ִ�.

        QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.

        �Է�
        ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. �� �׽�Ʈ ���̽��� �ݺ� Ƚ�� R(1 �� R �� 8), ���ڿ� S�� �������� ���еǾ� �־�����. S�� ���̴� ��� 1�̸�, 20���ڸ� ���� �ʴ´�.

        ���
        �� �׽�Ʈ ���̽��� ���� P�� ����Ѵ�.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // �׽�Ʈ���̽��� ��

        for(int i = 0 ; i < T; i++){
            String[] str = br.readLine().split(" "); //������ ��������

            int R = Integer.parseInt(str[0]);
            String S = str[1];

            for(int j = 0 ; j<S.length(); j++){
                for(int k = 0 ; k<R;k++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }



    }
}
