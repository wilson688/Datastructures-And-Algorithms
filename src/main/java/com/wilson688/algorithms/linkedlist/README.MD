# LINKEDLIST 

## Key Terminology

- <strong>Head</strong> : Head is the starting node of the linkedlist 
- <strong>Tail</strong> : It is the ending node of the linkedlist, tail.next = null  
- <strong>Node</strong> : A Linkedlist consists of a pair of Node and Value, where Node is the reference/address
- <strong>Previous</strong> : Previous is the term used to refer to the previous node in the list, you would need to assign it's value. In a single linked list we do not have previous value but in double linked list you access it using head.prev; 
- <strong>Next</strong> : Next is the term used to refer to the next node in the list, in a single linked list it's value is directly available to us for example: head.next; 
- <strong>Value</strong> : Value is the integer stored in that Node reference, you can access is using head.value

## Reverse LinkedList

while reversing a linkedlist the main thing to remember is to remember the previous node. 