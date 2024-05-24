
# Programmer:     Cheng, Jeff
# Last Modified:  05-21-2024 08:43PM
# Problem:        Counting Bits

class Solution:
    def countBits(self, n):
        results = [0] * (n+1)

        for i in range(n+1):
            results[i] = results[i//2] + (i&1)

        return results