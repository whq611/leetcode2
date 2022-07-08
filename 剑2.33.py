class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = []
        a = {}
        for s in strs:
            if str(sorted(s)) in a:
                res[a[str(sorted(s))]].append(s)
            else:
                a[str(sorted(s))] = len(res)
                res.append([s])
        return res
