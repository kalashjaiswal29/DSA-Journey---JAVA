package LinkedList.Basics;

class DLL {
  class Node {
    int val;
    Node prev;
    Node next;

    Node() {

    };

    Node(int val) {
      this.val = val;

    }

  }

  Node head;
  Node tail;
  int size;

  void display() {

    Node temp = head;
    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  void displayReverse() {
    Node temp = tail;
    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.prev;
    }
    System.out.println();
  }

  void insertAtHead(int val) {
    Node temp = new Node(val);
    if (head == null) {
      head = tail = temp;

    }

    else {
      temp.next = head;
      head.prev = temp;
      head = temp;

    }
    size++;

  };

  void insertAtTail(int val) {
    Node temp = new Node(val);
    if (head == null) {
      head = tail = temp;

    }

    else {
      tail.next = temp;
      temp.prev = tail;
      tail = temp;
    }
    size++;
  }

  void deleteAtHead() {

    if (size == 0) {
      System.out.println("List is emplty");
    } else if (size == 1) {
      head = tail = null;
      size--;
    } else {
      head = head.next;
      head.prev = null;
      size--;
    }

  }

  void deleteAtTail() {
    if (size == 0) {
      System.out.println("List is emplty");
    } else if (size == 1) {
      head = tail = null;
      size--;
    } else {
      tail = tail.prev;
      tail.next = null;
      size--;
    }
  }

  void insertAtIndex(int val, int pos) {
    if (pos == 1) {
      insertAtHead(val);
    } else if (pos == size + 1) {
      insertAtTail(val);
    } else {

      Node temp = head;
      Node n = new Node(val);
      for (int i = 1; i < pos - 1; i++) {
        temp = temp.next;

      }
      n.next = temp.next;
      temp.next = n;
      n.prev = temp;
      n.next.prev = n;
          size++;

    }

  }

  void deleteAtPos(int pos) {
    if (pos == 1) {
      deleteAtHead();
      return ;
    } else if (pos == size) {
      deleteAtTail();
      return ;
    } else {
      Node temp = head;
      for (int i = 1; i < pos - 1; i++) {
        temp = temp.next;

      }

      temp.next = temp.next.next;
      temp.next.prev = temp;
          size-- ;

    }
  }
}

public class DoublyLinkedListClass {

  public static void main(String[] args) {
    System.out.println("Kalash");
    DLL doublyLL = new DLL();

    doublyLL.display();
    System.out.println(doublyLL.size);
    doublyLL.deleteAtHead();
    System.out.println(doublyLL.size);

    doublyLL.insertAtTail(1);
    doublyLL.insertAtTail(10);
    doublyLL.display();

    doublyLL.insertAtHead(4);
    doublyLL.display();
    doublyLL.displayReverse();
    doublyLL.deleteAtHead();
    doublyLL.display();
    doublyLL.deleteAtTail();
    doublyLL.insertAtTail(1);
    doublyLL.insertAtTail(5);
    doublyLL.insertAtTail(171);
    doublyLL.insertAtTail(1147);
    doublyLL.insertAtTail(147);
    doublyLL.display();
    doublyLL.insertAtIndex(100, 1);
    ;
    doublyLL.display();

    doublyLL.deleteAtPos(7);
    doublyLL.display();

  }
}
