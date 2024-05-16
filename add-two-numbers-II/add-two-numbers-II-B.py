
# Programmer:     Cheng, Jeff
# Last Modified:  05-13-2024 09:53PM
# Problem:        Add Two Numbers II 

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def addTwoNumbers(self, l1, l2):
        def listLength(l):
            length = 0

            while l:
                length += 1
                l = l.next

            return length

        list1_length = listLength(l1)
        list2_length = listLength(l2)

        dummyHead = ListNode()

        while list1_length > 0 and list2_length > 0:
            val = 0
            if list1_length >= list2_length:
                val += l1.val
                l1 = l1.next
                list1_length -= 1
            if list1_length < list2_length:
                val += l2.val
                l2 = l2.next
                list2_length -= 1

            head = ListNode(val, dummyHead)
            dummyHead = head

        current = dummyHead
        dummyHead = None

        carry = 0
        while current:
            val = carry + current.val
            carry = val // 10
            val = val % 10

            head = ListNode(val, dummyHead)
            dummyHead = head

            current = current.next

        if dummyHead.val == 0:
            return dummyHead.next
        else:
            return dummyHead