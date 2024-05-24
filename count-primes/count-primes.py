
# Programmer:     Cheng, Jeff
# Last Modified:  05-24-2024 11:20AM
# Problem:        Count Primes

import math

class Solution:
    def countPrimes(self, n):

        if n < 2:
            return 0

        allPrimes = [1] * n
        allPrimes[0] = allPrimes[1] = 0
        
        for i in range(2, int(math.sqrt(n))+1):
            if allPrimes[i] == 1:
                allPrimes[i*i : n : i] = [0] * ((n-1-i*i)//i+1)

        return sum(allPrimes)
