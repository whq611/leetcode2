class Solution:
    def countSubstrings(self, s: str) -> int:
        t = "#"
        for i in s:
            t+=i
            t+="#"
        i_max = 0
        r_max = 0
        ans = 0
        f = [0] * len(t)
        for i in range(1,len(t)-1):
            if i>r_max: f[i] = 1
            else: f[i] = min(f[2*i_max-i], r_max-i+1)
            while i-f[i]>=0 and i+f[i]<len(t) and t[i-f[i]] == t[i+f[i]]: f[i]+=1
            if i+f[i]-1>r_max:
                i_max = i
                r_max = i+f[i]-1
            ans += f[i]//2
        return ans
