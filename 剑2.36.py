class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        dic = {
               '+': lambda a,b: a+b,
               '-': lambda a,b: a-b,
               '/': lambda a,b: int(a/b),
               '*': lambda a,b: a*b,
        }
        stack = []
        for i in tokens:
            if i not in dic:
                stack.append(int(i))
            else:
                a = stack.pop()
                b = stack.pop()
                operation = dic[i]
                stack.append(operation(b,a))
        return stack[0]
