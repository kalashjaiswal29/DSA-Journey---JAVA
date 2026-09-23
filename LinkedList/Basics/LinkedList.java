package LinkedList.Basics;

class Node {
  int val;
  Node next;

  Node(int val) {
    this.val = val;
  }
}

class Ll {
  Node head;
  Node tail;
  int size;

  // Searching an element ;
  int search(int el) {
    Node temp = head;
    int idx = 0;
    while (temp != null) {

      if (temp.val == el)
        return idx;
      else {
        idx++;
        temp = temp.next;
      }

    }
    return -1;
  }

  // Adding element at start
  void addAtHead(int el) {
    Node n = new Node(el);
    n.next = head;
    head = n;
    size++;
    System.out.println(n);

  }

  // Adding an element to the last of the LinkedList
  void addAtTail(int el) {
    Node n = new Node(el);
    if (size == 0)
      head = tail = n;
    else {
      tail.next = n;
      tail = n;
    }
    size++;
  }

  // Deleting first element
  void deleteAtHead() {
    if (size <= 0)
      System.out.println("No element in list to delete");
    else {
      head = head.next;
      size--;
    }
  }

  // Traversing all element in the list
  void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  // Obtaining element at index idx
  int getAtIndex(int idx) {
    Node temp = head;
    if (idx < 0 || idx > size)
      return -1;
    for (int i = 0; i < idx; i++) {
      temp = temp.next;
    }

    return temp.val;
  }

  // Insert an element at any index
  void insertAtIndex(int val, int idx) {
    if (idx < 0 || idx > size)
      System.out.println("Index Invalid ");
    if (idx == 0)
      addAtHead(val);
    else {
      Node temp = head;
      Node n = new Node(val);
      size++;
      for (int i = 0; i < idx - 1; i++) {
        temp = temp.next;
      }
      n.next = temp.next;
      temp.next = n;
    }

  }

  // Delete at an index
  void deleteAtIndex(int idx) {
    if (idx < 0 || idx > size)
      System.out.println("Index Invalid ");
    if (idx == 0)
      deleteAtHead();
    else {
      Node temp = head;
      size--;
      for (int i = 0; i < idx - 1; i++) {
        temp = temp.next;
      }
      temp.next = temp.next.next;
    }
  }

}

public class LinkedList {
  public static void main(String[] args) {
    Ll LinkedList = new Ll();
    LinkedList.addAtTail(31);
    LinkedList.display();
    LinkedList.addAtTail(33);
    LinkedList.display();
    System.out.println(LinkedList.search(33));
    LinkedList.addAtHead(22);
    LinkedList.display();
    System.out.println(LinkedList.search(33));
    LinkedList.deleteAtHead();
    LinkedList.addAtHead(45);
    LinkedList.addAtHead(54);
    LinkedList.addAtHead(75);

    LinkedList.display();
    System.out.println(LinkedList.getAtIndex(3));
    LinkedList.insertAtIndex(102, 0);
    LinkedList.display();
    LinkedList.deleteAtIndex(2);
    LinkedList.display();
    // System.out.println(LinkedList.size);
    // System.out.println(LinkedList.head);
    // System.out.println(LinkedList.tail);

  }
}
