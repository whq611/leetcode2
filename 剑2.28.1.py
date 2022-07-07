"""
# Definition for a Node.
class Node:
    def __init__(self, val, prev, next, child):
        self.val = val
        self.prev = prev
        self.next = next
        self.child = child
"""

class Solution:
    def flatten(self, head: 'Node') -> 'Node':

        a = []
        b = [head]
        cur = None
        while cur or b:
            if cur:
                a.append(cur)
                b.append(cur.next)
                cur = cur.child
            else:
                cur = b.pop()
        
        
        for i in range(len(a)-1):
            cur = a[i]
            a[i].next = a[i+1]
            a[i+1].prev = a[i]
            a[i].child = None
        return head
