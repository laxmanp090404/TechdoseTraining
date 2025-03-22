class Solution {
    public int search(int[] a, int t) {
        int n = a.length;
        if(n==1) return (a[0] == t)?0:-1;
        
        int l=0,h=n-1;
        while(l<=h){
            int m = l+(h-l)/2;

            if(a[m] == t){
                return m;
            }
            //left sorted
            else if(a[l] <= a[m]){
                    if(t >= a[l] && t <=a[m]){
                        h = m-1;
                    }
                    else{
                        l = m+1;
                    }
            }
            //rigth sorted
            else{
                if(t >=a[m] && t<=a[h]){
                    l = m+1;
                }
                else{
                    h  = m-1;
                }
            }
        }
        return -1;

    }
}