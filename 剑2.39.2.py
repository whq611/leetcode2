class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        n = len(heights)
        res = 0
        for i in range(n):
            l = r = i
            while l>0 and heights[l-1]>=heights[i]:
                l-=1
            while r<n-1 and heights[r+1]>=heights[i]:
                r+=1
            res = max(res,(r-l+1)*heights[i])
        return res
