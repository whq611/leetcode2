import java.util.PriorityQueue;

public class l215_1 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            queue.offer(nums[i]);
            if(i>=k) queue.poll();
        }
        return queue.peek();
    }
}
