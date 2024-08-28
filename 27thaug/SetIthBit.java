import java.util.Scanner;

public class SetIthBit {
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
        int n  = sc.nextInt();
        int org_n = n;
        System.out.println("Enter the ith index(0 based)");
        int i = sc.nextInt();
        n = n |(1<<i);
        
        if(!isBitSet(org_n, i)){
            System.out.printf("%d bit is set so as a result %d is incresed by %d resulting in %d",i,n -(1<<i),1<<i,n);
        }
        else{
            System.out.println("The bit is already set no change in value");
        }
        sc.close();

    }
}
