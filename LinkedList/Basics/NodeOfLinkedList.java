package LinkedList.Basics ;
  class Node{
    int val ;
    Node next ;
    Node(int val){
      this.val = val ;
    }
  }
public class NodeOfLinkedList {


  public static void main(String[] args) {

    Node a = new Node(20) ;
    Node b = new Node(30) ;
    Node c = new Node(40) ;
    Node d = new Node(50) ;
    Node e = new Node(60) ;

    a.next = b ;
    b.next = c ;
    c.next = d ;
    d.next = e ;

    System.out.println(a + ", " + a.val + ", " + a.next);
    System.out.println(b.next);
    System.out.println("Address of c" + c);
    System.out.println(c.next);
    System.out.println("Address of d" + d);
    System.out.println(d.next);
    System.out.println("Address of e" + e);
    System.out.println(e.next);


  

  }
}
