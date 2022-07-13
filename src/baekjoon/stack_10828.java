package baekjoon;

import java.util.Scanner;

public class stack_10828 {
    static int[] stack;
    static int size = 0 ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        stack = new int[N];

        for(int i = 0 ; i < N ; i++){
            String s = sc.next();

            if(s.equals("push")){
                int n = sc.nextInt();
                push(n);
            }else if(s.equals("pop")){
                sb.append(pop()).append('\n');
            }else if(s.equals("size")){
                sb.append(size()).append('\n');
            }else if(s.equals("empty")){
                sb.append(empty()).append('\n');
            }else if(s.equals("top")){
                sb.append(top()).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static void push(int num){
        stack[size] = num;
        size++;
    }

    public static int pop(){
        if(size == 0){
            return -1;
        }else{
            int rs = stack[size-1];
            stack[size-1]=0;
            size--;
            return rs;
        }
    }

    public static int size(){
        return size;
    }

    public static int empty(){
        if(size==0){
            return 1;
        }else{
            return 0;
        }
    }

    public static int top(){
        if(size==0) {
            return -1;
        }else{
            return stack[size-1];
        }
    }
}
