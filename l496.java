import java.util.HashMap;
import java.util.Stack;

public class l496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> a = new HashMap<>();
        int[] res = new int[nums1.length];
        for(int num: nums2){
            while(!stack.isEmpty() && stack.peek()<num){
                a.put(stack.pop(), num);
            }
            stack.push(num);
        }
        int i=0;
        for(int num: nums1){
            res[i] = a.getOrDefault(num,-1);
            i++;
        }
        return res;
    }
}
