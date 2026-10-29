package Queues.Basics;

import java.util.LinkedList;
import java.util.Queue;

public class TraversingQueue {
  // traversing in queue does not require extra space as in Stacks
  public static void main(String[] args) {
    
    Queue<Integer> q = new LinkedList<>() ;

    q.add(10) ; q.add(20) ; q.add(30) ; q.add(40) ;
    int n = q.size() ;
    for(int i = 1 ; i <= n ; i++){
      System.out.print(q.peek() + " "  );
      q.add(q.remove()) ;
    }

  }
}
