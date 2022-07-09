package baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sort2_2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N°³
        ArrayList<Integer> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();

        for(int i = 0 ; i < N; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        for(int i = 0 ; i < N ; i++){
            sb.append(list.get(i)).append("\n");
        }

        System.out.println(sb);
    }

}
