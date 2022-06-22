package baekjoon;

import java.util.Scanner;

public class honeycomb_2292 {
    public static void main(String[] args) {
        /*
            ���� �׸��� ���� ���������� �̷���� ������ �ִ�.
            �׸����� ���� �ٿ� ���� �߾��� �� 1���� �����ؼ� �̿��ϴ� �濡 ���ư��鼭 1�� �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�. ���� N�� �־����� ��, ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
            ���� ���, 13������ 3��, 58������ 5���� ������.


            ��
            1�� --> 1 --> 1
            2�� --> 2-7 --> 6
            3�� --> 8-19 --> 12
            4�� --> 20-37 --> 18

            6�� ����
        */

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N��° ���� �Է�
        int cnt = 1;
        int range = 2; // ���� �� �ּҰ��� ��������

        if(N==1){
            System.out.println(cnt);
        }else{
            while(range <= N){
                range = range + (6*cnt);
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
