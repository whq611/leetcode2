class Solution:
    def calcEquation(self, equations: List[List[str]], values: List[float], queries: List[List[str]]) -> List[float]:
        res = []
        dic = collections.defaultdict(list)
        for i in range(len(values)):
            dic[equations[i][0]].append([equations[i][1], values[i]])
            dic[equations[i][1]].append([equations[i][0], 1.0/values[i]])
        a = 0
        b = 0
        for q in queries:
            a+=1
            if q[0] not in dic or q[1] not in dic:
                res.append(-1.0)
                b+=1
                continue
            elif q[0]==q[1]:
                res.append(float(1))
                b+=1
                continue
            queue = collections.deque([(q[0],1.0)])
            visited = set()
            while queue:
                if a==b: break
                cur, num = queue.popleft()
                if cur in visited:
                    continue
                visited.add(cur)
                if cur in dic:
                    values = dic.get(cur)
                    nex = {}
                    for val in values:
                        nex[val[0]] = val[1]
                    for key in nex:
                        if key not in visited:
                            if key == q[1]:
                                res.append(num*nex[key])
                                b+=1
                                break
                            queue.append((key, num*nex[key]))
            if b<a:
                res.append(float(-1))
                b+=1
        return res
