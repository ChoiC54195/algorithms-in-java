package baekjoon;

import java.util.Scanner;

public class Distributed_1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트케이스
        for(int i = 0 ; i < T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int total = 1;
            for(int j = 1 ; j <= b; j++){
                total *= a;
                if(total>=10){
                    total %= 10 ;
                }
                if(total == 0){
                    total = 10;
                    break;
                }
            }

            System.out.println(total%10);
        }
    }
}
