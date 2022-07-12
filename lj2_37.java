import java.util.Stack;

public class lj2_37 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> res = new Stack<>();
        int i = 0;
        while(i<asteroids.length){
            if(res.isEmpty() || asteroids[i]>0 || res.peek()<0) res.push(asteroids[i]);
            else if(res.peek()<-asteroids[i]){
                res.pop();
                continue;
            }
            else if(res.peek()==-asteroids[i]) res.pop();
            i++;
        }
        int[] ans = new int[res.size()];
        for(int j=res.size()-1; j>=0; j--){
            ans[j] = res.pop();
        }
        return ans;
    }
}
