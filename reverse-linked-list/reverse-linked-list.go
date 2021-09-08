/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func reverseList(head *ListNode) *ListNode {
    
    if head == nil {
        return head
    }
    
    return reverseRecursive(nil, head)
}

func reverseRecursive(prev *ListNode, current *ListNode) *ListNode {
    if current.Next == nil {
        current.Next = prev
        return current;
    }
    
    tmp := current.Next
    
    current.Next = prev
    
    return reverseRecursive(current, tmp)
    
}