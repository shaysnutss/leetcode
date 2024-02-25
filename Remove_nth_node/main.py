# Given a singly linked list, remove the nth node from the end of list and return its head.

# input: 
# Linked list: 32 → 78 → 65 → 90 → 12 → 44 → NULL, n = 3
# output: 32 → 78 → 65 → 12 → 44 → NULL
from linked_list import LinkedList
from linked_list_node import LinkedListNode

def remove_nth_last_node(head, n):

    rightNode = head
    leftNode = head
    count = 1
    
    if head == None:
        return None

    # 1 2 3 4 5
    while rightNode.next != None:
        count = count + 1
        if rightNode.next.next == None:
            leftNode = rightNode
        rightNode = rightNode.next
        
    print(count)
    
    if n > count:
        return None
    elif n == 1:
        leftNode.next = None
        return head
    elif n == count:
        head = head.next
        return head
    
    position = count - n + 2
    leftNode = head
    rightNode = head.next
    
    for i in range(1, position - 2 + 1):
        if i == 1:
            rightNode = rightNode.next
        else:
            rightNode = rightNode.next
            leftNode = leftNode.next
    
    leftNode.next = rightNode
    return head

def main():
    # create a linked list: 32 → 78 → 65 → 90 → 12 → 44 → NULL
    linked_listInput = LinkedList()
    inputList = [32, 78, 65, 90, 12, 44]
    linked_listInput.create_linked_list(inputList)

    # remove the 3rd node from the end
    n = 3
    linked_listInput.head = remove_nth_last_node(linked_listInput.head, n)
    print(linked_listInput)


if __name__ == "__main__":
    main()