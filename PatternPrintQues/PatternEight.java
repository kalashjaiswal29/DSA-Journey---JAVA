public class PatternEight {
  public static void main(String[] args) {
    int n = 5, a = 1 ;
    for(int j = 1 ; j <= n ; j++) {
      for(int i = 1 ; i <= j ; i++){
      System.out.print(a+" ");
        a++ ;
    }
    System.out.println();
    }
  }
}
