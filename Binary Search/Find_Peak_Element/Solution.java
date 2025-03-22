class Solution {
    public int findPeakElement(int[] a) {
        int n = a.length;
        if(n==1) return 0;
        if(a[0] > a[1]) return 0;
        if(a[n-1]>a[n-2]) return n-1;

        int l = 1;
        int h = n-2;
        while(l<=h){
            int m = l+(h-l)/2;
            if(a[m] > a[m+1] && a[m] > a[m-1]){
                return m;
            }
            else if(a[m] > a[m-1]){
                l = m+1;
            }
            else{
                h = m-1;
            }
        }
        return -1;
    }
}
