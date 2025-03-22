  
class Solution {
    public int findMin(int[] a) {
        int n = a.length;
        if(n==1) return a[0];

        int minele = Integer.MAX_VALUE;
        int l = 0;
        int h = n-1;

        while(l<=h){
            int m = l+(h-l)/2;
            //find sorted part of array and find minimum and compare
            if(a[l]<=a[m]){
                minele = Math.min(a[l],minele);
                // go to nexthalf
                l = m+1;
            }else{
                minele = Math.min(a[m],minele);
                h = m-1;
            }
        }
        return minele;
    }
}