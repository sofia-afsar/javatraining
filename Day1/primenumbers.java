package javatraining;
import java.util.*;
public class primenumbers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int flag;
        System.out.println("the prime numbers between 1 and "+N+"are");
        for(int i=1;i<=N;i++){
             flag=1;
            if(i==0 || i==1) continue;
            for(int j=2;j<=i/2;j++){

                if(i%j==0) {
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.println(i);
            }
        }

    }
}
