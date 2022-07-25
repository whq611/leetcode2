class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        n = len(heights)
        a = heights[:]
        for i in range(n):
            for j in range(i+1,n):
                if heights[j]<heights[i]: break
                else: a[i]+=heights[i]
            for k in range(i-1,-1,-1):
                if heights[k]<heights[i]: break
                else: a[i]+=heights[i]
        return max(a)
