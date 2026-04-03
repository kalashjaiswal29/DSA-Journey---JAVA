public class PatternThirteen {
  public static void main(String[] args) {
    int n = 8 ;
    for(int j = 1 ; j <= n ; j++){
      for(int z = 1 ; z <= n-j ; z++){
        System.out.print("  ");
      }
      for(int i = 1 ; i <= (2*j)-1 ; i++){
        System.out.print("* ");
      }
      System.out.println()  ;
    }
  }
}
