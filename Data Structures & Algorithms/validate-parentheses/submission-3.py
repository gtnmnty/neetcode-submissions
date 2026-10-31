class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        match = { ")" : "(", "]" : "[", "}" : "{" }

        for char in s:
            if char in "([{":
                stack.append(char)
            else:
                if not stack:
                    return False
                else:
                    if stack[-1] == match[char]:
                        stack.pop()
                    else:
                        return False                
    
        return not stack
