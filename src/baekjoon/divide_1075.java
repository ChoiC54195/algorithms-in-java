package baekjoon;

import java.util.Scanner;

public class divide_1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int F = sc.nextInt();

        sc.close();

        int temp = N / 100 * 100;
        // 뒤 숫자 2자리는 최소로 정하고 싶으니까 00으로 만들어 시작할 수 지정

        while(true){
            if(temp%F==0){ // 나누어떨어질때
                System.out.format("%02d\n",temp%100); // 한자리 수일때는 0을 붙여줘야 함
                break;
            }else{
                temp++;
            }
        }
    }
}
