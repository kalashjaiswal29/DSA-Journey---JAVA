package LinkedList.Basics;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }

    // No need to pass 'head' if we call it on the head node itself!
    void print() {
        Node temp = this;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Standard 0-indexed lookup method
    int getValAtIdx(int index) {
        Node temp = this;
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException("Index out of range");
            }
            temp = temp.next;
        }
        if (temp == null) throw new IndexOutOfBoundsException("Index out of range");
        return temp.val;
    }
}

public class DisplayList {
    public static void main(String[] args) {
        Node a = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(50);
        Node e = new Node(60);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        a.print(); // Prints: 20 30 40 50 60 
        
        // Index 3 represents the 4th element (0 -> 20, 1 -> 30, 2 -> 40, 3 -> 50)
        System.out.println("Value at index 3: " + a.getValAtIdx(3)); 
    }
}
