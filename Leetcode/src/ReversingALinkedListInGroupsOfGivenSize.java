class LinkedList {
    Node head;
    class Node {
        int data;
        Node next;
        Node (int d) {
            data = d;
            next = null;
        }
    }
    Node reverse (Node head, int k) {
        if (head == null) {
            return null;
        }
        Node next = null;
        Node prev = null;

        int count = 0;

        // here, we reverse first k nodes of linked list
        while (head != null && count < k) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
            count++;
        }
        // next is now a pointer to (k+1)th node
        // we recursively call for list starting from head
        if (next != null) {
            head.next = reverse(next, k);
        }
        return prev;
    }
    public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* Function to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}


public class ReversingALinkedListInGroupsOfGivenSize {
    public static void main (String[] args) {
        LinkedList list = new LinkedList();
        list.push(9);
        list.push(8);
        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        System.out.println("Given Linked List is: ");
        list.printList();
        list.head = list.reverse(list.head, 3);
        System.out.println("Reversed list is: ");
        list.printList();

    }
}
