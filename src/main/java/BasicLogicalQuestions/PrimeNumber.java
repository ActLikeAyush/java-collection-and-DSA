package BasicLogicalQuestions;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            boolean isPrime=true;
            for(int j=2;j<i;j++){
                if(i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
                isPrime=false;
            }
        }
    }
}
