import java.util.Scanner;

public class NuberofSetBits {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int set_Cnt = 0;
        while(num!=0){
            num = num & num-1;
            set_Cnt++;
        }
        System.out.printf("The number of set bits in %d is %d",n,set_Cnt );
        sc.close();
    }
}
