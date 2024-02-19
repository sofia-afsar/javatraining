import java.util.Scanner;
public class Laballocation {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of seats in L1");
        int seats_l1=sc.nextInt();
        System.out.println("Enter the no of seats in L2 ");
        int seats_l2=sc.nextInt();
        System.out.println("Enter the no of seats in L3 ");
        int seats_l3=sc.nextInt();

        if(seats_l1<seats_l2 && seats_l1<seats_l3){
            System.out.println("seats with minimal capacity is L1 with "+seats_l1);
        }
        if(seats_l2<seats_l3 && seats_l2<seats_l1){
            System.out.println("seats with minimal capacity is L2 with "+seats_l2);
        }
       else{
            System.out.println("seats with minimal capacity is L3 with "+seats_l3);
        }

    }

}
