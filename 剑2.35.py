class Solution:
    def findMinDifference(self, timePoints: List[str]) -> int:
        if len(timePoints) > 24 * 60:
            return 0
        mins = []
        for t in timePoints:
            mins.append(int(t[:2]) * 60 + int(t[3:]))
        mins.sort()
        
        mins.append(mins[0] + 24 * 60)
        return min(mins[i] - mins[i - 1] for i in range(1, len(mins)))
