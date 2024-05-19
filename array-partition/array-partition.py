
# Programmer:     Cheng, Jeff
# Last Modified:  05-19-2024 03:44PM
# Problem:        Array Partition

class Solution:
    def arrayPairSum(self, nums):
        return sum(sorted(nums)[::2])