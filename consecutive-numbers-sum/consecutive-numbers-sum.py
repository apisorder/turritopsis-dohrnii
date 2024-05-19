

# Programmer:     Cheng, Jeff
# Last Modified:  05-19-2024 03:48PM
# Problem:        Array Partition

import math

class Solution:
    def consecutiveNumbersSum(self, n):
        answer = 1

        for k in range(2, int(math.sqrt(2*n))+1):
            if (n-(k-1)*k//2)%k == 0:
                answer += 1

        return answer