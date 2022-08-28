package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class CutLine_25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String kn = br.readLine();
        StringTokenizer st = new StringTokenizer(kn, " ");
        ArrayList<Integer> list = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String scores = br.readLine();
        //System.out.println("kn : "+kn);
        //System.out.println("scores : "+scores);
        st = new StringTokenizer(scores, " ");

        for(int i = 0 ; i < N ; i++) {
            list.add(Integer.valueOf(st.nextToken()));
        }

        //System.out.println(list.toString());
        Collections.reverse(list);

        System.out.println(list.get(k-1));
    }
}
