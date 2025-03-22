class Solution {
    public static int findDays(int cap,int[] w){
        int days = 1;
        int load = 0;

        for(int wt:w){
            if(load+wt>cap){
                days++;
                load = wt;
            }
            else{
                load+=wt;
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int minreq =Integer.MIN_VALUE;
        int maxreq =  0;

        for(int w:weights){
            minreq = Math.max(minreq,w);
            maxreq+=w;
        }

        int l  = minreq;
        int h = maxreq;
        int ans = Integer.MAX_VALUE;
        while(l<=h){
            int m = l+(h-l)/2;
            int daysmid = findDays(m,weights);
            if(daysmid<=days){
                ans = Math.min(ans,m);
                h = m-1;
            }
            else{
                l=m+1;
            }
        
            
        }
        return ans;
    }
}

