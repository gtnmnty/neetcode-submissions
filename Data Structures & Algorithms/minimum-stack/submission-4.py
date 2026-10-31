class MinStack:
    def __init__(self):
        self.curr = []
        self.minimum = []

    def push(self, val: int) -> None:
        self.curr.append(val)
        if not self.minimum or self.minimum[-1] >= val:
            self.minimum.append(val)

    def pop(self) -> None:
        val = self.curr.pop()
        if val == self.minimum[-1]:
            self.minimum.pop()

    def top(self) -> int:   
        return self.curr[-1]

    def getMin(self) -> int:
        return self.minimum[-1]