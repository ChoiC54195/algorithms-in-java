package baekjoon;

import java.util.Scanner;

public class honeycomb_2292 {
    public static void main(String[] args) {
        /*
            위의 그림과 같이 육각형으로 이루어진 벌집이 있다.
            그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다. 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오.
            예를 들면, 13까지는 3개, 58까지는 5개를 지난다.


            방
            1개 --> 1 --> 1
            2개 --> 2-7 --> 6
            3개 --> 8-19 --> 12
            4개 --> 20-37 --> 18

            6씩 증가
        */

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N번째 방을 입력
        int cnt = 1;
        int range = 2; // 범위 중 최소값을 기준으로

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
