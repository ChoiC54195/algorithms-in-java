package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class num_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0 ; i < N ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // ����

        if(N%2 == 0) {
            //����� ¦�������?
            System.out.println(arr[N/2-1]*arr[N/2]);
        }else if(N%2 == 1){
            //����� Ȧ�������?
            System.out.println(arr[N/2]*arr[N/2]);
        }
    }
}
