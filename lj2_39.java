import java.util.Arrays;

public class lj2_39 {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = heights[i];
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(heights[j]<heights[i]) break;
                else a[i] += heights[i];
            }
            for(int k=i-1; k>=0; k--){
                if(heights[k]<heights[i]) break;
                else a[i] += heights[i];
            }
        }
        return Arrays.stream(a).max().getAsInt();
    }
}
