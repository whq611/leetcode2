class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t) or s==t: return False
        a = [0]*26
        b = [0]*26
        for i in s:
            a[ord(i) - ord('a')] += 1
        for j in t:
            b[ord(j) - ord('a')] += 1
        return a==b
