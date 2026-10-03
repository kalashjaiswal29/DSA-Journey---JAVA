package Stacks.Basics;

class Node {
  int val;
  Node next;

  Node(int val) {
    this.val = val;
  }
}

class MyStack {
  Node head;
  Node tail;
  int size;

  // Get the top most value
  int peek() throws Exception {
    if (size <= 0) {
      throw new Exception("Stack Underflow error");
    }
    return head.val;
  }

  // Add an element according to Last in First out
  void push(int el) {
    Node n = new Node(el);
    if (size == 0) {
      head = tail = n;
    } else {
      n.next = head;
      head = n;
    }
    size++;
  }

  // Pop Topmost element
  int pop() throws Exception {
    if (size <= 0) {
      throw new Exception("Stack Underflow error");
    } else if (size == 1) {
      int val = head.val;
      head = tail = null;
      size--;
      return val;
    } else {
      int val = head.val;
      head = head.next;
      size--;
      return val;
    }

  }

  int size() {
    return size;
  }

  void print() {

    Node temp = head;
    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.next ;
    }
    System.out.println();

  }

}

public class ImplementationLL {
  public static void main(String[] args) throws Exception {
    MyStack st = new MyStack();
  
    st.push(1);
    st.push(2);
    st.push(21);
    st.push(26);
    st.push(212);
    st.push(2124);
    st.print();
    System.out.println(st.peek());
    System.out.println(st.pop()); 
    st.print();

    
  }
}
