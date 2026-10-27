class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_m = dict()

        for i, x in enumerate(nums):
            if target - x in num_m:
                return [num_m[target - x], i]

            num_m[x] = i

        return [0, 0]
