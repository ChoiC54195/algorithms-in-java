package baekjoon;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[9];
		int max = 0;
		int index = 0;
		
		for(int i = 0 ; i<array.length ; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i <array.length; i++) {
			if(max < array[i]) {
				max = array[i];
				index = i;
			}
		}
		
		System.out.println(max);
		System.out.println(index+1);
	}

}
