class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        n = len(heights) + 2
        res = 0
        heights = [0] + heights + [0]
        stack = [0]
        for i in range(1,n):
            while heights[i]<heights[stack[-1]]:
                cur_h = heights[stack.pop()]
                cur_w = i - stack[-1] - 1
                res = max(res, cur_h*cur_w)
            stack.append(i)
        return res
