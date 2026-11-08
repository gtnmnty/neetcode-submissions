# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        length = 0
        pointer = head

        while pointer:
            length+=1
            pointer = pointer.next
        
        pointer = head
        counter = (length + 1) // 2

        while counter > 0:
            if counter == 1:
                prev = pointer
                pointer = pointer.next
                prev.next = None
            else:
                pointer = pointer.next
            
            counter-=1
        
        prev = None
        while pointer:
            next = pointer.next
            pointer.next = prev
            prev = pointer
            pointer = next

        pointer1, pointer2 = head, prev
        while pointer1 and pointer2:
            next = pointer1.next
            pointer1.next = pointer2
            pointer1 = pointer2
            pointer2 = next

        