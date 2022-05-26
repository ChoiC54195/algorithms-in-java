package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinMax {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int min,max;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		max=Integer.parseInt(st.nextToken());
		min=max;
		
		while(st.hasMoreTokens()) {
			int temp = Integer.parseInt(st.nextToken());
			if(temp<min) {
				min = temp;
			}
			if(temp>max) {
				max=temp;
			}
		}
		
		System.out.print(min+" "+max);
		
	}

}
