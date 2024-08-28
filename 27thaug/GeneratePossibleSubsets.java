import java.util.Scanner;
import java.util.*;
public class GeneratePossibleSubsets {
    public static List<List<Integer>> generateAllSubset(List<Integer> lis,int n){
        List<List<Integer>> ans = new ArrayList<>();
        for(int mask = 0;mask< 1<<n;mask++){
            List<Integer> subset = new ArrayList<>();
            for(int ele_idx = 0;ele_idx<n;ele_idx++){
                if((mask & (1<<ele_idx))!=0){
                    subset.add(lis.get(ele_idx));
                }
            }
            ans.add(subset);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in list");
        int n = sc.nextInt();
        ArrayList<Integer> lis = new ArrayList<>();
        System.out.println("Enter the elements one by one");
        for(int i=0;i<n;i++){
           lis.add(sc.nextInt());
        }
        List<List<Integer>> ans =  generateAllSubset(lis,n);
        for(List<Integer> sub : ans){
            System.out.println(sub.toString());
        }
       sc.close();
    }
    
}
