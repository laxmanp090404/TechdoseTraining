import java.util.Scanner;

public class Ithbitsetornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter the index");
        int possiblemax_0_based_index = (int)Math.round(Math.log(num)/Math.log(2));

        int i = sc.nextInt();
        if(i-1>possiblemax_0_based_index || i<0){
            System.out.println("Invalid index request");
        }
        else{
            if((num & 1<<i) == 0){
                 System.out.println("The bit "+i+ " is unset");
            }
            else{
                System.out.println("The bit "+i+ " is set");
            }
        }
        sc.close();
    }
}
