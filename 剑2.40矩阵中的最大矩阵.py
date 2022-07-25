class Solution:
    def maximalRectangle(self, matrix: List[str]) -> int:
        def largestRectangleArea(heights):
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

        if len(matrix)==0 or len(matrix[0])==0: return 0
        res = 0
        m, n = len(matrix), len(matrix[0])
        heights = [0] * n
        for i in range(m):
            for j in range(n):
                if matrix[i][j]=="0":
                    heights[j] = 0
                else:
                    heights[j] += 1
            res = max(res, largestRectangleArea(heights))
        return res
