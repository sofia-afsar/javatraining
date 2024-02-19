package javatraining;
import java.util.*;
public class foodapp{
    public static void main(String[]args) {
        int flag = 0;
        while (flag == 0) {
            System.out.println("-------Hotel Taj ------\n" +
                    "1.\tCAKES (2USD)\n" +
                    "2.\tCOOLDRINK (1USD)\n" +
                    "3\tSNACKS (3USD)\n" +
                    "4\tCURRIES (4USD)\n" +
                    "5/EXIT");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the ItemCode ");
            int itemcode = sc.nextInt();
            System.out.println("Enter the no of packs");
            int packs = sc.nextInt();

            switch (itemcode) {
                case (1):
                    System.out.println("the amount to be paid is " + packs * 2);
                    break;
                case (2):
                    System.out.println("the amount to be paid is " + packs);
                    break;
                case (3):
                    System.out.println("the amount to be paid is " + packs * 3);
                    break;
                case (4):
                    System.out.println("the amount to be paid is " + packs * 4);
                    break;
                case (5):
                    System.out.println("EXIT");
                    flag=1;
                    break;
                default:
                    System.out.println("again re enter the correct itemcode between 1 and 5");
            }
        }
    }

}

