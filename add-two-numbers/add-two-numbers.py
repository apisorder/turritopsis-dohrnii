
# Programmer:     Cheng, Jeff
# Last Modified:  05-12-2024 11:59PM
# Problem:        Add Two Numbers

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def addTwoNumbers(self, l1, l2):
        dummyHead = ListNode()
        current = dummyHead

        carry = 0
        while l1 or l2 or carry:
            val = carry

            if l1:
                val += l1.val
                l1 = l1.next
            if l2:
                val += l2.val
                l2 = l2.next
            
            carry = val // 10
            val = val % 10

            current.next = ListNode(val)
            current = current.next

        return dummyHead.next