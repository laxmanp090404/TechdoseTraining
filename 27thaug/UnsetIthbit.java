import java.util.Scanner;

public class UnsetIthbit {
    public static boolean isBitSet(int num,int i){
        if((num & (1<<i)) == 0){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int org_n = n;
        System.out.println("Enter the index i(0 based)");
        int i = sc.nextInt();
        n = n & ~(1<<i);
       if(!isBitSet(org_n, i)){
         System.out.println("Bit already not set no change in value");
       }
       else{
        System.out.printf("%d bit is unset so as a result %d is decresed by %d resulting in %d",i,n+(1<<i),1<<i,n);
       }
        sc.close();
    }
}
