package OOps.Questions;

class ArrayList { // User defined data structure
  int arr[];
  int size = 0;
  int idx = 0;

  ArrayList(int capacity) {
    arr = new int[capacity];

  }

  void add(int el) {

    if (idx == arr.length) {
      int arr2[] = new int[arr.length * 2];
      for (int i = 0; i < arr.length; i++) {
        arr2[i] = arr[i];
      }
      arr = arr2;
    }
    arr[idx++] = el;
    size++;
  }

  void display() {
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  int get(int index) {
    return arr[index];
  }

  void removeFromEnd(){
    idx-- ;
    size-- ;
  }

}

public class OwnArrayList {
  public static void main(String[] args) {
    ArrayList arr = new ArrayList(2);
    arr.add(2);
    arr.add(3);
    arr.display();
    arr.add(4);
    arr.add(4);
    arr.add(4);
    arr.removeFromEnd();
    arr.display();

  }
}
