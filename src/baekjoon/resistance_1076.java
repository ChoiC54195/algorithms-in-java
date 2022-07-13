package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class resistance_1076 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String first = sc.next(); // 첫번째 색 --> 값
        String second = sc.next(); // 두번째 색 --> 값
        String third = sc.next(); // 세번째 색 --> 곱

        Map<String, Integer> res = new HashMap<String, Integer>();
        res.put("black",0);
        res.put("brown",1);
        res.put("red",2);
        res.put("orange",3);
        res.put("yellow",4);
        res.put("green",5);
        res.put("blue",6);
        res.put("violet",7);
        res.put("grey",8);
        res.put("white",9);

        long rs = ( ( res.get(first) * 10 ) + res.get(second) ) * (long)(Math.pow(10,res.get(third)));
        System.out.println(rs);
    }
}
