import java.util.Stack;

public class lj2_39_2 {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length+2, res = 0;
        int[] a = new int[n];
        for(int i=1; i<n-1; i++){
            a[i] = heights[i-1];
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=1; i<n; i++){
            while(a[i]<a[stack.peek()]){
                int cur_h = a[stack.pop()];
                int cur_w = i - stack.peek() - 1;
                res = Math.max(res,cur_h*cur_w);
            }
            stack.push(i);
        }
        return res;
    }
}
