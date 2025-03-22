import java.util.PriorityQueue;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int[] m:matrix){
            for(int val:m){
                q.add(val);
            }
        }
        for(int i=1;i<k;i++){
            q.poll();
        }
        return q.peek();
    }
}