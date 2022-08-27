class Node:
    def __init__(self,val=None):
        self.val = val
class ReferenceManager:
    def __init__(self,val=None):
        self.node = Node(val)
    def copyValue(self,obj):
        if not obj:
            return
        if not self.node:
            self.node = Node(obj.val)
        self.node.val = obj.val
    def copyReference(self,obj):
        self.node = obj
