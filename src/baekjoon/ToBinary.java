package baekjoon;

/*import java.util.*;*/
import java.io.*;

public class ToBinary {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		  스캐너를 썼더니 런타임에러가 떠서 다른 방법을 사용 
		  Scanner sc = new Scanner(System.in); 
		  int n = sc.nextInt(); 
		  String rs = "";
		 
		 while(n>0) { rs = n%2+rs; n/=2; }
		  
		  System.out.println(rs);
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int n = Integer.parseInt(br.readLine());
		// 문제의 n의 범위가 너무 커서 int로 하면 런타임에러(NumberFormat)이 뜬다 long으로 바꿔줄 것!
		long n = Long.parseLong(br.readLine());
		
		String rs = "";

		while (n > 0) {
			rs = n % 2 + rs;
			n /= 2;
		}
		System.out.println(rs);
	}

}
