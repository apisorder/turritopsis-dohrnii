
# Programmer:     Cheng, Jeff
# Last Modified:  05-24-2024 08:43PM
# Problem:        Climbing Stairs

class Solution:
    def climbStairs(self, n):

        if n < 2:
            return n

        numOfSteps = [0] * (n+1)
        numOfSteps[0] = numOfSteps[1] = 1

        for i in range(2, n+1):
            numOfSteps[i] = numOfSteps[i-1] + numOfSteps[i-2]

        return numOfSteps[n]
        