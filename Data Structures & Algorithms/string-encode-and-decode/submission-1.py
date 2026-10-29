class Solution:
    def encode(self, strs: list[str]) -> str:
        self.str_size = [len(s) for s in strs]
        return "".join(strs)

    def decode(self, s: str) -> list[str]:
        ans, start = [], 0
        for size in self.str_size:
            end = start + size
            ans.append(s[start:end])
            start = end
        return ans
