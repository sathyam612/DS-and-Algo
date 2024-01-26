
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new SinglyLinkedList.ListNode(10);
        SinglyLinkedList.ListNode first = new SinglyLinkedList.ListNode(1);
        SinglyLinkedList.ListNode second = new SinglyLinkedList.ListNode(23);
        SinglyLinkedList.ListNode third = new SinglyLinkedList.ListNode(2);
        SinglyLinkedList.ListNode fourth = new SinglyLinkedList.ListNode(4);
        sll.head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        sll.printer();
        sll.insertFirst(30);
        sll.printer();
        sll.insertAtEnd(300);
        sll.printer();
        sll.insertAtPosition(455, 1, true);
        sll.printer();
        sll.insertAtPosition(400, 3, true);
        sll.printer();
        sll.insertAtPosition(1000, 10, true);
        sll.printer();
        sll.insertAtPosition(2000, 15, false);
        sll.printer();
        sll.insertAtPosition(3000, 0, false);
        sll.printer();
    }
}