class RandomizedSet:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.dict = {}
        self.list = []


    def insert(self, val: int) -> bool:
        """
        Inserts a value to the set. Returns true if the set did not already contain the specified element.
        """
        if val in self.dict: return False
        self.dict[val] = len(self.list)
        self.list.append(val)
        return True


    def remove(self, val: int) -> bool:
        """
        Removes a value from the set. Returns true if the set contained the specified element.
        """
        if val not in self.dict: return False
        idx = self.dict[val]
        last = self.list[-1]
        self.list[idx] = last
        self.dict[last] = idx
        self.list.pop()
        self.dict.pop(val)
        return True



    def getRandom(self) -> int:
        """
        Get a random element from the set.
        """
        return self.list[random.randint(0,len(self.list)-1)]
