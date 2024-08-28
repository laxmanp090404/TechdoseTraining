import java.util.*;;
public class Swaptwonums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("a before swapping is %d and b before swapping is %d\n",a,b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.printf("a after swapping is %d and b after swapping is %d\n",a,b);
        sc.close();
    }
}
