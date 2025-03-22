class Solution {
    public int maximumCandies(int[] candies, long k) {
        int n = candies.length;
        int maxc = Integer.MIN_VALUE;
        long sumc =0 ;
        for(int i=0;i<n;i++){
            maxc = Math.max(candies[i],maxc);
            sumc+=candies[i];
        }
        if(sumc < k){
            return 0;
        }

        int l=1,h=maxc;
        int ans = 0;
        while(l<=h){
            int mid = l+(h-l)/2;

            long child = 0;
            for(int cand:candies){
                child+=(cand/mid);
            }
            if(child>=k){
                ans = mid;
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return ans;
    }
}

