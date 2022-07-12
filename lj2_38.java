import java.util.Stack;

public class lj2_38 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                int tmp = stack.pop();
                res[tmp] = i-tmp;
            }
            stack.push(i);
        }
        return res;
    }
}
