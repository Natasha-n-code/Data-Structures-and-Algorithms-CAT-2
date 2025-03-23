// Main class to test the SinglyLinkedList implementation
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Insert nodes at the beginning
        list.insertAtBeginning(20);
        list.insertAtBeginning(40);
        list.display();  // Output: Linked List: 40 -> 20 -> null
    }
}
