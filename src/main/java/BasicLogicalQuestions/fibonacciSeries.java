package BasicLogicalQuestions;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<n;i++){
            int next=a+b;
            System.out.println(next);
            a=b;
            b=next;

        }
    }
}
