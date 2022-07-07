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

        def dfs(root):
            if not root: return []
            return [root] + dfs(root.child) + dfs(root.next)
        a = dfs(head)
        
        
        for i in range(len(a)-1):
            cur = a[i]
            a[i].next = a[i+1]
            a[i+1].prev = a[i]
            a[i].child = None
        return head
