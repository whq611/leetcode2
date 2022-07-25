public class lj2_39_1 {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length, res = 0;

        for(int i=0; i<n; i++){
            int l = i, r = i;
            while(l>0 && heights[l-1]>=heights[i]) l--;
            while(r<n-1 && heights[r+1]>=heights[i]) r++;
            res = Math.max(res, heights[i]*(r-l+1));
        }
        return res;
    }
}
