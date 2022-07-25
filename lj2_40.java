import java.util.Stack;

public class lj2_40 {
    public int maximalRectangle(String[] matrix) {
        if(matrix.length==0 || matrix[0].length()==0) return 0;
        int res = 0;
        int m = matrix.length, n = matrix[0].length();
        int[] heights = new int[n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i].charAt(j)=='0') heights[j] = 0;
                else heights[j]++;
            }
            res = Math.max(res, largestRectangleArea(heights));
        }
        return res;
    }
    public int largestRectangleArea(int[] heights){
        int n = heights.length + 2, res = 0;
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
                res = Math.max(res, cur_h*cur_w);
            }
            stack.push(i);
        }
        return res;
    }
}
