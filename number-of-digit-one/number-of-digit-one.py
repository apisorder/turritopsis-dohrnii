
# Programmer:     Cheng, Jeff
# Last Modified:  05-24-2024 03:24PM
# Problem:        Number of Digit Ones

class Solution:
    def countDigitOne(self, n):
        multi = 1
        numOfOnes = 0
    
        while multi <= n:
            numOfOnes += (n//multi + 8)//10 * multi + (n//multi%10==1)*(n%multi+1)
            multi *= 10

        return numOfOnes