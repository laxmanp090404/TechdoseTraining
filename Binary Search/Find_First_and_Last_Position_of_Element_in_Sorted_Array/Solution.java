/*
alternate approach
class Solution {
    public int[] searchRange(int[] a, int t) {
        int[] ans = new int[]{-1,-1};
    
        int n = a.length;
       if (n == 1) {
    return (a[0] == t) ? new int[]{0, 0} : new int[]{-1, -1};
}
        int l = 0;
        int h = n-1;
        while(l<=h){
            int m = l+(h-l)/2;
            if(a[m] == t){
                int s = m;
                int e = m;
                while(s>=0 && a[s]==t){
                    s--;
                }
                while(e<=n-1 && a[e]==t){
                    e++;
                }
                ans[0] = s+1;
                ans[1] = e-1;
                break;

            }
            else if(a[m]>t){
                h = m-1;
            }
            else{
                l = m+1;
            }
        }
        return ans;
    }
}
*/
//actual approach
class Solution {
    public static int firstOf(int[] a,int t){
        int l = 0,n=a.length;
        int h = n-1;
        int idx = -1;
        while(l<=h){
            int mid = l+(h-l)/2;
        
            if(a[mid] == t){
                // go to prev pos to get first 
                idx = mid;
                h = mid-1;
            }
            else if(a[mid]<t){
                l = mid+1;
            }
            else {
                h = mid-1;
            }
        }
        return idx;
    }
    public static int lastOf(int[] a,int t){
        int l = 0,n=a.length;
        int h = n-1;
        int idx = -1;
        while(l<=h){
            int mid = l+(h-l)/2;
        
            if(a[mid] == t){
                // go to next pos to get last 
                idx = mid;
                l = mid+1;
            }
            else if(a[mid]<t){
                l = mid+1;
            }
            else {
                h = mid-1;
            }
        }
        return idx;
    }
    public int[] searchRange(int[] nums, int target) {
        int first = firstOf(nums,target);
        int last  = lastOf(nums,target);
        return new int[]{first,last};
    }
}
