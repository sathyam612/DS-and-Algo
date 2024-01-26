public class SinglyLinkedList {
    ListNode head;

    static class ListNode{
        private int data;
        ListNode next;

        public ListNode(){}

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printElements(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " ==> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int length(){
        int count = 0;
        if(head == null){
            return 0;
        }
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public void printLength(){
        System.out.println("Length of the linked list is: " + length());
    }

    public void printer(){
        printElements();
        printLength();
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        System.out.println("After inserting " + value + " at the beginning");
    }

    public void insertAtEnd(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        System.out.println("After inserting " + value + " at the end");
    }

    public void insertAtPosition(int value, int position, boolean ignoreLength){
        try {
            if (position == 1) {
                insertFirst(value);
            } else if (position == 0) {
                throw new RuntimeException("You cannot insert an element at position zero");
            } else if (position > length() && !ignoreLength) {
                throw new RuntimeException("You cannot insert at this position since length of this linked list is lesser than the position");
            } else if (position > length() && ignoreLength) {
                insertAtEnd(value);
            } else {
                ListNode newNode = new ListNode(value);
                int count = 1;
                ListNode previousNode = head;
                while (count < position - 1) {
                    previousNode = previousNode.next;
                    count++;
                }
                newNode.next = previousNode.next;
                previousNode.next = newNode;
                System.out.println("After inserting " + value + " at the position " + position);
            }

        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

}
