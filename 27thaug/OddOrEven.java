import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num & 1) == 0){
          System.out.println(num+" is a even number");
        }
        else{
            System.out.println(num+" is a odd number");
        }
        sc.close();
    }
}
