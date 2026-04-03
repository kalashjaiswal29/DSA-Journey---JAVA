package Arrays.Basics;

public class basics {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6} ;
    System.out.println(arr[0] );
    int[] arr1 = new int[4] ;
    arr1[0] = 4 ;
    arr1[1] = 4 ;
    arr1[2] = 3 ;
    arr1[3] = 4 ;
    // System.out.println();
    for(int i = 0 ; i < arr1.length ; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    for(int i = 0 ; i < arr1.length ; i++){
      System.out.print(arr1[i]+" ");
    }
  }
}
