package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sugar_2839 {
    public static void main(String[] args) throws IOException {
        /*
        *
        * ���� N(kg)
        * ����� 3(kg), 5(kg)
        * �ִ��� ���� ������
        *
        */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sugar = Integer.parseInt(br.readLine()); // ����
        int count = 0; // �������� ������ ����

        /*
            �ִ��� ���� �����̹Ƿ� �ϴ� 5kg ������ �� �� �ִ� ��ŭ ��� �������� 3kg ������ ��� �ȴ�
            ��Ģ�� ã�Ƽ� �����ش�
         */
        if (sugar == 4 || sugar == 7) { // 4�� 7�� ������ �������� �����Ƿ� -1
            count = -1;
        }
        else if (sugar % 5 == 0) { // 5�� ����� ��� 5kg ������ ����ϸ� �ǹǷ� ��
            count = sugar / 5;
        }
        /*
            ������ kg - ������ ����
            3 - 1(3kg : 1��)
            6 - 2(5kg : 1��,3kg : 1��)
            8 - 2(5kg : 1��,3kg : 1��)
            9 - 3(5kg : 1��,3kg : 2��)
            11 - 3(5kg : 2��,3kg : 1��)
            12 - 3(5kg : 2��,3kg : 2��)
            .
            .
            �������� 1�̰ų� 3�� �� 3kg�� �ϳ� �� �߰��ǰ�
            �������� 2�̰ų� 4�� �� 3kg�� �ΰ� �� �߰���

        */
        else if (sugar % 5 == 1 || sugar % 5 == 3) {
            count = (sugar / 5) + 1;
        }
        else if (sugar % 5 == 2 || sugar % 5 == 4) {
            count = (sugar / 5) + 2;
        }

        System.out.println(count);
    }
}
