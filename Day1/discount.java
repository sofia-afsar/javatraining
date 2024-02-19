import java.util.Scanner;
public class Discount {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of item1");
        float p1=sc.nextFloat();
        System.out.println("Enter the price of item2");
        float p2=sc.nextFloat();
        System.out.println("Enter the discount percent");
        int discountpercent=sc.nextInt();

        float sum=p1+p2;
        float savedamt=(sum*discountpercent)/100;
        float discountedprice=sum-savedamt;
        System.out.println("Total amt before discount in Rs"+sum);
        System.out.println("Saved amount in Rs:" +savedamt);
        System.out.println("New total price in Rs: "+discountedprice);
    }

}
