import java.util.Scanner;
public class ProfitandLoss {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of dozen of toys ");
        int ND=sc.nextInt();
        System.out.println("Enter the price per dozen of toys ");
        int CPD=sc.nextInt();
        System.out.println("Enter the Selling price of 1 Toy ");
        int SP=sc.nextInt();

        float CP=Math.floorDiv(CPD,12);
        float Profit=(SP-CP)/CP;
        float profitpercent=Profit*100;
        System.out.println("The profit earned is "+profitpercent);
        System.out.println(CP);
    }
}
