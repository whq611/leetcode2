# Definition for a Node.
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next


class Solution:
    def connect(self, root: 'Node') -> 'Node':
        if not root: return None
        cur = collections.deque([root])
        while cur:
            size = len(cur)
            for i in range(size):
                node = cur.popleft()
                if i<size-1:
                    node.next = cur[0]
                if node.left: cur.append(node.left)
                if node.right: cur.append(node.right)
        return root
