class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = []
        a = {}
        for s in strs:
            count = [0]*26
            for c in s:
                count[ord(c) - ord('a')] += 1
            if tuple(count) in a:
                res[a[tuple(count)]].append(s)
            else:
                a[tuple(count)] = len(res)
                res.append([s])
        return res
