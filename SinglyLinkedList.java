// Node class to represent each element in the linked list
class Node {
    int data;       // What is stored in the node
    Node next;      // Referring to the next node

    // Constructor to initialise a node with data
    Node(int data) {
        this.data = data;
        this.next = null;  // the next node is null
    }
}

// SinglyLinkedList class to manage the linked list
class SinglyLinkedList {
    private Node head;  // Referring to the first node in the list

    // Constructor to initialise an empty linked list
    SinglyLinkedList() {
        this.head = null;  // the list is empty
    }

    // Method to insert a node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);  // Create a new node
        newNode.next = head;            // Point the new node to the current head
        head = newNode;                 // Update the head
        System.out.println("Inserted " + data + " at the beginning.");
    }

    // Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node current = head;
            System.out.print("Linked List: ");
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
}

