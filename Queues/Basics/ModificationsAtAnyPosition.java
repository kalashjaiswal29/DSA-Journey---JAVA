package Queues.Basics;

import java.util.LinkedList;
import java.util.Queue;

public class ModificationsAtAnyPosition {

  // Add at any index
  public static void add(Queue<Integer> q, int el, int idx) {
    int n = q.size();

    for (int i = 0; i < idx; i++) {
      q.add(q.remove());
    }
    q.add(el);
    for (int i = 0; i < n - idx; i++) {
      q.add(q.remove());

    }
  }
  // Element at any index
  public static int peek(Queue<Integer> q, int idx) {
    int n = q.size();

    for (int i = 0; i < idx; i++) {
      q.add(q.remove());
    }
    int peek = q.peek() ;
    for (int i = 0; i < n - idx; i++) {
      q.add(q.remove());

    }
    return peek ;
  }

  //Remove any el at any position
    public static void remove(Queue<Integer> q, int idx) {
    int n = q.size();

    for (int i = 0; i < idx; i++) {
      q.add(q.remove());
    }
    q.remove() ;
    for (int i = 0; i < n - idx -1 ; i++) {
      q.add(q.remove());

    }
   
  }

  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();

    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    System.out.println(q);
    // add(90 at 2nd index) ;
    add(q, 90, 2);
    System.out.println(q);
    System.out.println(peek(q, 2));
    remove(q, 2) ;
    System.out.println(q);
  }
}
