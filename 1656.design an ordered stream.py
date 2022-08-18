class OrderedStream:

    def __init__(self, n: int):
        self.heap = []
        self.ptr = 1


    def insert(self, idKey: int, value: str) -> List[str]:
        res = []
        if idKey == self.ptr:
            res.append(value)
            self.ptr += 1
            while self.heap and self.heap[0][0] == self.ptr:
                res.append(heapq.heappop(self.heap)[1])
                self.ptr += 1
        else:
            heapq.heappush(self.heap,(idKey,value))
        return res 
