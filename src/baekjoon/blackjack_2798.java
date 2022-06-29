package baekjoon;

import java.util.Scanner;

public class blackjack_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] array = new int[N];

        for(int i = 0 ; i < N ; i++){
            array[i] = sc.nextInt();
        }

        int result = getResult(N, M, array);

        System.out.println(result);
    }

    private static int getResult(int N, int M, int[] array) {
        int result = 0 ;

        for(int i = 0; i < N -2; i++){
            for(int j = i+1; j < N -1; j++){
                for(int k = j+1; k < N; k++){
                    int sum = array[i]+ array[j]+ array[k];

                    if(M == sum){
                        return sum;
                    }

                    if(result < sum && sum < M){
                        result = sum;
                    }
                }
            }
        }
        return result;
    }
}
