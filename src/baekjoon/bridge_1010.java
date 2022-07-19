package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class bridge_1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0 ; i < T; i++){
            double N = sc.nextDouble();
            double M = sc.nextDouble();

            System.out.println(Bridge(N,M));
        }
    }

    static double Bridge(double n, double m) {
        double a = 1;
        double b = 1;

        for(double i = m; i > (m-n); i--){
            a *= i;
        }

        for(double i = n ; i > 0 ; i--){
            b *= i;
        }

        return a/b;
    }
}
