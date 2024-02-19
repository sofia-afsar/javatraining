package javatraining;
import java.util.*;
public class Compare2integers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number ");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println(num1+" greater than "+num2);
        } else if (num1<num2) {
            System.out.println(num1+" less than "+num2);
        }
        else{
            System.out.println(num1+" equal to "+num2);
        }
    }
}

