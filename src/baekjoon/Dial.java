package baekjoon;

import java.util.Scanner;

public class Dial {

    public static void main(String[] args) {
        /*��ȭ�� �ɰ� ���� ��ȣ�� �ִٸ�, ���ڸ� �ϳ��� ���� ������ �ݼ� ���� �ִ� �� ���� �ð�������� ������ �Ѵ�. ���ڸ� �ϳ� ������ ���̾��� ó�� ��ġ�� ���ư���, ���� ���ڸ� �������� ���̾��� ó�� ��ġ���� �ٽ� ������ �Ѵ�.

        ���� 1�� �ɷ��� �� 2�ʰ� �ʿ��ϴ�. 1���� ū ���� �Ŵµ� �ɸ��� �ð��� �̺��� �� �ɸ���, �� ĭ ���� �ִ� ���ڸ� �ɱ� ���ؼ� 1�ʾ� �� �ɸ���.

                ������� �ҸӴϴ� ��ȭ ��ȣ�� �� ���ڿ� �ش��ϴ� ���ڷ� �ܿ��. ��, � �ܾ �� ��, �� ���ĺ��� �ش��ϴ� ���ڸ� �ɸ� �ȴ�. ���� ���, UNUCIC�� 868242�� ����.

        �ҸӴϰ� �ܿ� �ܾ �־����� ��, �� ��ȭ�� �ɱ� ���ؼ� �ʿ��� �ּ� �ð��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

                �Է�
        ù° �ٿ� ���ĺ� �빮�ڷ� �̷���� �ܾ �־�����. �ܾ��� ���̴� 2���� ũ�ų� ����, 15���� �۰ų� ����.

                ���
        ù° �ٿ� ���̾��� �ɱ� ���ؼ� �ʿ��� �ּ� �ð��� ����Ѵ�.*/

        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        sc.close();

        int cnt = 0; // �� ����Ʈ�� ����

        int len = s.length();

        for(int i = 0 ; i < len; i++){
            switch (s.charAt(i)){
                case 'A':
                case 'B':
                case 'C':
                    cnt += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    cnt += 4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    cnt += 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    cnt += 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    cnt += 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    cnt += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    cnt += 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    cnt += 10;
                    break;
            }
        }
        System.out.println(cnt);
    }
}