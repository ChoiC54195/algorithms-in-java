package baekjoon;

import java.util.Scanner;

public class divide_1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int F = sc.nextInt();

        sc.close();

        int temp = N / 100 * 100;
        // �� ���� 2�ڸ��� �ּҷ� ���ϰ� �����ϱ� 00���� ����� ������ �� ����

        while(true){
            if(temp%F==0){ // �����������
                System.out.format("%02d\n",temp%100); // ���ڸ� ���϶��� 0�� �ٿ���� ��
                break;
            }else{
                temp++;
            }
        }
    }
}
